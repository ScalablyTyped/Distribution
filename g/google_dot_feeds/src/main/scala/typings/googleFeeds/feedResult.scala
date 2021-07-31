package typings.googleFeeds

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait feedResult extends StObject {
  
  var error: js.UndefOr[feedError] = js.undefined
  
  var feed: feedJSON
  
  var xmlDocument: js.UndefOr[String] = js.undefined
}
object feedResult {
  
  @scala.inline
  def apply(feed: feedJSON): feedResult = {
    val __obj = js.Dynamic.literal(feed = feed.asInstanceOf[js.Any])
    __obj.asInstanceOf[feedResult]
  }
  
  @scala.inline
  implicit class feedResultMutableBuilder[Self <: feedResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: feedError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setFeed(value: feedJSON): Self = StObject.set(x, "feed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXmlDocument(value: String): Self = StObject.set(x, "xmlDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXmlDocumentUndefined: Self = StObject.set(x, "xmlDocument", js.undefined)
  }
}

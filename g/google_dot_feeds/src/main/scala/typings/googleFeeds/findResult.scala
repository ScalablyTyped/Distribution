package typings.googleFeeds

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait findResult extends StObject {
  
  var error: js.UndefOr[feedError] = js.undefined
  
  var findEntries: js.Array[findEntry]
  
  var xmlDocument: js.UndefOr[String] = js.undefined
}
object findResult {
  
  @scala.inline
  def apply(findEntries: js.Array[findEntry]): findResult = {
    val __obj = js.Dynamic.literal(findEntries = findEntries.asInstanceOf[js.Any])
    __obj.asInstanceOf[findResult]
  }
  
  @scala.inline
  implicit class findResultMutableBuilder[Self <: findResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: feedError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setFindEntries(value: js.Array[findEntry]): Self = StObject.set(x, "findEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFindEntriesVarargs(value: findEntry*): Self = StObject.set(x, "findEntries", js.Array(value :_*))
    
    @scala.inline
    def setXmlDocument(value: String): Self = StObject.set(x, "xmlDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXmlDocumentUndefined: Self = StObject.set(x, "xmlDocument", js.undefined)
  }
}

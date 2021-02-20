package typings.googleFeeds

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait findEntry extends StObject {
  
  var contentSnippet: String = js.native
  
  var link: String = js.native
  
  var title: String = js.native
  
  var url: String = js.native
}
object findEntry {
  
  @scala.inline
  def apply(contentSnippet: String, link: String, title: String, url: String): findEntry = {
    val __obj = js.Dynamic.literal(contentSnippet = contentSnippet.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[findEntry]
  }
  
  @scala.inline
  implicit class findEntryMutableBuilder[Self <: findEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentSnippet(value: String): Self = StObject.set(x, "contentSnippet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}

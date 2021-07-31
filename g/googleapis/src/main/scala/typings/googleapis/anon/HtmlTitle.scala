package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HtmlTitle extends StObject {
  
  var htmlTitle: js.UndefOr[String] = js.undefined
  
  var link: js.UndefOr[String] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
}
object HtmlTitle {
  
  @scala.inline
  def apply(): HtmlTitle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HtmlTitle]
  }
  
  @scala.inline
  implicit class HtmlTitleMutableBuilder[Self <: HtmlTitle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHtmlTitle(value: String): Self = StObject.set(x, "htmlTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlTitleUndefined: Self = StObject.set(x, "htmlTitle", js.undefined)
    
    @scala.inline
    def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}

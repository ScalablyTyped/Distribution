package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Lang extends StObject {
  
  var lang: js.UndefOr[String] = js.native
  
  var previewImageUrl: js.UndefOr[String] = js.native
  
  var snippet: js.UndefOr[String] = js.native
  
  var snippetUrl: js.UndefOr[String] = js.native
  
  var title: js.UndefOr[String] = js.native
}
object Lang {
  
  @scala.inline
  def apply(): Lang = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Lang]
  }
  
  @scala.inline
  implicit class LangMutableBuilder[Self <: Lang] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
    
    @scala.inline
    def setPreviewImageUrl(value: String): Self = StObject.set(x, "previewImageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviewImageUrlUndefined: Self = StObject.set(x, "previewImageUrl", js.undefined)
    
    @scala.inline
    def setSnippet(value: String): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
    
    @scala.inline
    def setSnippetUrl(value: String): Self = StObject.set(x, "snippetUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnippetUrlUndefined: Self = StObject.set(x, "snippetUrl", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}

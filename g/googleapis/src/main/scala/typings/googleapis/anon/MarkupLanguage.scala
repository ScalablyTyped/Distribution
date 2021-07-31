package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarkupLanguage extends StObject {
  
  var markupLanguage: js.UndefOr[String] = js.undefined
  
  var scriptingLanguage: js.UndefOr[String] = js.undefined
  
  var size: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object MarkupLanguage {
  
  @scala.inline
  def apply(): MarkupLanguage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarkupLanguage]
  }
  
  @scala.inline
  implicit class MarkupLanguageMutableBuilder[Self <: MarkupLanguage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMarkupLanguage(value: String): Self = StObject.set(x, "markupLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkupLanguageUndefined: Self = StObject.set(x, "markupLanguage", js.undefined)
    
    @scala.inline
    def setScriptingLanguage(value: String): Self = StObject.set(x, "scriptingLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScriptingLanguageUndefined: Self = StObject.set(x, "scriptingLanguage", js.undefined)
    
    @scala.inline
    def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}

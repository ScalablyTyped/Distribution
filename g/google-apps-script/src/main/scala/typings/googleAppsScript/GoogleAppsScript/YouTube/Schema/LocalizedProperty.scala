package typings.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocalizedProperty extends js.Object {
  
  var default: js.UndefOr[String] = js.native
  
  var defaultLanguage: js.UndefOr[LanguageTag] = js.native
  
  var localized: js.UndefOr[js.Array[LocalizedString]] = js.native
}
object LocalizedProperty {
  
  @scala.inline
  def apply(): LocalizedProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalizedProperty]
  }
  
  @scala.inline
  implicit class LocalizedPropertyOps[Self <: LocalizedProperty] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDefault(value: String): Self = this.set("default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    
    @scala.inline
    def setDefaultLanguage(value: LanguageTag): Self = this.set("defaultLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultLanguage: Self = this.set("defaultLanguage", js.undefined)
    
    @scala.inline
    def setLocalizedVarargs(value: LocalizedString*): Self = this.set("localized", js.Array(value :_*))
    
    @scala.inline
    def setLocalized(value: js.Array[LocalizedString]): Self = this.set("localized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalized: Self = this.set("localized", js.undefined)
  }
}

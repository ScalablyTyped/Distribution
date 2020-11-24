package typings.googleAppsScript.GoogleAppsScript.Language

import typings.googleAppsScript.googleAppsScriptStrings.html
import typings.googleAppsScript.googleAppsScriptStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LanguageAdvancedParameters extends js.Object {
  
  /** the content type of the text; supported values are 'text' (default) and 'html' */
  var contentType: js.UndefOr[html | text] = js.native
}
object LanguageAdvancedParameters {
  
  @scala.inline
  def apply(): LanguageAdvancedParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LanguageAdvancedParameters]
  }
  
  @scala.inline
  implicit class LanguageAdvancedParametersOps[Self <: LanguageAdvancedParameters] (val x: Self) extends AnyVal {
    
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
    def setContentType(value: html | text): Self = this.set("contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
  }
}

package typings.flatpickr.datesMod

import typings.flatpickr.localeMod.Locale
import typings.flatpickr.optionsMod.ParsedOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormatterArgs extends js.Object {
  
  var config: js.UndefOr[ParsedOptions] = js.native
  
  var isMobile: js.UndefOr[Boolean] = js.native
  
  var l10n: js.UndefOr[Locale] = js.native
}
object FormatterArgs {
  
  @scala.inline
  def apply(): FormatterArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormatterArgs]
  }
  
  @scala.inline
  implicit class FormatterArgsOps[Self <: FormatterArgs] (val x: Self) extends AnyVal {
    
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
    def setConfig(value: ParsedOptions): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    
    @scala.inline
    def setIsMobile(value: Boolean): Self = this.set("isMobile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsMobile: Self = this.set("isMobile", js.undefined)
    
    @scala.inline
    def setL10n(value: Locale): Self = this.set("l10n", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteL10n: Self = this.set("l10n", js.undefined)
  }
}

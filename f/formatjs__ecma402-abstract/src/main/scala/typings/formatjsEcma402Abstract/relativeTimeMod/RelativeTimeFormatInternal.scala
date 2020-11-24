package typings.formatjsEcma402Abstract.relativeTimeMod

import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.always
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.auto
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.long
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.narrow
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.short
import typings.std.Intl.NumberFormat
import typings.std.Intl.PluralRules
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RelativeTimeFormatInternal extends js.Object {
  
  var fields: LocaleFieldsData = js.native
  
  var initializedRelativeTimeFormat: Boolean = js.native
  
  var locale: String = js.native
  
  var numberFormat: NumberFormat = js.native
  
  var numberingSystem: String = js.native
  
  var numeric: js.UndefOr[always | auto] = js.native
  
  var pluralRules: PluralRules = js.native
  
  var style: js.UndefOr[long | short | narrow] = js.native
}
object RelativeTimeFormatInternal {
  
  @scala.inline
  def apply(
    fields: LocaleFieldsData,
    initializedRelativeTimeFormat: Boolean,
    locale: String,
    numberFormat: NumberFormat,
    numberingSystem: String,
    pluralRules: PluralRules
  ): RelativeTimeFormatInternal = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], initializedRelativeTimeFormat = initializedRelativeTimeFormat.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], numberFormat = numberFormat.asInstanceOf[js.Any], numberingSystem = numberingSystem.asInstanceOf[js.Any], pluralRules = pluralRules.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelativeTimeFormatInternal]
  }
  
  @scala.inline
  implicit class RelativeTimeFormatInternalOps[Self <: RelativeTimeFormatInternal] (val x: Self) extends AnyVal {
    
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
    def setFields(value: LocaleFieldsData): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitializedRelativeTimeFormat(value: Boolean): Self = this.set("initializedRelativeTimeFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberFormat(value: NumberFormat): Self = this.set("numberFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberingSystem(value: String): Self = this.set("numberingSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPluralRules(value: PluralRules): Self = this.set("pluralRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumeric(value: always | auto): Self = this.set("numeric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumeric: Self = this.set("numeric", js.undefined)
    
    @scala.inline
    def setStyle(value: long | short | narrow): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}

package typings.formatjsEcma402Abstract.relativeTimeMod

import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.always
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.auto
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.long
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.narrow
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.short
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Pick<@formatjs/ecma402-abstract.@formatjs/ecma402-abstract/lib/types/relative-time.IntlRelativeTimeFormatOptions, 'style' | 'numeric'> */
@js.native
trait ResolvedIntlRelativeTimeFormatOptions extends js.Object {
  
  /**
    * The BCP 47 language tag for the locale actually used.
    * If any Unicode extension values were requested in the
    * input BCP 47 language tag that led to this locale,
    * the key-value pairs that were requested and are
    * supported for this locale are included in locale.
    */
  var locale: String = js.native
  
  /**
    * The value requested using the Unicode
    * extension key "nu" or filled in as a default.
    */
  var numberingSystem: String = js.native
  
  var numeric: js.UndefOr[always | auto] = js.native
  
  var style: js.UndefOr[long | short | narrow] = js.native
}
object ResolvedIntlRelativeTimeFormatOptions {
  
  @scala.inline
  def apply(locale: String, numberingSystem: String): ResolvedIntlRelativeTimeFormatOptions = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], numberingSystem = numberingSystem.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedIntlRelativeTimeFormatOptions]
  }
  
  @scala.inline
  implicit class ResolvedIntlRelativeTimeFormatOptionsOps[Self <: ResolvedIntlRelativeTimeFormatOptions] (val x: Self) extends AnyVal {
    
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
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberingSystem(value: String): Self = this.set("numberingSystem", value.asInstanceOf[js.Any])
    
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

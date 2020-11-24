package typings.formatjsIntlListformat.libMod

import typings.formatjsIntlListformat.formatjsIntlListformatStrings.conjunction
import typings.formatjsIntlListformat.formatjsIntlListformatStrings.disjunction
import typings.formatjsIntlListformat.formatjsIntlListformatStrings.long
import typings.formatjsIntlListformat.formatjsIntlListformatStrings.narrow
import typings.formatjsIntlListformat.formatjsIntlListformatStrings.short
import typings.formatjsIntlListformat.formatjsIntlListformatStrings.unit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResolvedIntlListFormatOptions extends js.Object {
  
  /**
    * The BCP 47 language tag for the locale actually used.
    * If any Unicode extension values were requested in the
    * input BCP 47 language tag that led to this locale,
    * the key-value pairs that were requested and are
    * supported for this locale are included in locale.
    */
  var locale: String = js.native
  
  /**
    * The length of the internationalized message. Possible values are:
    * - "long" (default, e.g., in 1 month)
    * - "short" (e.g., in 1 mo.),
    * - or "narrow" (e.g., in 1 mo.).
    * The narrow style could be similar to the short style for some locales.
    */
  var style: long | short | narrow = js.native
  
  /**
    * The format of output message. Possible values are:
    * - "always" (default, e.g., 1 day ago),
    * - or "auto" (e.g., yesterday).
    * The "auto" value allows to not always have to
    * use numeric values in the output.
    */
  var `type`: conjunction | disjunction | unit = js.native
}
object ResolvedIntlListFormatOptions {
  
  @scala.inline
  def apply(locale: String, style: long | short | narrow, `type`: conjunction | disjunction | unit): ResolvedIntlListFormatOptions = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedIntlListFormatOptions]
  }
  
  @scala.inline
  implicit class ResolvedIntlListFormatOptionsOps[Self <: ResolvedIntlListFormatOptions] (val x: Self) extends AnyVal {
    
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
    def setStyle(value: long | short | narrow): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: conjunction | disjunction | unit): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}

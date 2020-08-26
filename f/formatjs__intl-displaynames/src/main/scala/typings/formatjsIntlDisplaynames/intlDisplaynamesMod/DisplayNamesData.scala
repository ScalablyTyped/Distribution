package typings.formatjsIntlDisplaynames.intlDisplaynamesMod

import typings.formatjsIntlDisplaynames.anon.Currency
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisplayNamesData extends js.Object {
  /**
    * Not in spec, but we need this to display both language and region in display name.
    * e.g. zh-Hans-SG + "{0}（{1}）" -> 简体中文（新加坡）
    * Here {0} is replaced by language display name and {1} is replaced by region display name.
    */
  var patterns: typings.formatjsIntlDisplaynames.anon.Locale = js.native
  /**
    * Note that for style fields, `short` and `narrow` might not exist.
    * At runtime, the fallback order will be narrow -> short -> long.
    */
  var types: Currency = js.native
}

object DisplayNamesData {
  @scala.inline
  def apply(patterns: typings.formatjsIntlDisplaynames.anon.Locale, types: Currency): DisplayNamesData = {
    val __obj = js.Dynamic.literal(patterns = patterns.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayNamesData]
  }
  @scala.inline
  implicit class DisplayNamesDataOps[Self <: DisplayNamesData] (val x: Self) extends AnyVal {
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
    def setPatterns(value: typings.formatjsIntlDisplaynames.anon.Locale): Self = this.set("patterns", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypes(value: Currency): Self = this.set("types", value.asInstanceOf[js.Any])
  }
  
}


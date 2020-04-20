package typings.formatjsIntlUtils.displaynamesTypesMod

import typings.formatjsIntlUtils.AnonCurrency
import typings.formatjsIntlUtils.AnonLocale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisplayNamesData extends js.Object {
  /**
    * Not in spec, but we need this to display both language and region in display name.
    * e.g. zh-Hans-SG + "{0}（{1}）" -> 简体中文（新加坡）
    * Here {0} is replaced by language display name and {1} is replaced by region display name.
    */
  var patterns: AnonLocale
  /**
    * Note that for style fields, `short` and `narrow` might not exist.
    * At runtime, the fallback order will be narrow -> short -> long.
    */
  var types: AnonCurrency
}

object DisplayNamesData {
  @scala.inline
  def apply(patterns: AnonLocale, types: AnonCurrency): DisplayNamesData = {
    val __obj = js.Dynamic.literal(patterns = patterns.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayNamesData]
  }
}


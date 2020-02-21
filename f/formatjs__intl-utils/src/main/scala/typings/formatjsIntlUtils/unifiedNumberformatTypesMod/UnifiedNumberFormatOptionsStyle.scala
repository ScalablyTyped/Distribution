package typings.formatjsIntlUtils.unifiedNumberformatTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.formatjsIntlUtils.formatjsIntlUtilsStrings.decimal
  - typings.formatjsIntlUtils.formatjsIntlUtilsStrings.percent
  - typings.formatjsIntlUtils.formatjsIntlUtilsStrings.currency
  - typings.formatjsIntlUtils.formatjsIntlUtilsStrings.unit
*/
trait UnifiedNumberFormatOptionsStyle extends js.Object

object UnifiedNumberFormatOptionsStyle {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def currency: typings.formatjsIntlUtils.formatjsIntlUtilsStrings.currency = this.cast("currency")
  @scala.inline
  def decimal: typings.formatjsIntlUtils.formatjsIntlUtilsStrings.decimal = this.cast("decimal")
  @scala.inline
  def percent: typings.formatjsIntlUtils.formatjsIntlUtilsStrings.percent = this.cast("percent")
  @scala.inline
  def unit: typings.formatjsIntlUtils.formatjsIntlUtilsStrings.unit = this.cast("unit")
}


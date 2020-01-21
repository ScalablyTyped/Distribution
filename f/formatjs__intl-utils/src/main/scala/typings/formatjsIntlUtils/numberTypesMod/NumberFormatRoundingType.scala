package typings.formatjsIntlUtils.numberTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.formatjsIntlUtils.formatjsIntlUtilsStrings.significantDigits
  - typings.formatjsIntlUtils.formatjsIntlUtilsStrings.fractionDigits
  - typings.formatjsIntlUtils.formatjsIntlUtilsStrings.compactRounding
*/
trait NumberFormatRoundingType extends js.Object

object NumberFormatRoundingType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def compactRounding: typings.formatjsIntlUtils.formatjsIntlUtilsStrings.compactRounding = this.cast("compactRounding")
  @scala.inline
  def fractionDigits: typings.formatjsIntlUtils.formatjsIntlUtilsStrings.fractionDigits = this.cast("fractionDigits")
  @scala.inline
  def significantDigits: typings.formatjsIntlUtils.formatjsIntlUtilsStrings.significantDigits = this.cast("significantDigits")
}


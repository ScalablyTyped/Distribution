package typings.formatjsIntlUtils.numberTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SymbolsData extends js.Object {
  var decimal: String
  var exponential: String
  var group: String
  var infinity: String
  var list: String
  var minusSign: String
  var nan: String
  var perMille: String
  var percentSign: String
  var plusSign: String
  var superscriptingExponent: String
  var timeSeparator: String
}

object SymbolsData {
  @scala.inline
  def apply(
    decimal: String,
    exponential: String,
    group: String,
    infinity: String,
    list: String,
    minusSign: String,
    nan: String,
    perMille: String,
    percentSign: String,
    plusSign: String,
    superscriptingExponent: String,
    timeSeparator: String
  ): SymbolsData = {
    val __obj = js.Dynamic.literal(decimal = decimal.asInstanceOf[js.Any], exponential = exponential.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], infinity = infinity.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], minusSign = minusSign.asInstanceOf[js.Any], nan = nan.asInstanceOf[js.Any], perMille = perMille.asInstanceOf[js.Any], percentSign = percentSign.asInstanceOf[js.Any], plusSign = plusSign.asInstanceOf[js.Any], superscriptingExponent = superscriptingExponent.asInstanceOf[js.Any], timeSeparator = timeSeparator.asInstanceOf[js.Any])
    __obj.asInstanceOf[SymbolsData]
  }
}


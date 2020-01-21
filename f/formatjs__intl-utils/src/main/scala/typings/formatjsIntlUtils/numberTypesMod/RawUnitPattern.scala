package typings.formatjsIntlUtils.numberTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RawUnitPattern extends js.Object {
  var pattern: String
  var symbol: js.Array[String]
}

object RawUnitPattern {
  @scala.inline
  def apply(pattern: String, symbol: js.Array[String]): RawUnitPattern = {
    val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RawUnitPattern]
  }
}


package typings.atFormatjsIntlDashUtils.distNumberDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnitPattern extends js.Object {
  var long: SignDisplayPattern
  var narrow: SignDisplayPattern
  var short: SignDisplayPattern
}

object UnitPattern {
  @scala.inline
  def apply(long: SignDisplayPattern, narrow: SignDisplayPattern, short: SignDisplayPattern): UnitPattern = {
    val __obj = js.Dynamic.literal(long = long.asInstanceOf[js.Any], narrow = narrow.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UnitPattern]
  }
}


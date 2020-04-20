package typings.formatjsIntlUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCardinal extends js.Object {
  var cardinal: js.Array[String]
  var ordinal: js.Array[String]
}

object AnonCardinal {
  @scala.inline
  def apply(cardinal: js.Array[String], ordinal: js.Array[String]): AnonCardinal = {
    val __obj = js.Dynamic.literal(cardinal = cardinal.asInstanceOf[js.Any], ordinal = ordinal.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCardinal]
  }
}


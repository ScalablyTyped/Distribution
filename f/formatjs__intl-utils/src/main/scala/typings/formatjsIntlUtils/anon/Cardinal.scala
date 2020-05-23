package typings.formatjsIntlUtils.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cardinal extends js.Object {
  var cardinal: js.Array[String]
  var ordinal: js.Array[String]
}

object Cardinal {
  @scala.inline
  def apply(cardinal: js.Array[String], ordinal: js.Array[String]): Cardinal = {
    val __obj = js.Dynamic.literal(cardinal = cardinal.asInstanceOf[js.Any], ordinal = ordinal.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cardinal]
  }
}


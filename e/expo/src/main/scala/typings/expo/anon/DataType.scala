package typings.expo.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataType extends js.Object {
  var data: js.Object
  var `type`: String
}

object DataType {
  @scala.inline
  def apply(data: js.Object, `type`: String): DataType = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataType]
  }
}


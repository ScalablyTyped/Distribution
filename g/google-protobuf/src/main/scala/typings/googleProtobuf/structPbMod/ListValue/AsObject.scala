package typings.googleProtobuf.structPbMod.ListValue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var valuesList: js.Array[typings.googleProtobuf.structPbMod.Value.AsObject]
}

object AsObject {
  @scala.inline
  def apply(valuesList: js.Array[typings.googleProtobuf.structPbMod.Value.AsObject]): AsObject = {
    val __obj = js.Dynamic.literal(valuesList = valuesList.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AsObject]
  }
}


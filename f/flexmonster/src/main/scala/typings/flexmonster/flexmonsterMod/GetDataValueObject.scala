package typings.flexmonster.flexmonsterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDataValueObject extends js.Object {
  var data: js.Array[js.Object]
  var meta: js.Object
}

object GetDataValueObject {
  @scala.inline
  def apply(data: js.Array[js.Object], meta: js.Object): GetDataValueObject = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetDataValueObject]
  }
}


package typings.googleDashProtobuf.googleProtobufStructUnderscorePbMod.Struct

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var fieldsMap: js.Array[
    js.Tuple2[
      String, 
      typings.googleDashProtobuf.googleProtobufStructUnderscorePbMod.Value.AsObject
    ]
  ]
}

object AsObject {
  @scala.inline
  def apply(
    fieldsMap: js.Array[
      js.Tuple2[
        String, 
        typings.googleDashProtobuf.googleProtobufStructUnderscorePbMod.Value.AsObject
      ]
    ]
  ): AsObject = {
    val __obj = js.Dynamic.literal(fieldsMap = fieldsMap)
  
    __obj.asInstanceOf[AsObject]
  }
}


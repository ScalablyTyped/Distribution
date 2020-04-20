package typings.googleCloudKms.mod.v1

import typings.googleProtobuf.timestampPbMod.Timestamp.AsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyRing extends js.Object {
  var createTime: AsObject
  var name: String
}

object KeyRing {
  @scala.inline
  def apply(createTime: AsObject, name: String): KeyRing = {
    val __obj = js.Dynamic.literal(createTime = createTime.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyRing]
  }
}


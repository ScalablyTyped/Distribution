package typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1

import typings.googleDashProtobuf.googleProtobufTimestampUnderscorePbMod.Timestamp.AsObject
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
    val __obj = js.Dynamic.literal(createTime = createTime, name = name)
  
    __obj.asInstanceOf[KeyRing]
  }
}


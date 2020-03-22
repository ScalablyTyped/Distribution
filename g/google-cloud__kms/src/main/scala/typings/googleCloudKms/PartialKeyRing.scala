package typings.googleCloudKms

import typings.googleProtobuf.timestampPbMod.Timestamp.AsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@google-cloud/kms.@google-cloud/kms.v1.KeyRing> */
trait PartialKeyRing extends js.Object {
  var createTime: js.UndefOr[AsObject] = js.undefined
  var name: js.UndefOr[String] = js.undefined
}

object PartialKeyRing {
  @scala.inline
  def apply(createTime: AsObject = null, name: String = null): PartialKeyRing = {
    val __obj = js.Dynamic.literal()
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialKeyRing]
  }
}


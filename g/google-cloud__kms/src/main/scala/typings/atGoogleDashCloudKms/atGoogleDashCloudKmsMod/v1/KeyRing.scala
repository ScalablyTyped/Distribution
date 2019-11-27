package typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyRing extends js.Object {
  var createTime: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify google_protobuf_timestamp_pb.Timestamp.AsObject */ js.Any
  var name: String
}

object KeyRing {
  @scala.inline
  def apply(
    createTime: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify google_protobuf_timestamp_pb.Timestamp.AsObject */ js.Any,
    name: String
  ): KeyRing = {
    val __obj = js.Dynamic.literal(createTime = createTime.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[KeyRing]
  }
}


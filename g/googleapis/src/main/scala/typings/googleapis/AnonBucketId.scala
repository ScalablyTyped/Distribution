package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBucketId extends js.Object {
  var bucketId: js.UndefOr[String] = js.native
  var objectId: js.UndefOr[String] = js.native
}

object AnonBucketId {
  @scala.inline
  def apply(bucketId: String = null, objectId: String = null): AnonBucketId = {
    val __obj = js.Dynamic.literal()
    if (bucketId != null) __obj.updateDynamic("bucketId")(bucketId.asInstanceOf[js.Any])
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBucketId]
  }
}


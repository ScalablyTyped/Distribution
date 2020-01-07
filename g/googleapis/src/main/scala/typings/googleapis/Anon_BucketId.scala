package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_BucketId extends js.Object {
  var bucketId: js.UndefOr[String] = js.native
  var objectId: js.UndefOr[String] = js.native
}

object Anon_BucketId {
  @scala.inline
  def apply(bucketId: String = null, objectId: String = null): Anon_BucketId = {
    val __obj = js.Dynamic.literal()
    if (bucketId != null) __obj.updateDynamic("bucketId")(bucketId.asInstanceOf[js.Any])
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BucketId]
  }
}


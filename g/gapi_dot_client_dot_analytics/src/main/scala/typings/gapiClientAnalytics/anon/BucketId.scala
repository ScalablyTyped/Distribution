package typings.gapiClientAnalytics.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketId extends js.Object {
  /** Id of the bucket the file object is stored in. */
  var bucketId: js.UndefOr[String] = js.undefined
  /** Id of the file object containing the report data. */
  var objectId: js.UndefOr[String] = js.undefined
}

object BucketId {
  @scala.inline
  def apply(bucketId: String = null, objectId: String = null): BucketId = {
    val __obj = js.Dynamic.literal()
    if (bucketId != null) __obj.updateDynamic("bucketId")(bucketId.asInstanceOf[js.Any])
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketId]
  }
}


package typings.gapiDotClientDotAnalytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BucketId extends js.Object {
  /** Id of the bucket the file object is stored in. */
  var bucketId: js.UndefOr[String] = js.undefined
  /** Id of the file object containing the report data. */
  var objectId: js.UndefOr[String] = js.undefined
}

object Anon_BucketId {
  @scala.inline
  def apply(bucketId: String = null, objectId: String = null): Anon_BucketId = {
    val __obj = js.Dynamic.literal()
    if (bucketId != null) __obj.updateDynamic("bucketId")(bucketId)
    if (objectId != null) __obj.updateDynamic("objectId")(objectId)
    __obj.asInstanceOf[Anon_BucketId]
  }
}


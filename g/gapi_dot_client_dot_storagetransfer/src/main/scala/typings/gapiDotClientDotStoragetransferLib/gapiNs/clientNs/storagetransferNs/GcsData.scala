package typings
package gapiDotClientDotStoragetransferLib.gapiNs.clientNs.storagetransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GcsData extends js.Object {
  /**
    * Google Cloud Storage bucket name (see
    * [Bucket Name Requirements](https://cloud.google.com/storage/docs/bucket-naming#requirements)).
    * Required.
    */
  var bucketName: js.UndefOr[java.lang.String] = js.undefined
}

object GcsData {
  @scala.inline
  def apply(bucketName: java.lang.String = null): GcsData = {
    val __obj = js.Dynamic.literal()
    if (bucketName != null) __obj.updateDynamic("bucketName")(bucketName)
    __obj.asInstanceOf[GcsData]
  }
}


package typings.googleapis.buildSrcApisStoragetransferV1Mod.storagetransfer_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In a GcsData resource, an object&#39;s name is the Google Cloud Storage
  * object&#39;s name and its `lastModificationTime` refers to the object&#39;s
  * updated time, which changes when the content or the metadata of the object
  * is updated.
  */
@js.native
trait Schema$GcsData extends js.Object {
  /**
    * Google Cloud Storage bucket name (see [Bucket Name
    * Requirements](https://cloud.google.com/storage/docs/naming#requirements)).
    * Required.
    */
  var bucketName: js.UndefOr[String] = js.native
}

object Schema$GcsData {
  @scala.inline
  def apply(bucketName: String = null): Schema$GcsData = {
    val __obj = js.Dynamic.literal()
    if (bucketName != null) __obj.updateDynamic("bucketName")(bucketName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GcsData]
  }
}


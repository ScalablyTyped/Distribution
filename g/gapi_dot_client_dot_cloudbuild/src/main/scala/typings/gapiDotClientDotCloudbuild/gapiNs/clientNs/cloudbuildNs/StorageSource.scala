package typings.gapiDotClientDotCloudbuild.gapiNs.clientNs.cloudbuildNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StorageSource extends js.Object {
  /**
    * Google Cloud Storage bucket containing source (see
    * [Bucket Name
    * Requirements](https://cloud.google.com/storage/docs/bucket-naming#requirements)).
    */
  var bucket: js.UndefOr[String] = js.undefined
  /**
    * Google Cloud Storage generation for the object. If the generation is
    * omitted, the latest generation will be used.
    */
  var generation: js.UndefOr[String] = js.undefined
  /**
    * Google Cloud Storage object containing source.
    *
    * This object must be a gzipped archive file (.tar.gz) containing source to
    * build.
    */
  var `object`: js.UndefOr[String] = js.undefined
}

object StorageSource {
  @scala.inline
  def apply(bucket: String = null, generation: String = null, `object`: String = null): StorageSource = {
    val __obj = js.Dynamic.literal()
    if (bucket != null) __obj.updateDynamic("bucket")(bucket)
    if (generation != null) __obj.updateDynamic("generation")(generation)
    if (`object` != null) __obj.updateDynamic("object")(`object`)
    __obj.asInstanceOf[StorageSource]
  }
}


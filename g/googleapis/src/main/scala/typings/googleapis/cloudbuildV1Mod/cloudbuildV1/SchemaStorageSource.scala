package typings.googleapis.cloudbuildV1Mod.cloudbuildV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Location of the source in an archive file in Google Cloud Storage.
  */
@js.native
trait SchemaStorageSource extends js.Object {
  /**
    * Google Cloud Storage bucket containing the source (see [Bucket Name
    * Requirements](https://cloud.google.com/storage/docs/bucket-naming#requirements)).
    */
  var bucket: js.UndefOr[String] = js.native
  /**
    * Google Cloud Storage generation for the object. If the generation is
    * omitted, the latest generation will be used.
    */
  var generation: js.UndefOr[String] = js.native
  /**
    * Google Cloud Storage object containing the source.  This object must be a
    * gzipped archive file (`.tar.gz`) containing source to build.
    */
  var `object`: js.UndefOr[String] = js.native
}

object SchemaStorageSource {
  @scala.inline
  def apply(bucket: String = null, generation: String = null, `object`: String = null): SchemaStorageSource = {
    val __obj = js.Dynamic.literal()
    if (bucket != null) __obj.updateDynamic("bucket")(bucket.asInstanceOf[js.Any])
    if (generation != null) __obj.updateDynamic("generation")(generation.asInstanceOf[js.Any])
    if (`object` != null) __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaStorageSource]
  }
}


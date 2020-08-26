package typings.firebase.mod.storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The full set of object metadata, including read-only properties.
  */
@js.native
trait FullMetadata extends UploadMetadata {
  /**
    * The bucket this object is contained in.
    */
  var bucket: String = js.native
  /**
    * @deprecated
    * Use Reference.getDownloadURL instead. This property will be removed in a
    * future release.
    */
  var downloadURLs: js.Array[String] = js.native
  /**
    * The full path of this object.
    */
  var fullPath: String = js.native
  /**
    * The object's generation.
    * @see {@link https://cloud.google.com/storage/docs/generations-preconditions}
    */
  var generation: String = js.native
  /**
    * The object's metageneration.
    * @see {@link https://cloud.google.com/storage/docs/generations-preconditions}
    */
  var metageneration: String = js.native
  /**
    * The short name of this object, which is the last component of the full path.
    * For example, if fullPath is 'full/path/image.png', name is 'image.png'.
    */
  var name: String = js.native
  /**
    * The size of this object, in bytes.
    */
  var size: Double = js.native
  /**
    * A date string representing when this object was created.
    */
  var timeCreated: String = js.native
  /**
    * A date string representing when this object was last updated.
    */
  var updated: String = js.native
}

object FullMetadata {
  @scala.inline
  def apply(
    bucket: String,
    downloadURLs: js.Array[String],
    fullPath: String,
    generation: String,
    metageneration: String,
    name: String,
    size: Double,
    timeCreated: String,
    updated: String
  ): FullMetadata = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], downloadURLs = downloadURLs.asInstanceOf[js.Any], fullPath = fullPath.asInstanceOf[js.Any], generation = generation.asInstanceOf[js.Any], metageneration = metageneration.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], timeCreated = timeCreated.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullMetadata]
  }
  @scala.inline
  implicit class FullMetadataOps[Self <: FullMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBucket(value: String): Self = this.set("bucket", value.asInstanceOf[js.Any])
    @scala.inline
    def setDownloadURLsVarargs(value: String*): Self = this.set("downloadURLs", js.Array(value :_*))
    @scala.inline
    def setDownloadURLs(value: js.Array[String]): Self = this.set("downloadURLs", value.asInstanceOf[js.Any])
    @scala.inline
    def setFullPath(value: String): Self = this.set("fullPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setGeneration(value: String): Self = this.set("generation", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetageneration(value: String): Self = this.set("metageneration", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeCreated(value: String): Self = this.set("timeCreated", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdated(value: String): Self = this.set("updated", value.asInstanceOf[js.Any])
  }
  
}


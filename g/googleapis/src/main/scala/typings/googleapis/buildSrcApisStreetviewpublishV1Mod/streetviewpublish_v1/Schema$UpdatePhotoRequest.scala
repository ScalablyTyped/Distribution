package typings.googleapis.buildSrcApisStreetviewpublishV1Mod.streetviewpublish_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to update the metadata of a Photo. Updating the pixels of a photo
  * is not supported.
  */
@js.native
trait Schema$UpdatePhotoRequest extends js.Object {
  /**
    * Required. Photo object containing the new metadata.
    */
  var photo: js.UndefOr[Schema$Photo] = js.native
  /**
    * Mask that identifies fields on the photo metadata to update. If not
    * present, the old Photo metadata is entirely replaced with the new Photo
    * metadata in this request. The update fails if invalid fields are
    * specified. Multiple fields can be specified in a comma-delimited list.
    * The following fields are valid:  * `pose.heading` * `pose.latLngPair` *
    * `pose.pitch` * `pose.roll` * `pose.level` * `pose.altitude` *
    * `connections` * `places`   &lt;aside
    * class=&quot;note&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; When updateMask
    * contains repeated fields, the entire set of repeated values get replaced
    * with the new contents. For example, if updateMask contains `connections`
    * and `UpdatePhotoRequest.photo.connections` is empty, all connections are
    * removed.&lt;/aside&gt;
    */
  var updateMask: js.UndefOr[String] = js.native
}

object Schema$UpdatePhotoRequest {
  @scala.inline
  def apply(photo: Schema$Photo = null, updateMask: String = null): Schema$UpdatePhotoRequest = {
    val __obj = js.Dynamic.literal()
    if (photo != null) __obj.updateDynamic("photo")(photo.asInstanceOf[js.Any])
    if (updateMask != null) __obj.updateDynamic("updateMask")(updateMask.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UpdatePhotoRequest]
  }
}


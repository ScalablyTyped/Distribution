package typings.gapiClientBooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonVolumeAnnotationsVersion extends js.Object {
  /** The layer id of this layer (e.g. "geo"). */
  var layerId: js.UndefOr[String] = js.undefined
  /**
    * The current version of this layer's volume annotations. Note that this version applies only to the data in the books.layers.volumeAnnotations.&#42;
    * responses. The actual annotation data is versioned separately.
    */
  var volumeAnnotationsVersion: js.UndefOr[String] = js.undefined
}

object AnonVolumeAnnotationsVersion {
  @scala.inline
  def apply(layerId: String = null, volumeAnnotationsVersion: String = null): AnonVolumeAnnotationsVersion = {
    val __obj = js.Dynamic.literal()
    if (layerId != null) __obj.updateDynamic("layerId")(layerId.asInstanceOf[js.Any])
    if (volumeAnnotationsVersion != null) __obj.updateDynamic("volumeAnnotationsVersion")(volumeAnnotationsVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonVolumeAnnotationsVersion]
  }
}


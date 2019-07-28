package typings.gapiDotClientDotBooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LayerId extends js.Object {
  /** The layer id of this layer (e.g. "geo"). */
  var layerId: js.UndefOr[String] = js.undefined
  /**
    * The current version of this layer's volume annotations. Note that this version applies only to the data in the books.layers.volumeAnnotations.&#42;
    * responses. The actual annotation data is versioned separately.
    */
  var volumeAnnotationsVersion: js.UndefOr[String] = js.undefined
}

object Anon_LayerId {
  @scala.inline
  def apply(layerId: String = null, volumeAnnotationsVersion: String = null): Anon_LayerId = {
    val __obj = js.Dynamic.literal()
    if (layerId != null) __obj.updateDynamic("layerId")(layerId)
    if (volumeAnnotationsVersion != null) __obj.updateDynamic("volumeAnnotationsVersion")(volumeAnnotationsVersion)
    __obj.asInstanceOf[Anon_LayerId]
  }
}


package typings.googleapis.appengineV1betaMod.appengineV1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Volumes mounted within the app container. Only applicable in the App Engine
  * flexible environment.
  */
@js.native
trait SchemaVolume extends js.Object {
  /**
    * Unique name for the volume.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Volume size in gigabytes.
    */
  var sizeGb: js.UndefOr[Double] = js.native
  /**
    * Underlying volume type, e.g. &#39;tmpfs&#39;.
    */
  var volumeType: js.UndefOr[String] = js.native
}

object SchemaVolume {
  @scala.inline
  def apply(name: String = null, sizeGb: Int | Double = null, volumeType: String = null): SchemaVolume = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (sizeGb != null) __obj.updateDynamic("sizeGb")(sizeGb.asInstanceOf[js.Any])
    if (volumeType != null) __obj.updateDynamic("volumeType")(volumeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaVolume]
  }
}


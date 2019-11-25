package typings.gapiDotClientDotAppengine.gapi.client.appengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Volume extends js.Object {
  /** Unique name for the volume. */
  var name: js.UndefOr[String] = js.undefined
  /** Volume size in gigabytes. */
  var sizeGb: js.UndefOr[Double] = js.undefined
  /** Underlying volume type, e.g. 'tmpfs'. */
  var volumeType: js.UndefOr[String] = js.undefined
}

object Volume {
  @scala.inline
  def apply(name: String = null, sizeGb: Int | Double = null, volumeType: String = null): Volume = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (sizeGb != null) __obj.updateDynamic("sizeGb")(sizeGb.asInstanceOf[js.Any])
    if (volumeType != null) __obj.updateDynamic("volumeType")(volumeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Volume]
  }
}


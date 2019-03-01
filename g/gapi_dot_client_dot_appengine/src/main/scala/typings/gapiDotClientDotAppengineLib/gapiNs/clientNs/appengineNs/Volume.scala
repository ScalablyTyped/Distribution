package typings
package gapiDotClientDotAppengineLib.gapiNs.clientNs.appengineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Volume extends js.Object {
  /** Unique name for the volume. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Volume size in gigabytes. */
  var sizeGb: js.UndefOr[scala.Double] = js.undefined
  /** Underlying volume type, e.g. 'tmpfs'. */
  var volumeType: js.UndefOr[java.lang.String] = js.undefined
}

object Volume {
  @scala.inline
  def apply(
    name: java.lang.String = null,
    sizeGb: scala.Int | scala.Double = null,
    volumeType: java.lang.String = null
  ): Volume = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (sizeGb != null) __obj.updateDynamic("sizeGb")(sizeGb.asInstanceOf[js.Any])
    if (volumeType != null) __obj.updateDynamic("volumeType")(volumeType)
    __obj.asInstanceOf[Volume]
  }
}


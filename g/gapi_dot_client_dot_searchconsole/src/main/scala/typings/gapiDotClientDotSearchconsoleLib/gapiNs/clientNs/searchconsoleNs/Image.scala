package typings
package gapiDotClientDotSearchconsoleLib.gapiNs.clientNs.searchconsoleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Image extends js.Object {
  /**
    * Image data in format determined by the mime type. Currently, the format
    * will always be "image/png", but this might change in the future.
    */
  var data: js.UndefOr[java.lang.String] = js.undefined
  /** The mime-type of the image data. */
  var mimeType: js.UndefOr[java.lang.String] = js.undefined
}

object Image {
  @scala.inline
  def apply(data: java.lang.String = null, mimeType: java.lang.String = null): Image = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType)
    __obj.asInstanceOf[Image]
  }
}


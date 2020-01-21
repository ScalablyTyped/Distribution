package typings.gapiClientSearchconsole.gapi.client.searchconsole

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Image extends js.Object {
  /**
    * Image data in format determined by the mime type. Currently, the format
    * will always be "image/png", but this might change in the future.
    */
  var data: js.UndefOr[String] = js.undefined
  /** The mime-type of the image data. */
  var mimeType: js.UndefOr[String] = js.undefined
}

object Image {
  @scala.inline
  def apply(data: String = null, mimeType: String = null): Image = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Image]
  }
}


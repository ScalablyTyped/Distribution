package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  /**
    * The title of the URL at text.
    */
  var bookmark: js.UndefOr[String] = js.undefined
  var html: js.UndefOr[String] = js.undefined
  var image: js.UndefOr[NativeImage_] = js.undefined
  var rtf: js.UndefOr[String] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object Data {
  @scala.inline
  def apply(
    bookmark: String = null,
    html: String = null,
    image: NativeImage_ = null,
    rtf: String = null,
    text: String = null
  ): Data = {
    val __obj = js.Dynamic.literal()
    if (bookmark != null) __obj.updateDynamic("bookmark")(bookmark.asInstanceOf[js.Any])
    if (html != null) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (rtf != null) __obj.updateDynamic("rtf")(rtf.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
}


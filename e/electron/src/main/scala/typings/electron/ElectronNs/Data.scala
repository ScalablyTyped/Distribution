package typings.electron.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  /**
    * The title of the url at text.
    */
  var bookmark: js.UndefOr[String] = js.undefined
  var html: js.UndefOr[String] = js.undefined
  var image: js.UndefOr[NativeImage] = js.undefined
  var rtf: js.UndefOr[String] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object Data {
  @scala.inline
  def apply(
    bookmark: String = null,
    html: String = null,
    image: NativeImage = null,
    rtf: String = null,
    text: String = null
  ): Data = {
    val __obj = js.Dynamic.literal()
    if (bookmark != null) __obj.updateDynamic("bookmark")(bookmark)
    if (html != null) __obj.updateDynamic("html")(html)
    if (image != null) __obj.updateDynamic("image")(image)
    if (rtf != null) __obj.updateDynamic("rtf")(rtf)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[Data]
  }
}


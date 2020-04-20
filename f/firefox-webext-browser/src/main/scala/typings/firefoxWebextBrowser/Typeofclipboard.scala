package typings.firefoxWebextBrowser

import typings.firefoxWebextBrowser.browser.clipboard.ArrayBuffer
import typings.firefoxWebextBrowser.browser.clipboard._SetImageData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofclipboard extends js.Object {
  /* clipboard functions */
  /**
    * Copy an image to the clipboard. The image is re-encoded before it is written to the clipboard. If the image is
    * invalid, the clipboard is not modified.
    * @param imageData The image data to be copied.
    * @param imageType The type of imageData.
    */
  def setImageData(imageData: ArrayBuffer, imageType: _SetImageData): js.Promise[Unit]
}

object Typeofclipboard {
  @scala.inline
  def apply(setImageData: (ArrayBuffer, _SetImageData) => js.Promise[Unit]): Typeofclipboard = {
    val __obj = js.Dynamic.literal(setImageData = js.Any.fromFunction2(setImageData))
    __obj.asInstanceOf[Typeofclipboard]
  }
}


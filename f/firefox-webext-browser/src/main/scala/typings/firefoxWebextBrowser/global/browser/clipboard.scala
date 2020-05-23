package typings.firefoxWebextBrowser.global.browser

import typings.firefoxWebextBrowser.browser.clipboard.ArrayBuffer
import typings.firefoxWebextBrowser.browser.clipboard.SetImageData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Offers the ability to write to the clipboard. Reading is not supported because the clipboard can already be read
  * through the standard web platform APIs.
  *
  * Permissions: `clipboardWrite`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
@JSGlobal("browser.clipboard")
@js.native
object clipboard extends js.Object {
  /* clipboard functions */
  /**
    * Copy an image to the clipboard. The image is re-encoded before it is written to the clipboard. If the image is
    * invalid, the clipboard is not modified.
    * @param imageData The image data to be copied.
    * @param imageType The type of imageData.
    */
  def setImageData(imageData: ArrayBuffer, imageType: SetImageData): js.Promise[Unit] = js.native
}


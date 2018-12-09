package typings
package firefoxDashWebextDashBrowserLib.browserNs.clipboardNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.clipboard")
@js.native
object clipboardNsMembers extends js.Object {
  /* clipboard functions */
  /**
       * Copy an image to the clipboard. The image is re-encoded before it is written to the clipboard. If the image is
       * invalid, the clipboard is not modified.
       * @param imageData The image data to be copied.
       * @param imageType The type of imageData.
       */
  def setImageData(imageData: ArrayBuffer, imageType: _SetImageData): js.Promise[scala.Unit] = js.native
}


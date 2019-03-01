package typings
package dropzoneLib.dropzoneMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTMLElement extends js.Object {
  var dropzone: dropzoneLib.dropzoneMod.Dropzone
}

object HTMLElement {
  @scala.inline
  def apply(dropzone: dropzoneLib.dropzoneMod.Dropzone): HTMLElement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dropzone")(dropzone)
    __obj.asInstanceOf[HTMLElement]
  }
}


package typings
package dropzoneLib.dropzoneMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQuery extends js.Object {
  def dropzone(options: dropzoneLib.dropzoneMod.DropzoneOptions): dropzoneLib.dropzoneMod.Dropzone
}

object JQuery {
  @scala.inline
  def apply(dropzone: dropzoneLib.dropzoneMod.DropzoneOptions => dropzoneLib.dropzoneMod.Dropzone): JQuery = {
    val __obj = js.Dynamic.literal(dropzone = js.Any.fromFunction1(dropzone))
  
    __obj.asInstanceOf[JQuery]
  }
}


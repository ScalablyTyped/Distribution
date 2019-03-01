package typings
package dropzoneLib.dropzoneMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQuery extends js.Object {
  def dropzone(options: dropzoneLib.dropzoneMod.DropzoneNs.DropzoneOptions): dropzoneLib.dropzoneMod.Dropzone
}

object JQuery {
  @scala.inline
  def apply(
    dropzone: js.Function1[
      dropzoneLib.dropzoneMod.DropzoneNs.DropzoneOptions, 
      dropzoneLib.dropzoneMod.Dropzone
    ]
  ): JQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dropzone")(dropzone)
    __obj.asInstanceOf[JQuery]
  }
}


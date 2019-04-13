package typings
package dropzoneLib.dropzoneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropzoneFile
  extends stdLib.File {
  var accepted: scala.Boolean = js.native
  var previewElement: dropzoneLib.dropzoneMod.Global.HTMLElement = js.native
  var previewTemplate: dropzoneLib.dropzoneMod.Global.HTMLElement = js.native
  var previewsContainer: dropzoneLib.dropzoneMod.Global.HTMLElement = js.native
  var status: java.lang.String = js.native
  var xhr: js.UndefOr[stdLib.XMLHttpRequest] = js.native
}


package typings.dropzone.mod

import typings.dropzone.mod.global.HTMLElement
import typings.std.File
import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropzoneFile extends File {
  var accepted: Boolean = js.native
  var previewElement: HTMLElement = js.native
  var previewTemplate: HTMLElement = js.native
  var previewsContainer: HTMLElement = js.native
  var status: String = js.native
  var upload: js.UndefOr[DropzoneFileUpload] = js.native
  var xhr: js.UndefOr[XMLHttpRequest] = js.native
}


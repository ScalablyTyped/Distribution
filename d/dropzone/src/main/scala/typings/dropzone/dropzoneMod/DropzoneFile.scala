package typings.dropzone.dropzoneMod

import typings.dropzone.dropzoneMod._Global_.HTMLElement
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
  var xhr: js.UndefOr[XMLHttpRequest] = js.native
}


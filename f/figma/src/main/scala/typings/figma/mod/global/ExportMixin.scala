package typings.figma.mod.global

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportMixin extends js.Object {
  var exportSettings: js.Array[ExportSettings] = js.native
  def exportAsync(): js.Promise[Uint8Array] = js.native
  def exportAsync(settings: ExportSettings): js.Promise[Uint8Array] = js.native
}


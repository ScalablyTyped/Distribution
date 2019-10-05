package typings.gapiDotDrive.gapi.client.drive

import typings.gapi.gapi.client.HttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client.drive.files")
@js.native
object files extends js.Object {
  def copy(parameters: CopyParameters): HttpRequest[FileResource] = js.native
  def delete(parameters: DeleteParameters): HttpRequest[_] = js.native
  def emptyTrash(): HttpRequest[_] = js.native
  def export(parameters: ExportParameters): HttpRequest[FileResource] = js.native
  def generateIds(parameters: GenerateIdsParameters): HttpRequest[IdsResource] = js.native
  def get(parameters: GetParameters): HttpRequest[FileResource] = js.native
  def insert(parameters: InsertParameters): HttpRequest[FileResource] = js.native
  def list(parameters: ListParameters): HttpRequest[FileListResource] = js.native
  def patch(parameters: PatchParameters): HttpRequest[FileResource] = js.native
  def touch(parameters: TouchParameters): HttpRequest[FileResource] = js.native
  def trash(parameters: TrashParameters): HttpRequest[FileResource] = js.native
  def untrash(parameters: UntrashParameters): HttpRequest[FileResource] = js.native
  def watch(parameters: WatchParameters): HttpRequest[ChannelResource] = js.native
}


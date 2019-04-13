package typings
package gapiDotDriveLib.gapiNs.clientNs.driveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client.drive.files")
@js.native
object files extends js.Object {
  def copy(parameters: gapiDotDriveLib.gapiNs.clientNs.driveNs.CopyParameters): gapiLib.gapiNs.clientNs.HttpRequest[gapiDotDriveLib.gapiNs.clientNs.driveNs.FileResource] = js.native
  def delete(parameters: gapiDotDriveLib.gapiNs.clientNs.driveNs.DeleteParameters): gapiLib.gapiNs.clientNs.HttpRequest[_] = js.native
  def emptyTrash(): gapiLib.gapiNs.clientNs.HttpRequest[_] = js.native
  def export(parameters: gapiDotDriveLib.gapiNs.clientNs.driveNs.ExportParameters): gapiLib.gapiNs.clientNs.HttpRequest[gapiDotDriveLib.gapiNs.clientNs.driveNs.FileResource] = js.native
  def generateIds(parameters: gapiDotDriveLib.gapiNs.clientNs.driveNs.GenerateIdsParameters): gapiLib.gapiNs.clientNs.HttpRequest[gapiDotDriveLib.gapiNs.clientNs.driveNs.IdsResource] = js.native
  def get(parameters: gapiDotDriveLib.gapiNs.clientNs.driveNs.GetParameters): gapiLib.gapiNs.clientNs.HttpRequest[gapiDotDriveLib.gapiNs.clientNs.driveNs.FileResource] = js.native
  def insert(parameters: gapiDotDriveLib.gapiNs.clientNs.driveNs.InsertParameters): gapiLib.gapiNs.clientNs.HttpRequest[gapiDotDriveLib.gapiNs.clientNs.driveNs.FileResource] = js.native
  def list(parameters: gapiDotDriveLib.gapiNs.clientNs.driveNs.ListParameters): gapiLib.gapiNs.clientNs.HttpRequest[gapiDotDriveLib.gapiNs.clientNs.driveNs.FileListResource] = js.native
  def patch(parameters: gapiDotDriveLib.gapiNs.clientNs.driveNs.PatchParameters): gapiLib.gapiNs.clientNs.HttpRequest[gapiDotDriveLib.gapiNs.clientNs.driveNs.FileResource] = js.native
  def touch(parameters: gapiDotDriveLib.gapiNs.clientNs.driveNs.TouchParameters): gapiLib.gapiNs.clientNs.HttpRequest[gapiDotDriveLib.gapiNs.clientNs.driveNs.FileResource] = js.native
  def trash(parameters: gapiDotDriveLib.gapiNs.clientNs.driveNs.TrashParameters): gapiLib.gapiNs.clientNs.HttpRequest[gapiDotDriveLib.gapiNs.clientNs.driveNs.FileResource] = js.native
  def untrash(parameters: gapiDotDriveLib.gapiNs.clientNs.driveNs.UntrashParameters): gapiLib.gapiNs.clientNs.HttpRequest[gapiDotDriveLib.gapiNs.clientNs.driveNs.FileResource] = js.native
  def watch(parameters: gapiDotDriveLib.gapiNs.clientNs.driveNs.WatchParameters): gapiLib.gapiNs.clientNs.HttpRequest[gapiDotDriveLib.gapiNs.clientNs.driveNs.ChannelResource] = js.native
}


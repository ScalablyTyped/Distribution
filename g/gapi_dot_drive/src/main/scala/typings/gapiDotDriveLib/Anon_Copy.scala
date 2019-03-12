package typings
package gapiDotDriveLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Copy extends js.Object {
  def copy(parameters: gapiDotDriveLib.gapiNs.clientNs.driveNs.CopyParameters): gapiLib.gapiNs.clientNs.HttpRequest[gapiDotDriveLib.gapiNs.clientNs.driveNs.FileResource]
  def delete(parameters: gapiDotDriveLib.gapiNs.clientNs.driveNs.DeleteParameters): gapiLib.gapiNs.clientNs.HttpRequest[_]
  def emptyTrash(): gapiLib.gapiNs.clientNs.HttpRequest[_]
  def export(parameters: gapiDotDriveLib.gapiNs.clientNs.driveNs.ExportParameters): gapiLib.gapiNs.clientNs.HttpRequest[gapiDotDriveLib.gapiNs.clientNs.driveNs.FileResource]
  def generateIds(parameters: gapiDotDriveLib.gapiNs.clientNs.driveNs.GenerateIdsParameters): gapiLib.gapiNs.clientNs.HttpRequest[gapiDotDriveLib.gapiNs.clientNs.driveNs.IdsResource]
  def get(parameters: gapiDotDriveLib.gapiNs.clientNs.driveNs.GetParameters): gapiLib.gapiNs.clientNs.HttpRequest[gapiDotDriveLib.gapiNs.clientNs.driveNs.FileResource]
  def insert(parameters: gapiDotDriveLib.gapiNs.clientNs.driveNs.InsertParameters): gapiLib.gapiNs.clientNs.HttpRequest[gapiDotDriveLib.gapiNs.clientNs.driveNs.FileResource]
  def list(parameters: gapiDotDriveLib.gapiNs.clientNs.driveNs.ListParameters): gapiLib.gapiNs.clientNs.HttpRequest[gapiDotDriveLib.gapiNs.clientNs.driveNs.FileListResource]
  def patch(parameters: gapiDotDriveLib.gapiNs.clientNs.driveNs.PatchParameters): gapiLib.gapiNs.clientNs.HttpRequest[gapiDotDriveLib.gapiNs.clientNs.driveNs.FileResource]
  def touch(parameters: gapiDotDriveLib.gapiNs.clientNs.driveNs.TouchParameters): gapiLib.gapiNs.clientNs.HttpRequest[gapiDotDriveLib.gapiNs.clientNs.driveNs.FileResource]
  def trash(parameters: gapiDotDriveLib.gapiNs.clientNs.driveNs.TrashParameters): gapiLib.gapiNs.clientNs.HttpRequest[gapiDotDriveLib.gapiNs.clientNs.driveNs.FileResource]
  def untrash(parameters: gapiDotDriveLib.gapiNs.clientNs.driveNs.UntrashParameters): gapiLib.gapiNs.clientNs.HttpRequest[gapiDotDriveLib.gapiNs.clientNs.driveNs.FileResource]
  def watch(parameters: gapiDotDriveLib.gapiNs.clientNs.driveNs.WatchParameters): gapiLib.gapiNs.clientNs.HttpRequest[gapiDotDriveLib.gapiNs.clientNs.driveNs.ChannelResource]
}

object Anon_Copy {
  @scala.inline
  def apply(
    copy: gapiDotDriveLib.gapiNs.clientNs.driveNs.CopyParameters => gapiLib.gapiNs.clientNs.HttpRequest[gapiDotDriveLib.gapiNs.clientNs.driveNs.FileResource],
    delete: gapiDotDriveLib.gapiNs.clientNs.driveNs.DeleteParameters => gapiLib.gapiNs.clientNs.HttpRequest[_],
    emptyTrash: () => gapiLib.gapiNs.clientNs.HttpRequest[_],
    export: gapiDotDriveLib.gapiNs.clientNs.driveNs.ExportParameters => gapiLib.gapiNs.clientNs.HttpRequest[gapiDotDriveLib.gapiNs.clientNs.driveNs.FileResource],
    generateIds: gapiDotDriveLib.gapiNs.clientNs.driveNs.GenerateIdsParameters => gapiLib.gapiNs.clientNs.HttpRequest[gapiDotDriveLib.gapiNs.clientNs.driveNs.IdsResource],
    get: gapiDotDriveLib.gapiNs.clientNs.driveNs.GetParameters => gapiLib.gapiNs.clientNs.HttpRequest[gapiDotDriveLib.gapiNs.clientNs.driveNs.FileResource],
    insert: gapiDotDriveLib.gapiNs.clientNs.driveNs.InsertParameters => gapiLib.gapiNs.clientNs.HttpRequest[gapiDotDriveLib.gapiNs.clientNs.driveNs.FileResource],
    list: gapiDotDriveLib.gapiNs.clientNs.driveNs.ListParameters => gapiLib.gapiNs.clientNs.HttpRequest[gapiDotDriveLib.gapiNs.clientNs.driveNs.FileListResource],
    patch: gapiDotDriveLib.gapiNs.clientNs.driveNs.PatchParameters => gapiLib.gapiNs.clientNs.HttpRequest[gapiDotDriveLib.gapiNs.clientNs.driveNs.FileResource],
    touch: gapiDotDriveLib.gapiNs.clientNs.driveNs.TouchParameters => gapiLib.gapiNs.clientNs.HttpRequest[gapiDotDriveLib.gapiNs.clientNs.driveNs.FileResource],
    trash: gapiDotDriveLib.gapiNs.clientNs.driveNs.TrashParameters => gapiLib.gapiNs.clientNs.HttpRequest[gapiDotDriveLib.gapiNs.clientNs.driveNs.FileResource],
    untrash: gapiDotDriveLib.gapiNs.clientNs.driveNs.UntrashParameters => gapiLib.gapiNs.clientNs.HttpRequest[gapiDotDriveLib.gapiNs.clientNs.driveNs.FileResource],
    watch: gapiDotDriveLib.gapiNs.clientNs.driveNs.WatchParameters => gapiLib.gapiNs.clientNs.HttpRequest[gapiDotDriveLib.gapiNs.clientNs.driveNs.ChannelResource]
  ): Anon_Copy = {
    val __obj = js.Dynamic.literal(copy = js.Any.fromFunction1(copy), delete = js.Any.fromFunction1(delete), emptyTrash = js.Any.fromFunction0(emptyTrash), export = js.Any.fromFunction1(export), generateIds = js.Any.fromFunction1(generateIds), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), touch = js.Any.fromFunction1(touch), trash = js.Any.fromFunction1(trash), untrash = js.Any.fromFunction1(untrash), watch = js.Any.fromFunction1(watch))
  
    __obj.asInstanceOf[Anon_Copy]
  }
}


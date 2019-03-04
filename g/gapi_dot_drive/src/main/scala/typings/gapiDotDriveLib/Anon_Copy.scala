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
    copy: js.Function1[
      gapiDotDriveLib.gapiNs.clientNs.driveNs.CopyParameters, 
      gapiLib.gapiNs.clientNs.HttpRequest[gapiDotDriveLib.gapiNs.clientNs.driveNs.FileResource]
    ],
    delete: js.Function1[
      gapiDotDriveLib.gapiNs.clientNs.driveNs.DeleteParameters, 
      gapiLib.gapiNs.clientNs.HttpRequest[_]
    ],
    emptyTrash: js.Function0[gapiLib.gapiNs.clientNs.HttpRequest[_]],
    export: js.Function1[
      gapiDotDriveLib.gapiNs.clientNs.driveNs.ExportParameters, 
      gapiLib.gapiNs.clientNs.HttpRequest[gapiDotDriveLib.gapiNs.clientNs.driveNs.FileResource]
    ],
    generateIds: js.Function1[
      gapiDotDriveLib.gapiNs.clientNs.driveNs.GenerateIdsParameters, 
      gapiLib.gapiNs.clientNs.HttpRequest[gapiDotDriveLib.gapiNs.clientNs.driveNs.IdsResource]
    ],
    get: js.Function1[
      gapiDotDriveLib.gapiNs.clientNs.driveNs.GetParameters, 
      gapiLib.gapiNs.clientNs.HttpRequest[gapiDotDriveLib.gapiNs.clientNs.driveNs.FileResource]
    ],
    insert: js.Function1[
      gapiDotDriveLib.gapiNs.clientNs.driveNs.InsertParameters, 
      gapiLib.gapiNs.clientNs.HttpRequest[gapiDotDriveLib.gapiNs.clientNs.driveNs.FileResource]
    ],
    list: js.Function1[
      gapiDotDriveLib.gapiNs.clientNs.driveNs.ListParameters, 
      gapiLib.gapiNs.clientNs.HttpRequest[gapiDotDriveLib.gapiNs.clientNs.driveNs.FileListResource]
    ],
    patch: js.Function1[
      gapiDotDriveLib.gapiNs.clientNs.driveNs.PatchParameters, 
      gapiLib.gapiNs.clientNs.HttpRequest[gapiDotDriveLib.gapiNs.clientNs.driveNs.FileResource]
    ],
    touch: js.Function1[
      gapiDotDriveLib.gapiNs.clientNs.driveNs.TouchParameters, 
      gapiLib.gapiNs.clientNs.HttpRequest[gapiDotDriveLib.gapiNs.clientNs.driveNs.FileResource]
    ],
    trash: js.Function1[
      gapiDotDriveLib.gapiNs.clientNs.driveNs.TrashParameters, 
      gapiLib.gapiNs.clientNs.HttpRequest[gapiDotDriveLib.gapiNs.clientNs.driveNs.FileResource]
    ],
    untrash: js.Function1[
      gapiDotDriveLib.gapiNs.clientNs.driveNs.UntrashParameters, 
      gapiLib.gapiNs.clientNs.HttpRequest[gapiDotDriveLib.gapiNs.clientNs.driveNs.FileResource]
    ],
    watch: js.Function1[
      gapiDotDriveLib.gapiNs.clientNs.driveNs.WatchParameters, 
      gapiLib.gapiNs.clientNs.HttpRequest[gapiDotDriveLib.gapiNs.clientNs.driveNs.ChannelResource]
    ]
  ): Anon_Copy = {
    val __obj = js.Dynamic.literal(copy = copy, delete = delete, emptyTrash = emptyTrash, export = export, generateIds = generateIds, get = get, insert = insert, list = list, patch = patch, touch = touch, trash = trash, untrash = untrash, watch = watch)
  
    __obj.asInstanceOf[Anon_Copy]
  }
}


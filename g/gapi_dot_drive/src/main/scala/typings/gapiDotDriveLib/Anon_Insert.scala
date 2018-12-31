package typings
package gapiDotDriveLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Insert extends js.Object {
  var copy: js.Function1[
    /* parameters */ gapiDotDriveLib.gapiNs.clientNs.driveNs.CopyParameters, 
    gapiLib.gapiNs.clientNs.HttpRequest[gapiDotDriveLib.gapiNs.clientNs.driveNs.FileResource]
  ]
  var delete: js.Function1[
    /* parameters */ gapiDotDriveLib.gapiNs.clientNs.driveNs.DeleteParameters, 
    gapiLib.gapiNs.clientNs.HttpRequest[_]
  ]
  var emptyTrash: js.Function0[gapiLib.gapiNs.clientNs.HttpRequest[_]]
  var export: js.Function1[
    /* parameters */ gapiDotDriveLib.gapiNs.clientNs.driveNs.ExportParameters, 
    gapiLib.gapiNs.clientNs.HttpRequest[gapiDotDriveLib.gapiNs.clientNs.driveNs.FileResource]
  ]
  var generateIds: js.Function1[
    /* parameters */ gapiDotDriveLib.gapiNs.clientNs.driveNs.GenerateIdsParameters, 
    gapiLib.gapiNs.clientNs.HttpRequest[gapiDotDriveLib.gapiNs.clientNs.driveNs.IdsResource]
  ]
  var get: js.Function1[
    /* parameters */ gapiDotDriveLib.gapiNs.clientNs.driveNs.GetParameters, 
    gapiLib.gapiNs.clientNs.HttpRequest[gapiDotDriveLib.gapiNs.clientNs.driveNs.FileResource]
  ]
  var insert: js.Function1[
    /* parameters */ gapiDotDriveLib.gapiNs.clientNs.driveNs.InsertParameters, 
    gapiLib.gapiNs.clientNs.HttpRequest[gapiDotDriveLib.gapiNs.clientNs.driveNs.FileResource]
  ]
  var list: js.Function1[
    /* parameters */ gapiDotDriveLib.gapiNs.clientNs.driveNs.ListParameters, 
    gapiLib.gapiNs.clientNs.HttpRequest[gapiDotDriveLib.gapiNs.clientNs.driveNs.FileListResource]
  ]
  var patch: js.Function1[
    /* parameters */ gapiDotDriveLib.gapiNs.clientNs.driveNs.PatchParameters, 
    gapiLib.gapiNs.clientNs.HttpRequest[gapiDotDriveLib.gapiNs.clientNs.driveNs.FileResource]
  ]
  var touch: js.Function1[
    /* parameters */ gapiDotDriveLib.gapiNs.clientNs.driveNs.TouchParameters, 
    gapiLib.gapiNs.clientNs.HttpRequest[gapiDotDriveLib.gapiNs.clientNs.driveNs.FileResource]
  ]
  var trash: js.Function1[
    /* parameters */ gapiDotDriveLib.gapiNs.clientNs.driveNs.TrashParameters, 
    gapiLib.gapiNs.clientNs.HttpRequest[gapiDotDriveLib.gapiNs.clientNs.driveNs.FileResource]
  ]
  var untrash: js.Function1[
    /* parameters */ gapiDotDriveLib.gapiNs.clientNs.driveNs.UntrashParameters, 
    gapiLib.gapiNs.clientNs.HttpRequest[gapiDotDriveLib.gapiNs.clientNs.driveNs.FileResource]
  ]
  var watch: js.Function1[
    /* parameters */ gapiDotDriveLib.gapiNs.clientNs.driveNs.WatchParameters, 
    gapiLib.gapiNs.clientNs.HttpRequest[gapiDotDriveLib.gapiNs.clientNs.driveNs.ChannelResource]
  ]
}


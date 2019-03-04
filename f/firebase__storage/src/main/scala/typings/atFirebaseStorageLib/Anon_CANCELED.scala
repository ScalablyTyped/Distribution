package typings
package atFirebaseStorageLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CANCELED extends js.Object {
  var CANCELED: atFirebaseStorageDashTypesLib.atFirebaseStorageDashTypesMod.TaskState
  var ERROR: atFirebaseStorageDashTypesLib.atFirebaseStorageDashTypesMod.TaskState
  var PAUSED: atFirebaseStorageDashTypesLib.atFirebaseStorageDashTypesMod.TaskState
  var RUNNING: atFirebaseStorageDashTypesLib.atFirebaseStorageDashTypesMod.TaskState
  var SUCCESS: atFirebaseStorageDashTypesLib.atFirebaseStorageDashTypesMod.TaskState
}

object Anon_CANCELED {
  @scala.inline
  def apply(
    CANCELED: atFirebaseStorageDashTypesLib.atFirebaseStorageDashTypesMod.TaskState,
    ERROR: atFirebaseStorageDashTypesLib.atFirebaseStorageDashTypesMod.TaskState,
    PAUSED: atFirebaseStorageDashTypesLib.atFirebaseStorageDashTypesMod.TaskState,
    RUNNING: atFirebaseStorageDashTypesLib.atFirebaseStorageDashTypesMod.TaskState,
    SUCCESS: atFirebaseStorageDashTypesLib.atFirebaseStorageDashTypesMod.TaskState
  ): Anon_CANCELED = {
    val __obj = js.Dynamic.literal(CANCELED = CANCELED, ERROR = ERROR, PAUSED = PAUSED, RUNNING = RUNNING, SUCCESS = SUCCESS)
  
    __obj.asInstanceOf[Anon_CANCELED]
  }
}


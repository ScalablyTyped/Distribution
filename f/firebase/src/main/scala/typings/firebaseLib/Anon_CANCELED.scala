package typings
package firebaseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CANCELED extends js.Object {
  var CANCELED: firebaseLib.firebaseMod.firebaseNs.storageNs.TaskState
  var ERROR: firebaseLib.firebaseMod.firebaseNs.storageNs.TaskState
  var PAUSED: firebaseLib.firebaseMod.firebaseNs.storageNs.TaskState
  var RUNNING: firebaseLib.firebaseMod.firebaseNs.storageNs.TaskState
  var SUCCESS: firebaseLib.firebaseMod.firebaseNs.storageNs.TaskState
}

object Anon_CANCELED {
  @scala.inline
  def apply(
    CANCELED: firebaseLib.firebaseMod.firebaseNs.storageNs.TaskState,
    ERROR: firebaseLib.firebaseMod.firebaseNs.storageNs.TaskState,
    PAUSED: firebaseLib.firebaseMod.firebaseNs.storageNs.TaskState,
    RUNNING: firebaseLib.firebaseMod.firebaseNs.storageNs.TaskState,
    SUCCESS: firebaseLib.firebaseMod.firebaseNs.storageNs.TaskState
  ): Anon_CANCELED = {
    val __obj = js.Dynamic.literal(CANCELED = CANCELED, ERROR = ERROR, PAUSED = PAUSED, RUNNING = RUNNING, SUCCESS = SUCCESS)
  
    __obj.asInstanceOf[Anon_CANCELED]
  }
}


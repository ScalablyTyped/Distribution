package typings.atFirebaseStorage

import typings.atFirebaseStorageDashTypes.atFirebaseStorageDashTypesMod.TaskState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CANCELED extends js.Object {
  var CANCELED: TaskState
  var ERROR: TaskState
  var PAUSED: TaskState
  var RUNNING: TaskState
  var SUCCESS: TaskState
}

object Anon_CANCELED {
  @scala.inline
  def apply(CANCELED: TaskState, ERROR: TaskState, PAUSED: TaskState, RUNNING: TaskState, SUCCESS: TaskState): Anon_CANCELED = {
    val __obj = js.Dynamic.literal(CANCELED = CANCELED, ERROR = ERROR, PAUSED = PAUSED, RUNNING = RUNNING, SUCCESS = SUCCESS)
  
    __obj.asInstanceOf[Anon_CANCELED]
  }
}


package typings.firebaseStorage.anon

import typings.firebaseStorageTypes.mod.TaskEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait STATECHANGED extends js.Object {
  var STATE_CHANGED: TaskEvent
}

object STATECHANGED {
  @scala.inline
  def apply(STATE_CHANGED: TaskEvent): STATECHANGED = {
    val __obj = js.Dynamic.literal(STATE_CHANGED = STATE_CHANGED.asInstanceOf[js.Any])
    __obj.asInstanceOf[STATECHANGED]
  }
}


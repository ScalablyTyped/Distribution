package typings
package firebaseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_STATECHANGED extends js.Object {
  /**
    * For this event,
    * <ul>
    *   <li>The `next` function is triggered on progress updates and when the
    *       task is paused/resumed with a
    *       {@link firebase.storage.UploadTaskSnapshot} as the first
    *       argument.</li>
    *   <li>The `error` function is triggered if the upload is canceled or fails
    *       for another reason.</li>
    *   <li>The `complete` function is triggered if the upload completes
    *       successfully.</li>
    * </ul>
    */
  var STATE_CHANGED: firebaseLib.firebaseMod.firebaseNs.storageNs.TaskEvent
}

object Anon_STATECHANGED {
  @scala.inline
  def apply(STATE_CHANGED: firebaseLib.firebaseMod.firebaseNs.storageNs.TaskEvent): Anon_STATECHANGED = {
    val __obj = js.Dynamic.literal(STATE_CHANGED = STATE_CHANGED)
  
    __obj.asInstanceOf[Anon_STATECHANGED]
  }
}


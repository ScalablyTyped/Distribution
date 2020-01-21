package typings.firebase.mod.storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("firebase", "storage.TaskEvent")
@js.native
object TaskEvent extends js.Object {
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
  var STATE_CHANGED: TaskEvent = js.native
}


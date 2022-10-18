package typings.firebaseStorage.distStorageMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object _TaskEvent {
  
  @JSImport("@firebase/storage/dist/storage", "_TaskEvent")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * For this event,
    * <ul>
    *   <li>The `next` function is triggered on progress updates and when the
    *       task is paused/resumed with an `UploadTaskSnapshot` as the first
    *       argument.</li>
    *   <li>The `error` function is triggered if the upload is canceled or fails
    *       for another reason.</li>
    *   <li>The `complete` function is triggered if the upload completes
    *       successfully.</li>
    * </ul>
    */
  @JSImport("@firebase/storage/dist/storage", "_TaskEvent.STATE_CHANGED")
  @js.native
  def STATE_CHANGED: String = js.native
  inline def STATE_CHANGED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STATE_CHANGED")(x.asInstanceOf[js.Any])
}

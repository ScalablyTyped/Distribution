package typings.firebaseStorage.distStorageMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Request2[T] extends StObject {
  
  /**
    * Cancels the request. IMPORTANT: the promise may still be resolved with an
    * appropriate value (if the request is finished before you call this method,
    * but the promise has not yet been resolved), so don't just assume it will be
    * rejected if you call this function.
    * @param appDelete - True if the cancelation came from the app being deleted.
    */
  def cancel(): Unit = js.native
  def cancel(appDelete: Boolean): Unit = js.native
  
  def getPromise(): js.Promise[T] = js.native
}

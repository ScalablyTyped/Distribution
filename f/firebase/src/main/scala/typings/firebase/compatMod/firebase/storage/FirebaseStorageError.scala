package typings.firebase.compatMod.firebase.storage

import typings.firebase.anon.ServerResponse
import typings.firebase.compatMod.firebase.FirebaseError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirebaseStorageError
  extends StObject
     with FirebaseError {
  
  /**
    * Compares a `StorageErrorCode` against this error's code, filtering out the prefix.
    */
  def _codeEquals(code: StorageErrorCode): Boolean = js.native
  
  /**
    * Stores custom error data unique to the `StorageError`.
    */
  var customData: ServerResponse = js.native
  
  /**
    * Optional response message that was added by the server.
    */
  def serverResponse: Null | String = js.native
  def serverResponse_=(serverResponse: String | Null): Unit = js.native
  
  def status: Double = js.native
  def status_=(status: Double): Unit = js.native
}

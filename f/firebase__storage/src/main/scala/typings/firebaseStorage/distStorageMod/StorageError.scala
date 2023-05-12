package typings.firebaseStorage.distStorageMod

import typings.firebaseStorage.anon.ServerResponse
import typings.firebaseUtil.mod.FirebaseError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/storage/dist/storage", "StorageError")
@js.native
open class StorageError protected () extends FirebaseError {
  /**
    * @param code - A `StorageErrorCode` string to be prefixed with 'storage/' and
    *  added to the end of the message.
    * @param message  - Error message.
    * @param status_ - Corresponding HTTP Status Code
    */
  def this(code: StorageErrorCode, message: String) = this()
  def this(code: StorageErrorCode, message: String, status_ : Double) = this()
  
  /* private */ val _baseMessage: Any = js.native
  
  /**
    * Compares a `StorageErrorCode` against this error's code, filtering out the prefix.
    */
  def _codeEquals(code: StorageErrorCode): Boolean = js.native
  
  /**
    * Stores custom error data unique to the `StorageError`.
    */
  @JSName("customData")
  var customData_StorageError: ServerResponse = js.native
  
  /**
    * Optional response message that was added by the server.
    */
  def serverResponse: Null | String = js.native
  def serverResponse_=(serverResponse: String | Null): Unit = js.native
  
  def status: Double = js.native
  
  /* private */ var status_ : Any = js.native
  
  def status_=(status: Double): Unit = js.native
}

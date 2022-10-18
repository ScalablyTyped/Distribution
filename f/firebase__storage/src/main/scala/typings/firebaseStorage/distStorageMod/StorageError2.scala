package typings.firebaseStorage.distStorageMod

import typings.firebaseStorage.anon.ServerResponse
import typings.firebaseUtil.mod.FirebaseError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An error returned by the Firebase Storage SDK.
  * @public
  */
@js.native
trait StorageError2 extends FirebaseError {
  
  /* private */ val _baseMessage: Any = js.native
  
  /**
    * Compares a StorageErrorCode against this error's code, filtering out the prefix.
    */
  def _codeEquals(code: StorageErrorCode): Boolean = js.native
  
  /**
    * Stores custom error data unque to StorageError.
    */
  @JSName("customData")
  var customData_StorageError2: ServerResponse = js.native
  
  /**
    * Optional response message that was added by the server.
    */
  def serverResponse: Null | String = js.native
  def serverResponse_=(serverResponse: String | Null): Unit = js.native
  
  def status: Double = js.native
  
  /* private */ var status_ : Any = js.native
  
  def status_=(status: Double): Unit = js.native
}

package typings.firebaseStorage.distStorageMod

import typings.firebaseUtil.mod.FirebaseError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StorageError extends FirebaseError {
  
  /**
    * A server response message for the error, if applicable.
    */
  var serverResponse: String | Null = js.native
}

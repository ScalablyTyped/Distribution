package typings.firebaseFirestore.distPrivateMod

import typings.firebaseUtil.mod.FirebaseError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore/dist/private", "FirestoreError")
@js.native
open class FirestoreError protected () extends FirebaseError {
  /** @hideconstructor */
  def this(
    /**
    * The backend error code associated with this error.
    */
  code: FirestoreErrorCode,
    /**
    * A custom error description.
    */
  message: String
  ) = this()
  
  /**
    * The backend error code associated with this error.
    */
  @JSName("code")
  val code_FirestoreError: FirestoreErrorCode = js.native
}

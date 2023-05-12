package typings.firebaseFirestore.distLiteFirestoreSrcApiMod

import typings.firebaseFirestore.distLiteFirestoreSrcUtilErrorMod.FirestoreErrorCode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore/dist/lite/firestore/src/api", "FirestoreError")
@js.native
open class FirestoreError protected ()
  extends typings.firebaseFirestore.distLiteFirestoreSrcUtilErrorMod.FirestoreError {
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
}

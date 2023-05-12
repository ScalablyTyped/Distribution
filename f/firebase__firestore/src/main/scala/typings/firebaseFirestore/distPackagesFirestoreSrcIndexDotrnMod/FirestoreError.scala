package typings.firebaseFirestore.distPackagesFirestoreSrcIndexDotrnMod

import typings.firebaseFirestore.distPackagesFirestoreSrcUtilErrorMod.FirestoreErrorCode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore/dist/packages/firestore/src/index.rn", "FirestoreError")
@js.native
open class FirestoreError protected ()
  extends typings.firebaseFirestore.distPackagesFirestoreSrcApiMod.FirestoreError {
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

package typings.firebaseFirestore.distLitePackagesFirestoreTestIntegrationUtilFirebaseExportMod

import typings.firebaseFirestore.distLitePackagesFirestoreSrcUtilErrorMod.FirestoreErrorCode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore/dist/lite/packages/firestore/test/integration/util/firebase_export", "FirestoreError")
@js.native
open class FirestoreError protected ()
  extends typings.firebaseFirestore.distLitePackagesFirestoreSrcMod.FirestoreError {
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

package typings.firebaseAdmin

import typings.firebaseAdmin.cloudeventMod.CloudEvent
import typings.firebaseAdmin.errorMod.PrefixedFirebaseError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventarcUtilsMod {
  
  @JSImport("firebase-admin/lib/eventarc/eventarc-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("firebase-admin/lib/eventarc/eventarc-utils", "FirebaseEventarcError")
  @js.native
  open class FirebaseEventarcError protected () extends PrefixedFirebaseError {
    def this(code: EventarcErrorCode, message: String) = this()
  }
  
  inline def toCloudEventProtoFormat(ce: CloudEvent): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toCloudEventProtoFormat")(ce.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseAdmin.firebaseAdminStrings.`unknown-error`
    - typings.firebaseAdmin.firebaseAdminStrings.`invalid-argument`
  */
  trait EventarcErrorCode extends StObject
  object EventarcErrorCode {
    
    inline def `invalid-argument`: typings.firebaseAdmin.firebaseAdminStrings.`invalid-argument` = "invalid-argument".asInstanceOf[typings.firebaseAdmin.firebaseAdminStrings.`invalid-argument`]
    
    inline def `unknown-error`: typings.firebaseAdmin.firebaseAdminStrings.`unknown-error` = "unknown-error".asInstanceOf[typings.firebaseAdmin.firebaseAdminStrings.`unknown-error`]
  }
}

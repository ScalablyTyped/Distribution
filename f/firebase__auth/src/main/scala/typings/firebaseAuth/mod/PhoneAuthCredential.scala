package typings.firebaseAuth.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/auth", "PhoneAuthCredential")
@js.native
/* private */ open class PhoneAuthCredential () extends AuthCredential {
  
  /* private */ val params: Any = js.native
}
/* static members */
object PhoneAuthCredential {
  
  @JSImport("@firebase/auth", "PhoneAuthCredential")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: String): PhoneAuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[PhoneAuthCredential | Null]
  /** Generates a phone credential based on a plain object or a JSON string. */
  inline def fromJSON(json: js.Object): PhoneAuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[PhoneAuthCredential | Null]
}

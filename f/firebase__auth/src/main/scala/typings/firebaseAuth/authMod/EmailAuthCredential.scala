package typings.firebaseAuth.authMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/auth/dist/auth", "EmailAuthCredential")
@js.native
/** @internal */
/* private */ open class EmailAuthCredential () extends AuthCredential {
  
  /** @internal */
  val _email: String = js.native
  
  /** @internal */
  val _password: String = js.native
  
  /** @internal */
  val _tenantId: String | Null = js.native
}
/* static members */
object EmailAuthCredential {
  
  @JSImport("@firebase/auth/dist/auth", "EmailAuthCredential")
  @js.native
  val ^ : js.Any = js.native
  
  /** @internal */
  inline def _fromEmailAndCode(email: String, oobCode: String): EmailAuthCredential = (^.asInstanceOf[js.Dynamic].applyDynamic("_fromEmailAndCode")(email.asInstanceOf[js.Any], oobCode.asInstanceOf[js.Any])).asInstanceOf[EmailAuthCredential]
  inline def _fromEmailAndCode(email: String, oobCode: String, tenantId: String): EmailAuthCredential = (^.asInstanceOf[js.Dynamic].applyDynamic("_fromEmailAndCode")(email.asInstanceOf[js.Any], oobCode.asInstanceOf[js.Any], tenantId.asInstanceOf[js.Any])).asInstanceOf[EmailAuthCredential]
  
  /** @internal */
  inline def _fromEmailAndPassword(email: String, password: String): EmailAuthCredential = (^.asInstanceOf[js.Dynamic].applyDynamic("_fromEmailAndPassword")(email.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[EmailAuthCredential]
  
  inline def fromJSON(json: String): EmailAuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[EmailAuthCredential | Null]
  /**
    * Static method to deserialize a JSON representation of an object into an {@link  AuthCredential}.
    *
    * @param json - Either `object` or the stringified representation of the object. When string is
    * provided, `JSON.parse` would be called first.
    *
    * @returns If the JSON input does not represent an {@link AuthCredential}, null is returned.
    */
  inline def fromJSON(json: js.Object): EmailAuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[EmailAuthCredential | Null]
}

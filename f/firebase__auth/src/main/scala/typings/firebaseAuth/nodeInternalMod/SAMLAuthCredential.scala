package typings.firebaseAuth.nodeInternalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/auth/dist/node/internal", "SAMLAuthCredential")
@js.native
/** @internal */
/* private */ open class SAMLAuthCredential ()
  extends typings.firebaseAuth.nodeSrcCoreCredentialsSamlMod.SAMLAuthCredential
/* static members */
object SAMLAuthCredential {
  
  @JSImport("@firebase/auth/dist/node/internal", "SAMLAuthCredential")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Helper static method to avoid exposing the constructor to end users.
    *
    * @internal
    */
  inline def _create(providerId: String, pendingToken: String): typings.firebaseAuth.nodeSrcCoreCredentialsSamlMod.SAMLAuthCredential = (^.asInstanceOf[js.Dynamic].applyDynamic("_create")(providerId.asInstanceOf[js.Any], pendingToken.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseAuth.nodeSrcCoreCredentialsSamlMod.SAMLAuthCredential]
  
  /**
    * Static method to deserialize a JSON representation of an object into an
    * {@link  AuthCredential}.
    *
    * @param json - Input can be either Object or the stringified representation of the object.
    * When string is provided, JSON.parse would be called first.
    *
    * @returns If the JSON input does not represent an {@link  AuthCredential}, null is returned.
    */
  inline def fromJSON(json: String): typings.firebaseAuth.nodeSrcCoreCredentialsSamlMod.SAMLAuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseAuth.nodeSrcCoreCredentialsSamlMod.SAMLAuthCredential | Null]
  inline def fromJSON(json: js.Object): typings.firebaseAuth.nodeSrcCoreCredentialsSamlMod.SAMLAuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseAuth.nodeSrcCoreCredentialsSamlMod.SAMLAuthCredential | Null]
}

package typings.firebaseAuth.distEsm5SrcModelPublicTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationVerifier extends StObject {
  
  /**
    * Identifies the type of application verifier (e.g. "recaptcha").
    */
  val `type`: String
  
  /**
    * Executes the verification process.
    *
    * @returns A Promise for a token that can be used to assert the validity of a request.
    */
  def verify(): js.Promise[String]
}
object ApplicationVerifier {
  
  inline def apply(`type`: String, verify: () => js.Promise[String]): ApplicationVerifier = {
    val __obj = js.Dynamic.literal(verify = js.Any.fromFunction0(verify))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationVerifier]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationVerifier] (val x: Self) extends AnyVal {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVerify(value: () => js.Promise[String]): Self = StObject.set(x, "verify", js.Any.fromFunction0(value))
  }
}

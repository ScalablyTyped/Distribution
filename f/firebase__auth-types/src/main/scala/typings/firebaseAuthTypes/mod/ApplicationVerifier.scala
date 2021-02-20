package typings.firebaseAuthTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationVerifier extends StObject {
  
  var `type`: String = js.native
  
  def verify(): js.Promise[String] = js.native
}
object ApplicationVerifier {
  
  @scala.inline
  def apply(`type`: String, verify: () => js.Promise[String]): ApplicationVerifier = {
    val __obj = js.Dynamic.literal(verify = js.Any.fromFunction0(verify))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationVerifier]
  }
  
  @scala.inline
  implicit class ApplicationVerifierMutableBuilder[Self <: ApplicationVerifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerify(value: () => js.Promise[String]): Self = StObject.set(x, "verify", js.Any.fromFunction0(value))
  }
}

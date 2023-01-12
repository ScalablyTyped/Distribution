package typings.firebaseAuth

import typings.firebaseAuth.distCordovaSrcModelPublicTypesMod.ApplicationVerifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCordovaSrcModelApplicationVerifierMod {
  
  trait ApplicationVerifierInternal
    extends StObject
       with ApplicationVerifier {
    
    /**
      * @internal
      */
    def _reset(): Unit
  }
  object ApplicationVerifierInternal {
    
    inline def apply(_reset: () => Unit, `type`: String, verify: () => js.Promise[String]): ApplicationVerifierInternal = {
      val __obj = js.Dynamic.literal(_reset = js.Any.fromFunction0(_reset), verify = js.Any.fromFunction0(verify))
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApplicationVerifierInternal]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ApplicationVerifierInternal] (val x: Self) extends AnyVal {
      
      inline def set_reset(value: () => Unit): Self = StObject.set(x, "_reset", js.Any.fromFunction0(value))
    }
  }
}

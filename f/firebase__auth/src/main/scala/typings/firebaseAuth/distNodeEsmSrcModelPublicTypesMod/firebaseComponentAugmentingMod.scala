package typings.firebaseAuth.distNodeEsmSrcModelPublicTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object firebaseComponentAugmentingMod {
  
  trait NameServiceMapping extends StObject {
    
    var auth: Auth
  }
  object NameServiceMapping {
    
    inline def apply(auth: Auth): NameServiceMapping = {
      val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any])
      __obj.asInstanceOf[NameServiceMapping]
    }
    
    extension [Self <: NameServiceMapping](x: Self) {
      
      inline def setAuth(value: Auth): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    }
  }
}

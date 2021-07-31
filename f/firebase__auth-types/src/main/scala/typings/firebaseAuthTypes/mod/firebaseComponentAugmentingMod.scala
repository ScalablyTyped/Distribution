package typings.firebaseAuthTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object firebaseComponentAugmentingMod {
  
  trait NameServiceMapping extends StObject {
    
    var auth: FirebaseAuth
  }
  object NameServiceMapping {
    
    @scala.inline
    def apply(auth: FirebaseAuth): NameServiceMapping = {
      val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any])
      __obj.asInstanceOf[NameServiceMapping]
    }
    
    @scala.inline
    implicit class NameServiceMappingMutableBuilder[Self <: NameServiceMapping] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuth(value: FirebaseAuth): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    }
  }
}

package typings.firebaseAuth.rnSrcModelPublicTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object firebaseComponentAugmentingMod {
  
  trait NameServiceMapping extends StObject {
    
    var auth: typings.firebaseAuth.publicTypesMod.Auth
  }
  object NameServiceMapping {
    
    inline def apply(auth: typings.firebaseAuth.publicTypesMod.Auth): NameServiceMapping = {
      val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any])
      __obj.asInstanceOf[NameServiceMapping]
    }
    
    extension [Self <: NameServiceMapping](x: Self) {
      
      inline def setAuth(value: typings.firebaseAuth.publicTypesMod.Auth): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    }
  }
}

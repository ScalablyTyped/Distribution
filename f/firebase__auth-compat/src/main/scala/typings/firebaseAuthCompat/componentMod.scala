package typings.firebaseAuthCompat

import typings.firebaseAuthTypes.mod.FirebaseAuth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentMod {
  
  trait NameServiceMapping extends StObject {
    
    var `auth-compat`: FirebaseAuth
  }
  object NameServiceMapping {
    
    inline def apply(`auth-compat`: FirebaseAuth): NameServiceMapping = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("auth-compat")(`auth-compat`.asInstanceOf[js.Any])
      __obj.asInstanceOf[NameServiceMapping]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NameServiceMapping] (val x: Self) extends AnyVal {
      
      inline def `setAuth-compat`(value: FirebaseAuth): Self = StObject.set(x, "auth-compat", value.asInstanceOf[js.Any])
    }
  }
}

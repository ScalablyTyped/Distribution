package typings.firebaseInstallationsCompat

import typings.firebaseInstallationsTypes.mod.FirebaseInstallations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object firebaseComponentMod {
  
  trait NameServiceMapping extends StObject {
    
    var `installations-compat`: FirebaseInstallations
  }
  object NameServiceMapping {
    
    inline def apply(`installations-compat`: FirebaseInstallations): NameServiceMapping = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("installations-compat")(`installations-compat`.asInstanceOf[js.Any])
      __obj.asInstanceOf[NameServiceMapping]
    }
    
    extension [Self <: NameServiceMapping](x: Self) {
      
      inline def `setInstallations-compat`(value: FirebaseInstallations): Self = StObject.set(x, "installations-compat", value.asInstanceOf[js.Any])
    }
  }
}

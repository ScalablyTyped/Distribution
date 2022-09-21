package typings.fhir.r3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackboneElement
  extends StObject
     with Element {
  
  /**
    * There can be no stigma associated with the use of extensions by any application, project, or standard - regardless of the institution or jurisdiction that uses or defines the extensions.  The use of extensions is what allows the FHIR specification to retain a core level of simplicity for everyone.
    */
  var modifierExtension: js.UndefOr[js.Array[Extension]] = js.undefined
}
object BackboneElement {
  
  inline def apply(): BackboneElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackboneElement]
  }
  
  extension [Self <: BackboneElement](x: Self) {
    
    inline def setModifierExtension(value: js.Array[Extension]): Self = StObject.set(x, "modifierExtension", value.asInstanceOf[js.Any])
    
    inline def setModifierExtensionUndefined: Self = StObject.set(x, "modifierExtension", js.undefined)
    
    inline def setModifierExtensionVarargs(value: Extension*): Self = StObject.set(x, "modifierExtension", js.Array(value*))
  }
}

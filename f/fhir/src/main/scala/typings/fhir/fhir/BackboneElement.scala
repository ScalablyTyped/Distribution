package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base for elements defined inside a resource
  */
trait BackboneElement
  extends StObject
     with Element {
  
  /**
    * Extensions that cannot be ignored
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
    
    inline def setModifierExtensionVarargs(value: Extension*): Self = StObject.set(x, "modifierExtension", js.Array(value :_*))
  }
}

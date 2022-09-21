package typings.floatingUiCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Elements extends StObject {
  
  var floating: FloatingElement
  
  var reference: ReferenceElement
}
object Elements {
  
  inline def apply(floating: FloatingElement, reference: ReferenceElement): Elements = {
    val __obj = js.Dynamic.literal(floating = floating.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
    __obj.asInstanceOf[Elements]
  }
  
  extension [Self <: Elements](x: Self) {
    
    inline def setFloating(value: FloatingElement): Self = StObject.set(x, "floating", value.asInstanceOf[js.Any])
    
    inline def setReference(value: ReferenceElement): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
  }
}

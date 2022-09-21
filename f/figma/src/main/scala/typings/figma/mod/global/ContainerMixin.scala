package typings.figma.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerMixin extends StObject {
  
  // DEPRECATED: use 'fills' instead
  var backgroundStyleId: String
  
  var backgrounds: js.Array[Paint]
  
  var expanded: Boolean
}
object ContainerMixin {
  
  inline def apply(backgroundStyleId: String, backgrounds: js.Array[Paint], expanded: Boolean): ContainerMixin = {
    val __obj = js.Dynamic.literal(backgroundStyleId = backgroundStyleId.asInstanceOf[js.Any], backgrounds = backgrounds.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerMixin]
  }
  
  extension [Self <: ContainerMixin](x: Self) {
    
    inline def setBackgroundStyleId(value: String): Self = StObject.set(x, "backgroundStyleId", value.asInstanceOf[js.Any])
    
    inline def setBackgrounds(value: js.Array[Paint]): Self = StObject.set(x, "backgrounds", value.asInstanceOf[js.Any])
    
    inline def setBackgroundsVarargs(value: Paint*): Self = StObject.set(x, "backgrounds", js.Array(value*))
    
    inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
  }
}

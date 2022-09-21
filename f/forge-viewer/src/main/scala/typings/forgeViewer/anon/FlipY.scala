package typings.forgeViewer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlipY extends StObject {
  
  var flipY: Boolean
  
  var preserveAspect: Boolean
}
object FlipY {
  
  inline def apply(flipY: Boolean, preserveAspect: Boolean): FlipY = {
    val __obj = js.Dynamic.literal(flipY = flipY.asInstanceOf[js.Any], preserveAspect = preserveAspect.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlipY]
  }
  
  extension [Self <: FlipY](x: Self) {
    
    inline def setFlipY(value: Boolean): Self = StObject.set(x, "flipY", value.asInstanceOf[js.Any])
    
    inline def setPreserveAspect(value: Boolean): Self = StObject.set(x, "preserveAspect", value.asInstanceOf[js.Any])
  }
}

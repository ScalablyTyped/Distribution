package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.animation._AnimationState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Scale
  extends StObject
     with _AnimationState {
  
  /**
    * A value that controls element size.
    */
  var scale: Double
}
object Scale {
  
  inline def apply(scale: Double): Scale = {
    val __obj = js.Dynamic.literal(scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scale]
  }
  
  extension [Self <: Scale](x: Self) {
    
    inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
  }
}

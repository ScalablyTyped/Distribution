package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.animation.CollisionResolution
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XY extends StObject {
  
  /**
    * Specifies how to resolve horizontal collisions.
    */
  var x: js.UndefOr[CollisionResolution] = js.undefined
  
  /**
    * Specifies how to resolve vertical collisions.
    */
  var y: js.UndefOr[CollisionResolution] = js.undefined
}
object XY {
  
  inline def apply(): XY = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XY]
  }
  
  extension [Self <: XY](x: Self) {
    
    inline def setX(value: CollisionResolution): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: CollisionResolution): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}

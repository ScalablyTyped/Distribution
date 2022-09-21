package typings.devextreme.mod.DevExpress

import typings.devextreme.anon.X
import typings.devextreme.anon.XY
import typings.devextreme.anon.Y
import typings.devextreme.mod.DevExpress.animation.CollisionResolutionCombination
import typings.devextreme.mod.DevExpress.common.PositionAlignment
import typings.devextreme.mod.DevExpress.core.UserDefinedElement
import typings.std.Element
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PositionConfig extends StObject {
  
  /**
    * Specifies the target element&apos;s side or corner where the overlay element should be positioned.
    */
  var at: js.UndefOr[PositionAlignment | X] = js.undefined
  
  /**
    * A boundary element in which the overlay element must be positioned.
    */
  var boundary: js.UndefOr[String | UserDefinedElement[Element] | Window] = js.undefined
  
  /**
    * Specifies the offset of boundaries from the boundary element.
    */
  var boundaryOffset: js.UndefOr[String | Y] = js.undefined
  
  /**
    * Specifies how to resolve collisions - when the overlay element exceeds the boundary element.
    */
  var collision: js.UndefOr[CollisionResolutionCombination | XY] = js.undefined
  
  /**
    * Specifies the overlay element&apos;s side or corner to align with a target element.
    */
  var my: js.UndefOr[PositionAlignment | X] = js.undefined
  
  /**
    * The target element relative to which the overlay element should be positioned.
    */
  var of: js.UndefOr[String | UserDefinedElement[Element] | Window] = js.undefined
  
  /**
    * Specifies the overlay element&apos;s offset from a specified position.
    */
  var offset: js.UndefOr[String | Y] = js.undefined
}
object PositionConfig {
  
  inline def apply(): PositionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PositionConfig]
  }
  
  extension [Self <: PositionConfig](x: Self) {
    
    inline def setAt(value: PositionAlignment | X): Self = StObject.set(x, "at", value.asInstanceOf[js.Any])
    
    inline def setAtUndefined: Self = StObject.set(x, "at", js.undefined)
    
    inline def setBoundary(value: String | UserDefinedElement[Element] | Window): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
    
    inline def setBoundaryOffset(value: String | Y): Self = StObject.set(x, "boundaryOffset", value.asInstanceOf[js.Any])
    
    inline def setBoundaryOffsetUndefined: Self = StObject.set(x, "boundaryOffset", js.undefined)
    
    inline def setBoundaryUndefined: Self = StObject.set(x, "boundary", js.undefined)
    
    inline def setCollision(value: CollisionResolutionCombination | XY): Self = StObject.set(x, "collision", value.asInstanceOf[js.Any])
    
    inline def setCollisionUndefined: Self = StObject.set(x, "collision", js.undefined)
    
    inline def setMy(value: PositionAlignment | X): Self = StObject.set(x, "my", value.asInstanceOf[js.Any])
    
    inline def setMyUndefined: Self = StObject.set(x, "my", js.undefined)
    
    inline def setOf(value: String | UserDefinedElement[Element] | Window): Self = StObject.set(x, "of", value.asInstanceOf[js.Any])
    
    inline def setOfUndefined: Self = StObject.set(x, "of", js.undefined)
    
    inline def setOffset(value: String | Y): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
  }
}

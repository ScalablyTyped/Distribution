package typings.figma.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VectorVertex extends StObject {
  
  val cornerRadius: js.UndefOr[Double] = js.undefined
  
  val handleMirroring: js.UndefOr[HandleMirroring] = js.undefined
  
  val strokeCap: js.UndefOr[StrokeCap] = js.undefined
  
  val strokeJoin: js.UndefOr[StrokeJoin] = js.undefined
  
  val x: Double
  
  val y: Double
}
object VectorVertex {
  
  inline def apply(x: Double, y: Double): VectorVertex = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[VectorVertex]
  }
  
  extension [Self <: VectorVertex](x: Self) {
    
    inline def setCornerRadius(value: Double): Self = StObject.set(x, "cornerRadius", value.asInstanceOf[js.Any])
    
    inline def setCornerRadiusUndefined: Self = StObject.set(x, "cornerRadius", js.undefined)
    
    inline def setHandleMirroring(value: HandleMirroring): Self = StObject.set(x, "handleMirroring", value.asInstanceOf[js.Any])
    
    inline def setHandleMirroringUndefined: Self = StObject.set(x, "handleMirroring", js.undefined)
    
    inline def setStrokeCap(value: StrokeCap): Self = StObject.set(x, "strokeCap", value.asInstanceOf[js.Any])
    
    inline def setStrokeCapUndefined: Self = StObject.set(x, "strokeCap", js.undefined)
    
    inline def setStrokeJoin(value: StrokeJoin): Self = StObject.set(x, "strokeJoin", value.asInstanceOf[js.Any])
    
    inline def setStrokeJoinUndefined: Self = StObject.set(x, "strokeJoin", js.undefined)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}

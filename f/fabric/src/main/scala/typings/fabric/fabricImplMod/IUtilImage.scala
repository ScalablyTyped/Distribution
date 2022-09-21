package typings.fabric.fabricImplMod

import typings.std.CanvasRenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IUtilImage extends StObject {
  
  def setImageSmoothing(ctx: CanvasRenderingContext2D, value: Any): Unit
}
object IUtilImage {
  
  inline def apply(setImageSmoothing: (CanvasRenderingContext2D, Any) => Unit): IUtilImage = {
    val __obj = js.Dynamic.literal(setImageSmoothing = js.Any.fromFunction2(setImageSmoothing))
    __obj.asInstanceOf[IUtilImage]
  }
  
  extension [Self <: IUtilImage](x: Self) {
    
    inline def setSetImageSmoothing(value: (CanvasRenderingContext2D, Any) => Unit): Self = StObject.set(x, "setImageSmoothing", js.Any.fromFunction2(value))
  }
}

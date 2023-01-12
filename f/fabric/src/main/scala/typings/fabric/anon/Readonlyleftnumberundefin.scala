package typings.fabric.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  left :number | undefined,   top :number | undefined,   width :number | undefined,   height :number | undefined}> */
trait Readonlyleftnumberundefin extends StObject {
  
  val height: js.UndefOr[Double] = js.undefined
  
  val left: js.UndefOr[Double] = js.undefined
  
  val top: js.UndefOr[Double] = js.undefined
  
  val width: js.UndefOr[Double] = js.undefined
}
object Readonlyleftnumberundefin {
  
  inline def apply(): Readonlyleftnumberundefin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Readonlyleftnumberundefin]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Readonlyleftnumberundefin] (val x: Self) extends AnyVal {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}

package typings.fabric.fabricImplMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEllipseOptions
  extends StObject
     with IObjectOptions {
  
  /**
    * Horizontal radius
    */
  var rx: js.UndefOr[Double] = js.undefined
  
  /**
    * Vertical radius
    */
  var ry: js.UndefOr[Double] = js.undefined
}
object IEllipseOptions {
  
  inline def apply(): IEllipseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEllipseOptions]
  }
  
  extension [Self <: IEllipseOptions](x: Self) {
    
    inline def setRx(value: Double): Self = StObject.set(x, "rx", value.asInstanceOf[js.Any])
    
    inline def setRxUndefined: Self = StObject.set(x, "rx", js.undefined)
    
    inline def setRy(value: Double): Self = StObject.set(x, "ry", value.asInstanceOf[js.Any])
    
    inline def setRyUndefined: Self = StObject.set(x, "ry", js.undefined)
  }
}

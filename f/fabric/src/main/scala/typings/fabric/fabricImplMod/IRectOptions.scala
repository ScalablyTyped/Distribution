package typings.fabric.fabricImplMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRectOptions
  extends StObject
     with IObjectOptions {
  
  /**
    * Horizontal border radius
    */
  var rx: js.UndefOr[Double] = js.undefined
  
  /**
    * Vertical border radius
    */
  var ry: js.UndefOr[Double] = js.undefined
}
object IRectOptions {
  
  inline def apply(): IRectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRectOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IRectOptions] (val x: Self) extends AnyVal {
    
    inline def setRx(value: Double): Self = StObject.set(x, "rx", value.asInstanceOf[js.Any])
    
    inline def setRxUndefined: Self = StObject.set(x, "rx", js.undefined)
    
    inline def setRy(value: Double): Self = StObject.set(x, "ry", value.asInstanceOf[js.Any])
    
    inline def setRyUndefined: Self = StObject.set(x, "ry", js.undefined)
  }
}

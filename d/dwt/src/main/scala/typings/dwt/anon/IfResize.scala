package typings.dwt.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IfResize extends StObject {
  
  var ifResize: js.UndefOr[Boolean] = js.undefined
  
  var maxSize: js.UndefOr[Double] = js.undefined
  
  // Example: 26,
  var minSize: js.UndefOr[Double] = js.undefined
}
object IfResize {
  
  inline def apply(): IfResize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IfResize]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IfResize] (val x: Self) extends AnyVal {
    
    inline def setIfResize(value: Boolean): Self = StObject.set(x, "ifResize", value.asInstanceOf[js.Any])
    
    inline def setIfResizeUndefined: Self = StObject.set(x, "ifResize", js.undefined)
    
    inline def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
    
    inline def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
    
    inline def setMinSize(value: Double): Self = StObject.set(x, "minSize", value.asInstanceOf[js.Any])
    
    inline def setMinSizeUndefined: Self = StObject.set(x, "minSize", js.undefined)
  }
}

package typings.expressValidator.srcOptionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MinMaxExtendedOptions
  extends StObject
     with MinMaxOptions {
  
  var gt: js.UndefOr[Double] = js.undefined
  
  var lt: js.UndefOr[Double] = js.undefined
}
object MinMaxExtendedOptions {
  
  inline def apply(): MinMaxExtendedOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MinMaxExtendedOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MinMaxExtendedOptions] (val x: Self) extends AnyVal {
    
    inline def setGt(value: Double): Self = StObject.set(x, "gt", value.asInstanceOf[js.Any])
    
    inline def setGtUndefined: Self = StObject.set(x, "gt", js.undefined)
    
    inline def setLt(value: Double): Self = StObject.set(x, "lt", value.asInstanceOf[js.Any])
    
    inline def setLtUndefined: Self = StObject.set(x, "lt", js.undefined)
  }
}

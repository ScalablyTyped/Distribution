package typings.elkjs.libElkApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElkLayoutArguments extends StObject {
  
  var layoutOptions: js.UndefOr[LayoutOptions] = js.undefined
  
  var logging: js.UndefOr[Boolean] = js.undefined
  
  var measureExecutionTime: js.UndefOr[Boolean] = js.undefined
}
object ElkLayoutArguments {
  
  inline def apply(): ElkLayoutArguments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElkLayoutArguments]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ElkLayoutArguments] (val x: Self) extends AnyVal {
    
    inline def setLayoutOptions(value: LayoutOptions): Self = StObject.set(x, "layoutOptions", value.asInstanceOf[js.Any])
    
    inline def setLayoutOptionsUndefined: Self = StObject.set(x, "layoutOptions", js.undefined)
    
    inline def setLogging(value: Boolean): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
    
    inline def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
    
    inline def setMeasureExecutionTime(value: Boolean): Self = StObject.set(x, "measureExecutionTime", value.asInstanceOf[js.Any])
    
    inline def setMeasureExecutionTimeUndefined: Self = StObject.set(x, "measureExecutionTime", js.undefined)
  }
}

package typings.gaeaModel.FitGaea

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventCallType extends StObject {
  
  // 调用函数名称
  var functionName: String
  
  // 调用参数
  var param: js.UndefOr[js.Array[EventCallTypeParam]] = js.undefined
}
object EventCallType {
  
  inline def apply(functionName: String): EventCallType = {
    val __obj = js.Dynamic.literal(functionName = functionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventCallType]
  }
  
  extension [Self <: EventCallType](x: Self) {
    
    inline def setFunctionName(value: String): Self = StObject.set(x, "functionName", value.asInstanceOf[js.Any])
    
    inline def setParam(value: js.Array[EventCallTypeParam]): Self = StObject.set(x, "param", value.asInstanceOf[js.Any])
    
    inline def setParamUndefined: Self = StObject.set(x, "param", js.undefined)
    
    inline def setParamVarargs(value: EventCallTypeParam*): Self = StObject.set(x, "param", js.Array(value*))
  }
}

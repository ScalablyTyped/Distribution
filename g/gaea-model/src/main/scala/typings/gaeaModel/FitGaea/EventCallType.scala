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
  
  @scala.inline
  def apply(functionName: String): EventCallType = {
    val __obj = js.Dynamic.literal(functionName = functionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventCallType]
  }
  
  @scala.inline
  implicit class EventCallTypeMutableBuilder[Self <: EventCallType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFunctionName(value: String): Self = StObject.set(x, "functionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParam(value: js.Array[EventCallTypeParam]): Self = StObject.set(x, "param", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamUndefined: Self = StObject.set(x, "param", js.undefined)
    
    @scala.inline
    def setParamVarargs(value: EventCallTypeParam*): Self = StObject.set(x, "param", js.Array(value :_*))
  }
}

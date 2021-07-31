package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TraceBufferUsageReturnValue extends StObject {
  
  var percentage: Double
  
  var value: Double
}
object TraceBufferUsageReturnValue {
  
  @scala.inline
  def apply(percentage: Double, value: Double): TraceBufferUsageReturnValue = {
    val __obj = js.Dynamic.literal(percentage = percentage.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TraceBufferUsageReturnValue]
  }
  
  @scala.inline
  implicit class TraceBufferUsageReturnValueMutableBuilder[Self <: TraceBufferUsageReturnValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPercentage(value: Double): Self = StObject.set(x, "percentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

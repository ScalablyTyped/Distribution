package typings.devtoolsProtocol.mod.Protocol.Profiler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuntimeCallCounterInfo extends StObject {
  
  /**
    * Counter name.
    */
  var name: String = js.native
  
  /**
    * Counter time in seconds.
    */
  var time: Double = js.native
  
  /**
    * Counter value.
    */
  var value: Double = js.native
}
object RuntimeCallCounterInfo {
  
  @scala.inline
  def apply(name: String, time: Double, value: Double): RuntimeCallCounterInfo = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuntimeCallCounterInfo]
  }
  
  @scala.inline
  implicit class RuntimeCallCounterInfoMutableBuilder[Self <: RuntimeCallCounterInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

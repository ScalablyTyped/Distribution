package typings.diagnosticChannelPublishers

import typings.diagnosticChannel.distSrcPatchRequireMod.IModulePatcher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcRedisDotpubMod {
  
  @JSImport("diagnostic-channel-publishers/dist/src/redis.pub", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def enable(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enable")().asInstanceOf[Unit]
  
  @JSImport("diagnostic-channel-publishers/dist/src/redis.pub", "redis")
  @js.native
  val redis: IModulePatcher = js.native
  
  trait IRedisData extends StObject {
    
    var address: String
    
    var commandObj: Any
    
    var duration: Double
    
    var err: js.Error
    
    var result: Any
    
    var time: js.Date
  }
  object IRedisData {
    
    inline def apply(address: String, commandObj: Any, duration: Double, err: js.Error, result: Any, time: js.Date): IRedisData = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], commandObj = commandObj.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], err = err.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRedisData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IRedisData] (val x: Self) extends AnyVal {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setCommandObj(value: Any): Self = StObject.set(x, "commandObj", value.asInstanceOf[js.Any])
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setErr(value: js.Error): Self = StObject.set(x, "err", value.asInstanceOf[js.Any])
      
      inline def setResult(value: Any): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setTime(value: js.Date): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    }
  }
}

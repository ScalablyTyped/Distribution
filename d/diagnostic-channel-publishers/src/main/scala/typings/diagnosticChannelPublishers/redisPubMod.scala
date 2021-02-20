package typings.diagnosticChannelPublishers

import typings.diagnosticChannel.patchRequireMod.IModulePatcher
import typings.std.Date
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object redisPubMod {
  
  @JSImport("diagnostic-channel-publishers/dist/src/redis.pub", "enable")
  @js.native
  def enable(): Unit = js.native
  
  @JSImport("diagnostic-channel-publishers/dist/src/redis.pub", "redis")
  @js.native
  val redis: IModulePatcher = js.native
  
  @js.native
  trait IRedisData extends StObject {
    
    var address: String = js.native
    
    var commandObj: js.Any = js.native
    
    var duration: Double = js.native
    
    var err: Error = js.native
    
    var result: js.Any = js.native
    
    var time: Date = js.native
  }
  object IRedisData {
    
    @scala.inline
    def apply(address: String, commandObj: js.Any, duration: Double, err: Error, result: js.Any, time: Date): IRedisData = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], commandObj = commandObj.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], err = err.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRedisData]
    }
    
    @scala.inline
    implicit class IRedisDataMutableBuilder[Self <: IRedisData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommandObj(value: js.Any): Self = StObject.set(x, "commandObj", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErr(value: Error): Self = StObject.set(x, "err", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResult(value: js.Any): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTime(value: Date): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    }
  }
}

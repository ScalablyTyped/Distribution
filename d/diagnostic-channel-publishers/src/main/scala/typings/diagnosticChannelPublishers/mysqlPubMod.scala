package typings.diagnosticChannelPublishers

import typings.diagnosticChannel.patchRequireMod.IModulePatcher
import typings.diagnosticChannelPublishers.anon.Connection
import typings.std.Date
import typings.std.Error
import typings.std.IArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mysqlPubMod {
  
  @JSImport("diagnostic-channel-publishers/dist/src/mysql.pub", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def enable(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enable")().asInstanceOf[Unit]
  
  @JSImport("diagnostic-channel-publishers/dist/src/mysql.pub", "mysql")
  @js.native
  val mysql: IModulePatcher = js.native
  
  trait IMysqlData extends StObject {
    
    var callbackArgs: IArguments
    
    var duration: Double
    
    var err: Error
    
    var query: Connection
    
    var time: Date
  }
  object IMysqlData {
    
    inline def apply(callbackArgs: IArguments, duration: Double, err: Error, query: Connection, time: Date): IMysqlData = {
      val __obj = js.Dynamic.literal(callbackArgs = callbackArgs.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], err = err.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
      __obj.asInstanceOf[IMysqlData]
    }
    
    extension [Self <: IMysqlData](x: Self) {
      
      inline def setCallbackArgs(value: IArguments): Self = StObject.set(x, "callbackArgs", value.asInstanceOf[js.Any])
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setErr(value: Error): Self = StObject.set(x, "err", value.asInstanceOf[js.Any])
      
      inline def setQuery(value: Connection): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setTime(value: Date): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    }
  }
}

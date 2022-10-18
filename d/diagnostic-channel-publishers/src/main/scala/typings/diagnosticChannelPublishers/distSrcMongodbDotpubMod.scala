package typings.diagnosticChannelPublishers

import typings.diagnosticChannel.distSrcPatchRequireMod.IModulePatcher
import typings.diagnosticChannelPublishers.anon.Command
import typings.diagnosticChannelPublishers.anon.CommandName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcMongodbDotpubMod {
  
  @JSImport("diagnostic-channel-publishers/dist/src/mongodb.pub", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def enable(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enable")().asInstanceOf[Unit]
  
  @JSImport("diagnostic-channel-publishers/dist/src/mongodb.pub", "mongo2")
  @js.native
  val mongo2: IModulePatcher = js.native
  
  @JSImport("diagnostic-channel-publishers/dist/src/mongodb.pub", "mongo3")
  @js.native
  val mongo3: IModulePatcher = js.native
  
  @JSImport("diagnostic-channel-publishers/dist/src/mongodb.pub", "mongo330")
  @js.native
  val mongo330: IModulePatcher = js.native
  
  trait IMongoData extends StObject {
    
    var event: CommandName
    
    var startedData: Command
    
    var succeeded: Boolean
  }
  object IMongoData {
    
    inline def apply(event: CommandName, startedData: Command, succeeded: Boolean): IMongoData = {
      val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], startedData = startedData.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any])
      __obj.asInstanceOf[IMongoData]
    }
    
    extension [Self <: IMongoData](x: Self) {
      
      inline def setEvent(value: CommandName): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setStartedData(value: Command): Self = StObject.set(x, "startedData", value.asInstanceOf[js.Any])
      
      inline def setSucceeded(value: Boolean): Self = StObject.set(x, "succeeded", value.asInstanceOf[js.Any])
    }
  }
}

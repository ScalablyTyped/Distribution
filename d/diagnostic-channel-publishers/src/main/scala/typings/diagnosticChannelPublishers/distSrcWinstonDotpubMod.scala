package typings.diagnosticChannelPublishers

import typings.diagnosticChannel.distSrcPatchRequireMod.IModulePatcher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcWinstonDotpubMod {
  
  @JSImport("diagnostic-channel-publishers/dist/src/winston.pub", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def enable(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enable")().asInstanceOf[Unit]
  
  @JSImport("diagnostic-channel-publishers/dist/src/winston.pub", "winston2")
  @js.native
  val winston2: IModulePatcher = js.native
  
  @JSImport("diagnostic-channel-publishers/dist/src/winston.pub", "winston3")
  @js.native
  val winston3: IModulePatcher = js.native
  
  trait IWinstonData extends StObject {
    
    var level: String
    
    var levelKind: String
    
    var message: String | js.Error
    
    var meta: Any
  }
  object IWinstonData {
    
    inline def apply(level: String, levelKind: String, message: String | js.Error, meta: Any): IWinstonData = {
      val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], levelKind = levelKind.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
      __obj.asInstanceOf[IWinstonData]
    }
    
    extension [Self <: IWinstonData](x: Self) {
      
      inline def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelKind(value: String): Self = StObject.set(x, "levelKind", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String | js.Error): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: Any): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    }
  }
}

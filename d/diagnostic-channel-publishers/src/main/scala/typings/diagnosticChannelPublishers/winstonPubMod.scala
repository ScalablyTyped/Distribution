package typings.diagnosticChannelPublishers

import typings.diagnosticChannel.patchRequireMod.IModulePatcher
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object winstonPubMod {
  
  @JSImport("diagnostic-channel-publishers/dist/src/winston.pub", "enable")
  @js.native
  def enable(): Unit = js.native
  
  @JSImport("diagnostic-channel-publishers/dist/src/winston.pub", "winston2")
  @js.native
  val winston2: IModulePatcher = js.native
  
  @JSImport("diagnostic-channel-publishers/dist/src/winston.pub", "winston3")
  @js.native
  val winston3: IModulePatcher = js.native
  
  @js.native
  trait IWinstonData extends StObject {
    
    var level: String = js.native
    
    var levelKind: String = js.native
    
    var message: String | Error = js.native
    
    var meta: js.Any = js.native
  }
  object IWinstonData {
    
    @scala.inline
    def apply(level: String, levelKind: String, message: String | Error, meta: js.Any): IWinstonData = {
      val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], levelKind = levelKind.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
      __obj.asInstanceOf[IWinstonData]
    }
    
    @scala.inline
    implicit class IWinstonDataMutableBuilder[Self <: IWinstonData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevelKind(value: String): Self = StObject.set(x, "levelKind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String | Error): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMeta(value: js.Any): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    }
  }
}

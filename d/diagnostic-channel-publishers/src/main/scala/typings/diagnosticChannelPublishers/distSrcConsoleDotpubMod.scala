package typings.diagnosticChannelPublishers

import typings.diagnosticChannel.distSrcPatchRequireMod.IModulePatcher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcConsoleDotpubMod {
  
  @JSImport("diagnostic-channel-publishers/dist/src/console.pub", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("diagnostic-channel-publishers/dist/src/console.pub", "console")
  @js.native
  val console: IModulePatcher = js.native
  
  inline def enable(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enable")().asInstanceOf[Unit]
  
  trait IConsoleData extends StObject {
    
    var message: String
    
    var stderr: js.UndefOr[Boolean] = js.undefined
  }
  object IConsoleData {
    
    inline def apply(message: String): IConsoleData = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[IConsoleData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IConsoleData] (val x: Self) extends AnyVal {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setStderr(value: Boolean): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
      
      inline def setStderrUndefined: Self = StObject.set(x, "stderr", js.undefined)
    }
  }
}

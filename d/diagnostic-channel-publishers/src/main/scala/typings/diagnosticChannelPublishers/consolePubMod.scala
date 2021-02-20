package typings.diagnosticChannelPublishers

import typings.diagnosticChannel.patchRequireMod.IModulePatcher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object consolePubMod {
  
  @JSImport("diagnostic-channel-publishers/dist/src/console.pub", "console")
  @js.native
  val console: IModulePatcher = js.native
  
  @JSImport("diagnostic-channel-publishers/dist/src/console.pub", "enable")
  @js.native
  def enable(): Unit = js.native
  
  @js.native
  trait IConsoleData extends StObject {
    
    var message: String = js.native
    
    var stderr: js.UndefOr[Boolean] = js.native
  }
  object IConsoleData {
    
    @scala.inline
    def apply(message: String): IConsoleData = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[IConsoleData]
    }
    
    @scala.inline
    implicit class IConsoleDataMutableBuilder[Self <: IConsoleData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStderr(value: Boolean): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStderrUndefined: Self = StObject.set(x, "stderr", js.undefined)
    }
  }
}

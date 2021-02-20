package typings.diagnosticChannelPublishers

import typings.diagnosticChannel.patchRequireMod.IModulePatcher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bunyanPubMod {
  
  @JSImport("diagnostic-channel-publishers/dist/src/bunyan.pub", "bunyan")
  @js.native
  val bunyan: IModulePatcher = js.native
  
  @JSImport("diagnostic-channel-publishers/dist/src/bunyan.pub", "enable")
  @js.native
  def enable(): Unit = js.native
  
  @js.native
  trait IBunyanData extends StObject {
    
    var level: Double = js.native
    
    var result: String = js.native
  }
  object IBunyanData {
    
    @scala.inline
    def apply(level: Double, result: String): IBunyanData = {
      val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
      __obj.asInstanceOf[IBunyanData]
    }
    
    @scala.inline
    implicit class IBunyanDataMutableBuilder[Self <: IBunyanData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResult(value: String): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    }
  }
}

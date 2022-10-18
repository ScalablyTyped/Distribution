package typings.diagnosticChannelPublishers

import typings.diagnosticChannel.distSrcPatchRequireMod.IModulePatcher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcBunyanDotpubMod {
  
  @JSImport("diagnostic-channel-publishers/dist/src/bunyan.pub", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("diagnostic-channel-publishers/dist/src/bunyan.pub", "bunyan")
  @js.native
  val bunyan: IModulePatcher = js.native
  
  inline def enable(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enable")().asInstanceOf[Unit]
  
  trait IBunyanData extends StObject {
    
    var level: Double
    
    var result: String
  }
  object IBunyanData {
    
    inline def apply(level: Double, result: String): IBunyanData = {
      val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
      __obj.asInstanceOf[IBunyanData]
    }
    
    extension [Self <: IBunyanData](x: Self) {
      
      inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setResult(value: String): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    }
  }
}

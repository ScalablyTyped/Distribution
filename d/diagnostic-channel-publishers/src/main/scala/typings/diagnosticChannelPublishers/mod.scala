package typings.diagnosticChannelPublishers

import typings.diagnosticChannel.patchRequireMod.IModulePatcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("diagnostic-channel-publishers", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def enable(): Unit = js.native
  
  @js.native
  object azuresdk extends js.Object {
    
    val AzureMonitorSymbol: /* "Azure_Monitor_Tracer" */ String = js.native
    
    val azureCoreTracing: IModulePatcher = js.native
    
    def enable(): Unit = js.native
  }
  
  @js.native
  object bunyan extends js.Object {
    
    val bunyan: IModulePatcher = js.native
    
    def enable(): Unit = js.native
  }
  
  @js.native
  object console extends js.Object {
    
    val console: IModulePatcher = js.native
    
    def enable(): Unit = js.native
  }
  
  @js.native
  object mongodb extends js.Object {
    
    def enable(): Unit = js.native
    
    val mongo2: IModulePatcher = js.native
    
    val mongo3: IModulePatcher = js.native
    
    val mongo330: IModulePatcher = js.native
  }
  
  @js.native
  object mongodbCore extends js.Object {
    
    def enable(): Unit = js.native
    
    val mongoCore: IModulePatcher = js.native
  }
  
  @js.native
  object mysql extends js.Object {
    
    def enable(): Unit = js.native
    
    val mysql: IModulePatcher = js.native
  }
  
  @js.native
  object pg extends js.Object {
    
    def enable(): Unit = js.native
    
    val postgres6: IModulePatcher = js.native
    
    val postgres7: IModulePatcher = js.native
  }
  
  @js.native
  object pgPool extends js.Object {
    
    def enable(): Unit = js.native
    
    val postgresPool1: IModulePatcher = js.native
  }
  
  @js.native
  object redis extends js.Object {
    
    def enable(): Unit = js.native
    
    val redis: IModulePatcher = js.native
  }
  
  @js.native
  object tedious extends js.Object {
    
    def enable(): Unit = js.native
    
    val tedious: IModulePatcher = js.native
  }
  
  @js.native
  object winston extends js.Object {
    
    def enable(): Unit = js.native
    
    val winston2: IModulePatcher = js.native
    
    val winston3: IModulePatcher = js.native
  }
}

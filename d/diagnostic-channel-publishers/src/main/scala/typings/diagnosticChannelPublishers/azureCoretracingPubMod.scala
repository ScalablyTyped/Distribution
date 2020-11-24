package typings.diagnosticChannelPublishers

import typings.diagnosticChannel.patchRequireMod.IModulePatcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("diagnostic-channel-publishers/dist/src/azure-coretracing.pub", JSImport.Namespace)
@js.native
object azureCoretracingPubMod extends js.Object {
  
  val AzureMonitorSymbol: /* "Azure_Monitor_Tracer" */ String = js.native
  
  val azureCoreTracing: IModulePatcher = js.native
  
  def enable(): Unit = js.native
}

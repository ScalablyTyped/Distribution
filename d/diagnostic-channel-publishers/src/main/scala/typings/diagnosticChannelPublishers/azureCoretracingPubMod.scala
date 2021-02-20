package typings.diagnosticChannelPublishers

import typings.diagnosticChannel.patchRequireMod.IModulePatcher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object azureCoretracingPubMod {
  
  @JSImport("diagnostic-channel-publishers/dist/src/azure-coretracing.pub", "AzureMonitorSymbol")
  @js.native
  val AzureMonitorSymbol: /* "Azure_Monitor_Tracer" */ String = js.native
  
  @JSImport("diagnostic-channel-publishers/dist/src/azure-coretracing.pub", "azureCoreTracing")
  @js.native
  val azureCoreTracing: IModulePatcher = js.native
  
  @JSImport("diagnostic-channel-publishers/dist/src/azure-coretracing.pub", "enable")
  @js.native
  def enable(): Unit = js.native
}

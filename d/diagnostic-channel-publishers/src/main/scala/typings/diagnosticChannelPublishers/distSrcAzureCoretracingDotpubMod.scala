package typings.diagnosticChannelPublishers

import typings.diagnosticChannel.distSrcPatchRequireMod.IModulePatcher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcAzureCoretracingDotpubMod {
  
  @JSImport("diagnostic-channel-publishers/dist/src/azure-coretracing.pub", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("diagnostic-channel-publishers/dist/src/azure-coretracing.pub", "AzureMonitorSymbol")
  @js.native
  val AzureMonitorSymbol: /* "Azure_Monitor_Tracer" */ String = js.native
  
  @JSImport("diagnostic-channel-publishers/dist/src/azure-coretracing.pub", "azureCoreTracing")
  @js.native
  val azureCoreTracing: IModulePatcher = js.native
  
  inline def enable(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enable")().asInstanceOf[Unit]
}

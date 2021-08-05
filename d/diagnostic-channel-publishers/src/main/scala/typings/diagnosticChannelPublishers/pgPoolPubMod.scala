package typings.diagnosticChannelPublishers

import typings.diagnosticChannel.patchRequireMod.IModulePatcher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pgPoolPubMod {
  
  @JSImport("diagnostic-channel-publishers/dist/src/pg-pool.pub", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def enable(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enable")().asInstanceOf[Unit]
  
  @JSImport("diagnostic-channel-publishers/dist/src/pg-pool.pub", "postgresPool1")
  @js.native
  val postgresPool1: IModulePatcher = js.native
}

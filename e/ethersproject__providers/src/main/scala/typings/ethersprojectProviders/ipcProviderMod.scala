package typings.ethersprojectProviders

import typings.ethersprojectNetworks.typesMod.Networkish
import typings.ethersprojectProviders.jsonRpcProviderMod.JsonRpcProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ipcProviderMod {
  
  @JSImport("@ethersproject/providers/lib/ipc-provider", "IpcProvider")
  @js.native
  class IpcProvider protected () extends JsonRpcProvider {
    def this(path: String) = this()
    def this(path: String, network: Networkish) = this()
    
    val path: String = js.native
  }
}

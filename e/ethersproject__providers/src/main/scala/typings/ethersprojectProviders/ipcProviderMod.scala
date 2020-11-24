package typings.ethersprojectProviders

import typings.ethersprojectNetworks.typesMod.Networkish
import typings.ethersprojectProviders.jsonRpcProviderMod.JsonRpcProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ethersproject/providers/lib/ipc-provider", JSImport.Namespace)
@js.native
object ipcProviderMod extends js.Object {
  
  @js.native
  class IpcProvider protected () extends JsonRpcProvider {
    def this(path: String) = this()
    def this(path: String, network: Networkish) = this()
    
    val path: String = js.native
  }
}

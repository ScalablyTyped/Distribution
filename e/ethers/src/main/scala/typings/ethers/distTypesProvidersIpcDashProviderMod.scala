package typings.ethers

import typings.ethers.distTypesProvidersJsonDashRpcDashProviderMod.JsonRpcProvider
import typings.ethers.distTypesUtilsTypesMod.Networkish
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethers/dist/types/providers/ipc-provider", JSImport.Namespace)
@js.native
object distTypesProvidersIpcDashProviderMod extends js.Object {
  @js.native
  class IpcProvider protected () extends JsonRpcProvider {
    def this(path: String) = this()
    def this(path: String, network: Networkish) = this()
    val path: String = js.native
  }
  
}


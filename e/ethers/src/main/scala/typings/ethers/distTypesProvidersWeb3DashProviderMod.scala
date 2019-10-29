package typings.ethers

import typings.ethers.distTypesProvidersJsonDashRpcDashProviderMod.JsonRpcProvider
import typings.ethers.distTypesUtilsTypesMod.AsyncProvider
import typings.ethers.distTypesUtilsTypesMod.Networkish
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethers/dist/types/providers/web3-provider", JSImport.Namespace)
@js.native
object distTypesProvidersWeb3DashProviderMod extends js.Object {
  @js.native
  class Web3Provider protected () extends JsonRpcProvider {
    def this(web3Provider: AsyncProvider) = this()
    def this(web3Provider: AsyncProvider, network: Networkish) = this()
    val _web3Provider: AsyncProvider = js.native
  }
  
}


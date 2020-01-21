package typings.ethers

import typings.ethers.jsonRpcProviderMod.JsonRpcProvider
import typings.ethers.typesMod.Networkish
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethers/dist/types/providers/infura-provider", JSImport.Namespace)
@js.native
object infuraProviderMod extends js.Object {
  @js.native
  class InfuraProvider () extends JsonRpcProvider {
    def this(network: Networkish) = this()
    def this(network: Networkish, apiAccessToken: String) = this()
    val apiAccessToken: String = js.native
  }
  
}


package typings.ethersprojectProviders.web3ProviderMod

import typings.ethersprojectNetworks.typesMod.Networkish
import typings.ethersprojectProviders.jsonRpcProviderMod.JsonRpcProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ethersproject/providers/lib/web3-provider", "Web3Provider")
@js.native
class Web3Provider protected () extends JsonRpcProvider {
  def this(provider: ExternalProvider) = this()
  def this(provider: JsonRpcFetchFunc) = this()
  def this(provider: ExternalProvider, network: Networkish) = this()
  def this(provider: JsonRpcFetchFunc, network: Networkish) = this()
  
  def jsonRpcFetchFunc(method: String): js.Promise[_] = js.native
  def jsonRpcFetchFunc(method: String, params: js.Array[_]): js.Promise[_] = js.native
  
  val provider: ExternalProvider = js.native
}

package typings.ethers.ethersMod.providers

import typings.ethersprojectNetworks.typesMod.Network
import typings.ethersprojectNetworks.typesMod.Networkish
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers/lib/ethers", "providers.BaseProvider")
@js.native
class BaseProvider protected ()
  extends typings.ethersprojectProviders.mod.BaseProvider {
  def this(network: js.Promise[Network]) = this()
  /**
    *  ready
    *
    *  A Promise<Network> that resolves only once the provider is ready.
    *
    *  Sub-classes that call the super with a network without a chainId
    *  MUST set this. Standard named networks have a known chainId.
    *
    */
  def this(network: Networkish) = this()
}
/* static members */
@JSImport("ethers/lib/ethers", "providers.BaseProvider")
@js.native
object BaseProvider extends js.Object {
  
  def getFormatter(): typings.ethersprojectProviders.formatterMod.Formatter = js.native
  
  def getNetwork(network: Networkish): Network = js.native
}

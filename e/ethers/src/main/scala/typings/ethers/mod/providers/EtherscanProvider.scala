package typings.ethers.mod.providers

import typings.ethersprojectNetworks.typesMod.Networkish
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers", "providers.EtherscanProvider")
@js.native
class EtherscanProvider ()
  extends typings.ethersprojectProviders.mod.EtherscanProvider {
  def this(network: Networkish) = this()
  def this(network: js.UndefOr[Networkish], apiKey: String) = this()
}

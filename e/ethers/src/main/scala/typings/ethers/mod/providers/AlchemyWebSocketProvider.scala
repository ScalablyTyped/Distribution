package typings.ethers.mod.providers

import typings.ethersprojectNetworks.typesMod.Networkish
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers", "providers.AlchemyWebSocketProvider")
@js.native
class AlchemyWebSocketProvider ()
  extends typings.ethersprojectProviders.mod.AlchemyWebSocketProvider {
  def this(network: Networkish) = this()
  def this(network: js.UndefOr[Networkish], apiKey: js.Any) = this()
}

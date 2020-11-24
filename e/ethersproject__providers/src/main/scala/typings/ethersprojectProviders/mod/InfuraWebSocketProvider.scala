package typings.ethersprojectProviders.mod

import typings.ethersprojectNetworks.typesMod.Networkish
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ethersproject/providers", "InfuraWebSocketProvider")
@js.native
class InfuraWebSocketProvider ()
  extends typings.ethersprojectProviders.infuraProviderMod.InfuraWebSocketProvider {
  def this(network: Networkish) = this()
  def this(network: js.UndefOr[Networkish], apiKey: js.Any) = this()
}

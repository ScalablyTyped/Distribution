package typings.ethers.mod.ethers

import typings.ethers.typesProvidersNetworkMod.Networkish
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers", "ethers.AlchemyProvider")
@js.native
open class AlchemyProvider ()
  extends typings.ethers.typesEthersMod.AlchemyProvider {
  def this(_network: Networkish) = this()
  def this(_network: Unit, apiKey: String) = this()
  def this(_network: Networkish, apiKey: String) = this()
}
/* static members */
object AlchemyProvider {
  
  @JSImport("ethers", "ethers.AlchemyProvider")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getRequest(network: typings.ethers.typesProvidersNetworkMod.Network): typings.ethers.typesUtilsMod.FetchRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("getRequest")(network.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesUtilsMod.FetchRequest]
  inline def getRequest(network: typings.ethers.typesProvidersNetworkMod.Network, apiKey: String): typings.ethers.typesUtilsMod.FetchRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("getRequest")(network.asInstanceOf[js.Any], apiKey.asInstanceOf[js.Any])).asInstanceOf[typings.ethers.typesUtilsMod.FetchRequest]
}

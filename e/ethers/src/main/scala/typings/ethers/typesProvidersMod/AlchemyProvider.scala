package typings.ethers.typesProvidersMod

import typings.ethers.typesProvidersNetworkMod.Networkish
import typings.ethers.typesUtilsMod.FetchRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers/types/providers", "AlchemyProvider")
@js.native
open class AlchemyProvider ()
  extends typings.ethers.typesProvidersProviderAlchemyMod.AlchemyProvider {
  def this(_network: Networkish) = this()
  def this(_network: Unit, apiKey: String) = this()
  def this(_network: Networkish, apiKey: String) = this()
}
/* static members */
object AlchemyProvider {
  
  @JSImport("ethers/types/providers", "AlchemyProvider")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getRequest(network: typings.ethers.typesProvidersNetworkMod.Network): FetchRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("getRequest")(network.asInstanceOf[js.Any]).asInstanceOf[FetchRequest]
  inline def getRequest(network: typings.ethers.typesProvidersNetworkMod.Network, apiKey: String): FetchRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("getRequest")(network.asInstanceOf[js.Any], apiKey.asInstanceOf[js.Any])).asInstanceOf[FetchRequest]
}

package typings.ethers.typesEthersMod

import typings.ethers.typesProvidersNetworkMod.Networkish
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers/types/ethers", "QuickNodeProvider")
@js.native
/**
  *  Creates a new **QuickNodeProvider**.
  */
open class QuickNodeProvider ()
  extends typings.ethers.typesProvidersMod.QuickNodeProvider {
  def this(_network: Networkish) = this()
  def this(_network: Unit, token: String) = this()
  def this(_network: Networkish, token: String) = this()
}
/* static members */
object QuickNodeProvider {
  
  @JSImport("ethers/types/ethers", "QuickNodeProvider")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *  Returns a new request prepared for %%network%% and the
    *  %%token%%.
    */
  inline def getRequest(network: typings.ethers.typesProvidersNetworkMod.Network): typings.ethers.typesUtilsMod.FetchRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("getRequest")(network.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesUtilsMod.FetchRequest]
  inline def getRequest(network: typings.ethers.typesProvidersNetworkMod.Network, token: String): typings.ethers.typesUtilsMod.FetchRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("getRequest")(network.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[typings.ethers.typesUtilsMod.FetchRequest]
}

package typings.ethers.mod.ethers

import typings.ethers.typesProvidersNetworkMod.Networkish
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers", "ethers.InfuraProvider")
@js.native
/**
  *  Creates a new **InfuraProvider**.
  */
open class InfuraProvider ()
  extends typings.ethers.typesEthersMod.InfuraProvider {
  def this(_network: Networkish) = this()
  def this(_network: Unit, projectId: String) = this()
  def this(_network: Networkish, projectId: String) = this()
  def this(_network: Unit, projectId: String, projectSecret: String) = this()
  def this(_network: Unit, projectId: Null, projectSecret: String) = this()
  def this(_network: Unit, projectId: Unit, projectSecret: String) = this()
  def this(_network: Networkish, projectId: String, projectSecret: String) = this()
  def this(_network: Networkish, projectId: Null, projectSecret: String) = this()
  def this(_network: Networkish, projectId: Unit, projectSecret: String) = this()
}
/* static members */
object InfuraProvider {
  
  @JSImport("ethers", "ethers.InfuraProvider")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *  Returns a prepared request for connecting to %%network%%
    *  with %%projectId%% and %%projectSecret%%.
    */
  inline def getRequest(network: typings.ethers.typesProvidersNetworkMod.Network): typings.ethers.typesUtilsMod.FetchRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("getRequest")(network.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesUtilsMod.FetchRequest]
  inline def getRequest(network: typings.ethers.typesProvidersNetworkMod.Network, projectId: String): typings.ethers.typesUtilsMod.FetchRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("getRequest")(network.asInstanceOf[js.Any], projectId.asInstanceOf[js.Any])).asInstanceOf[typings.ethers.typesUtilsMod.FetchRequest]
  inline def getRequest(network: typings.ethers.typesProvidersNetworkMod.Network, projectId: String, projectSecret: String): typings.ethers.typesUtilsMod.FetchRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("getRequest")(network.asInstanceOf[js.Any], projectId.asInstanceOf[js.Any], projectSecret.asInstanceOf[js.Any])).asInstanceOf[typings.ethers.typesUtilsMod.FetchRequest]
  inline def getRequest(network: typings.ethers.typesProvidersNetworkMod.Network, projectId: Null, projectSecret: String): typings.ethers.typesUtilsMod.FetchRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("getRequest")(network.asInstanceOf[js.Any], projectId.asInstanceOf[js.Any], projectSecret.asInstanceOf[js.Any])).asInstanceOf[typings.ethers.typesUtilsMod.FetchRequest]
  inline def getRequest(network: typings.ethers.typesProvidersNetworkMod.Network, projectId: Unit, projectSecret: String): typings.ethers.typesUtilsMod.FetchRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("getRequest")(network.asInstanceOf[js.Any], projectId.asInstanceOf[js.Any], projectSecret.asInstanceOf[js.Any])).asInstanceOf[typings.ethers.typesUtilsMod.FetchRequest]
  
  /**
    *  Creates a new **InfuraWebSocketProvider**.
    */
  inline def getWebSocketProvider(): typings.ethers.typesProvidersProviderInfuraMod.InfuraWebSocketProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("getWebSocketProvider")().asInstanceOf[typings.ethers.typesProvidersProviderInfuraMod.InfuraWebSocketProvider]
  inline def getWebSocketProvider(network: Unit, projectId: String): typings.ethers.typesProvidersProviderInfuraMod.InfuraWebSocketProvider = (^.asInstanceOf[js.Dynamic].applyDynamic("getWebSocketProvider")(network.asInstanceOf[js.Any], projectId.asInstanceOf[js.Any])).asInstanceOf[typings.ethers.typesProvidersProviderInfuraMod.InfuraWebSocketProvider]
  inline def getWebSocketProvider(network: Networkish): typings.ethers.typesProvidersProviderInfuraMod.InfuraWebSocketProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("getWebSocketProvider")(network.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesProvidersProviderInfuraMod.InfuraWebSocketProvider]
  inline def getWebSocketProvider(network: Networkish, projectId: String): typings.ethers.typesProvidersProviderInfuraMod.InfuraWebSocketProvider = (^.asInstanceOf[js.Dynamic].applyDynamic("getWebSocketProvider")(network.asInstanceOf[js.Any], projectId.asInstanceOf[js.Any])).asInstanceOf[typings.ethers.typesProvidersProviderInfuraMod.InfuraWebSocketProvider]
}

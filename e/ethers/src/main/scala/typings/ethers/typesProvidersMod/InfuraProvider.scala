package typings.ethers.typesProvidersMod

import typings.ethers.typesProvidersNetworkMod.Networkish
import typings.ethers.typesUtilsMod.FetchRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers/types/providers", "InfuraProvider")
@js.native
/**
  *  Creates a new **InfuraProvider**.
  */
open class InfuraProvider ()
  extends typings.ethers.typesProvidersProviderInfuraMod.InfuraProvider {
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
  
  @JSImport("ethers/types/providers", "InfuraProvider")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *  Returns a prepared request for connecting to %%network%%
    *  with %%projectId%% and %%projectSecret%%.
    */
  inline def getRequest(network: typings.ethers.typesProvidersNetworkMod.Network): FetchRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("getRequest")(network.asInstanceOf[js.Any]).asInstanceOf[FetchRequest]
  inline def getRequest(network: typings.ethers.typesProvidersNetworkMod.Network, projectId: String): FetchRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("getRequest")(network.asInstanceOf[js.Any], projectId.asInstanceOf[js.Any])).asInstanceOf[FetchRequest]
  inline def getRequest(network: typings.ethers.typesProvidersNetworkMod.Network, projectId: String, projectSecret: String): FetchRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("getRequest")(network.asInstanceOf[js.Any], projectId.asInstanceOf[js.Any], projectSecret.asInstanceOf[js.Any])).asInstanceOf[FetchRequest]
  inline def getRequest(network: typings.ethers.typesProvidersNetworkMod.Network, projectId: Null, projectSecret: String): FetchRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("getRequest")(network.asInstanceOf[js.Any], projectId.asInstanceOf[js.Any], projectSecret.asInstanceOf[js.Any])).asInstanceOf[FetchRequest]
  inline def getRequest(network: typings.ethers.typesProvidersNetworkMod.Network, projectId: Unit, projectSecret: String): FetchRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("getRequest")(network.asInstanceOf[js.Any], projectId.asInstanceOf[js.Any], projectSecret.asInstanceOf[js.Any])).asInstanceOf[FetchRequest]
  
  /**
    *  Creates a new **InfuraWebSocketProvider**.
    */
  inline def getWebSocketProvider(): typings.ethers.typesProvidersProviderInfuraMod.InfuraWebSocketProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("getWebSocketProvider")().asInstanceOf[typings.ethers.typesProvidersProviderInfuraMod.InfuraWebSocketProvider]
  inline def getWebSocketProvider(network: Unit, projectId: String): typings.ethers.typesProvidersProviderInfuraMod.InfuraWebSocketProvider = (^.asInstanceOf[js.Dynamic].applyDynamic("getWebSocketProvider")(network.asInstanceOf[js.Any], projectId.asInstanceOf[js.Any])).asInstanceOf[typings.ethers.typesProvidersProviderInfuraMod.InfuraWebSocketProvider]
  inline def getWebSocketProvider(network: Networkish): typings.ethers.typesProvidersProviderInfuraMod.InfuraWebSocketProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("getWebSocketProvider")(network.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesProvidersProviderInfuraMod.InfuraWebSocketProvider]
  inline def getWebSocketProvider(network: Networkish, projectId: String): typings.ethers.typesProvidersProviderInfuraMod.InfuraWebSocketProvider = (^.asInstanceOf[js.Dynamic].applyDynamic("getWebSocketProvider")(network.asInstanceOf[js.Any], projectId.asInstanceOf[js.Any])).asInstanceOf[typings.ethers.typesProvidersProviderInfuraMod.InfuraWebSocketProvider]
}

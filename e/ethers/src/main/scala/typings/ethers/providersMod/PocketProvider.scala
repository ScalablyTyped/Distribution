package typings.ethers.providersMod

import typings.ethers.typesProvidersNetworkMod.Networkish
import typings.ethers.typesUtilsMod.FetchRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers/providers", "PocketProvider")
@js.native
/**
  *  Create a new **PocketProvider**.
  *
  *  By default connecting to ``mainnet`` with a highly throttled
  *  API key.
  */
open class PocketProvider ()
  extends typings.ethers.typesProvidersMod.PocketProvider {
  def this(_network: Networkish) = this()
  def this(_network: Unit, applicationId: String) = this()
  def this(_network: Networkish, applicationId: String) = this()
  def this(_network: Unit, applicationId: String, applicationSecret: String) = this()
  def this(_network: Unit, applicationId: Null, applicationSecret: String) = this()
  def this(_network: Unit, applicationId: Unit, applicationSecret: String) = this()
  def this(_network: Networkish, applicationId: String, applicationSecret: String) = this()
  def this(_network: Networkish, applicationId: Null, applicationSecret: String) = this()
  def this(_network: Networkish, applicationId: Unit, applicationSecret: String) = this()
}
/* static members */
object PocketProvider {
  
  @JSImport("ethers/providers", "PocketProvider")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *  Returns a prepared request for connecting to %%network%% with
    *  %%applicationId%%.
    */
  inline def getRequest(network: typings.ethers.typesProvidersNetworkMod.Network): FetchRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("getRequest")(network.asInstanceOf[js.Any]).asInstanceOf[FetchRequest]
  inline def getRequest(network: typings.ethers.typesProvidersNetworkMod.Network, applicationId: String): FetchRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("getRequest")(network.asInstanceOf[js.Any], applicationId.asInstanceOf[js.Any])).asInstanceOf[FetchRequest]
  inline def getRequest(
    network: typings.ethers.typesProvidersNetworkMod.Network,
    applicationId: String,
    applicationSecret: String
  ): FetchRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("getRequest")(network.asInstanceOf[js.Any], applicationId.asInstanceOf[js.Any], applicationSecret.asInstanceOf[js.Any])).asInstanceOf[FetchRequest]
  inline def getRequest(
    network: typings.ethers.typesProvidersNetworkMod.Network,
    applicationId: Null,
    applicationSecret: String
  ): FetchRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("getRequest")(network.asInstanceOf[js.Any], applicationId.asInstanceOf[js.Any], applicationSecret.asInstanceOf[js.Any])).asInstanceOf[FetchRequest]
  inline def getRequest(
    network: typings.ethers.typesProvidersNetworkMod.Network,
    applicationId: Unit,
    applicationSecret: String
  ): FetchRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("getRequest")(network.asInstanceOf[js.Any], applicationId.asInstanceOf[js.Any], applicationSecret.asInstanceOf[js.Any])).asInstanceOf[FetchRequest]
}

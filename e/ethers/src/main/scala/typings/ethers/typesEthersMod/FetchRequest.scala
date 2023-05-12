package typings.ethers.typesEthersMod

import typings.ethers.typesUtilsFetchMod.FetchGatewayFunc
import typings.ethers.typesUtilsFetchMod.FetchGetUrlFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers/types/ethers", "FetchRequest")
@js.native
open class FetchRequest protected ()
  extends typings.ethers.typesUtilsMod.FetchRequest {
  /**
    *  Create a new FetchRequest instance with default values.
    *
    *  Once created, each property may be set before issuing a
    *  ``.send()`` to make the request.
    */
  def this(url: String) = this()
}
/* static members */
object FetchRequest {
  
  @JSImport("ethers/types/ethers", "FetchRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *  Creates a function that can "fetch" data URIs.
    *
    *  Note that this is automatically done internally to support
    *  data URIs, so it is not necessary to register it.
    *
    *  This is not generally something that is needed, but may
    *  be useful in a wrapper to perfom custom data URI functionality.
    */
  inline def createDataGateway(): FetchGatewayFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("createDataGateway")().asInstanceOf[FetchGatewayFunc]
  
  /**
    *  Creates a function that will fetch IPFS (unvalidated) from
    *  a custom gateway baseUrl.
    *
    *  The default IPFS gateway used internally is
    *  ``"https:/\/gateway.ipfs.io/ipfs/"``.
    */
  inline def createIpfsGatewayFunc(baseUrl: String): FetchGatewayFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("createIpfsGatewayFunc")(baseUrl.asInstanceOf[js.Any]).asInstanceOf[FetchGatewayFunc]
  
  /**
    *  Get the current Gateway function for %%scheme%%.
    */
  inline def getGateway(scheme: String): Null | FetchGatewayFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("getGateway")(scheme.asInstanceOf[js.Any]).asInstanceOf[Null | FetchGatewayFunc]
  
  /**
    *  Locks all static configuration for gateways and FetchGetUrlFunc
    *  registration.
    */
  inline def lockConfig(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("lockConfig")().asInstanceOf[Unit]
  
  /**
    *  Use the %%func%% when fetching URIs using %%scheme%%.
    *
    *  This method affects all requests globally.
    *
    *  If [[lockConfig]] has been called, no change is made and this
    *  throws.
    */
  inline def registerGateway(scheme: String, func: FetchGatewayFunc): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerGateway")(scheme.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    *  Use %%getUrl%% when fetching URIs over HTTP and HTTPS requests.
    *
    *  This method affects all requests globally.
    *
    *  If [[lockConfig]] has been called, no change is made and this
    *  throws.
    */
  inline def registerGetUrl(getUrl: FetchGetUrlFunc): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerGetUrl")(getUrl.asInstanceOf[js.Any]).asInstanceOf[Unit]
}

package typings.ethers.providersMod

import typings.ethers.typesProvidersNetworkMod.Networkish
import typings.ethers.typesUtilsMathsMod.BigNumberish
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers/providers", "Network")
@js.native
open class Network protected ()
  extends typings.ethers.typesProvidersMod.Network {
  def this(name: String, chainId: BigNumberish) = this()
}
/* static members */
object Network {
  
  @JSImport("ethers/providers", "Network")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *  Returns a new Network for the %%network%% name or chainId.
    */
  inline def from(): typings.ethers.typesProvidersNetworkMod.Network = ^.asInstanceOf[js.Dynamic].applyDynamic("from")().asInstanceOf[typings.ethers.typesProvidersNetworkMod.Network]
  inline def from(network: Networkish): typings.ethers.typesProvidersNetworkMod.Network = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(network.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesProvidersNetworkMod.Network]
  
  /**
    *  Register %%nameOrChainId%% with a function which returns
    *  an instance of a Network representing that chain.
    */
  inline def register(nameOrChainId: String, networkFunc: js.Function0[this.type]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("register")(nameOrChainId.asInstanceOf[js.Any], networkFunc.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def register(nameOrChainId: js.BigInt, networkFunc: js.Function0[this.type]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("register")(nameOrChainId.asInstanceOf[js.Any], networkFunc.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def register(nameOrChainId: Double, networkFunc: js.Function0[this.type]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("register")(nameOrChainId.asInstanceOf[js.Any], networkFunc.asInstanceOf[js.Any])).asInstanceOf[Unit]
}

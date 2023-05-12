package typings.ethers

import typings.ethers.typesProvidersPluginsNetworkMod.NetworkPlugin
import typings.ethers.typesTransactionTransactionMod.TransactionLike
import typings.ethers.typesUtilsMathsMod.BigNumberish
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesProvidersNetworkMod {
  
  @JSImport("ethers/types/providers/network", "Network")
  @js.native
  open class Network protected ()
    extends StObject
       with _Networkish {
    def this(name: String, chainId: BigNumberish) = this()
    
    def attachPlugin(plugin: NetworkPlugin): this.type = js.native
    
    def chainId: js.BigInt = js.native
    def chainId_=(value: BigNumberish): Unit = js.native
    
    def computeIntrinsicGas(tx: TransactionLike[String]): Double = js.native
    
    def getPlugin[T /* <: NetworkPlugin */](name: String): Null | T = js.native
    
    def getPlugins[T /* <: NetworkPlugin */](basename: String): js.Array[T] = js.native
    
    def name: String = js.native
    def name_=(value: String): Unit = js.native
    
    def plugins: js.Array[NetworkPlugin] = js.native
    
    /* private */ var `private`: Any = js.native
    
    def toJSON(): Any = js.native
  }
  /* static members */
  object Network {
    
    @JSImport("ethers/types/providers/network", "Network")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      *  Returns a new Network for the %%network%% name or chainId.
      */
    inline def from(): Network = ^.asInstanceOf[js.Dynamic].applyDynamic("from")().asInstanceOf[Network]
    inline def from(network: Networkish): Network = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(network.asInstanceOf[js.Any]).asInstanceOf[Network]
    
    /**
      *  Register %%nameOrChainId%% with a function which returns
      *  an instance of a Network representing that chain.
      */
    inline def register(nameOrChainId: String, networkFunc: js.Function0[this.type]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("register")(nameOrChainId.asInstanceOf[js.Any], networkFunc.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def register(nameOrChainId: js.BigInt, networkFunc: js.Function0[this.type]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("register")(nameOrChainId.asInstanceOf[js.Any], networkFunc.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def register(nameOrChainId: Double, networkFunc: js.Function0[this.type]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("register")(nameOrChainId.asInstanceOf[js.Any], networkFunc.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ethers.typesProvidersNetworkMod.Network
    - scala.Double
    - js.BigInt
    - java.lang.String
    - typings.ethers.anon.ChainId
  */
  type Networkish = _Networkish | Double | js.BigInt | String
  
  trait _Networkish extends StObject
}

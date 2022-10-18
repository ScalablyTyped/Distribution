package typings.ethereumjsCommon.distEnumsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CustomChain extends StObject
@JSImport("@ethereumjs/common/dist/enums", "CustomChain")
@js.native
object CustomChain extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CustomChain & String] = js.native
  
  /**
    * Arbitrum Rinkeby Testnet
    *
    * - [Documentation](https://developer.offchainlabs.com/docs/public_testnet)
    */
  @js.native
  sealed trait ArbitrumRinkebyTestnet
    extends StObject
       with CustomChain
  /* "arbitrum-rinkeby-testnet" */ val ArbitrumRinkebyTestnet: typings.ethereumjsCommon.distEnumsMod.CustomChain.ArbitrumRinkebyTestnet & String = js.native
  
  /**
    * Optimistic Ethereum - mainnet for Optimism roll-up
    *
    * - [Documentation](https://community.optimism.io/docs/developers/tutorials.html)
    */
  @js.native
  sealed trait OptimisticEthereum
    extends StObject
       with CustomChain
  /* "optimistic-ethereum" */ val OptimisticEthereum: typings.ethereumjsCommon.distEnumsMod.CustomChain.OptimisticEthereum & String = js.native
  
  /**
    * Optimistic Kovan - testnet for Optimism roll-up
    *
    * - [Documentation](https://community.optimism.io/docs/developers/tutorials.html)
    */
  @js.native
  sealed trait OptimisticKovan
    extends StObject
       with CustomChain
  /* "optimistic-kovan" */ val OptimisticKovan: typings.ethereumjsCommon.distEnumsMod.CustomChain.OptimisticKovan & String = js.native
  
  /**
    * Polygon (Matic) Mainnet
    *
    * - [Documentation](https://docs.matic.network/docs/develop/network-details/network)
    */
  @js.native
  sealed trait PolygonMainnet
    extends StObject
       with CustomChain
  /* "polygon-mainnet" */ val PolygonMainnet: typings.ethereumjsCommon.distEnumsMod.CustomChain.PolygonMainnet & String = js.native
  
  /**
    * Polygon (Matic) Mumbai Testnet
    *
    * - [Documentation](https://docs.matic.network/docs/develop/network-details/network)
    */
  @js.native
  sealed trait PolygonMumbai
    extends StObject
       with CustomChain
  /* "polygon-mumbai" */ val PolygonMumbai: typings.ethereumjsCommon.distEnumsMod.CustomChain.PolygonMumbai & String = js.native
  
  /**
    * xDai EVM sidechain with a native stable token
    *
    * - [Documentation](https://www.xdaichain.com/)
    */
  @js.native
  sealed trait xDaiChain
    extends StObject
       with CustomChain
  /* "x-dai-chain" */ val xDaiChain: typings.ethereumjsCommon.distEnumsMod.CustomChain.xDaiChain & String = js.native
}

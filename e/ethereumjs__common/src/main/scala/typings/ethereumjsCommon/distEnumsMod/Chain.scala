package typings.ethereumjsCommon.distEnumsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Chain extends StObject
@JSImport("@ethereumjs/common/dist/enums", "Chain")
@js.native
object Chain extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Chain & Double] = js.native
  
  @js.native
  sealed trait Goerli
    extends StObject
       with Chain
  /* 5 */ val Goerli: typings.ethereumjsCommon.distEnumsMod.Chain.Goerli & Double = js.native
  
  @js.native
  sealed trait Mainnet
    extends StObject
       with Chain
  /* 1 */ val Mainnet: typings.ethereumjsCommon.distEnumsMod.Chain.Mainnet & Double = js.native
  
  @js.native
  sealed trait Rinkeby
    extends StObject
       with Chain
  /* 4 */ val Rinkeby: typings.ethereumjsCommon.distEnumsMod.Chain.Rinkeby & Double = js.native
  
  @js.native
  sealed trait Ropsten
    extends StObject
       with Chain
  /* 3 */ val Ropsten: typings.ethereumjsCommon.distEnumsMod.Chain.Ropsten & Double = js.native
  
  @js.native
  sealed trait Sepolia
    extends StObject
       with Chain
  /* 11155111 */ val Sepolia: typings.ethereumjsCommon.distEnumsMod.Chain.Sepolia & Double = js.native
}

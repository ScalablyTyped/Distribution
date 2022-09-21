package typings.ethereumjsCommon.enumsMod

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
  /* 5 */ val Goerli: typings.ethereumjsCommon.enumsMod.Chain.Goerli & Double = js.native
  
  @js.native
  sealed trait Mainnet
    extends StObject
       with Chain
  /* 1 */ val Mainnet: typings.ethereumjsCommon.enumsMod.Chain.Mainnet & Double = js.native
  
  @js.native
  sealed trait Rinkeby
    extends StObject
       with Chain
  /* 4 */ val Rinkeby: typings.ethereumjsCommon.enumsMod.Chain.Rinkeby & Double = js.native
  
  @js.native
  sealed trait Ropsten
    extends StObject
       with Chain
  /* 3 */ val Ropsten: typings.ethereumjsCommon.enumsMod.Chain.Ropsten & Double = js.native
  
  @js.native
  sealed trait Sepolia
    extends StObject
       with Chain
  /* 11155111 */ val Sepolia: typings.ethereumjsCommon.enumsMod.Chain.Sepolia & Double = js.native
}

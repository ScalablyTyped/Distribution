package typings
package ethereumDashProtocolLib.ethereumDashProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SolidityTypes extends js.Object

@JSImport("ethereum-protocol", "SolidityTypes")
@js.native
object SolidityTypes extends js.Object {
  @js.native
  sealed trait Address
    extends ethereumDashProtocolLib.ethereumDashProtocolMod.SolidityTypes
  
  @js.native
  sealed trait Uint
    extends ethereumDashProtocolLib.ethereumDashProtocolMod.SolidityTypes
  
  @js.native
  sealed trait Uint256
    extends ethereumDashProtocolLib.ethereumDashProtocolMod.SolidityTypes
  
  @js.native
  sealed trait Uint8
    extends ethereumDashProtocolLib.ethereumDashProtocolMod.SolidityTypes
  
  /* "address" */ val Address: Address with java.lang.String = js.native
  /* "uint" */ val Uint: Uint with java.lang.String = js.native
  /* "uint256" */ val Uint256: Uint256 with java.lang.String = js.native
  /* "uint8" */ val Uint8: Uint8 with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ethereumDashProtocolLib.ethereumDashProtocolMod.SolidityTypes with java.lang.String
  ] = js.native
}


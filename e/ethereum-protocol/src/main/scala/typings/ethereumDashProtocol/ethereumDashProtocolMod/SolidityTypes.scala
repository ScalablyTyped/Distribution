package typings.ethereumDashProtocol.ethereumDashProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SolidityTypes extends js.Object

@JSImport("ethereum-protocol", "SolidityTypes")
@js.native
object SolidityTypes extends js.Object {
  @js.native
  sealed trait Address extends SolidityTypes
  
  @js.native
  sealed trait Uint extends SolidityTypes
  
  @js.native
  sealed trait Uint256 extends SolidityTypes
  
  @js.native
  sealed trait Uint8 extends SolidityTypes
  
  /* "address" */ val Address: typings.ethereumDashProtocol.ethereumDashProtocolMod.SolidityTypes.Address with String = js.native
  /* "uint" */ val Uint: typings.ethereumDashProtocol.ethereumDashProtocolMod.SolidityTypes.Uint with String = js.native
  /* "uint256" */ val Uint256: typings.ethereumDashProtocol.ethereumDashProtocolMod.SolidityTypes.Uint256 with String = js.native
  /* "uint8" */ val Uint8: typings.ethereumDashProtocol.ethereumDashProtocolMod.SolidityTypes.Uint8 with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SolidityTypes with String] = js.native
}


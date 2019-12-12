package typings.ethereumDashProtocol.ethereumDashProtocolMod

import org.scalablytyped.runtime.TopLevel
import typings.ethereumDashProtocol.ethereumDashProtocolMod.SolidityTypes.Address
import typings.ethereumDashProtocol.ethereumDashProtocolMod.SolidityTypes.Uint
import typings.ethereumDashProtocol.ethereumDashProtocolMod.SolidityTypes.Uint256
import typings.ethereumDashProtocol.ethereumDashProtocolMod.SolidityTypes.Uint8
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SolidityTypes with String] = js.native
  /* "address" */ @js.native
  object Address extends TopLevel[Address with String]
  
  /* "uint" */ @js.native
  object Uint extends TopLevel[Uint with String]
  
  /* "uint256" */ @js.native
  object Uint256 extends TopLevel[Uint256 with String]
  
  /* "uint8" */ @js.native
  object Uint8 extends TopLevel[Uint8 with String]
  
}


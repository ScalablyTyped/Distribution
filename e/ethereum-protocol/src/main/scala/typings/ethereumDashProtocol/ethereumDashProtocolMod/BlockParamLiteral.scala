package typings.ethereumDashProtocol.ethereumDashProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BlockParamLiteral extends js.Object

@JSImport("ethereum-protocol", "BlockParamLiteral")
@js.native
object BlockParamLiteral extends js.Object {
  @js.native
  sealed trait Earliest extends BlockParamLiteral
  
  @js.native
  sealed trait Latest extends BlockParamLiteral
  
  @js.native
  sealed trait Pending extends BlockParamLiteral
  
  /* "earliest" */ val Earliest: typings.ethereumDashProtocol.ethereumDashProtocolMod.BlockParamLiteral.Earliest with String = js.native
  /* "latest" */ val Latest: typings.ethereumDashProtocol.ethereumDashProtocolMod.BlockParamLiteral.Latest with String = js.native
  /* "pending" */ val Pending: typings.ethereumDashProtocol.ethereumDashProtocolMod.BlockParamLiteral.Pending with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[BlockParamLiteral with String] = js.native
}


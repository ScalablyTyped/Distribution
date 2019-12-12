package typings.ethereumDashProtocol.ethereumDashProtocolMod

import org.scalablytyped.runtime.TopLevel
import typings.ethereumDashProtocol.ethereumDashProtocolMod.BlockParamLiteral.Earliest
import typings.ethereumDashProtocol.ethereumDashProtocolMod.BlockParamLiteral.Latest
import typings.ethereumDashProtocol.ethereumDashProtocolMod.BlockParamLiteral.Pending
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[BlockParamLiteral with String] = js.native
  /* "earliest" */ @js.native
  object Earliest extends TopLevel[Earliest with String]
  
  /* "latest" */ @js.native
  object Latest extends TopLevel[Latest with String]
  
  /* "pending" */ @js.native
  object Pending extends TopLevel[Pending with String]
  
}


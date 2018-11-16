package typings
package ethereumDashProtocolLib.ethereumDashProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BlockParamLiteral extends js.Object

@JSImport("ethereum-protocol", "BlockParamLiteral")
@js.native
object BlockParamLiteral extends js.Object {
  @js.native
  sealed trait Earliest
    extends ethereumDashProtocolLib.ethereumDashProtocolMod.BlockParamLiteral
  
  @js.native
  sealed trait Latest
    extends ethereumDashProtocolLib.ethereumDashProtocolMod.BlockParamLiteral
  
  @js.native
  sealed trait Pending
    extends ethereumDashProtocolLib.ethereumDashProtocolMod.BlockParamLiteral
  
  /* "earliest" */ val Earliest: Earliest with java.lang.String = js.native
  /* "latest" */ val Latest: Latest with java.lang.String = js.native
  /* "pending" */ val Pending: Pending with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ethereumDashProtocolLib.ethereumDashProtocolMod.BlockParamLiteral with java.lang.String
  ] = js.native
}


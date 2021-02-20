package typings.ethereumProtocol.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BlockParamLiteral extends StObject
@JSImport("ethereum-protocol", "BlockParamLiteral")
@js.native
object BlockParamLiteral extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[BlockParamLiteral with String] = js.native
  
  @js.native
  sealed trait Earliest extends BlockParamLiteral
  /* "earliest" */ val Earliest: typings.ethereumProtocol.mod.BlockParamLiteral.Earliest with String = js.native
  
  @js.native
  sealed trait Latest extends BlockParamLiteral
  /* "latest" */ val Latest: typings.ethereumProtocol.mod.BlockParamLiteral.Latest with String = js.native
  
  @js.native
  sealed trait Pending extends BlockParamLiteral
  /* "pending" */ val Pending: typings.ethereumProtocol.mod.BlockParamLiteral.Pending with String = js.native
}

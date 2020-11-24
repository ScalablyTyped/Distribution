package typings.ethereumProtocol.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BlockParamLiteral extends js.Object
@JSImport("ethereum-protocol", "BlockParamLiteral")
@js.native
object BlockParamLiteral extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[BlockParamLiteral with String] = js.native
  
  @js.native
  sealed trait Earliest extends BlockParamLiteral
  /* "earliest" */ @js.native
  object Earliest extends TopLevel[Earliest with String]
  
  @js.native
  sealed trait Latest extends BlockParamLiteral
  /* "latest" */ @js.native
  object Latest extends TopLevel[Latest with String]
  
  @js.native
  sealed trait Pending extends BlockParamLiteral
  /* "pending" */ @js.native
  object Pending extends TopLevel[Pending with String]
}

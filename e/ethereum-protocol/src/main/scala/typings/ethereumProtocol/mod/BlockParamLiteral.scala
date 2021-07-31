package typings.ethereumProtocol.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BlockParamLiteral extends StObject
@JSImport("ethereum-protocol", "BlockParamLiteral")
@js.native
object BlockParamLiteral extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[BlockParamLiteral & String] = js.native
  
  @js.native
  sealed trait Earliest
    extends StObject
       with BlockParamLiteral
  /* "earliest" */ val Earliest: typings.ethereumProtocol.mod.BlockParamLiteral.Earliest & String = js.native
  
  @js.native
  sealed trait Latest
    extends StObject
       with BlockParamLiteral
  /* "latest" */ val Latest: typings.ethereumProtocol.mod.BlockParamLiteral.Latest & String = js.native
  
  @js.native
  sealed trait Pending
    extends StObject
       with BlockParamLiteral
  /* "pending" */ val Pending: typings.ethereumProtocol.mod.BlockParamLiteral.Pending & String = js.native
}

package typings.ethereumProtocol.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SolidityTypes extends StObject
@JSImport("ethereum-protocol", "SolidityTypes")
@js.native
object SolidityTypes extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SolidityTypes & String] = js.native
  
  @js.native
  sealed trait Address
    extends StObject
       with SolidityTypes
  /* "address" */ val Address: typings.ethereumProtocol.mod.SolidityTypes.Address & String = js.native
  
  @js.native
  sealed trait Uint
    extends StObject
       with SolidityTypes
  /* "uint" */ val Uint: typings.ethereumProtocol.mod.SolidityTypes.Uint & String = js.native
  
  @js.native
  sealed trait Uint256
    extends StObject
       with SolidityTypes
  /* "uint256" */ val Uint256: typings.ethereumProtocol.mod.SolidityTypes.Uint256 & String = js.native
  
  @js.native
  sealed trait Uint8
    extends StObject
       with SolidityTypes
  /* "uint8" */ val Uint8: typings.ethereumProtocol.mod.SolidityTypes.Uint8 & String = js.native
}

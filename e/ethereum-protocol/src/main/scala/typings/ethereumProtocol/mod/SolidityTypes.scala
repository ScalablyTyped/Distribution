package typings.ethereumProtocol.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SolidityTypes extends js.Object
@JSImport("ethereum-protocol", "SolidityTypes")
@js.native
object SolidityTypes extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SolidityTypes with String] = js.native
  
  @js.native
  sealed trait Address extends SolidityTypes
  /* "address" */ @js.native
  object Address extends TopLevel[Address with String]
  
  @js.native
  sealed trait Uint extends SolidityTypes
  /* "uint" */ @js.native
  object Uint extends TopLevel[Uint with String]
  
  @js.native
  sealed trait Uint256 extends SolidityTypes
  /* "uint256" */ @js.native
  object Uint256 extends TopLevel[Uint256 with String]
  
  @js.native
  sealed trait Uint8 extends SolidityTypes
  /* "uint8" */ @js.native
  object Uint8 extends TopLevel[Uint8 with String]
}

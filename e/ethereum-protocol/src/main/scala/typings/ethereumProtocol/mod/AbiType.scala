package typings.ethereumProtocol.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AbiType extends js.Object
@JSImport("ethereum-protocol", "AbiType")
@js.native
object AbiType extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AbiType with String] = js.native
  
  @js.native
  sealed trait Constructor extends AbiType
  /* "constructor" */ @js.native
  object Constructor extends TopLevel[Constructor with String]
  
  @js.native
  sealed trait Event extends AbiType
  /* "event" */ @js.native
  object Event extends TopLevel[Event with String]
  
  @js.native
  sealed trait Fallback extends AbiType
  /* "fallback" */ @js.native
  object Fallback extends TopLevel[Fallback with String]
  
  @js.native
  sealed trait Function extends AbiType
  /* "function" */ @js.native
  object Function extends TopLevel[Function with String]
}

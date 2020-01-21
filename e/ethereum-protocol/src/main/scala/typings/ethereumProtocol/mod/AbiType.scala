package typings.ethereumProtocol.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AbiType extends js.Object

@JSImport("ethereum-protocol", "AbiType")
@js.native
object AbiType extends js.Object {
  @js.native
  sealed trait Constructor extends AbiType
  
  @js.native
  sealed trait Event extends AbiType
  
  @js.native
  sealed trait Fallback extends AbiType
  
  @js.native
  sealed trait Function extends AbiType
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AbiType with String] = js.native
  /* "constructor" */ @js.native
  object Constructor extends TopLevel[Constructor with String]
  
  /* "event" */ @js.native
  object Event extends TopLevel[Event with String]
  
  /* "fallback" */ @js.native
  object Fallback extends TopLevel[Fallback with String]
  
  /* "function" */ @js.native
  object Function extends TopLevel[Function with String]
  
}


package typings
package ethereumDashProtocolLib.ethereumDashProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AbiType extends js.Object

@JSImport("ethereum-protocol", "AbiType")
@js.native
object AbiType extends js.Object {
  @js.native
  sealed trait Constructor
    extends ethereumDashProtocolLib.ethereumDashProtocolMod.AbiType
  
  @js.native
  sealed trait Event
    extends ethereumDashProtocolLib.ethereumDashProtocolMod.AbiType
  
  @js.native
  sealed trait Fallback
    extends ethereumDashProtocolLib.ethereumDashProtocolMod.AbiType
  
  @js.native
  sealed trait Function
    extends ethereumDashProtocolLib.ethereumDashProtocolMod.AbiType
  
  /* "constructor" */ val Constructor: Constructor with java.lang.String = js.native
  /* "event" */ val Event: Event with java.lang.String = js.native
  /* "fallback" */ val Fallback: Fallback with java.lang.String = js.native
  /* "function" */ val Function: Function with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ethereumDashProtocolLib.ethereumDashProtocolMod.AbiType with java.lang.String] = js.native
}


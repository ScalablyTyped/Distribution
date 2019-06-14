package typings
package ejDotWebDotAllLib.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CheckState extends js.Object

@JSGlobal("ej.CheckState")
@js.native
object CheckState extends js.Object {
  //string
  @js.native
  sealed trait Check
    extends ejDotWebDotAllLib.ejNs.CheckState
  
  //string
  @js.native
  sealed trait Indeterminate
    extends ejDotWebDotAllLib.ejNs.CheckState
  
  //string
  @js.native
  sealed trait Uncheck
    extends ejDotWebDotAllLib.ejNs.CheckState
  
  /* 1 */ val Check: Check with scala.Double = js.native
  /* 2 */ val Indeterminate: Indeterminate with scala.Double = js.native
  /* 0 */ val Uncheck: Uncheck with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.CheckState with scala.Double] = js.native
}


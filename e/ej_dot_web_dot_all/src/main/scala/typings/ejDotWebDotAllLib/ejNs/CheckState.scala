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
  
  val Check: Check with java.lang.String = js.native
  val Indeterminate: Indeterminate with java.lang.String = js.native
  val Uncheck: Uncheck with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.CheckState with java.lang.String] = js.native
}


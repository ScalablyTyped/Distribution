package typings
package ejDotWebDotAllLib.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait headerOption extends js.Object

@JSGlobal("ej.headerOption")
@js.native
object headerOption extends js.Object {
  @js.native
  sealed trait row
    extends ejDotWebDotAllLib.ejNs.headerOption
  
  @js.native
  sealed trait tHead
    extends ejDotWebDotAllLib.ejNs.headerOption
  
  /* 0 */ val row: row with scala.Double = js.native
  /* 1 */ val tHead: tHead with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.headerOption with scala.Double] = js.native
}


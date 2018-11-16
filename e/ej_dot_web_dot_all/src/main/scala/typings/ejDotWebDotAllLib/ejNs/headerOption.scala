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
  
  val row: row with java.lang.String = js.native
  val tHead: tHead with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.headerOption with java.lang.String] = js.native
}


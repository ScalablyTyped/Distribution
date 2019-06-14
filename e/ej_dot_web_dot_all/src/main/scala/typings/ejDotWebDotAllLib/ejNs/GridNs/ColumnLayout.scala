package typings
package ejDotWebDotAllLib.ejNs.GridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ColumnLayout extends js.Object

@JSGlobal("ej.Grid.ColumnLayout")
@js.native
object ColumnLayout extends js.Object {
  ///Column layout is auto(based on width).
  @js.native
  sealed trait Auto
    extends ejDotWebDotAllLib.ejNs.GridNs.ColumnLayout
  
  ///Column layout is fixed(based on width).
  @js.native
  sealed trait Fixed
    extends ejDotWebDotAllLib.ejNs.GridNs.ColumnLayout
  
  /* 0 */ val Auto: Auto with scala.Double = js.native
  /* 1 */ val Fixed: Fixed with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.GridNs.ColumnLayout with scala.Double] = js.native
}


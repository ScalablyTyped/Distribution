package typings
package ejDotWebDotAllLib.ejNs.TreeGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FilterType extends js.Object

@JSGlobal("ej.TreeGrid.FilterType")
@js.native
object FilterType extends js.Object {
  ///Specifies the filter type as excel.
  @js.native
  sealed trait Excel
    extends ejDotWebDotAllLib.ejNs.TreeGridNs.FilterType
  
  ///Specifies the filter type as menu.
  @js.native
  sealed trait Menu
    extends ejDotWebDotAllLib.ejNs.TreeGridNs.FilterType
  
  /* 1 */ val Excel: Excel with scala.Double = js.native
  /* 0 */ val Menu: Menu with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.TreeGridNs.FilterType with scala.Double] = js.native
}


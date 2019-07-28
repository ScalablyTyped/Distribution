package typings.ejDotWebDotAll.ejNs.TreeGridNs

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
    extends typings.ejDotWebDotAll.ejNs.TreeGridNs.FilterType
  
  ///Specifies the filter type as menu.
  @js.native
  sealed trait Menu
    extends typings.ejDotWebDotAll.ejNs.TreeGridNs.FilterType
  
  /* 1 */ val Excel: typings.ejDotWebDotAll.ejNs.TreeGridNs.FilterType.Excel with Double = js.native
  /* 0 */ val Menu: typings.ejDotWebDotAll.ejNs.TreeGridNs.FilterType.Menu with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.ejDotWebDotAll.ejNs.TreeGridNs.FilterType with Double] = js.native
}


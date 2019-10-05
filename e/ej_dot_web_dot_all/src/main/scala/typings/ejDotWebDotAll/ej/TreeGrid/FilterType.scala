package typings.ejDotWebDotAll.ej.TreeGrid

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
    extends typings.ejDotWebDotAll.ej.TreeGrid.FilterType
  
  ///Specifies the filter type as menu.
  @js.native
  sealed trait Menu
    extends typings.ejDotWebDotAll.ej.TreeGrid.FilterType
  
  /* 1 */ val Excel: typings.ejDotWebDotAll.ej.TreeGrid.FilterType.Excel with Double = js.native
  /* 0 */ val Menu: typings.ejDotWebDotAll.ej.TreeGrid.FilterType.Menu with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.ejDotWebDotAll.ej.TreeGrid.FilterType with Double] = js.native
}


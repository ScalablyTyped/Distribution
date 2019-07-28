package typings.ejDotWebDotAll.ejNs.GridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FilterType extends js.Object

@JSGlobal("ej.Grid.FilterType")
@js.native
object FilterType extends js.Object {
  ///Specifies the filter type as excel.
  @js.native
  sealed trait Excel
    extends typings.ejDotWebDotAll.ejNs.GridNs.FilterType
  
  ///Specifies the filter type as menu.
  @js.native
  sealed trait Menu
    extends typings.ejDotWebDotAll.ejNs.GridNs.FilterType
  
  /* 1 */ val Excel: typings.ejDotWebDotAll.ejNs.GridNs.FilterType.Excel with Double = js.native
  /* 0 */ val Menu: typings.ejDotWebDotAll.ejNs.GridNs.FilterType.Menu with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.ejDotWebDotAll.ejNs.GridNs.FilterType with Double] = js.native
}


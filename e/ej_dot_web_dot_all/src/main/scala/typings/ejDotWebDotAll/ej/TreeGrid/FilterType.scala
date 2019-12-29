package typings.ejDotWebDotAll.ej.TreeGrid

import org.scalablytyped.runtime.TopLevel
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
  sealed trait Excel extends FilterType
  
  ///Specifies the filter type as menu.
  @js.native
  sealed trait Menu extends FilterType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FilterType with Double] = js.native
  /* 1 */ @js.native
  object Excel extends TopLevel[Excel with Double]
  
  /* 0 */ @js.native
  object Menu extends TopLevel[Menu with Double]
  
}


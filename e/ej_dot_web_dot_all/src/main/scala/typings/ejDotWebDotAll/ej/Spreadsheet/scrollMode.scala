package typings.ejDotWebDotAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait scrollMode extends js.Object

@JSGlobal("ej.Spreadsheet.scrollMode")
@js.native
object scrollMode extends js.Object {
  ///To enable Infinite scroll mode for Spreadsheet.
  @js.native
  sealed trait Infinite extends scrollMode
  
  ///To enable Normal scroll mode for Spreadsheet.
  @js.native
  sealed trait Normal extends scrollMode
  
  /* 0 */ val Infinite: typings.ejDotWebDotAll.ej.Spreadsheet.scrollMode.Infinite with Double = js.native
  /* 1 */ val Normal: typings.ejDotWebDotAll.ej.Spreadsheet.scrollMode.Normal with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[scrollMode with Double] = js.native
}


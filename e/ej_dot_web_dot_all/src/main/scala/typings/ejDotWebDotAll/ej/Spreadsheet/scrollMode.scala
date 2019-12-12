package typings.ejDotWebDotAll.ej.Spreadsheet

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.Spreadsheet.scrollMode.Infinite
import typings.ejDotWebDotAll.ej.Spreadsheet.scrollMode.Normal
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[scrollMode with Double] = js.native
  /* 0 */ @js.native
  object Infinite extends TopLevel[Infinite with Double]
  
  /* 1 */ @js.native
  object Normal extends TopLevel[Normal with Double]
  
}


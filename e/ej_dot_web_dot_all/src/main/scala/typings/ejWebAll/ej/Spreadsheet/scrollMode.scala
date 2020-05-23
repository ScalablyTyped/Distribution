package typings.ejWebAll.ej.Spreadsheet

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
  
}


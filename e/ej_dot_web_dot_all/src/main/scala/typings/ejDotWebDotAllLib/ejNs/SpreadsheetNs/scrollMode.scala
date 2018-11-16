package typings
package ejDotWebDotAllLib.ejNs.SpreadsheetNs

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
  sealed trait Infinite
    extends ejDotWebDotAllLib.ejNs.SpreadsheetNs.scrollMode
  
  ///To enable Normal scroll mode for Spreadsheet.
  @js.native
  sealed trait Normal
    extends ejDotWebDotAllLib.ejNs.SpreadsheetNs.scrollMode
  
  val Infinite: Infinite with java.lang.String = js.native
  val Normal: Normal with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.SpreadsheetNs.scrollMode with java.lang.String] = js.native
}


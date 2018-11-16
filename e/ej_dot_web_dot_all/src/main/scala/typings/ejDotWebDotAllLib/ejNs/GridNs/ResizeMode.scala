package typings
package ejDotWebDotAllLib.ejNs.GridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ResizeMode extends js.Object

@JSGlobal("ej.Grid.ResizeMode")
@js.native
object ResizeMode extends js.Object {
  ///New column Size will be adjusted using entire control
  @js.native
  sealed trait Control
    extends ejDotWebDotAllLib.ejNs.GridNs.ResizeMode
  
  ///New column Size will be adjusted using next column.
  @js.native
  sealed trait NextColumn
    extends ejDotWebDotAllLib.ejNs.GridNs.ResizeMode
  
  ///New column size will be adjusted by all other Columns
  @js.native
  sealed trait Normal
    extends ejDotWebDotAllLib.ejNs.GridNs.ResizeMode
  
  val Control: Control with java.lang.String = js.native
  val NextColumn: NextColumn with java.lang.String = js.native
  val Normal: Normal with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.GridNs.ResizeMode with java.lang.String] = js.native
}


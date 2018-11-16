package typings
package ejDotWebDotAllLib.ejNs.GridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ColumnLayout extends js.Object

@JSGlobal("ej.Grid.ColumnLayout")
@js.native
object ColumnLayout extends js.Object {
  ///Column layout is auto(based on width).
  @js.native
  sealed trait Auto
    extends ejDotWebDotAllLib.ejNs.GridNs.ColumnLayout
  
  ///Column layout is fixed(based on width).
  @js.native
  sealed trait Fixed
    extends ejDotWebDotAllLib.ejNs.GridNs.ColumnLayout
  
  val Auto: Auto with java.lang.String = js.native
  val Fixed: Fixed with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.GridNs.ColumnLayout with java.lang.String] = js.native
}


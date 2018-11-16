package typings
package ejDotWebDotAllLib.ejNs.TreeGridNs

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
    extends ejDotWebDotAllLib.ejNs.TreeGridNs.FilterType
  
  ///Specifies the filter type as menu.
  @js.native
  sealed trait Menu
    extends ejDotWebDotAllLib.ejNs.TreeGridNs.FilterType
  
  val Excel: Excel with java.lang.String = js.native
  val Menu: Menu with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.TreeGridNs.FilterType with java.lang.String] = js.native
}


package typings
package ejDotWebDotAllLib.ejNs.TreeGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SelectionType extends js.Object

@JSGlobal("ej.TreeGrid.SelectionType")
@js.native
object SelectionType extends js.Object {
  ///you can select rows using checkbox.
  @js.native
  sealed trait Checkbox
    extends ejDotWebDotAllLib.ejNs.TreeGridNs.SelectionType
  
  ///you can select a multiple row.
  @js.native
  sealed trait Multiple
    extends ejDotWebDotAllLib.ejNs.TreeGridNs.SelectionType
  
  ///you can select a single row.
  @js.native
  sealed trait Single
    extends ejDotWebDotAllLib.ejNs.TreeGridNs.SelectionType
  
  val Checkbox: Checkbox with java.lang.String = js.native
  val Multiple: Multiple with java.lang.String = js.native
  val Single: Single with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.TreeGridNs.SelectionType with java.lang.String] = js.native
}


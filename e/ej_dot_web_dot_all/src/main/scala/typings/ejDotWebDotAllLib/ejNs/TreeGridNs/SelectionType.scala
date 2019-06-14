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
  
  /* 2 */ val Checkbox: Checkbox with scala.Double = js.native
  /* 1 */ val Multiple: Multiple with scala.Double = js.native
  /* 0 */ val Single: Single with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.TreeGridNs.SelectionType with scala.Double] = js.native
}


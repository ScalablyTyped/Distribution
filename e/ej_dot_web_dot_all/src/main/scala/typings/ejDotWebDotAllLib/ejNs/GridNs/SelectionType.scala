package typings
package ejDotWebDotAllLib.ejNs.GridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SelectionType extends js.Object

@JSGlobal("ej.Grid.SelectionType")
@js.native
object SelectionType extends js.Object {
  ///Specifies the selection type as multiple.
  @js.native
  sealed trait Multiple
    extends ejDotWebDotAllLib.ejNs.GridNs.SelectionType
  
  ///Specifies the selection type as single.
  @js.native
  sealed trait Single
    extends ejDotWebDotAllLib.ejNs.GridNs.SelectionType
  
  /* 1 */ val Multiple: Multiple with scala.Double = js.native
  /* 0 */ val Single: Single with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.GridNs.SelectionType with scala.Double] = js.native
}


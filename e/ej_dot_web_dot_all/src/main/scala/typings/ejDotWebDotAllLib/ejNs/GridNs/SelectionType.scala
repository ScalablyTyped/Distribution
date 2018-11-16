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
  
  val Multiple: Multiple with java.lang.String = js.native
  val Single: Single with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.GridNs.SelectionType with java.lang.String] = js.native
}


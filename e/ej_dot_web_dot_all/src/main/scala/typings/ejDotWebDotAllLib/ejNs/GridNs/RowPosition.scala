package typings
package ejDotWebDotAllLib.ejNs.GridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RowPosition extends js.Object

@JSGlobal("ej.Grid.RowPosition")
@js.native
object RowPosition extends js.Object {
  ///Specifies position of add new row as bottom.
  @js.native
  sealed trait Bottom
    extends ejDotWebDotAllLib.ejNs.GridNs.RowPosition
  
  ///Specifies position of add new row as top.
  @js.native
  sealed trait Top
    extends ejDotWebDotAllLib.ejNs.GridNs.RowPosition
  
  val Bottom: Bottom with java.lang.String = js.native
  val Top: Top with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.GridNs.RowPosition with java.lang.String] = js.native
}


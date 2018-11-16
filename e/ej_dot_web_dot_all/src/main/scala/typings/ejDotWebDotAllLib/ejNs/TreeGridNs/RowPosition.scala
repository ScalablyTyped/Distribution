package typings
package ejDotWebDotAllLib.ejNs.TreeGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RowPosition extends js.Object

@JSGlobal("ej.TreeGrid.RowPosition")
@js.native
object RowPosition extends js.Object {
  ///you can add a new row to above selected row.
  @js.native
  sealed trait Above
    extends ejDotWebDotAllLib.ejNs.TreeGridNs.RowPosition
  
  ///you can add a new row to below selected row.
  @js.native
  sealed trait Below
    extends ejDotWebDotAllLib.ejNs.TreeGridNs.RowPosition
  
  ///you can add a new row at bottom.
  @js.native
  sealed trait Bottom
    extends ejDotWebDotAllLib.ejNs.TreeGridNs.RowPosition
  
  ///you can add a new row as a child for selected row.
  @js.native
  sealed trait Child
    extends ejDotWebDotAllLib.ejNs.TreeGridNs.RowPosition
  
  ///you can add a new row at top.
  @js.native
  sealed trait Top
    extends ejDotWebDotAllLib.ejNs.TreeGridNs.RowPosition
  
  val Above: Above with java.lang.String = js.native
  val Below: Below with java.lang.String = js.native
  val Bottom: Bottom with java.lang.String = js.native
  val Child: Child with java.lang.String = js.native
  val Top: Top with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.TreeGridNs.RowPosition with java.lang.String] = js.native
}


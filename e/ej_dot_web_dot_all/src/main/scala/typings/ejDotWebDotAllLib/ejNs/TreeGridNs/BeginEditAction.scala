package typings
package ejDotWebDotAllLib.ejNs.TreeGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BeginEditAction extends js.Object

@JSGlobal("ej.TreeGrid.BeginEditAction")
@js.native
object BeginEditAction extends js.Object {
  ///you can begin the editing at single click
  @js.native
  sealed trait Click
    extends ejDotWebDotAllLib.ejNs.TreeGridNs.BeginEditAction
  
  ///you can begin the editing at double click
  @js.native
  sealed trait DblClick
    extends ejDotWebDotAllLib.ejNs.TreeGridNs.BeginEditAction
  
  val Click: Click with java.lang.String = js.native
  val DblClick: DblClick with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.TreeGridNs.BeginEditAction with java.lang.String] = js.native
}


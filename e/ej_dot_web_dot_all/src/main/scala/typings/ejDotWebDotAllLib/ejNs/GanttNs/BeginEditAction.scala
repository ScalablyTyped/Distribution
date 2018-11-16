package typings
package ejDotWebDotAllLib.ejNs.GanttNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BeginEditAction extends js.Object

@JSGlobal("ej.Gantt.BeginEditAction")
@js.native
object BeginEditAction extends js.Object {
  ///you can begin the editing at single click
  @js.native
  sealed trait Click
    extends ejDotWebDotAllLib.ejNs.GanttNs.BeginEditAction
  
  ///you can begin the editing at double click
  @js.native
  sealed trait DblClick
    extends ejDotWebDotAllLib.ejNs.GanttNs.BeginEditAction
  
  val Click: Click with java.lang.String = js.native
  val DblClick: DblClick with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.GanttNs.BeginEditAction with java.lang.String] = js.native
}


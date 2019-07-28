package typings.ejDotWebDotAll.ejNs.TreeGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PageSizeMode extends js.Object

@JSGlobal("ej.TreeGrid.PageSizeMode")
@js.native
object PageSizeMode extends js.Object {
  ///To count all the parent and child records.
  @js.native
  sealed trait All extends PageSizeMode
  
  ///To count the Zeroth level parent records.
  @js.native
  sealed trait Root extends PageSizeMode
  
  /* 0 */ val All: typings.ejDotWebDotAll.ejNs.TreeGridNs.PageSizeMode.All with Double = js.native
  /* 1 */ val Root: typings.ejDotWebDotAll.ejNs.TreeGridNs.PageSizeMode.Root with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PageSizeMode with Double] = js.native
}


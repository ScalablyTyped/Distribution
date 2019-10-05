package typings.ejDotWebDotAll.ej.ReportDesigner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Permission extends js.Object

@JSGlobal("ej.ReportDesigner.Permission")
@js.native
object Permission extends js.Object {
  ///Shows all the options in data source pane.
  @js.native
  sealed trait All extends Permission
  
  ///Shows or hides create option in data source pane.
  @js.native
  sealed trait Create extends Permission
  
  ///Shows or hides the delete option in data source pane.
  @js.native
  sealed trait Delete extends Permission
  
  ///Shows or hides the edit option in data source pane.
  @js.native
  sealed trait Edit extends Permission
  
  /* 3 */ val All: typings.ejDotWebDotAll.ej.ReportDesigner.Permission.All with Double = js.native
  /* 0 */ val Create: typings.ejDotWebDotAll.ej.ReportDesigner.Permission.Create with Double = js.native
  /* 2 */ val Delete: typings.ejDotWebDotAll.ej.ReportDesigner.Permission.Delete with Double = js.native
  /* 1 */ val Edit: typings.ejDotWebDotAll.ej.ReportDesigner.Permission.Edit with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Permission with Double] = js.native
}


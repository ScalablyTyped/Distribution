package typings.ejWebAll.ej.ReportDesigner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}

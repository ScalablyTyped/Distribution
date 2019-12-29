package typings.ejDotWebDotAll.ej.ReportDesigner

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Permission with Double] = js.native
  /* 3 */ @js.native
  object All extends TopLevel[All with Double]
  
  /* 0 */ @js.native
  object Create extends TopLevel[Create with Double]
  
  /* 2 */ @js.native
  object Delete extends TopLevel[Delete with Double]
  
  /* 1 */ @js.native
  object Edit extends TopLevel[Edit with Double]
  
}


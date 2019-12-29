package typings.ejDotWebDotAll.ej.datavisualization.Diagram

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LabelEditMode extends js.Object

@JSGlobal("ej.datavisualization.Diagram.LabelEditMode")
@js.native
object LabelEditMode extends js.Object {
  //Used to set label edit mode as edit
  @js.native
  sealed trait Edit extends LabelEditMode
  
  //Used to set label edit mode as view
  @js.native
  sealed trait View extends LabelEditMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LabelEditMode with Double] = js.native
  /* 0 */ @js.native
  object Edit extends TopLevel[Edit with Double]
  
  /* 1 */ @js.native
  object View extends TopLevel[View with Double]
  
}


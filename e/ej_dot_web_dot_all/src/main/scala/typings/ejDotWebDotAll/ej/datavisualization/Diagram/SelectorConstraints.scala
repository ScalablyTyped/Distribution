package typings.ejDotWebDotAll.ej.datavisualization.Diagram

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.SelectorConstraints.All
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.SelectorConstraints.AutoHideThumbs
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.SelectorConstraints.DragOnEmptySpace
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.SelectorConstraints.None
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.SelectorConstraints.Resizer
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.SelectorConstraints.UserHandles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SelectorConstraints extends js.Object

@JSGlobal("ej.datavisualization.Diagram.SelectorConstraints")
@js.native
object SelectorConstraints extends js.Object {
  //Sets the visibility of all selection handles as visible
  @js.native
  sealed trait All extends SelectorConstraints
  
  //Show/Hide the selection handles when it is overlapped with each other's.
  @js.native
  sealed trait AutoHideThumbs extends SelectorConstraints
  
  //Enables dragging while selecting the multiple nodes and click on the empty region of the selection rectangle.
  @js.native
  sealed trait DragOnEmptySpace extends SelectorConstraints
  
  //Hides the selector
  @js.native
  sealed trait None extends SelectorConstraints
  
  //Sets the visibility of resize handles as visible
  @js.native
  sealed trait Resizer extends SelectorConstraints
  
  //Sets the visibility of rotation handle as visible
  @js.native
  sealed trait Rotator extends SelectorConstraints
  
  //Enables the default tooltip of the diagram control.
  @js.native
  sealed trait Tooltip extends SelectorConstraints
  
  //Sets the visibility of user handles as visible
  @js.native
  sealed trait UserHandles extends SelectorConstraints
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SelectorConstraints with Double] = js.native
  /* 7 */ @js.native
  object All extends TopLevel[All with Double]
  
  /* 6 */ @js.native
  object AutoHideThumbs extends TopLevel[AutoHideThumbs with Double]
  
  /* 5 */ @js.native
  object DragOnEmptySpace extends TopLevel[DragOnEmptySpace with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 2 */ @js.native
  object Resizer extends TopLevel[Resizer with Double]
  
  /* 1 */ @js.native
  object Rotator
    extends TopLevel[
          typings.ejDotWebDotAll.ej.datavisualization.Diagram.SelectorConstraints.Rotator with Double
        ]
  
  /* 4 */ @js.native
  object Tooltip
    extends TopLevel[
          typings.ejDotWebDotAll.ej.datavisualization.Diagram.SelectorConstraints.Tooltip with Double
        ]
  
  /* 3 */ @js.native
  object UserHandles extends TopLevel[UserHandles with Double]
  
}


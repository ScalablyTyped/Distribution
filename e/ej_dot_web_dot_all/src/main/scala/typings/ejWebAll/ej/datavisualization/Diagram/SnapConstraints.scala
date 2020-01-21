package typings.ejWebAll.ej.datavisualization.Diagram

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SnapConstraints extends js.Object

@JSGlobal("ej.datavisualization.Diagram.SnapConstraints")
@js.native
object SnapConstraints extends js.Object {
  //Enable all the constraints
  @js.native
  sealed trait All extends SnapConstraints
  
  //Enables node to be snapped to horizontal gridlines
  @js.native
  sealed trait None extends SnapConstraints
  
  //Enable horizontal lines
  @js.native
  sealed trait ShowHorizontalLines extends SnapConstraints
  
  //Enable both horizontal and vertical lines
  @js.native
  sealed trait ShowLines extends SnapConstraints
  
  //Enable vertical lines
  @js.native
  sealed trait ShowVerticalLines extends SnapConstraints
  
  //Enables node to be snapped to vertical gridlines
  @js.native
  sealed trait SnapToHorizontalLines extends SnapConstraints
  
  //Enables node to be snapped to gridlines
  @js.native
  sealed trait SnapToLines extends SnapConstraints
  
  //Enables node to be snapped to horizontal gridlines
  @js.native
  sealed trait SnapToVerticalLines extends SnapConstraints
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SnapConstraints with Double] = js.native
  /* 7 */ @js.native
  object All extends TopLevel[All with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 4 */ @js.native
  object ShowHorizontalLines extends TopLevel[ShowHorizontalLines with Double]
  
  /* 6 */ @js.native
  object ShowLines extends TopLevel[ShowLines with Double]
  
  /* 5 */ @js.native
  object ShowVerticalLines extends TopLevel[ShowVerticalLines with Double]
  
  /* 1 */ @js.native
  object SnapToHorizontalLines extends TopLevel[SnapToHorizontalLines with Double]
  
  /* 3 */ @js.native
  object SnapToLines extends TopLevel[SnapToLines with Double]
  
  /* 2 */ @js.native
  object SnapToVerticalLines extends TopLevel[SnapToVerticalLines with Double]
  
}


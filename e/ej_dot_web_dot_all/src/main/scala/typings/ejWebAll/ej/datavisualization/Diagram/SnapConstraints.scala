package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}

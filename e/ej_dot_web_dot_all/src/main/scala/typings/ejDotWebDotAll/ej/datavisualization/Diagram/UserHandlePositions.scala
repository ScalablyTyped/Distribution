package typings.ejDotWebDotAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UserHandlePositions extends js.Object

@JSGlobal("ej.datavisualization.Diagram.UserHandlePositions")
@js.native
object UserHandlePositions extends js.Object {
  //Set the position of the userhandle as bottomcenter
  @js.native
  sealed trait BottomCenter extends UserHandlePositions
  
  //Set the position of the userhandle as bottomleft
  @js.native
  sealed trait BottomLeft extends UserHandlePositions
  
  //Set the position of the userhandle as bottom right
  @js.native
  sealed trait BottomRight extends UserHandlePositions
  
  //Set the position of the userhandle as middleleft
  @js.native
  sealed trait MiddleLeft extends UserHandlePositions
  
  //Set the position of the userhandle as middleright
  @js.native
  sealed trait MiddleRight extends UserHandlePositions
  
  //Set the position of the userhandle as topcenter
  @js.native
  sealed trait TopCenter extends UserHandlePositions
  
  //Set the position of the userhandle as topleft
  @js.native
  sealed trait TopLeft extends UserHandlePositions
  
  //Set the position of the userhandle as topright
  @js.native
  sealed trait TopRight extends UserHandlePositions
  
  /* 6 */ val BottomCenter: typings.ejDotWebDotAll.ej.datavisualization.Diagram.UserHandlePositions.BottomCenter with Double = js.native
  /* 5 */ val BottomLeft: typings.ejDotWebDotAll.ej.datavisualization.Diagram.UserHandlePositions.BottomLeft with Double = js.native
  /* 7 */ val BottomRight: typings.ejDotWebDotAll.ej.datavisualization.Diagram.UserHandlePositions.BottomRight with Double = js.native
  /* 3 */ val MiddleLeft: typings.ejDotWebDotAll.ej.datavisualization.Diagram.UserHandlePositions.MiddleLeft with Double = js.native
  /* 4 */ val MiddleRight: typings.ejDotWebDotAll.ej.datavisualization.Diagram.UserHandlePositions.MiddleRight with Double = js.native
  /* 1 */ val TopCenter: typings.ejDotWebDotAll.ej.datavisualization.Diagram.UserHandlePositions.TopCenter with Double = js.native
  /* 0 */ val TopLeft: typings.ejDotWebDotAll.ej.datavisualization.Diagram.UserHandlePositions.TopLeft with Double = js.native
  /* 2 */ val TopRight: typings.ejDotWebDotAll.ej.datavisualization.Diagram.UserHandlePositions.TopRight with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UserHandlePositions with Double] = js.native
}


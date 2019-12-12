package typings.ejDotWebDotAll.ej.datavisualization.Diagram

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.UserHandlePositions.BottomCenter
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.UserHandlePositions.BottomLeft
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.UserHandlePositions.BottomRight
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.UserHandlePositions.MiddleLeft
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.UserHandlePositions.MiddleRight
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.UserHandlePositions.TopCenter
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.UserHandlePositions.TopLeft
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.UserHandlePositions.TopRight
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UserHandlePositions with Double] = js.native
  /* 6 */ @js.native
  object BottomCenter extends TopLevel[BottomCenter with Double]
  
  /* 5 */ @js.native
  object BottomLeft extends TopLevel[BottomLeft with Double]
  
  /* 7 */ @js.native
  object BottomRight extends TopLevel[BottomRight with Double]
  
  /* 3 */ @js.native
  object MiddleLeft extends TopLevel[MiddleLeft with Double]
  
  /* 4 */ @js.native
  object MiddleRight extends TopLevel[MiddleRight with Double]
  
  /* 1 */ @js.native
  object TopCenter extends TopLevel[TopCenter with Double]
  
  /* 0 */ @js.native
  object TopLeft extends TopLevel[TopLeft with Double]
  
  /* 2 */ @js.native
  object TopRight extends TopLevel[TopRight with Double]
  
}


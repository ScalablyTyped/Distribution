package typings.ejWebAll.ej.datavisualization.Diagram

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
  
}


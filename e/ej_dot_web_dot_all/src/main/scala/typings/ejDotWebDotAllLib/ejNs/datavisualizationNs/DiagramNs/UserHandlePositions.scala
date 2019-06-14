package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

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
  sealed trait BottomCenter
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.UserHandlePositions
  
  //Set the position of the userhandle as bottomleft
  @js.native
  sealed trait BottomLeft
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.UserHandlePositions
  
  //Set the position of the userhandle as bottom right
  @js.native
  sealed trait BottomRight
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.UserHandlePositions
  
  //Set the position of the userhandle as middleleft
  @js.native
  sealed trait MiddleLeft
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.UserHandlePositions
  
  //Set the position of the userhandle as middleright
  @js.native
  sealed trait MiddleRight
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.UserHandlePositions
  
  //Set the position of the userhandle as topcenter
  @js.native
  sealed trait TopCenter
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.UserHandlePositions
  
  //Set the position of the userhandle as topleft
  @js.native
  sealed trait TopLeft
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.UserHandlePositions
  
  //Set the position of the userhandle as topright
  @js.native
  sealed trait TopRight
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.UserHandlePositions
  
  /* 6 */ val BottomCenter: BottomCenter with scala.Double = js.native
  /* 5 */ val BottomLeft: BottomLeft with scala.Double = js.native
  /* 7 */ val BottomRight: BottomRight with scala.Double = js.native
  /* 3 */ val MiddleLeft: MiddleLeft with scala.Double = js.native
  /* 4 */ val MiddleRight: MiddleRight with scala.Double = js.native
  /* 1 */ val TopCenter: TopCenter with scala.Double = js.native
  /* 0 */ val TopLeft: TopLeft with scala.Double = js.native
  /* 2 */ val TopRight: TopRight with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.UserHandlePositions with scala.Double
  ] = js.native
}


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
  
  val BottomCenter: BottomCenter with java.lang.String = js.native
  val BottomLeft: BottomLeft with java.lang.String = js.native
  val BottomRight: BottomRight with java.lang.String = js.native
  val MiddleLeft: MiddleLeft with java.lang.String = js.native
  val MiddleRight: MiddleRight with java.lang.String = js.native
  val TopCenter: TopCenter with java.lang.String = js.native
  val TopLeft: TopLeft with java.lang.String = js.native
  val TopRight: TopRight with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.UserHandlePositions with java.lang.String
  ] = js.native
}


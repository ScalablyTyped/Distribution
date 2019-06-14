package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ImageAlignment extends js.Object

@JSGlobal("ej.datavisualization.Diagram.ImageAlignment")
@js.native
object ImageAlignment extends js.Object {
  //Scales the graphic content non-uniformly to the width and height of the diagram area
  @js.native
  sealed trait None
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.ImageAlignment
  
  //Used to align the image at the bottom right of diagram area/node
  @js.native
  sealed trait XMaxYMax
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.ImageAlignment
  
  //Used to align the image at the right center of diagram area/node
  @js.native
  sealed trait XMaxYMid
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.ImageAlignment
  
  //Used to align the image at the top right of diagram area/node
  @js.native
  sealed trait XMaxYMin
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.ImageAlignment
  
  //Used to align the image at the bottom center of diagram area
  @js.native
  sealed trait XMidYMax
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.ImageAlignment
  
  //Used to align the image at the center of diagram area
  @js.native
  sealed trait XMidYMid
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.ImageAlignment
  
  //Used to align the image at the top center of diagram area
  @js.native
  sealed trait XMidYMin
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.ImageAlignment
  
  //Used to align the image at the bottom left of diagram area
  @js.native
  sealed trait XMinYMax
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.ImageAlignment
  
  //Used to align the image at the left center of diagram area
  @js.native
  sealed trait XMinYMid
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.ImageAlignment
  
  //Used to align the image at the top left of diagram area
  @js.native
  sealed trait XMinYMin
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.ImageAlignment
  
  /* 0 */ val None: None with scala.Double = js.native
  /* 9 */ val XMaxYMax: XMaxYMax with scala.Double = js.native
  /* 8 */ val XMaxYMid: XMaxYMid with scala.Double = js.native
  /* 7 */ val XMaxYMin: XMaxYMin with scala.Double = js.native
  /* 6 */ val XMidYMax: XMidYMax with scala.Double = js.native
  /* 5 */ val XMidYMid: XMidYMid with scala.Double = js.native
  /* 4 */ val XMidYMin: XMidYMin with scala.Double = js.native
  /* 3 */ val XMinYMax: XMinYMax with scala.Double = js.native
  /* 2 */ val XMinYMid: XMinYMid with scala.Double = js.native
  /* 1 */ val XMinYMin: XMinYMin with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.ImageAlignment with scala.Double
  ] = js.native
}


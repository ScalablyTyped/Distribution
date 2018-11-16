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
  
  val None: None with java.lang.String = js.native
  val XMaxYMax: XMaxYMax with java.lang.String = js.native
  val XMaxYMid: XMaxYMid with java.lang.String = js.native
  val XMaxYMin: XMaxYMin with java.lang.String = js.native
  val XMidYMax: XMidYMax with java.lang.String = js.native
  val XMidYMid: XMidYMid with java.lang.String = js.native
  val XMidYMin: XMidYMin with java.lang.String = js.native
  val XMinYMax: XMinYMax with java.lang.String = js.native
  val XMinYMid: XMinYMid with java.lang.String = js.native
  val XMinYMin: XMinYMin with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.ImageAlignment with java.lang.String
  ] = js.native
}


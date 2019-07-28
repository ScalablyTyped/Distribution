package typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs

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
  sealed trait None extends ImageAlignment
  
  //Used to align the image at the bottom right of diagram area/node
  @js.native
  sealed trait XMaxYMax extends ImageAlignment
  
  //Used to align the image at the right center of diagram area/node
  @js.native
  sealed trait XMaxYMid extends ImageAlignment
  
  //Used to align the image at the top right of diagram area/node
  @js.native
  sealed trait XMaxYMin extends ImageAlignment
  
  //Used to align the image at the bottom center of diagram area
  @js.native
  sealed trait XMidYMax extends ImageAlignment
  
  //Used to align the image at the center of diagram area
  @js.native
  sealed trait XMidYMid extends ImageAlignment
  
  //Used to align the image at the top center of diagram area
  @js.native
  sealed trait XMidYMin extends ImageAlignment
  
  //Used to align the image at the bottom left of diagram area
  @js.native
  sealed trait XMinYMax extends ImageAlignment
  
  //Used to align the image at the left center of diagram area
  @js.native
  sealed trait XMinYMid extends ImageAlignment
  
  //Used to align the image at the top left of diagram area
  @js.native
  sealed trait XMinYMin extends ImageAlignment
  
  /* 0 */ val None: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.ImageAlignment.None with Double = js.native
  /* 9 */ val XMaxYMax: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.ImageAlignment.XMaxYMax with Double = js.native
  /* 8 */ val XMaxYMid: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.ImageAlignment.XMaxYMid with Double = js.native
  /* 7 */ val XMaxYMin: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.ImageAlignment.XMaxYMin with Double = js.native
  /* 6 */ val XMidYMax: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.ImageAlignment.XMidYMax with Double = js.native
  /* 5 */ val XMidYMid: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.ImageAlignment.XMidYMid with Double = js.native
  /* 4 */ val XMidYMin: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.ImageAlignment.XMidYMin with Double = js.native
  /* 3 */ val XMinYMax: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.ImageAlignment.XMinYMax with Double = js.native
  /* 2 */ val XMinYMid: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.ImageAlignment.XMinYMid with Double = js.native
  /* 1 */ val XMinYMin: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.ImageAlignment.XMinYMin with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ImageAlignment with Double] = js.native
}


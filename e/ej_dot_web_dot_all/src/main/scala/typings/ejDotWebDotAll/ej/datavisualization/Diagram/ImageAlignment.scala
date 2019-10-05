package typings.ejDotWebDotAll.ej.datavisualization.Diagram

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
  
  /* 0 */ val None: typings.ejDotWebDotAll.ej.datavisualization.Diagram.ImageAlignment.None with Double = js.native
  /* 9 */ val XMaxYMax: typings.ejDotWebDotAll.ej.datavisualization.Diagram.ImageAlignment.XMaxYMax with Double = js.native
  /* 8 */ val XMaxYMid: typings.ejDotWebDotAll.ej.datavisualization.Diagram.ImageAlignment.XMaxYMid with Double = js.native
  /* 7 */ val XMaxYMin: typings.ejDotWebDotAll.ej.datavisualization.Diagram.ImageAlignment.XMaxYMin with Double = js.native
  /* 6 */ val XMidYMax: typings.ejDotWebDotAll.ej.datavisualization.Diagram.ImageAlignment.XMidYMax with Double = js.native
  /* 5 */ val XMidYMid: typings.ejDotWebDotAll.ej.datavisualization.Diagram.ImageAlignment.XMidYMid with Double = js.native
  /* 4 */ val XMidYMin: typings.ejDotWebDotAll.ej.datavisualization.Diagram.ImageAlignment.XMidYMin with Double = js.native
  /* 3 */ val XMinYMax: typings.ejDotWebDotAll.ej.datavisualization.Diagram.ImageAlignment.XMinYMax with Double = js.native
  /* 2 */ val XMinYMid: typings.ejDotWebDotAll.ej.datavisualization.Diagram.ImageAlignment.XMinYMid with Double = js.native
  /* 1 */ val XMinYMin: typings.ejDotWebDotAll.ej.datavisualization.Diagram.ImageAlignment.XMinYMin with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ImageAlignment with Double] = js.native
}


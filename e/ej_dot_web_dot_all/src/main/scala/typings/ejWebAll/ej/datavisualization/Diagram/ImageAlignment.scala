package typings.ejWebAll.ej.datavisualization.Diagram

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ImageAlignment with Double] = js.native
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 9 */ @js.native
  object XMaxYMax extends TopLevel[XMaxYMax with Double]
  
  /* 8 */ @js.native
  object XMaxYMid extends TopLevel[XMaxYMid with Double]
  
  /* 7 */ @js.native
  object XMaxYMin extends TopLevel[XMaxYMin with Double]
  
  /* 6 */ @js.native
  object XMidYMax extends TopLevel[XMidYMax with Double]
  
  /* 5 */ @js.native
  object XMidYMid extends TopLevel[XMidYMid with Double]
  
  /* 4 */ @js.native
  object XMidYMin extends TopLevel[XMidYMin with Double]
  
  /* 3 */ @js.native
  object XMinYMax extends TopLevel[XMinYMax with Double]
  
  /* 2 */ @js.native
  object XMinYMid extends TopLevel[XMinYMid with Double]
  
  /* 1 */ @js.native
  object XMinYMin extends TopLevel[XMinYMin with Double]
  
}


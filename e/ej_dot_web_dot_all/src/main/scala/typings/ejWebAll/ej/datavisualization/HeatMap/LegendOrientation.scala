package typings.ejWebAll.ej.datavisualization.HeatMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LegendOrientation extends js.Object
@JSGlobal("ej.datavisualization.HeatMap.LegendOrientation")
@js.native
object LegendOrientation extends js.Object {
  
  //Scales the graphic content non-uniformly to the width and height of the diagram area
  @js.native
  sealed trait Horizontal extends LegendOrientation
  
  //Used to align the image at the top left of diagram area
  @js.native
  sealed trait Vertical extends LegendOrientation
}

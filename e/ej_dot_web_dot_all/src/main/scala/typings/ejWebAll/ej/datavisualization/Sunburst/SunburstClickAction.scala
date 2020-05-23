package typings.ejWebAll.ej.datavisualization.Sunburst

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SunburstClickAction extends js.Object

@JSGlobal("ej.datavisualization.Sunburst.SunburstClickAction")
@js.native
object SunburstClickAction extends js.Object {
  //string
  @js.native
  sealed trait None extends SunburstClickAction
  
  //string
  @js.native
  sealed trait ToggleSegmentSelection extends SunburstClickAction
  
  //string
  @js.native
  sealed trait ToggleSegmentVisibility extends SunburstClickAction
  
}


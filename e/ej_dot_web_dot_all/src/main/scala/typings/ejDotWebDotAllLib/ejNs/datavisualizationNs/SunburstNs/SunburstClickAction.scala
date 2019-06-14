package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.SunburstNs

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
  sealed trait None
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.SunburstNs.SunburstClickAction
  
  //string
  @js.native
  sealed trait ToggleSegmentSelection
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.SunburstNs.SunburstClickAction
  
  //string
  @js.native
  sealed trait ToggleSegmentVisibility
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.SunburstNs.SunburstClickAction
  
  /* 0 */ val None: None with scala.Double = js.native
  /* 2 */ val ToggleSegmentSelection: ToggleSegmentSelection with scala.Double = js.native
  /* 1 */ val ToggleSegmentVisibility: ToggleSegmentVisibility with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.SunburstNs.SunburstClickAction with scala.Double
  ] = js.native
}


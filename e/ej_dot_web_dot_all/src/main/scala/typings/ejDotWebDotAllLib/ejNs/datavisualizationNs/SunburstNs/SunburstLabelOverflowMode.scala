package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.SunburstNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SunburstLabelOverflowMode extends js.Object

@JSGlobal("ej.datavisualization.Sunburst.SunburstLabelOverflowMode")
@js.native
object SunburstLabelOverflowMode extends js.Object {
  //string
  @js.native
  sealed trait Hide
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.SunburstNs.SunburstLabelOverflowMode
  
  //string
  @js.native
  sealed trait None
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.SunburstNs.SunburstLabelOverflowMode
  
  //string
  @js.native
  sealed trait Trim
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.SunburstNs.SunburstLabelOverflowMode
  
  val Hide: Hide with java.lang.String = js.native
  val None: None with java.lang.String = js.native
  val Trim: Trim with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.SunburstNs.SunburstLabelOverflowMode with java.lang.String
  ] = js.native
}


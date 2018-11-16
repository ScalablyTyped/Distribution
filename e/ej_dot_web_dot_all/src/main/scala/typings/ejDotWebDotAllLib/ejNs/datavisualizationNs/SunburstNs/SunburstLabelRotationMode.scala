package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.SunburstNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SunburstLabelRotationMode extends js.Object

@JSGlobal("ej.datavisualization.Sunburst.SunburstLabelRotationMode")
@js.native
object SunburstLabelRotationMode extends js.Object {
  //string
  @js.native
  sealed trait Angle
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.SunburstNs.SunburstLabelRotationMode
  
  //string
  @js.native
  sealed trait Normal
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.SunburstNs.SunburstLabelRotationMode
  
  val Angle: Angle with java.lang.String = js.native
  val Normal: Normal with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.SunburstNs.SunburstLabelRotationMode with java.lang.String
  ] = js.native
}


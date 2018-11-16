package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.SunburstNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Animation extends js.Object

@JSGlobal("ej.datavisualization.Sunburst.Animation")
@js.native
object Animation extends js.Object {
  //string
  @js.native
  sealed trait FadeIn
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.SunburstNs.Animation
  
  //string
  @js.native
  sealed trait Rotation
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.SunburstNs.Animation
  
  val FadeIn: FadeIn with java.lang.String = js.native
  val Rotation: Rotation with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.SunburstNs.Animation with java.lang.String
  ] = js.native
}


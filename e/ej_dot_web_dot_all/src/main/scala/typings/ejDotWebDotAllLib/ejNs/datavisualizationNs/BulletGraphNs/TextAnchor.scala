package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.BulletGraphNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextAnchor extends js.Object

@JSGlobal("ej.datavisualization.BulletGraph.TextAnchor")
@js.native
object TextAnchor extends js.Object {
  //string
  @js.native
  sealed trait End
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.BulletGraphNs.TextAnchor
  
  //string
  @js.native
  sealed trait Middle
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.BulletGraphNs.TextAnchor
  
  //string
  @js.native
  sealed trait Start
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.BulletGraphNs.TextAnchor
  
  /* 2 */ val End: End with scala.Double = js.native
  /* 1 */ val Middle: Middle with scala.Double = js.native
  /* 0 */ val Start: Start with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.BulletGraphNs.TextAnchor with scala.Double
  ] = js.native
}


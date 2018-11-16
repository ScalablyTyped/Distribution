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
  
  val End: End with java.lang.String = js.native
  val Middle: Middle with java.lang.String = js.native
  val Start: Start with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.BulletGraphNs.TextAnchor with java.lang.String
  ] = js.native
}


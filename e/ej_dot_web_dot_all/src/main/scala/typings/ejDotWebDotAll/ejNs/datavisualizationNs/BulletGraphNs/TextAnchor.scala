package typings.ejDotWebDotAll.ejNs.datavisualizationNs.BulletGraphNs

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
  sealed trait End extends TextAnchor
  
  //string
  @js.native
  sealed trait Middle extends TextAnchor
  
  //string
  @js.native
  sealed trait Start extends TextAnchor
  
  /* 2 */ val End: typings.ejDotWebDotAll.ejNs.datavisualizationNs.BulletGraphNs.TextAnchor.End with Double = js.native
  /* 1 */ val Middle: typings.ejDotWebDotAll.ejNs.datavisualizationNs.BulletGraphNs.TextAnchor.Middle with Double = js.native
  /* 0 */ val Start: typings.ejDotWebDotAll.ejNs.datavisualizationNs.BulletGraphNs.TextAnchor.Start with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextAnchor with Double] = js.native
}


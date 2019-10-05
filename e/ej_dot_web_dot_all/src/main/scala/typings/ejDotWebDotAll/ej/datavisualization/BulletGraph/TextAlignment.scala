package typings.ejDotWebDotAll.ej.datavisualization.BulletGraph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextAlignment extends js.Object

@JSGlobal("ej.datavisualization.BulletGraph.TextAlignment")
@js.native
object TextAlignment extends js.Object {
  //string
  @js.native
  sealed trait Center extends TextAlignment
  
  //string
  @js.native
  sealed trait Far extends TextAlignment
  
  //string
  @js.native
  sealed trait Near extends TextAlignment
  
  /* 2 */ val Center: typings.ejDotWebDotAll.ej.datavisualization.BulletGraph.TextAlignment.Center with Double = js.native
  /* 1 */ val Far: typings.ejDotWebDotAll.ej.datavisualization.BulletGraph.TextAlignment.Far with Double = js.native
  /* 0 */ val Near: typings.ejDotWebDotAll.ej.datavisualization.BulletGraph.TextAlignment.Near with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextAlignment with Double] = js.native
}


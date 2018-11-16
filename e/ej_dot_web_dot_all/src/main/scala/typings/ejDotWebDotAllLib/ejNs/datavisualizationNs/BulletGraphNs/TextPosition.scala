package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.BulletGraphNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextPosition extends js.Object

@JSGlobal("ej.datavisualization.BulletGraph.TextPosition")
@js.native
object TextPosition extends js.Object {
  //string
  @js.native
  sealed trait Bottom
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.BulletGraphNs.TextPosition
  
  //string
  @js.native
  sealed trait Float
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.BulletGraphNs.TextPosition
  
  //string
  @js.native
  sealed trait Left
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.BulletGraphNs.TextPosition
  
  //string
  @js.native
  sealed trait Right
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.BulletGraphNs.TextPosition
  
  //string
  @js.native
  sealed trait Top
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.BulletGraphNs.TextPosition
  
  val Bottom: Bottom with java.lang.String = js.native
  val Float: Float with java.lang.String = js.native
  val Left: Left with java.lang.String = js.native
  val Right: Right with java.lang.String = js.native
  val Top: Top with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.BulletGraphNs.TextPosition with java.lang.String
  ] = js.native
}


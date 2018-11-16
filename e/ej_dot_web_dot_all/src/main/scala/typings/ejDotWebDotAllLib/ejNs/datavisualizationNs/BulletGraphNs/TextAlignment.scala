package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.BulletGraphNs

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
  sealed trait Center
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.BulletGraphNs.TextAlignment
  
  //string
  @js.native
  sealed trait Far
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.BulletGraphNs.TextAlignment
  
  //string
  @js.native
  sealed trait Near
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.BulletGraphNs.TextAlignment
  
  val Center: Center with java.lang.String = js.native
  val Far: Far with java.lang.String = js.native
  val Near: Near with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.BulletGraphNs.TextAlignment with java.lang.String
  ] = js.native
}


package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.BulletGraphNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FontStyle extends js.Object

@JSGlobal("ej.datavisualization.BulletGraph.FontStyle")
@js.native
object FontStyle extends js.Object {
  //string
  @js.native
  sealed trait Italic
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.BulletGraphNs.FontStyle
  
  //string
  @js.native
  sealed trait Normal
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.BulletGraphNs.FontStyle
  
  //string
  @js.native
  sealed trait Oblique
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.BulletGraphNs.FontStyle
  
  val Italic: Italic with java.lang.String = js.native
  val Normal: Normal with java.lang.String = js.native
  val Oblique: Oblique with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.BulletGraphNs.FontStyle with java.lang.String
  ] = js.native
}


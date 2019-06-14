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
  
  /* 1 */ val Italic: Italic with scala.Double = js.native
  /* 0 */ val Normal: Normal with scala.Double = js.native
  /* 2 */ val Oblique: Oblique with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.BulletGraphNs.FontStyle with scala.Double
  ] = js.native
}


package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.BulletGraphNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FontWeight extends js.Object

@JSGlobal("ej.datavisualization.BulletGraph.FontWeight")
@js.native
object FontWeight extends js.Object {
  //string
  @js.native
  sealed trait Bold
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.BulletGraphNs.FontWeight
  
  //string
  @js.native
  sealed trait Bolder
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.BulletGraphNs.FontWeight
  
  //string
  @js.native
  sealed trait Lighter
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.BulletGraphNs.FontWeight
  
  //string
  @js.native
  sealed trait Normal
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.BulletGraphNs.FontWeight
  
  /* 1 */ val Bold: Bold with scala.Double = js.native
  /* 2 */ val Bolder: Bolder with scala.Double = js.native
  /* 3 */ val Lighter: Lighter with scala.Double = js.native
  /* 0 */ val Normal: Normal with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.BulletGraphNs.FontWeight with scala.Double
  ] = js.native
}


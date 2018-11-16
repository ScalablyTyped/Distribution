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
  
  val Bold: Bold with java.lang.String = js.native
  val Bolder: Bolder with java.lang.String = js.native
  val Lighter: Lighter with java.lang.String = js.native
  val Normal: Normal with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.BulletGraphNs.FontWeight with java.lang.String
  ] = js.native
}


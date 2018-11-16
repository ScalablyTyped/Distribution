package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.TreeMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Position extends js.Object

@JSGlobal("ej.datavisualization.TreeMap.Position")
@js.native
object Position extends js.Object {
  //specifies the bottomcenter position
  @js.native
  sealed trait Bottomcenter
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.TreeMapNs.Position
  
  //specifies the bottomleft position
  @js.native
  sealed trait Bottomleft
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.TreeMapNs.Position
  
  //specifies the bottomright position
  @js.native
  sealed trait Bottomright
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.TreeMapNs.Position
  
  //specifies the center position
  @js.native
  sealed trait Center
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.TreeMapNs.Position
  
  //specifies the centerleft position
  @js.native
  sealed trait Centerleft
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.TreeMapNs.Position
  
  //specifies the centerright position
  @js.native
  sealed trait Centerright
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.TreeMapNs.Position
  
  //specifies the none position
  @js.native
  sealed trait None
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.TreeMapNs.Position
  
  //specifies the topcenter position
  @js.native
  sealed trait Topcenter
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.TreeMapNs.Position
  
  //specifies the topleft position
  @js.native
  sealed trait Topleft
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.TreeMapNs.Position
  
  //specifies the topright position
  @js.native
  sealed trait Topright
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.TreeMapNs.Position
  
  val Bottomcenter: Bottomcenter with java.lang.String = js.native
  val Bottomleft: Bottomleft with java.lang.String = js.native
  val Bottomright: Bottomright with java.lang.String = js.native
  val Center: Center with java.lang.String = js.native
  val Centerleft: Centerleft with java.lang.String = js.native
  val Centerright: Centerright with java.lang.String = js.native
  val None: None with java.lang.String = js.native
  val Topcenter: Topcenter with java.lang.String = js.native
  val Topleft: Topleft with java.lang.String = js.native
  val Topright: Topright with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.TreeMapNs.Position with java.lang.String
  ] = js.native
}


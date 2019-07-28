package typings.ejDotWebDotAll.ejNs.datavisualizationNs.TreeMapNs

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
  sealed trait Bottomcenter extends Position
  
  //specifies the bottomleft position
  @js.native
  sealed trait Bottomleft extends Position
  
  //specifies the bottomright position
  @js.native
  sealed trait Bottomright extends Position
  
  //specifies the center position
  @js.native
  sealed trait Center extends Position
  
  //specifies the centerleft position
  @js.native
  sealed trait Centerleft extends Position
  
  //specifies the centerright position
  @js.native
  sealed trait Centerright extends Position
  
  //specifies the none position
  @js.native
  sealed trait None extends Position
  
  //specifies the topcenter position
  @js.native
  sealed trait Topcenter extends Position
  
  //specifies the topleft position
  @js.native
  sealed trait Topleft extends Position
  
  //specifies the topright position
  @js.native
  sealed trait Topright extends Position
  
  /* 8 */ val Bottomcenter: typings.ejDotWebDotAll.ejNs.datavisualizationNs.TreeMapNs.Position.Bottomcenter with Double = js.native
  /* 7 */ val Bottomleft: typings.ejDotWebDotAll.ejNs.datavisualizationNs.TreeMapNs.Position.Bottomleft with Double = js.native
  /* 9 */ val Bottomright: typings.ejDotWebDotAll.ejNs.datavisualizationNs.TreeMapNs.Position.Bottomright with Double = js.native
  /* 5 */ val Center: typings.ejDotWebDotAll.ejNs.datavisualizationNs.TreeMapNs.Position.Center with Double = js.native
  /* 4 */ val Centerleft: typings.ejDotWebDotAll.ejNs.datavisualizationNs.TreeMapNs.Position.Centerleft with Double = js.native
  /* 6 */ val Centerright: typings.ejDotWebDotAll.ejNs.datavisualizationNs.TreeMapNs.Position.Centerright with Double = js.native
  /* 0 */ val None: typings.ejDotWebDotAll.ejNs.datavisualizationNs.TreeMapNs.Position.None with Double = js.native
  /* 2 */ val Topcenter: typings.ejDotWebDotAll.ejNs.datavisualizationNs.TreeMapNs.Position.Topcenter with Double = js.native
  /* 1 */ val Topleft: typings.ejDotWebDotAll.ejNs.datavisualizationNs.TreeMapNs.Position.Topleft with Double = js.native
  /* 3 */ val Topright: typings.ejDotWebDotAll.ejNs.datavisualizationNs.TreeMapNs.Position.Topright with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Position with Double] = js.native
}


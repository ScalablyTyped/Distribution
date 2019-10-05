package typings.ejDotWebDotAll.ej.datavisualization.Map

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Position extends js.Object

@JSGlobal("ej.datavisualization.Map.Position")
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
  
  /* 8 */ val Bottomcenter: typings.ejDotWebDotAll.ej.datavisualization.Map.Position.Bottomcenter with Double = js.native
  /* 7 */ val Bottomleft: typings.ejDotWebDotAll.ej.datavisualization.Map.Position.Bottomleft with Double = js.native
  /* 9 */ val Bottomright: typings.ejDotWebDotAll.ej.datavisualization.Map.Position.Bottomright with Double = js.native
  /* 5 */ val Center: typings.ejDotWebDotAll.ej.datavisualization.Map.Position.Center with Double = js.native
  /* 4 */ val Centerleft: typings.ejDotWebDotAll.ej.datavisualization.Map.Position.Centerleft with Double = js.native
  /* 6 */ val Centerright: typings.ejDotWebDotAll.ej.datavisualization.Map.Position.Centerright with Double = js.native
  /* 0 */ val None: typings.ejDotWebDotAll.ej.datavisualization.Map.Position.None with Double = js.native
  /* 2 */ val Topcenter: typings.ejDotWebDotAll.ej.datavisualization.Map.Position.Topcenter with Double = js.native
  /* 1 */ val Topleft: typings.ejDotWebDotAll.ej.datavisualization.Map.Position.Topleft with Double = js.native
  /* 3 */ val Topright: typings.ejDotWebDotAll.ej.datavisualization.Map.Position.Topright with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Position with Double] = js.native
}


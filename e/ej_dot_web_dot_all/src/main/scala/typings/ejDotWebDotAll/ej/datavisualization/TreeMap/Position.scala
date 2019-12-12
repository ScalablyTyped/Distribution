package typings.ejDotWebDotAll.ej.datavisualization.TreeMap

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.datavisualization.TreeMap.Position.Bottomcenter
import typings.ejDotWebDotAll.ej.datavisualization.TreeMap.Position.Bottomleft
import typings.ejDotWebDotAll.ej.datavisualization.TreeMap.Position.Bottomright
import typings.ejDotWebDotAll.ej.datavisualization.TreeMap.Position.Center
import typings.ejDotWebDotAll.ej.datavisualization.TreeMap.Position.Centerleft
import typings.ejDotWebDotAll.ej.datavisualization.TreeMap.Position.Centerright
import typings.ejDotWebDotAll.ej.datavisualization.TreeMap.Position.None
import typings.ejDotWebDotAll.ej.datavisualization.TreeMap.Position.Topcenter
import typings.ejDotWebDotAll.ej.datavisualization.TreeMap.Position.Topleft
import typings.ejDotWebDotAll.ej.datavisualization.TreeMap.Position.Topright
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Position with Double] = js.native
  /* 8 */ @js.native
  object Bottomcenter extends TopLevel[Bottomcenter with Double]
  
  /* 7 */ @js.native
  object Bottomleft extends TopLevel[Bottomleft with Double]
  
  /* 9 */ @js.native
  object Bottomright extends TopLevel[Bottomright with Double]
  
  /* 5 */ @js.native
  object Center extends TopLevel[Center with Double]
  
  /* 4 */ @js.native
  object Centerleft extends TopLevel[Centerleft with Double]
  
  /* 6 */ @js.native
  object Centerright extends TopLevel[Centerright with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 2 */ @js.native
  object Topcenter extends TopLevel[Topcenter with Double]
  
  /* 1 */ @js.native
  object Topleft extends TopLevel[Topleft with Double]
  
  /* 3 */ @js.native
  object Topright extends TopLevel[Topright with Double]
  
}


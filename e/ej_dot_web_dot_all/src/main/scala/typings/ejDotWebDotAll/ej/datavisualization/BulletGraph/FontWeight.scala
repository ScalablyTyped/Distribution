package typings.ejDotWebDotAll.ej.datavisualization.BulletGraph

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
  sealed trait Bold extends FontWeight
  
  //string
  @js.native
  sealed trait Bolder extends FontWeight
  
  //string
  @js.native
  sealed trait Lighter extends FontWeight
  
  //string
  @js.native
  sealed trait Normal extends FontWeight
  
  /* 1 */ val Bold: typings.ejDotWebDotAll.ej.datavisualization.BulletGraph.FontWeight.Bold with Double = js.native
  /* 2 */ val Bolder: typings.ejDotWebDotAll.ej.datavisualization.BulletGraph.FontWeight.Bolder with Double = js.native
  /* 3 */ val Lighter: typings.ejDotWebDotAll.ej.datavisualization.BulletGraph.FontWeight.Lighter with Double = js.native
  /* 0 */ val Normal: typings.ejDotWebDotAll.ej.datavisualization.BulletGraph.FontWeight.Normal with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FontWeight with Double] = js.native
}


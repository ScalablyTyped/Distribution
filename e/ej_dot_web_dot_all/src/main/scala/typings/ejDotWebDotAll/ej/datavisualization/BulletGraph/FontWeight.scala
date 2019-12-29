package typings.ejDotWebDotAll.ej.datavisualization.BulletGraph

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FontWeight with Double] = js.native
  /* 1 */ @js.native
  object Bold extends TopLevel[Bold with Double]
  
  /* 2 */ @js.native
  object Bolder extends TopLevel[Bolder with Double]
  
  /* 3 */ @js.native
  object Lighter extends TopLevel[Lighter with Double]
  
  /* 0 */ @js.native
  object Normal extends TopLevel[Normal with Double]
  
}


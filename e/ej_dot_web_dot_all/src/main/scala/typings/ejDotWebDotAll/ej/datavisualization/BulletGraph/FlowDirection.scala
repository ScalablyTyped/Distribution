package typings.ejDotWebDotAll.ej.datavisualization.BulletGraph

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.datavisualization.BulletGraph.FlowDirection.Backward
import typings.ejDotWebDotAll.ej.datavisualization.BulletGraph.FlowDirection.Forward
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FlowDirection extends js.Object

@JSGlobal("ej.datavisualization.BulletGraph.FlowDirection")
@js.native
object FlowDirection extends js.Object {
  //string
  @js.native
  sealed trait Backward extends FlowDirection
  
  //string
  @js.native
  sealed trait Forward extends FlowDirection
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FlowDirection with Double] = js.native
  /* 1 */ @js.native
  object Backward extends TopLevel[Backward with Double]
  
  /* 0 */ @js.native
  object Forward extends TopLevel[Forward with Double]
  
}


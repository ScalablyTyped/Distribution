package typings.ejDotWebDotAll.ej.datavisualization.BulletGraph

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
  sealed trait Italic extends FontStyle
  
  //string
  @js.native
  sealed trait Normal extends FontStyle
  
  //string
  @js.native
  sealed trait Oblique extends FontStyle
  
  /* 1 */ val Italic: typings.ejDotWebDotAll.ej.datavisualization.BulletGraph.FontStyle.Italic with Double = js.native
  /* 0 */ val Normal: typings.ejDotWebDotAll.ej.datavisualization.BulletGraph.FontStyle.Normal with Double = js.native
  /* 2 */ val Oblique: typings.ejDotWebDotAll.ej.datavisualization.BulletGraph.FontStyle.Oblique with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FontStyle with Double] = js.native
}


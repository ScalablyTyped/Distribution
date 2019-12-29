package typings.ejDotWebDotAll.ej.datavisualization.BulletGraph

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FontStyle with Double] = js.native
  /* 1 */ @js.native
  object Italic extends TopLevel[Italic with Double]
  
  /* 0 */ @js.native
  object Normal extends TopLevel[Normal with Double]
  
  /* 2 */ @js.native
  object Oblique extends TopLevel[Oblique with Double]
  
}


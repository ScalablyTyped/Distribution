package typings.ejDotWebDotAll.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Animation extends js.Object

@JSGlobal("ej.Animation")
@js.native
object Animation extends js.Object {
  @js.native
  sealed trait Fade extends Animation
  
  @js.native
  sealed trait None extends Animation
  
  @js.native
  sealed trait Slide extends Animation
  
  /* 0 */ val Fade: typings.ejDotWebDotAll.ejNs.Animation.Fade with Double = js.native
  /* 1 */ val None: typings.ejDotWebDotAll.ejNs.Animation.None with Double = js.native
  /* 2 */ val Slide: typings.ejDotWebDotAll.ejNs.Animation.Slide with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Animation with Double] = js.native
}


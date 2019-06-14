package typings
package ejDotWebDotAllLib.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Animation extends js.Object

@JSGlobal("ej.Animation")
@js.native
object Animation extends js.Object {
  @js.native
  sealed trait Fade
    extends ejDotWebDotAllLib.ejNs.Animation
  
  @js.native
  sealed trait None
    extends ejDotWebDotAllLib.ejNs.Animation
  
  @js.native
  sealed trait Slide
    extends ejDotWebDotAllLib.ejNs.Animation
  
  /* 0 */ val Fade: Fade with scala.Double = js.native
  /* 1 */ val None: None with scala.Double = js.native
  /* 2 */ val Slide: Slide with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.Animation with scala.Double] = js.native
}


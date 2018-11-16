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
  
  val Fade: Fade with java.lang.String = js.native
  val None: None with java.lang.String = js.native
  val Slide: Slide with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.Animation with java.lang.String] = js.native
}


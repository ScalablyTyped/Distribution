package typings
package ejDotWebDotAllLib.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Type extends js.Object

@JSGlobal("ej.Type")
@js.native
object Type extends js.Object {
  @js.native
  sealed trait Overlay
    extends ejDotWebDotAllLib.ejNs.Type
  
  @js.native
  sealed trait Slide
    extends ejDotWebDotAllLib.ejNs.Type
  
  /* 0 */ val Overlay: Overlay with scala.Double = js.native
  /* 1 */ val Slide: Slide with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.Type with scala.Double] = js.native
}


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
  
  val Overlay: Overlay with java.lang.String = js.native
  val Slide: Slide with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.Type with java.lang.String] = js.native
}


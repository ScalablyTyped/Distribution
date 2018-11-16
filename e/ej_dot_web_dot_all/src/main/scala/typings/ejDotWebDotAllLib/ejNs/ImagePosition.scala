package typings
package ejDotWebDotAllLib.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ImagePosition extends js.Object

@JSGlobal("ej.ImagePosition")
@js.native
object ImagePosition extends js.Object {
  //support for aligning text in top and image in bottom
  @js.native
  sealed trait ImageBottom
    extends ejDotWebDotAllLib.ejNs.ImagePosition
  
  //support for aligning text in right and image in left
  @js.native
  sealed trait ImageLeft
    extends ejDotWebDotAllLib.ejNs.ImagePosition
  
  //support for aligning text in left and image in right
  @js.native
  sealed trait ImageRight
    extends ejDotWebDotAllLib.ejNs.ImagePosition
  
  //support for aligning text in bottom and image in top.
  @js.native
  sealed trait ImageTop
    extends ejDotWebDotAllLib.ejNs.ImagePosition
  
  val ImageBottom: ImageBottom with java.lang.String = js.native
  val ImageLeft: ImageLeft with java.lang.String = js.native
  val ImageRight: ImageRight with java.lang.String = js.native
  val ImageTop: ImageTop with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.ImagePosition with java.lang.String] = js.native
}


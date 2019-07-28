package typings.ejDotWebDotAll.ejNs

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
  sealed trait ImageBottom extends ImagePosition
  
  //support for aligning text in right and image in left
  @js.native
  sealed trait ImageLeft extends ImagePosition
  
  //support for aligning text in left and image in right
  @js.native
  sealed trait ImageRight extends ImagePosition
  
  //support for aligning text in bottom and image in top.
  @js.native
  sealed trait ImageTop extends ImagePosition
  
  /* 3 */ val ImageBottom: typings.ejDotWebDotAll.ejNs.ImagePosition.ImageBottom with Double = js.native
  /* 1 */ val ImageLeft: typings.ejDotWebDotAll.ejNs.ImagePosition.ImageLeft with Double = js.native
  /* 0 */ val ImageRight: typings.ejDotWebDotAll.ejNs.ImagePosition.ImageRight with Double = js.native
  /* 2 */ val ImageTop: typings.ejDotWebDotAll.ejNs.ImagePosition.ImageTop with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ImagePosition with Double] = js.native
}


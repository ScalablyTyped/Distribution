package typings.ejWebAll.ej

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ImagePosition with Double] = js.native
  /* 3 */ @js.native
  object ImageBottom extends TopLevel[ImageBottom with Double]
  
  /* 1 */ @js.native
  object ImageLeft extends TopLevel[ImageLeft with Double]
  
  /* 0 */ @js.native
  object ImageRight extends TopLevel[ImageRight with Double]
  
  /* 2 */ @js.native
  object ImageTop extends TopLevel[ImageTop with Double]
  
}


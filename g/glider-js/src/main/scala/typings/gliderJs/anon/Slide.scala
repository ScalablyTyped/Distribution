package typings.gliderJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Slide extends js.Object {
  var slide: Double
}

object Slide {
  @scala.inline
  def apply(slide: Double): Slide = {
    val __obj = js.Dynamic.literal(slide = slide.asInstanceOf[js.Any])
    __obj.asInstanceOf[Slide]
  }
}


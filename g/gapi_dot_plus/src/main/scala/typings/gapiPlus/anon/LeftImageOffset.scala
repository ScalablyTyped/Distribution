package typings.gapiPlus.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeftImageOffset extends js.Object {
  var leftImageOffset: Double
  var topImageOffset: Double
}

object LeftImageOffset {
  @scala.inline
  def apply(leftImageOffset: Double, topImageOffset: Double): LeftImageOffset = {
    val __obj = js.Dynamic.literal(leftImageOffset = leftImageOffset.asInstanceOf[js.Any], topImageOffset = topImageOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeftImageOffset]
  }
}


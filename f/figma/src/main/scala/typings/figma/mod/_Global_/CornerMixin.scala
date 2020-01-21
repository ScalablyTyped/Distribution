package typings.figma.mod._Global_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CornerMixin extends js.Object {
  var cornerRadius: Double | js.Symbol
  var cornerSmoothing: Double
}

object CornerMixin {
  @scala.inline
  def apply(cornerRadius: Double | js.Symbol, cornerSmoothing: Double): CornerMixin = {
    val __obj = js.Dynamic.literal(cornerRadius = cornerRadius.asInstanceOf[js.Any], cornerSmoothing = cornerSmoothing.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CornerMixin]
  }
}


package typings.gestalt.gestaltMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpinnerProps extends js.Object {
  var accessibilityLabel: String
  var show: Boolean
}

object SpinnerProps {
  @scala.inline
  def apply(accessibilityLabel: String, show: Boolean): SpinnerProps = {
    val __obj = js.Dynamic.literal(accessibilityLabel = accessibilityLabel, show = show)
  
    __obj.asInstanceOf[SpinnerProps]
  }
}


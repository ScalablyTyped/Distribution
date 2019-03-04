package typings
package gestaltLib.gestaltMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpinnerProps extends js.Object {
  var accessibilityLabel: java.lang.String
  var show: scala.Boolean
}

object SpinnerProps {
  @scala.inline
  def apply(accessibilityLabel: java.lang.String, show: scala.Boolean): SpinnerProps = {
    val __obj = js.Dynamic.literal(accessibilityLabel = accessibilityLabel, show = show)
  
    __obj.asInstanceOf[SpinnerProps]
  }
}


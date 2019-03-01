package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the scaling settings.
  */
trait Scale extends js.Object {
  /**
    * Gets or sets the image's y-scale factor as a percent.
    * Value: An integer value that is the y-scale factor as a percent.
    */
  var x: scala.Double
  /**
    * Gets or sets the image's x-scale factor as a percent.
    * Value: An integer value that is the x-scale factor as a percent.
    */
  var y: scala.Double
}

object Scale {
  @scala.inline
  def apply(x: scala.Double, y: scala.Double): Scale = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[Scale]
  }
}


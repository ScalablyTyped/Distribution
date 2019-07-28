package typings.devexpressDashWeb

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
  var x: Double
  /**
    * Gets or sets the image's x-scale factor as a percent.
    * Value: An integer value that is the x-scale factor as a percent.
    */
  var y: Double
}

object Scale {
  @scala.inline
  def apply(x: Double, y: Double): Scale = {
    val __obj = js.Dynamic.literal(x = x, y = y)
  
    __obj.asInstanceOf[Scale]
  }
}


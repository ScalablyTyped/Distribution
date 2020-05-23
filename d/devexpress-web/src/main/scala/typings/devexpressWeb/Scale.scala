package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the scaling settings.
  */
trait Scale extends js.Object {
  /**
    * Specifies the image's x-scale factor as a percent.
    */
  var x: Double
  /**
    * Specifies the image's y-scale factor as a percent.
    */
  var y: Double
}

object Scale {
  @scala.inline
  def apply(x: Double, y: Double): Scale = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scale]
  }
}


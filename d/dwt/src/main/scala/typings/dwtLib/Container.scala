package typings
package dwtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * interface for a DWT container which basically defines a DIV on the page
  */
trait Container extends js.Object {
  var ContainerId: java.lang.String
  var Height: java.lang.String | scala.Double
  var Width: java.lang.String | scala.Double
}

object Container {
  @scala.inline
  def apply(
    ContainerId: java.lang.String,
    Height: java.lang.String | scala.Double,
    Width: java.lang.String | scala.Double
  ): Container = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ContainerId")(ContainerId)
    __obj.updateDynamic("Height")(Height.asInstanceOf[js.Any])
    __obj.updateDynamic("Width")(Width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Container]
  }
}


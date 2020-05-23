package typings.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * interface for a DWT container which basically defines a DIV on the page
  */
trait Container extends js.Object {
  var ContainerId: String
  var Height: String | Double
  var Width: String | Double
}

object Container {
  @scala.inline
  def apply(ContainerId: String, Height: String | Double, Width: String | Double): Container = {
    val __obj = js.Dynamic.literal(ContainerId = ContainerId.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Container]
  }
}


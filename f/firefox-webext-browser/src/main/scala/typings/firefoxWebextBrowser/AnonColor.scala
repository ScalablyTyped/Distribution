package typings.firefoxWebextBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColor extends js.Object {
  /** The color of the contextual identity. */
  var color: String
  /** The icon of the contextual identity. */
  var icon: String
  /** The name of the contextual identity. */
  var name: String
}

object AnonColor {
  @scala.inline
  def apply(color: String, icon: String, name: String): AnonColor = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColor]
  }
}


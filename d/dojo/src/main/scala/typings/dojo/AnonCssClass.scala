package typings.dojo

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCssClass extends js.Object {
  var cssClass: String
  var node: HTMLElement
}

object AnonCssClass {
  @scala.inline
  def apply(cssClass: String, node: HTMLElement): AnonCssClass = {
    val __obj = js.Dynamic.literal(cssClass = cssClass.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCssClass]
  }
}


package typings.dojo

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CssClass extends js.Object {
  var cssClass: String
  var node: HTMLElement
}

object Anon_CssClass {
  @scala.inline
  def apply(cssClass: String, node: HTMLElement): Anon_CssClass = {
    val __obj = js.Dynamic.literal(cssClass = cssClass, node = node)
  
    __obj.asInstanceOf[Anon_CssClass]
  }
}


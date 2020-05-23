package typings.gestalt.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Href extends js.Object {
  var href: String
  var text: js.Any
}

object Href {
  @scala.inline
  def apply(href: String, text: js.Any): Href = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Href]
  }
}


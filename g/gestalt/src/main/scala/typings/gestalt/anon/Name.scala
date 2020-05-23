package typings.gestalt.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Name extends js.Object {
  var name: String
  var src: js.UndefOr[String] = js.undefined
}

object Name {
  @scala.inline
  def apply(name: String, src: String = null): Name = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
}


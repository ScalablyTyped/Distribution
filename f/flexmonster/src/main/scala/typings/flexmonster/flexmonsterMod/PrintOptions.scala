package typings.flexmonster.flexmonsterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrintOptions extends js.Object {
  var footer: js.UndefOr[String] = js.undefined
  var header: js.UndefOr[String] = js.undefined
}

object PrintOptions {
  @scala.inline
  def apply(footer: String = null, header: String = null): PrintOptions = {
    val __obj = js.Dynamic.literal()
    if (footer != null) __obj.updateDynamic("footer")(footer)
    if (header != null) __obj.updateDynamic("header")(header)
    __obj.asInstanceOf[PrintOptions]
  }
}


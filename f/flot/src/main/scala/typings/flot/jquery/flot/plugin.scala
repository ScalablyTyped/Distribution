package typings.flot.jquery.flot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait plugin extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var options: js.UndefOr[js.Any] = js.undefined
  var version: js.UndefOr[String] = js.undefined
  def init(options: plotOptions): js.Any
}

object plugin {
  @scala.inline
  def apply(init: plotOptions => js.Any, name: String = null, options: js.Any = null, version: String = null): plugin = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction1(init))
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[plugin]
  }
}


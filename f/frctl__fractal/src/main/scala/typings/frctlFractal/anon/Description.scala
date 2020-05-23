package typings.frctlFractal.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Description extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var options: js.UndefOr[js.Array[js.Array[String]]] = js.undefined
}

object Description {
  @scala.inline
  def apply(description: String = null, options: js.Array[js.Array[String]] = null): Description = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Description]
  }
}


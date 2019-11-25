package typings.atFrctlFractal.atFrctlFractalMod.fractal.api.docs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocDefaultConfig extends js.Object {
  var context: js.UndefOr[js.Any] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
  var status: js.UndefOr[String] = js.undefined
}

object DocDefaultConfig {
  @scala.inline
  def apply(context: js.Any = null, prefix: String = null, status: String = null): DocDefaultConfig = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocDefaultConfig]
  }
}


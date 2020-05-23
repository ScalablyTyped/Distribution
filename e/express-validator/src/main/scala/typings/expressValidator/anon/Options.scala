package typings.expressValidator.anon

import typings.expressValidator.contextMod.Optional
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var options: js.UndefOr[Partial[Optional]] = js.undefined
}

object Options {
  @scala.inline
  def apply(options: Partial[Optional] = null): Options = {
    val __obj = js.Dynamic.literal()
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}


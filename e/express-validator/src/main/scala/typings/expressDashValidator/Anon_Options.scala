package typings.expressDashValidator

import typings.expressDashValidator.srcContextMod.Optional
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Options extends js.Object {
  var options: js.UndefOr[Partial[Optional]] = js.undefined
}

object Anon_Options {
  @scala.inline
  def apply(options: Partial[Optional] = null): Anon_Options = {
    val __obj = js.Dynamic.literal()
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[Anon_Options]
  }
}


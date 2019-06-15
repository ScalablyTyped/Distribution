package typings
package dos2unixLib.dos2unixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var glob: js.UndefOr[globLib.globMod.IOptions] = js.undefined
  var maxConcurrency: js.UndefOr[scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(glob: globLib.globMod.IOptions = null, maxConcurrency: scala.Int | scala.Double = null): Options = {
    val __obj = js.Dynamic.literal()
    if (glob != null) __obj.updateDynamic("glob")(glob)
    if (maxConcurrency != null) __obj.updateDynamic("maxConcurrency")(maxConcurrency.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}


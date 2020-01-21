package typings.dos2unix.mod

import typings.glob.mod.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var glob: js.UndefOr[IOptions] = js.undefined
  var maxConcurrency: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(glob: IOptions = null, maxConcurrency: Int | Double = null): Options = {
    val __obj = js.Dynamic.literal()
    if (glob != null) __obj.updateDynamic("glob")(glob.asInstanceOf[js.Any])
    if (maxConcurrency != null) __obj.updateDynamic("maxConcurrency")(maxConcurrency.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}


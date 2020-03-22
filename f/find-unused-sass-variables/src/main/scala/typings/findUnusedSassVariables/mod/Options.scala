package typings.findUnusedSassVariables.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** Array of strings of the variables to ignore, e.g. `['$my-var', '$my-second-var']` */
  var ignore: js.UndefOr[js.Array[String]] = js.undefined
}

object Options {
  @scala.inline
  def apply(ignore: js.Array[String] = null): Options = {
    val __obj = js.Dynamic.literal()
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}


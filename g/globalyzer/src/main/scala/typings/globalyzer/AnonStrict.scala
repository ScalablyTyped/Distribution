package typings.globalyzer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStrict extends js.Object {
  /**
    * Use strict parsing (be strict about what's a glob and what's not)
    * @default false
    */
  var strict: js.UndefOr[Boolean] = js.undefined
}

object AnonStrict {
  @scala.inline
  def apply(strict: js.UndefOr[Boolean] = js.undefined): AnonStrict = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStrict]
  }
}


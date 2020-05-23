package typings.globalyzer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Strict extends js.Object {
  /**
    * Use strict parsing (be strict about what's a glob and what's not)
    * @default false
    */
  var strict: js.UndefOr[Boolean] = js.undefined
}

object Strict {
  @scala.inline
  def apply(strict: js.UndefOr[Boolean] = js.undefined): Strict = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Strict]
  }
}


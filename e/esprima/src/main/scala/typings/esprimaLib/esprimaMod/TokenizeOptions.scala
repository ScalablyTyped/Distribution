package typings
package esprimaLib.esprimaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenizeOptions extends js.Object {
  var comment: js.UndefOr[scala.Boolean] = js.undefined
  var loc: js.UndefOr[scala.Boolean] = js.undefined
  var range: js.UndefOr[scala.Boolean] = js.undefined
  var tolerant: js.UndefOr[scala.Boolean] = js.undefined
}

object TokenizeOptions {
  @scala.inline
  def apply(
    comment: js.UndefOr[scala.Boolean] = js.undefined,
    loc: js.UndefOr[scala.Boolean] = js.undefined,
    range: js.UndefOr[scala.Boolean] = js.undefined,
    tolerant: js.UndefOr[scala.Boolean] = js.undefined
  ): TokenizeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(comment)) __obj.updateDynamic("comment")(comment)
    if (!js.isUndefined(loc)) __obj.updateDynamic("loc")(loc)
    if (!js.isUndefined(range)) __obj.updateDynamic("range")(range)
    if (!js.isUndefined(tolerant)) __obj.updateDynamic("tolerant")(tolerant)
    __obj.asInstanceOf[TokenizeOptions]
  }
}


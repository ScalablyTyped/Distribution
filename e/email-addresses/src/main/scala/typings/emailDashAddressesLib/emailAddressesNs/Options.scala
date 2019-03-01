package typings
package emailDashAddressesLib.emailAddressesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var input: java.lang.String
  var oneResult: js.UndefOr[scala.Boolean] = js.undefined
  var partial: js.UndefOr[scala.Boolean] = js.undefined
  var rejectTLD: js.UndefOr[scala.Boolean] = js.undefined
  var rfc6532: js.UndefOr[scala.Boolean] = js.undefined
  var simple: js.UndefOr[scala.Boolean] = js.undefined
  var startAt: js.UndefOr[java.lang.String] = js.undefined
  var strict: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    input: java.lang.String,
    oneResult: js.UndefOr[scala.Boolean] = js.undefined,
    partial: js.UndefOr[scala.Boolean] = js.undefined,
    rejectTLD: js.UndefOr[scala.Boolean] = js.undefined,
    rfc6532: js.UndefOr[scala.Boolean] = js.undefined,
    simple: js.UndefOr[scala.Boolean] = js.undefined,
    startAt: java.lang.String = null,
    strict: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("input")(input)
    if (!js.isUndefined(oneResult)) __obj.updateDynamic("oneResult")(oneResult)
    if (!js.isUndefined(partial)) __obj.updateDynamic("partial")(partial)
    if (!js.isUndefined(rejectTLD)) __obj.updateDynamic("rejectTLD")(rejectTLD)
    if (!js.isUndefined(rfc6532)) __obj.updateDynamic("rfc6532")(rfc6532)
    if (!js.isUndefined(simple)) __obj.updateDynamic("simple")(simple)
    if (startAt != null) __obj.updateDynamic("startAt")(startAt)
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    __obj.asInstanceOf[Options]
  }
}


package typings.emailDashAddresses.emailAddresses

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var input: String
  var oneResult: js.UndefOr[Boolean] = js.undefined
  var partial: js.UndefOr[Boolean] = js.undefined
  var rejectTLD: js.UndefOr[Boolean] = js.undefined
  var rfc6532: js.UndefOr[Boolean] = js.undefined
  var simple: js.UndefOr[Boolean] = js.undefined
  var startAt: js.UndefOr[String] = js.undefined
  var strict: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    input: String,
    oneResult: js.UndefOr[Boolean] = js.undefined,
    partial: js.UndefOr[Boolean] = js.undefined,
    rejectTLD: js.UndefOr[Boolean] = js.undefined,
    rfc6532: js.UndefOr[Boolean] = js.undefined,
    simple: js.UndefOr[Boolean] = js.undefined,
    startAt: String = null,
    strict: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any])
    if (!js.isUndefined(oneResult)) __obj.updateDynamic("oneResult")(oneResult.asInstanceOf[js.Any])
    if (!js.isUndefined(partial)) __obj.updateDynamic("partial")(partial.asInstanceOf[js.Any])
    if (!js.isUndefined(rejectTLD)) __obj.updateDynamic("rejectTLD")(rejectTLD.asInstanceOf[js.Any])
    if (!js.isUndefined(rfc6532)) __obj.updateDynamic("rfc6532")(rfc6532.asInstanceOf[js.Any])
    if (!js.isUndefined(simple)) __obj.updateDynamic("simple")(simple.asInstanceOf[js.Any])
    if (startAt != null) __obj.updateDynamic("startAt")(startAt.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}


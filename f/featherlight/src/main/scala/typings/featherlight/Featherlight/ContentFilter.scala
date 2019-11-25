package typings.featherlight.Featherlight

import typings.featherlight.JQuery
import typings.jquery.JQueryPromise
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContentFilter extends js.Object {
  var process: js.UndefOr[js.Function1[/* data */ JQuery | String, JQuery | JQueryPromise[JQuery]]] = js.undefined
  var regex: js.UndefOr[RegExp] = js.undefined
  var test: js.UndefOr[js.Function1[/* data */ JQuery | String, Boolean]] = js.undefined
}

object ContentFilter {
  @scala.inline
  def apply(
    process: /* data */ JQuery | String => JQuery | JQueryPromise[JQuery] = null,
    regex: RegExp = null,
    test: /* data */ JQuery | String => Boolean = null
  ): ContentFilter = {
    val __obj = js.Dynamic.literal()
    if (process != null) __obj.updateDynamic("process")(js.Any.fromFunction1(process))
    if (regex != null) __obj.updateDynamic("regex")(regex.asInstanceOf[js.Any])
    if (test != null) __obj.updateDynamic("test")(js.Any.fromFunction1(test))
    __obj.asInstanceOf[ContentFilter]
  }
}


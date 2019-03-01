package typings
package featherlightLib.FeatherlightNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContentFilter extends js.Object {
  var process: js.UndefOr[
    js.Function1[
      /* data */ featherlightLib.JQuery | java.lang.String, 
      featherlightLib.JQuery | jqueryLib.JQueryPromise[featherlightLib.JQuery]
    ]
  ] = js.undefined
  var regex: js.UndefOr[stdLib.RegExp] = js.undefined
  var test: js.UndefOr[
    js.Function1[/* data */ featherlightLib.JQuery | java.lang.String, scala.Boolean]
  ] = js.undefined
}

object ContentFilter {
  @scala.inline
  def apply(
    process: js.Function1[
      /* data */ featherlightLib.JQuery | java.lang.String, 
      featherlightLib.JQuery | jqueryLib.JQueryPromise[featherlightLib.JQuery]
    ] = null,
    regex: stdLib.RegExp = null,
    test: js.Function1[/* data */ featherlightLib.JQuery | java.lang.String, scala.Boolean] = null
  ): ContentFilter = {
    val __obj = js.Dynamic.literal()
    if (process != null) __obj.updateDynamic("process")(process)
    if (regex != null) __obj.updateDynamic("regex")(regex)
    if (test != null) __obj.updateDynamic("test")(test)
    __obj.asInstanceOf[ContentFilter]
  }
}


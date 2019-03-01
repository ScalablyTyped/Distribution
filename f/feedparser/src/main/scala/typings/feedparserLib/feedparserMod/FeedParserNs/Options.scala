package typings
package feedparserLib.feedparserMod.FeedParserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var MAX_BUFFER_LENGTH: js.UndefOr[scala.Double] = js.undefined
  var addmeta: js.UndefOr[scala.Boolean] = js.undefined
  var feedurl: js.UndefOr[java.lang.String] = js.undefined
  var normalize: js.UndefOr[scala.Boolean] = js.undefined
  var resume_saxerror: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    MAX_BUFFER_LENGTH: scala.Int | scala.Double = null,
    addmeta: js.UndefOr[scala.Boolean] = js.undefined,
    feedurl: java.lang.String = null,
    normalize: js.UndefOr[scala.Boolean] = js.undefined,
    resume_saxerror: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (MAX_BUFFER_LENGTH != null) __obj.updateDynamic("MAX_BUFFER_LENGTH")(MAX_BUFFER_LENGTH.asInstanceOf[js.Any])
    if (!js.isUndefined(addmeta)) __obj.updateDynamic("addmeta")(addmeta)
    if (feedurl != null) __obj.updateDynamic("feedurl")(feedurl)
    if (!js.isUndefined(normalize)) __obj.updateDynamic("normalize")(normalize)
    if (!js.isUndefined(resume_saxerror)) __obj.updateDynamic("resume_saxerror")(resume_saxerror)
    __obj.asInstanceOf[Options]
  }
}


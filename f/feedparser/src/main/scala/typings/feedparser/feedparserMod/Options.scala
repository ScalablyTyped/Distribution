package typings.feedparser.feedparserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var MAX_BUFFER_LENGTH: js.UndefOr[Double] = js.undefined
  var addmeta: js.UndefOr[Boolean] = js.undefined
  var feedurl: js.UndefOr[String] = js.undefined
  var normalize: js.UndefOr[Boolean] = js.undefined
  var resume_saxerror: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    MAX_BUFFER_LENGTH: Int | Double = null,
    addmeta: js.UndefOr[Boolean] = js.undefined,
    feedurl: String = null,
    normalize: js.UndefOr[Boolean] = js.undefined,
    resume_saxerror: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (MAX_BUFFER_LENGTH != null) __obj.updateDynamic("MAX_BUFFER_LENGTH")(MAX_BUFFER_LENGTH.asInstanceOf[js.Any])
    if (!js.isUndefined(addmeta)) __obj.updateDynamic("addmeta")(addmeta.asInstanceOf[js.Any])
    if (feedurl != null) __obj.updateDynamic("feedurl")(feedurl.asInstanceOf[js.Any])
    if (!js.isUndefined(normalize)) __obj.updateDynamic("normalize")(normalize.asInstanceOf[js.Any])
    if (!js.isUndefined(resume_saxerror)) __obj.updateDynamic("resume_saxerror")(resume_saxerror.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}


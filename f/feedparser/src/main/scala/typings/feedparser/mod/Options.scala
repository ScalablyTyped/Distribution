package typings.feedparser.mod

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
    MAX_BUFFER_LENGTH: js.UndefOr[Double] = js.undefined,
    addmeta: js.UndefOr[Boolean] = js.undefined,
    feedurl: String = null,
    normalize: js.UndefOr[Boolean] = js.undefined,
    resume_saxerror: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(MAX_BUFFER_LENGTH)) __obj.updateDynamic("MAX_BUFFER_LENGTH")(MAX_BUFFER_LENGTH.get.asInstanceOf[js.Any])
    if (!js.isUndefined(addmeta)) __obj.updateDynamic("addmeta")(addmeta.get.asInstanceOf[js.Any])
    if (feedurl != null) __obj.updateDynamic("feedurl")(feedurl.asInstanceOf[js.Any])
    if (!js.isUndefined(normalize)) __obj.updateDynamic("normalize")(normalize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(resume_saxerror)) __obj.updateDynamic("resume_saxerror")(resume_saxerror.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}


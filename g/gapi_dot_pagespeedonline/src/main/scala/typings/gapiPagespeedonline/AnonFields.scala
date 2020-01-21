package typings.gapiPagespeedonline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFields extends js.Object {
  /**
    * Selector specifying which fields to include in a partial response.
    */
  var fields: js.UndefOr[String] = js.undefined
  /**
    * The locale that results should be generated in.
    */
  var locale: js.UndefOr[String] = js.undefined
  /**
    * The PageSpeed rules to run. Can be specified multiple times
    */
  var rule: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Indicates if binary data containing a screenshot should be included
    */
  var screenshot: js.UndefOr[Boolean] = js.undefined
  /**
    * The strategy to use when analyzing the page. Valid values are desktop and mobile.
    */
  var stategy: js.UndefOr[String] = js.undefined
  /**
    * The URL of the page for which the PageSpeed Insights API should generate results.
    */
  var url: String
}

object AnonFields {
  @scala.inline
  def apply(
    url: String,
    fields: String = null,
    locale: String = null,
    rule: js.Array[String] = null,
    screenshot: js.UndefOr[Boolean] = js.undefined,
    stategy: String = null
  ): AnonFields = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (rule != null) __obj.updateDynamic("rule")(rule.asInstanceOf[js.Any])
    if (!js.isUndefined(screenshot)) __obj.updateDynamic("screenshot")(screenshot.asInstanceOf[js.Any])
    if (stategy != null) __obj.updateDynamic("stategy")(stategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFields]
  }
}


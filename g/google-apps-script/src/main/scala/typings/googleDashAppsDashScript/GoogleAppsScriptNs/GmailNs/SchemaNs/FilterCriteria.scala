package typings.googleDashAppsDashScript.GoogleAppsScriptNs.GmailNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterCriteria extends js.Object {
  var excludeChats: js.UndefOr[Boolean] = js.undefined
  var from: js.UndefOr[String] = js.undefined
  var hasAttachment: js.UndefOr[Boolean] = js.undefined
  var negatedQuery: js.UndefOr[String] = js.undefined
  var query: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var sizeComparison: js.UndefOr[String] = js.undefined
  var subject: js.UndefOr[String] = js.undefined
  var to: js.UndefOr[String] = js.undefined
}

object FilterCriteria {
  @scala.inline
  def apply(
    excludeChats: js.UndefOr[Boolean] = js.undefined,
    from: String = null,
    hasAttachment: js.UndefOr[Boolean] = js.undefined,
    negatedQuery: String = null,
    query: String = null,
    size: Int | Double = null,
    sizeComparison: String = null,
    subject: String = null,
    to: String = null
  ): FilterCriteria = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(excludeChats)) __obj.updateDynamic("excludeChats")(excludeChats)
    if (from != null) __obj.updateDynamic("from")(from)
    if (!js.isUndefined(hasAttachment)) __obj.updateDynamic("hasAttachment")(hasAttachment)
    if (negatedQuery != null) __obj.updateDynamic("negatedQuery")(negatedQuery)
    if (query != null) __obj.updateDynamic("query")(query)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (sizeComparison != null) __obj.updateDynamic("sizeComparison")(sizeComparison)
    if (subject != null) __obj.updateDynamic("subject")(subject)
    if (to != null) __obj.updateDynamic("to")(to)
    __obj.asInstanceOf[FilterCriteria]
  }
}


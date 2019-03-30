package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterCriteria extends js.Object {
  var excludeChats: js.UndefOr[scala.Boolean] = js.undefined
  var from: js.UndefOr[java.lang.String] = js.undefined
  var hasAttachment: js.UndefOr[scala.Boolean] = js.undefined
  var negatedQuery: js.UndefOr[java.lang.String] = js.undefined
  var query: js.UndefOr[java.lang.String] = js.undefined
  var size: js.UndefOr[scala.Double] = js.undefined
  var sizeComparison: js.UndefOr[java.lang.String] = js.undefined
  var subject: js.UndefOr[java.lang.String] = js.undefined
  var to: js.UndefOr[java.lang.String] = js.undefined
}

object FilterCriteria {
  @scala.inline
  def apply(
    excludeChats: js.UndefOr[scala.Boolean] = js.undefined,
    from: java.lang.String = null,
    hasAttachment: js.UndefOr[scala.Boolean] = js.undefined,
    negatedQuery: java.lang.String = null,
    query: java.lang.String = null,
    size: scala.Int | scala.Double = null,
    sizeComparison: java.lang.String = null,
    subject: java.lang.String = null,
    to: java.lang.String = null
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


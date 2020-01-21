package typings.googleAppsScript.GoogleAppsScript.Sites

import typings.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageAdvancedParameters extends js.Object {
  /** whether to include deleted pages (default false) */
  var includeDeleted: js.UndefOr[Boolean] = js.undefined
  /** whether to include draft pages (default false) */
  var includeDrafts: js.UndefOr[Boolean] = js.undefined
  /** the max number of results (default 200) */
  var max: js.UndefOr[Integer] = js.undefined
  /** only return pages matching this query */
  var search: js.UndefOr[String] = js.undefined
  /** start the results here */
  var start: js.UndefOr[Integer] = js.undefined
  /** only get pages of this type */
  var `type`: js.UndefOr[js.Array[PageType]] = js.undefined
}

object PageAdvancedParameters {
  @scala.inline
  def apply(
    includeDeleted: js.UndefOr[Boolean] = js.undefined,
    includeDrafts: js.UndefOr[Boolean] = js.undefined,
    max: Int | Double = null,
    search: String = null,
    start: Int | Double = null,
    `type`: js.Array[PageType] = null
  ): PageAdvancedParameters = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeDeleted)) __obj.updateDynamic("includeDeleted")(includeDeleted.asInstanceOf[js.Any])
    if (!js.isUndefined(includeDrafts)) __obj.updateDynamic("includeDrafts")(includeDrafts.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (search != null) __obj.updateDynamic("search")(search.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageAdvancedParameters]
  }
}


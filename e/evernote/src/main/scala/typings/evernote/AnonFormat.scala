package typings.evernote

import typings.evernote.mod.Types.Guid
import typings.evernote.mod.Types.QueryFormat
import typings.evernote.mod.Types.SavedSearchScope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFormat extends js.Object {
  var format: js.UndefOr[QueryFormat] = js.undefined
  var guid: js.UndefOr[Guid] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var query: js.UndefOr[String] = js.undefined
  var scope: js.UndefOr[SavedSearchScope] = js.undefined
  var updateSequenceNum: js.UndefOr[Double] = js.undefined
}

object AnonFormat {
  @scala.inline
  def apply(
    format: QueryFormat = null,
    guid: Guid = null,
    name: String = null,
    query: String = null,
    scope: SavedSearchScope = null,
    updateSequenceNum: Int | Double = null
  ): AnonFormat = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (guid != null) __obj.updateDynamic("guid")(guid.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (updateSequenceNum != null) __obj.updateDynamic("updateSequenceNum")(updateSequenceNum.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFormat]
  }
}


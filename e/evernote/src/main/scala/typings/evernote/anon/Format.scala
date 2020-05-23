package typings.evernote.anon

import typings.evernote.mod.Types.QueryFormat
import typings.evernote.mod.Types.SavedSearchScope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Format extends js.Object {
  var format: js.UndefOr[QueryFormat] = js.undefined
  var guid: js.UndefOr[typings.evernote.mod.Types.Guid] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var query: js.UndefOr[String] = js.undefined
  var scope: js.UndefOr[SavedSearchScope] = js.undefined
  var updateSequenceNum: js.UndefOr[Double] = js.undefined
}

object Format {
  @scala.inline
  def apply(
    format: QueryFormat = null,
    guid: typings.evernote.mod.Types.Guid = null,
    name: String = null,
    query: String = null,
    scope: SavedSearchScope = null,
    updateSequenceNum: js.UndefOr[Double] = js.undefined
  ): Format = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (guid != null) __obj.updateDynamic("guid")(guid.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (!js.isUndefined(updateSequenceNum)) __obj.updateDynamic("updateSequenceNum")(updateSequenceNum.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Format]
  }
}


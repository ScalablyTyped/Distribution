package typings.evernote

import typings.evernote.evernoteMod.Evernote.QueryFormat
import typings.evernote.evernoteMod.Evernote.SavedSearchScope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Format extends js.Object {
  var format: js.UndefOr[QueryFormat] = js.undefined
  var guid: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var query: js.UndefOr[String] = js.undefined
  var scope: js.UndefOr[SavedSearchScope] = js.undefined
  var updateSequenceNum: js.UndefOr[Double] = js.undefined
}

object Anon_Format {
  @scala.inline
  def apply(
    format: QueryFormat = null,
    guid: String = null,
    name: String = null,
    query: String = null,
    scope: SavedSearchScope = null,
    updateSequenceNum: Int | Double = null
  ): Anon_Format = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (guid != null) __obj.updateDynamic("guid")(guid.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (updateSequenceNum != null) __obj.updateDynamic("updateSequenceNum")(updateSequenceNum.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Format]
  }
}


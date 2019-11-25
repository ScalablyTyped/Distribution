package typings.googleDashAppsDashScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchResult extends js.Object {
  var etag: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[ResourceId] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var snippet: js.UndefOr[SearchResultSnippet] = js.undefined
}

object SearchResult {
  @scala.inline
  def apply(
    etag: String = null,
    id: ResourceId = null,
    kind: String = null,
    snippet: SearchResultSnippet = null
  ): SearchResult = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (snippet != null) __obj.updateDynamic("snippet")(snippet.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResult]
  }
}


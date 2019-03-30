package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeUnderscoreV3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchResult extends js.Object {
  var etag: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[ResourceId] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var snippet: js.UndefOr[SearchResultSnippet] = js.undefined
}

object SearchResult {
  @scala.inline
  def apply(
    etag: java.lang.String = null,
    id: ResourceId = null,
    kind: java.lang.String = null,
    snippet: SearchResultSnippet = null
  ): SearchResult = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (snippet != null) __obj.updateDynamic("snippet")(snippet)
    __obj.asInstanceOf[SearchResult]
  }
}


package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DriveNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileList extends js.Object {
  var etag: js.UndefOr[String] = js.undefined
  var incompleteSearch: js.UndefOr[Boolean] = js.undefined
  var items: js.UndefOr[
    js.Array[typings.googleDashAppsDashScript.GoogleAppsScriptNs.DriveNs.SchemaNs.File]
  ] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var nextLink: js.UndefOr[String] = js.undefined
  var nextPageToken: js.UndefOr[String] = js.undefined
  var selfLink: js.UndefOr[String] = js.undefined
}

object FileList {
  @scala.inline
  def apply(
    etag: String = null,
    incompleteSearch: js.UndefOr[Boolean] = js.undefined,
    items: js.Array[typings.googleDashAppsDashScript.GoogleAppsScriptNs.DriveNs.SchemaNs.File] = null,
    kind: String = null,
    nextLink: String = null,
    nextPageToken: String = null,
    selfLink: String = null
  ): FileList = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (!js.isUndefined(incompleteSearch)) __obj.updateDynamic("incompleteSearch")(incompleteSearch)
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextLink != null) __obj.updateDynamic("nextLink")(nextLink)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    __obj.asInstanceOf[FileList]
  }
}


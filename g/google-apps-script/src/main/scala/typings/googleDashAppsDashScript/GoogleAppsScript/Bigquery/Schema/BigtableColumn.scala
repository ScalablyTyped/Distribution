package typings.googleDashAppsDashScript.GoogleAppsScript.Bigquery.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BigtableColumn extends js.Object {
  var encoding: js.UndefOr[String] = js.undefined
  var fieldName: js.UndefOr[String] = js.undefined
  var onlyReadLatest: js.UndefOr[Boolean] = js.undefined
  var qualifierEncoded: js.UndefOr[String] = js.undefined
  var qualifierString: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object BigtableColumn {
  @scala.inline
  def apply(
    encoding: String = null,
    fieldName: String = null,
    onlyReadLatest: js.UndefOr[Boolean] = js.undefined,
    qualifierEncoded: String = null,
    qualifierString: String = null,
    `type`: String = null
  ): BigtableColumn = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (fieldName != null) __obj.updateDynamic("fieldName")(fieldName.asInstanceOf[js.Any])
    if (!js.isUndefined(onlyReadLatest)) __obj.updateDynamic("onlyReadLatest")(onlyReadLatest.asInstanceOf[js.Any])
    if (qualifierEncoded != null) __obj.updateDynamic("qualifierEncoded")(qualifierEncoded.asInstanceOf[js.Any])
    if (qualifierString != null) __obj.updateDynamic("qualifierString")(qualifierString.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BigtableColumn]
  }
}


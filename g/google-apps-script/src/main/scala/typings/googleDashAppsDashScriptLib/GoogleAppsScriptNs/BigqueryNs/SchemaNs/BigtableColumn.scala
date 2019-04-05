package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.BigqueryNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BigtableColumn extends js.Object {
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  var fieldName: js.UndefOr[java.lang.String] = js.undefined
  var onlyReadLatest: js.UndefOr[scala.Boolean] = js.undefined
  var qualifierEncoded: js.UndefOr[java.lang.String] = js.undefined
  var qualifierString: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object BigtableColumn {
  @scala.inline
  def apply(
    encoding: java.lang.String = null,
    fieldName: java.lang.String = null,
    onlyReadLatest: js.UndefOr[scala.Boolean] = js.undefined,
    qualifierEncoded: java.lang.String = null,
    qualifierString: java.lang.String = null,
    `type`: java.lang.String = null
  ): BigtableColumn = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (fieldName != null) __obj.updateDynamic("fieldName")(fieldName)
    if (!js.isUndefined(onlyReadLatest)) __obj.updateDynamic("onlyReadLatest")(onlyReadLatest)
    if (qualifierEncoded != null) __obj.updateDynamic("qualifierEncoded")(qualifierEncoded)
    if (qualifierString != null) __obj.updateDynamic("qualifierString")(qualifierString)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[BigtableColumn]
  }
}


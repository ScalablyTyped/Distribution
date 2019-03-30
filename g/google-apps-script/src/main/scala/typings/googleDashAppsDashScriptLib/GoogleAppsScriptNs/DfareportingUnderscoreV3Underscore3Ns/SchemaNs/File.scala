package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingUnderscoreV3Underscore3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait File extends js.Object {
  var dateRange: js.UndefOr[DateRange] = js.undefined
  var etag: js.UndefOr[java.lang.String] = js.undefined
  var fileName: js.UndefOr[java.lang.String] = js.undefined
  var format: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var lastModifiedTime: js.UndefOr[java.lang.String] = js.undefined
  var reportId: js.UndefOr[java.lang.String] = js.undefined
  var status: js.UndefOr[java.lang.String] = js.undefined
  var urls: js.UndefOr[FileUrls] = js.undefined
}

object File {
  @scala.inline
  def apply(
    dateRange: DateRange = null,
    etag: java.lang.String = null,
    fileName: java.lang.String = null,
    format: java.lang.String = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    lastModifiedTime: java.lang.String = null,
    reportId: java.lang.String = null,
    status: java.lang.String = null,
    urls: FileUrls = null
  ): File = {
    val __obj = js.Dynamic.literal()
    if (dateRange != null) __obj.updateDynamic("dateRange")(dateRange)
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (fileName != null) __obj.updateDynamic("fileName")(fileName)
    if (format != null) __obj.updateDynamic("format")(format)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (lastModifiedTime != null) __obj.updateDynamic("lastModifiedTime")(lastModifiedTime)
    if (reportId != null) __obj.updateDynamic("reportId")(reportId)
    if (status != null) __obj.updateDynamic("status")(status)
    if (urls != null) __obj.updateDynamic("urls")(urls)
    __obj.asInstanceOf[File]
  }
}


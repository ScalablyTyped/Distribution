package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait File extends js.Object {
  /** The date range for which the file has report data. The date range will always be the absolute date range for which the report is run. */
  var dateRange: js.UndefOr[DateRange] = js.undefined
  /** The eTag of this response for caching purposes. */
  var etag: js.UndefOr[java.lang.String] = js.undefined
  /** The filename of the file. */
  var fileName: js.UndefOr[java.lang.String] = js.undefined
  /** The output format of the report. Only available once the file is available. */
  var format: js.UndefOr[java.lang.String] = js.undefined
  /** The unique ID of this report file. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** The kind of resource this is, in this case dfareporting#file. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The timestamp in milliseconds since epoch when this file was last modified. */
  var lastModifiedTime: js.UndefOr[java.lang.String] = js.undefined
  /** The ID of the report this file was generated from. */
  var reportId: js.UndefOr[java.lang.String] = js.undefined
  /** The status of the report file. */
  var status: js.UndefOr[java.lang.String] = js.undefined
  /** The URLs where the completed report file can be downloaded. */
  var urls: js.UndefOr[gapiDotClientDotDfareportingLib.Anon_ApiUrl] = js.undefined
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
    urls: gapiDotClientDotDfareportingLib.Anon_ApiUrl = null
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


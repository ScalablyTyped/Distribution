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
  var urls: js.UndefOr[gapiDotClientDotDfareportingLib.Anon_BrowserUrl] = js.undefined
}


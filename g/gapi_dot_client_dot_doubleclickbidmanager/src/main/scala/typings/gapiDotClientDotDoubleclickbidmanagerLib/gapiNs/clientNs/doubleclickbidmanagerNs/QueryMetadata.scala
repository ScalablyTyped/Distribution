package typings
package gapiDotClientDotDoubleclickbidmanagerLib.gapiNs.clientNs.doubleclickbidmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait QueryMetadata extends js.Object {
  /** Range of report data. */
  var dataRange: js.UndefOr[java.lang.String] = js.undefined
  /** Format of the generated report. */
  var format: js.UndefOr[java.lang.String] = js.undefined
  /** The path to the location in Google Cloud Storage where the latest report is stored. */
  var googleCloudStoragePathForLatestReport: js.UndefOr[java.lang.String] = js.undefined
  /** The path in Google Drive for the latest report. */
  var googleDrivePathForLatestReport: js.UndefOr[java.lang.String] = js.undefined
  /** The time when the latest report started to run. */
  var latestReportRunTimeMs: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Locale of the generated reports. Valid values are cs CZECH de GERMAN en ENGLISH es SPANISH fr FRENCH it ITALIAN ja JAPANESE ko KOREAN pl POLISH pt-BR
               * BRAZILIAN_PORTUGUESE ru RUSSIAN tr TURKISH uk UKRAINIAN zh-CN CHINA_CHINESE zh-TW TAIWAN_CHINESE
               *
               * An locale string not in the list above will generate reports in English.
               */
  var locale: js.UndefOr[java.lang.String] = js.undefined
  /** Number of reports that have been generated for the query. */
  var reportCount: js.UndefOr[scala.Double] = js.undefined
  /** Whether the latest report is currently running. */
  var running: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether to send an email notification when a report is ready. Default to false. */
  var sendNotification: js.UndefOr[scala.Boolean] = js.undefined
  /** List of email addresses which are sent email notifications when the report is finished. Separate from sendNotification. */
  var shareEmailAddress: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Query title. It is used to name the reports generated from this query. */
  var title: js.UndefOr[java.lang.String] = js.undefined
}


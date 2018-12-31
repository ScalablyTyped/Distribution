package typings
package gapiDotClientDotAnalyticsLib.gapiNs.clientNs.analyticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnsampledReport extends js.Object {
  /** Account ID to which this unsampled report belongs. */
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  /** Download details for a file stored in Google Cloud Storage. */
  var cloudStorageDownloadDetails: js.UndefOr[gapiDotClientDotAnalyticsLib.Anon_BucketId] = js.undefined
  /** Time this unsampled report was created. */
  var created: js.UndefOr[java.lang.String] = js.undefined
  /** The dimensions for the unsampled report. */
  var dimensions: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The type of download you need to use for the report data file. Possible values include `GOOGLE_DRIVE` and `GOOGLE_CLOUD_STORAGE`. If the value is
    * `GOOGLE_DRIVE`, see the `driveDownloadDetails` field. If the value is `GOOGLE_CLOUD_STORAGE`, see the `cloudStorageDownloadDetails` field.
    */
  var downloadType: js.UndefOr[java.lang.String] = js.undefined
  /** Download details for a file stored in Google Drive. */
  var driveDownloadDetails: js.UndefOr[gapiDotClientDotAnalyticsLib.Anon_DocumentId] = js.undefined
  /** The end date for the unsampled report. */
  var `end-date`: js.UndefOr[java.lang.String] = js.undefined
  /** The filters for the unsampled report. */
  var filters: js.UndefOr[java.lang.String] = js.undefined
  /** Unsampled report ID. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Resource type for an Analytics unsampled report. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The metrics for the unsampled report. */
  var metrics: js.UndefOr[java.lang.String] = js.undefined
  /** View (Profile) ID to which this unsampled report belongs. */
  var profileId: js.UndefOr[java.lang.String] = js.undefined
  /** The segment for the unsampled report. */
  var segment: js.UndefOr[java.lang.String] = js.undefined
  /** Link for this unsampled report. */
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
  /** The start date for the unsampled report. */
  var `start-date`: js.UndefOr[java.lang.String] = js.undefined
  /** Status of this unsampled report. Possible values are PENDING, COMPLETED, or FAILED. */
  var status: js.UndefOr[java.lang.String] = js.undefined
  /** Title of the unsampled report. */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /** Time this unsampled report was last modified. */
  var updated: js.UndefOr[java.lang.String] = js.undefined
  /** Web property ID to which this unsampled report belongs. The web property ID is of the form UA-XXXXX-YY. */
  var webPropertyId: js.UndefOr[java.lang.String] = js.undefined
}


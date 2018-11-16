package typings
package gapiDotClientDotBigquerydatatransferLib.gapiNs.clientNs.bigquerydatatransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TransferRun extends js.Object {
  /** Output only. Data source id. */
  var dataSourceId: js.UndefOr[java.lang.String] = js.undefined
  /** Output only. Region in which BigQuery dataset is located. */
  var datasetRegion: js.UndefOr[java.lang.String] = js.undefined
  /** The BigQuery target dataset id. */
  var destinationDatasetId: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Output only. Time when transfer run ended.
               * Parameter ignored by server for input requests.
               */
  var endTime: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The resource name of the transfer run.
               * Transfer run names have the form
               * `projects/{project_id}/locations/{location}/transferConfigs/{config_id}/runs/{run_id}`.
               * The name is ignored when creating a transfer run.
               */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Data transfer specific parameters. */
  var params: js.UndefOr[stdLib.Record[java.lang.String, _]] = js.undefined
  /**
               * For batch transfer runs, specifies the date and time that
               * data should be ingested.
               */
  var runTime: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Output only. Describes the schedule of this transfer run if it was
               * created as part of a regular schedule. For batch transfer runs that are
               * scheduled manually, this is empty.
               * NOTE: the system might choose to delay the schedule depending on the
               * current load, so `schedule_time` doesn't always matches this.
               */
  var schedule: js.UndefOr[java.lang.String] = js.undefined
  /** Minimum time after which a transfer run can be started. */
  var scheduleTime: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Output only. Time when transfer run was started.
               * Parameter ignored by server for input requests.
               */
  var startTime: js.UndefOr[java.lang.String] = js.undefined
  /** Output only. Data transfer run state. Ignored for input requests. */
  var state: js.UndefOr[java.lang.String] = js.undefined
  /** Output only. Last time the data transfer run state was updated. */
  var updateTime: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Output only. Unique ID of the user on whose behalf transfer is done.
               * Applicable only to data sources that do not support service accounts.
               * When set to 0, the data source service account credentials are used.
               */
  var userId: js.UndefOr[java.lang.String] = js.undefined
}


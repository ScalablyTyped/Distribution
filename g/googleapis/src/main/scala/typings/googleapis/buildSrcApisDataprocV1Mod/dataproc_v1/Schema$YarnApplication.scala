package typings.googleapis.buildSrcApisDataprocV1Mod.dataproc_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A YARN application created by a job. Application information is a subset of
  * &lt;code&gt;org.apache.hadoop.yarn.proto.YarnProtos.ApplicationReportProto&lt;/code&gt;.Beta
  * Feature: This report is available for testing purposes only. It may be
  * changed before final release.
  */
@js.native
trait Schema$YarnApplication extends js.Object {
  /**
    * Required. The application name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Required. The numerical progress of the application, from 1 to 100.
    */
  var progress: js.UndefOr[Double] = js.native
  /**
    * Required. The application state.
    */
  var state: js.UndefOr[String] = js.native
  /**
    * Optional. The HTTP URL of the ApplicationMaster, HistoryServer, or
    * TimelineServer that provides application-specific information. The URL
    * uses the internal hostname, and requires a proxy server for resolution
    * and, possibly, access.
    */
  var trackingUrl: js.UndefOr[String] = js.native
}

object Schema$YarnApplication {
  @scala.inline
  def apply(
    name: String = null,
    progress: Int | Double = null,
    state: String = null,
    trackingUrl: String = null
  ): Schema$YarnApplication = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (progress != null) __obj.updateDynamic("progress")(progress.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (trackingUrl != null) __obj.updateDynamic("trackingUrl")(trackingUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$YarnApplication]
  }
}


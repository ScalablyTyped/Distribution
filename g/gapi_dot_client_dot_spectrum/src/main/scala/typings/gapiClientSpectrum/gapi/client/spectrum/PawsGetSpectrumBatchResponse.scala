package typings.gapiClientSpectrum.gapi.client.spectrum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PawsGetSpectrumBatchResponse extends js.Object {
  /**
    * A database may include the databaseChange parameter to notify a device of a change to its database URI, providing one or more alternate database URIs.
    * The device should use this information to update its list of pre-configured databases by (only) replacing its entry for the responding database with
    * the list of alternate URIs.
    */
  var databaseChange: js.UndefOr[DbUpdateSpec] = js.native
  /**
    * The database must return in its available spectrum response the device descriptor information it received in the master device's available spectrum
    * batch request.
    */
  var deviceDesc: js.UndefOr[DeviceDescriptor] = js.native
  /**
    * The available spectrum batch response must contain a geo-spectrum schedule list, The list may be empty if spectrum is not available. The database may
    * return more than one geo-spectrum schedule to represent future changes to the available spectrum. How far in advance a schedule may be provided depends
    * upon the applicable regulatory domain. The database may return available spectrum for fewer geolocations than requested. The device must not make
    * assumptions about the order of the entries in the list, and must use the geolocation value in each geo-spectrum schedule entry to match available
    * spectrum to a location.
    */
  var geoSpectrumSchedules: js.UndefOr[js.Array[GeoSpectrumSchedule]] = js.native
  /** Identifies what kind of resource this is. Value: the fixed string "spectrum#pawsGetSpectrumBatchResponse". */
  var kind: js.UndefOr[String] = js.native
  /**
    * The database may return a constraint on the allowed maximum contiguous bandwidth (in Hertz). A regulatory domain may require the database to return
    * this parameter. When this parameter is present in the response, the device must apply this constraint to its spectrum-selection logic to ensure that no
    * single block of spectrum has bandwidth that exceeds this value.
    */
  var maxContiguousBwHz: js.UndefOr[Double] = js.native
  /**
    * The database may return a constraint on the allowed maximum total bandwidth (in Hertz), which does not need to be contiguous. A regulatory domain may
    * require the database to return this parameter. When this parameter is present in the available spectrum batch response, the device must apply this
    * constraint to its spectrum-selection logic to ensure that total bandwidth does not exceed this value.
    */
  var maxTotalBwHz: js.UndefOr[Double] = js.native
  /**
    * For regulatory domains that require a spectrum-usage report from devices, the database must return true for this parameter if the geo-spectrum
    * schedules list is not empty; otherwise, the database should either return false or omit this parameter. If this parameter is present and its value is
    * true, the device must send a spectrum use notify message to the database; otherwise, the device should not send the notification.
    */
  var needsSpectrumReport: js.UndefOr[Boolean] = js.native
  /**
    * The database should return ruleset information, which identifies the applicable regulatory authority and ruleset for the available spectrum batch
    * response. If included, the device must use the corresponding ruleset to interpret the response. Values provided in the returned ruleset information,
    * such as maxLocationChange, take precedence over any conflicting values provided in the ruleset information returned in a prior initialization response
    * sent by the database to the device.
    */
  var rulesetInfo: js.UndefOr[RulesetInfo] = js.native
  /**
    * The database includes a timestamp of the form, YYYY-MM-DDThh:mm:ssZ (Internet timestamp format per RFC3339), in its available spectrum batch response.
    * The timestamp should be used by the device as a reference for the start and stop times specified in the response spectrum schedules.
    */
  var timestamp: js.UndefOr[String] = js.native
  /**
    * The message type (e.g., INIT_REQ, AVAIL_SPECTRUM_REQ, ...).
    *
    * Required field.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * The PAWS version. Must be exactly 1.0.
    *
    * Required field.
    */
  var version: js.UndefOr[String] = js.native
}

object PawsGetSpectrumBatchResponse {
  @scala.inline
  def apply(): PawsGetSpectrumBatchResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PawsGetSpectrumBatchResponse]
  }
  @scala.inline
  implicit class PawsGetSpectrumBatchResponseOps[Self <: PawsGetSpectrumBatchResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDatabaseChange(value: DbUpdateSpec): Self = this.set("databaseChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatabaseChange: Self = this.set("databaseChange", js.undefined)
    @scala.inline
    def setDeviceDesc(value: DeviceDescriptor): Self = this.set("deviceDesc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceDesc: Self = this.set("deviceDesc", js.undefined)
    @scala.inline
    def setGeoSpectrumSchedulesVarargs(value: GeoSpectrumSchedule*): Self = this.set("geoSpectrumSchedules", js.Array(value :_*))
    @scala.inline
    def setGeoSpectrumSchedules(value: js.Array[GeoSpectrumSchedule]): Self = this.set("geoSpectrumSchedules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGeoSpectrumSchedules: Self = this.set("geoSpectrumSchedules", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setMaxContiguousBwHz(value: Double): Self = this.set("maxContiguousBwHz", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxContiguousBwHz: Self = this.set("maxContiguousBwHz", js.undefined)
    @scala.inline
    def setMaxTotalBwHz(value: Double): Self = this.set("maxTotalBwHz", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxTotalBwHz: Self = this.set("maxTotalBwHz", js.undefined)
    @scala.inline
    def setNeedsSpectrumReport(value: Boolean): Self = this.set("needsSpectrumReport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNeedsSpectrumReport: Self = this.set("needsSpectrumReport", js.undefined)
    @scala.inline
    def setRulesetInfo(value: RulesetInfo): Self = this.set("rulesetInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRulesetInfo: Self = this.set("rulesetInfo", js.undefined)
    @scala.inline
    def setTimestamp(value: String): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimestamp: Self = this.set("timestamp", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}


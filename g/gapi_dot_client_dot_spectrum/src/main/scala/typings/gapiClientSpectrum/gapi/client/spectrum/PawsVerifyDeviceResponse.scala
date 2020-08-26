package typings.gapiClientSpectrum.gapi.client.spectrum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PawsVerifyDeviceResponse extends js.Object {
  /**
    * A database may include the databaseChange parameter to notify a device of a change to its database URI, providing one or more alternate database URIs.
    * The device should use this information to update its list of pre-configured databases by (only) replacing its entry for the responding database with
    * the list of alternate URIs.
    */
  var databaseChange: js.UndefOr[DbUpdateSpec] = js.native
  /**
    * A device validities list is required in the device validation response to report whether each slave device listed in a previous device validation
    * request is valid. The number of entries must match the number of device descriptors listed in the previous device validation request.
    */
  var deviceValidities: js.UndefOr[js.Array[DeviceValidity]] = js.native
  /** Identifies what kind of resource this is. Value: the fixed string "spectrum#pawsVerifyDeviceResponse". */
  var kind: js.UndefOr[String] = js.native
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

object PawsVerifyDeviceResponse {
  @scala.inline
  def apply(): PawsVerifyDeviceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PawsVerifyDeviceResponse]
  }
  @scala.inline
  implicit class PawsVerifyDeviceResponseOps[Self <: PawsVerifyDeviceResponse] (val x: Self) extends AnyVal {
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
    def setDeviceValiditiesVarargs(value: DeviceValidity*): Self = this.set("deviceValidities", js.Array(value :_*))
    @scala.inline
    def setDeviceValidities(value: js.Array[DeviceValidity]): Self = this.set("deviceValidities", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceValidities: Self = this.set("deviceValidities", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
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


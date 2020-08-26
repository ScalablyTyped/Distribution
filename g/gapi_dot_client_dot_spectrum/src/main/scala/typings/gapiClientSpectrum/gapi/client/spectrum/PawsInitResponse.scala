package typings.gapiClientSpectrum.gapi.client.spectrum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PawsInitResponse extends js.Object {
  /**
    * A database may include the databaseChange parameter to notify a device of a change to its database URI, providing one or more alternate database URIs.
    * The device should use this information to update its list of pre-configured databases by (only) replacing its entry for the responding database with
    * the list of alternate URIs.
    */
  var databaseChange: js.UndefOr[DbUpdateSpec] = js.native
  /** Identifies what kind of resource this is. Value: the fixed string "spectrum#pawsInitResponse". */
  var kind: js.UndefOr[String] = js.native
  /**
    * The rulesetInfo parameter must be included in the response. This parameter specifies the regulatory domain and parameters applicable to that domain.
    * The database must include the authority field, which defines the regulatory domain for the location specified in the INIT_REQ message.
    */
  var rulesetInfo: js.UndefOr[RulesetInfo] = js.native
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

object PawsInitResponse {
  @scala.inline
  def apply(): PawsInitResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PawsInitResponse]
  }
  @scala.inline
  implicit class PawsInitResponseOps[Self <: PawsInitResponse] (val x: Self) extends AnyVal {
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setRulesetInfo(value: RulesetInfo): Self = this.set("rulesetInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRulesetInfo: Self = this.set("rulesetInfo", js.undefined)
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


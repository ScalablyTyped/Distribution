package typings.gapiDotClientDotCivicinfo.gapi.client.civicinfo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdministrationRegion extends js.Object {
  /** The election administration body for this area. */
  var electionAdministrationBody: js.UndefOr[AdministrativeBody] = js.undefined
  /**
    * An ID for this object. IDs may change in future requests and should not be cached. Access to this field requires special access that can be requested
    * from the Request more link on the Quotas page.
    */
  var id: js.UndefOr[String] = js.undefined
  /** The city or county that provides election information for this voter. This object can have the same elements as state. */
  var local_jurisdiction: js.UndefOr[AdministrationRegion] = js.undefined
  /** The name of the jurisdiction. */
  var name: js.UndefOr[String] = js.undefined
  /** A list of sources for this area. If multiple sources are listed the data has been aggregated from those sources. */
  var sources: js.UndefOr[js.Array[Source]] = js.undefined
}

object AdministrationRegion {
  @scala.inline
  def apply(
    electionAdministrationBody: AdministrativeBody = null,
    id: String = null,
    local_jurisdiction: AdministrationRegion = null,
    name: String = null,
    sources: js.Array[Source] = null
  ): AdministrationRegion = {
    val __obj = js.Dynamic.literal()
    if (electionAdministrationBody != null) __obj.updateDynamic("electionAdministrationBody")(electionAdministrationBody.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (local_jurisdiction != null) __obj.updateDynamic("local_jurisdiction")(local_jurisdiction.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (sources != null) __obj.updateDynamic("sources")(sources.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdministrationRegion]
  }
}


package typings.fhirDashJsDashClient.FHIR.SMART

import typings.fhirDashJsDashClient.Anon_At
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistoryParams extends CommonQueryFilters {
  /**
    * Resource ID,  if the history to be fetched is resource specific.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * Type of the resource,  if the history to be fetched is resource specific.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object HistoryParams {
  @scala.inline
  def apply(
    count: Int | Double = null,
    id: String = null,
    params: Anon_At = null,
    since: String = null,
    `type`: String = null
  ): HistoryParams = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (since != null) __obj.updateDynamic("since")(since.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistoryParams]
  }
}


package typings
package fhirDashJsDashClientLib.FHIRNs.SMARTNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistoryParams extends CommonQueryFilters {
  /**
    * Resource ID,  if the history to be fetched is resource specific.
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Type of the resource,  if the history to be fetched is resource specific.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object HistoryParams {
  @scala.inline
  def apply(
    count: scala.Int | scala.Double = null,
    id: java.lang.String = null,
    params: fhirDashJsDashClientLib.Anon_At = null,
    since: java.lang.String = null,
    `type`: java.lang.String = null
  ): HistoryParams = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (params != null) __obj.updateDynamic("params")(params)
    if (since != null) __obj.updateDynamic("since")(since)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[HistoryParams]
  }
}


package typings.fhirJsClient.FHIR.SMART

import typings.fhirJsClient.anon.DictpropName
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
    count: js.UndefOr[Double] = js.undefined,
    id: String = null,
    params: DictpropName = null,
    since: String = null,
    `type`: String = null
  ): HistoryParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(count)) __obj.updateDynamic("count")(count.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (since != null) __obj.updateDynamic("since")(since.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistoryParams]
  }
}


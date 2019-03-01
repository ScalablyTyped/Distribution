package typings
package gapiDotClientDotAdexchangebuyer2Lib.gapiNs.clientNs.adexchangebuyer2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImpressionMetricsResource extends js.Object {
  /** Lists all metrics that are measured in terms of number of impressions. */
  def list(
    request: gapiDotClientDotAdexchangebuyer2Lib.Anon_AccesstokenAccountIdAltBearertokenCallbackFieldsFilterSetId
  ): gapiDotClientLib.gapiNs.clientNs.Request[ListImpressionMetricsResponse]
}

object ImpressionMetricsResource {
  @scala.inline
  def apply(
    list: js.Function1[
      gapiDotClientDotAdexchangebuyer2Lib.Anon_AccesstokenAccountIdAltBearertokenCallbackFieldsFilterSetId, 
      gapiDotClientLib.gapiNs.clientNs.Request[ListImpressionMetricsResponse]
    ]
  ): ImpressionMetricsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(list)
    __obj.asInstanceOf[ImpressionMetricsResource]
  }
}


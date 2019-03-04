package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AcceleratorTypesResource extends js.Object {
  /** Retrieves an aggregated list of accelerator types. */
  def aggregatedList(request: gapiDotClientDotComputeLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[AcceleratorTypeAggregatedList]
  /** Returns the specified accelerator type. Get a list of available accelerator types by making a list() request. */
  def get(request: gapiDotClientDotComputeLib.Anon_AcceleratorType): gapiDotClientLib.gapiNs.clientNs.Request[AcceleratorType]
  /** Retrieves a list of accelerator types available to the specified project. */
  def list(request: gapiDotClientDotComputeLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[AcceleratorTypeList]
}

object AcceleratorTypesResource {
  @scala.inline
  def apply(
    aggregatedList: js.Function1[
      gapiDotClientDotComputeLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[AcceleratorTypeAggregatedList]
    ],
    get: js.Function1[
      gapiDotClientDotComputeLib.Anon_AcceleratorType, 
      gapiDotClientLib.gapiNs.clientNs.Request[AcceleratorType]
    ],
    list: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[AcceleratorTypeList]
    ]
  ): AcceleratorTypesResource = {
    val __obj = js.Dynamic.literal(aggregatedList = aggregatedList, get = get, list = list)
  
    __obj.asInstanceOf[AcceleratorTypesResource]
  }
}


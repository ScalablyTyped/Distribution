package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AcceleratorTypesResource extends js.Object {
  /** Retrieves an aggregated list of accelerator types. */
  def aggregatedList(request: gapiDotClientDotComputeLib.Anon_Project): gapiDotClientLib.gapiNs.clientNs.Request[AcceleratorTypeAggregatedList]
  /** Returns the specified accelerator type. Get a list of available accelerator types by making a list() request. */
  def get(
    request: gapiDotClientDotComputeLib.Anon_ProjectPrettyPrintQuotaUserKeyUserIpOauthtokenAltFieldsAcceleratorType
  ): gapiDotClientLib.gapiNs.clientNs.Request[AcceleratorType]
  /** Retrieves a list of accelerator types available to the specified project. */
  def list(request: gapiDotClientDotComputeLib.Anon_ProjectMaxResults): gapiDotClientLib.gapiNs.clientNs.Request[AcceleratorTypeList]
}


package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DiskTypesResource extends js.Object {
  /** Retrieves an aggregated list of disk types. */
  def aggregatedList(request: gapiDotClientDotComputeLib.Anon_Project): gapiDotClientLib.gapiNs.clientNs.Request[DiskTypeAggregatedList]
  /** Returns the specified disk type. Get a list of available disk types by making a list() request. */
  def get(
    request: gapiDotClientDotComputeLib.Anon_ProjectPrettyPrintQuotaUserKeyUserIpOauthtokenAltFieldsDiskType
  ): gapiDotClientLib.gapiNs.clientNs.Request[DiskType]
  /** Retrieves a list of disk types available to the specified project. */
  def list(request: gapiDotClientDotComputeLib.Anon_ProjectMaxResults): gapiDotClientLib.gapiNs.clientNs.Request[DiskTypeList]
}


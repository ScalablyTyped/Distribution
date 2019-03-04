package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiskTypesResource extends js.Object {
  /** Retrieves an aggregated list of disk types. */
  def aggregatedList(request: gapiDotClientDotComputeLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[DiskTypeAggregatedList]
  /** Returns the specified disk type. Get a list of available disk types by making a list() request. */
  def get(request: gapiDotClientDotComputeLib.Anon_AltDiskType): gapiDotClientLib.gapiNs.clientNs.Request[DiskType]
  /** Retrieves a list of disk types available to the specified project. */
  def list(request: gapiDotClientDotComputeLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[DiskTypeList]
}

object DiskTypesResource {
  @scala.inline
  def apply(
    aggregatedList: js.Function1[
      gapiDotClientDotComputeLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[DiskTypeAggregatedList]
    ],
    get: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltDiskType, 
      gapiDotClientLib.gapiNs.clientNs.Request[DiskType]
    ],
    list: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[DiskTypeList]
    ]
  ): DiskTypesResource = {
    val __obj = js.Dynamic.literal(aggregatedList = aggregatedList, get = get, list = list)
  
    __obj.asInstanceOf[DiskTypesResource]
  }
}


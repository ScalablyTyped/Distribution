package typings.gapiDotClientDotCompute.gapiNs.clientNs.computeNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotCompute.Anon_Alt
import typings.gapiDotClientDotCompute.Anon_AltDiskType
import typings.gapiDotClientDotCompute.Anon_AltFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiskTypesResource extends js.Object {
  /** Retrieves an aggregated list of disk types. */
  def aggregatedList(request: Anon_Alt): Request[DiskTypeAggregatedList]
  /** Returns the specified disk type. Get a list of available disk types by making a list() request. */
  def get(request: Anon_AltDiskType): Request[DiskType]
  /** Retrieves a list of disk types available to the specified project. */
  def list(request: Anon_AltFields): Request[DiskTypeList]
}

object DiskTypesResource {
  @scala.inline
  def apply(
    aggregatedList: Anon_Alt => Request[DiskTypeAggregatedList],
    get: Anon_AltDiskType => Request[DiskType],
    list: Anon_AltFields => Request[DiskTypeList]
  ): DiskTypesResource = {
    val __obj = js.Dynamic.literal(aggregatedList = js.Any.fromFunction1(aggregatedList), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[DiskTypesResource]
  }
}


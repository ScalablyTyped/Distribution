package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientCompute.AnonAlt
import typings.gapiClientCompute.AnonDiskType
import typings.gapiClientCompute.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiskTypesResource extends js.Object {
  /** Retrieves an aggregated list of disk types. */
  def aggregatedList(request: AnonAlt): Request_[DiskTypeAggregatedList]
  /** Returns the specified disk type. Get a list of available disk types by making a list() request. */
  def get(request: AnonDiskType): Request_[DiskType]
  /** Retrieves a list of disk types available to the specified project. */
  def list(request: AnonFields): Request_[DiskTypeList]
}

object DiskTypesResource {
  @scala.inline
  def apply(
    aggregatedList: AnonAlt => Request_[DiskTypeAggregatedList],
    get: AnonDiskType => Request_[DiskType],
    list: AnonFields => Request_[DiskTypeList]
  ): DiskTypesResource = {
    val __obj = js.Dynamic.literal(aggregatedList = js.Any.fromFunction1(aggregatedList), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[DiskTypesResource]
  }
}


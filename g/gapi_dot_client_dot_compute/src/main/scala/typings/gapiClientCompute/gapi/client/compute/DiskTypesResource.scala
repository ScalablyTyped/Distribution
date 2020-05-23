package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.gapiClientCompute.anon.Alt
import typings.gapiClientCompute.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiskTypesResource extends js.Object {
  /** Retrieves an aggregated list of disk types. */
  def aggregatedList(request: Alt): Request[DiskTypeAggregatedList]
  /** Returns the specified disk type. Get a list of available disk types by making a list() request. */
  def get(request: typings.gapiClientCompute.anon.DiskType): Request[DiskType]
  /** Retrieves a list of disk types available to the specified project. */
  def list(request: Fields): Request[DiskTypeList]
}

object DiskTypesResource {
  @scala.inline
  def apply(
    aggregatedList: Alt => Request[DiskTypeAggregatedList],
    get: typings.gapiClientCompute.anon.DiskType => Request[DiskType],
    list: Fields => Request[DiskTypeList]
  ): DiskTypesResource = {
    val __obj = js.Dynamic.literal(aggregatedList = js.Any.fromFunction1(aggregatedList), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[DiskTypesResource]
  }
}


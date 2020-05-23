package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.gapiClientCompute.anon.Alt
import typings.gapiClientCompute.anon.Filter
import typings.gapiClientCompute.anon.PrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegionCommitmentsResource extends js.Object {
  /** Retrieves an aggregated list of commitments. */
  def aggregatedList(request: Alt): Request[CommitmentAggregatedList]
  /** Returns the specified commitment resource. Get a list of available commitments by making a list() request. */
  def get(request: typings.gapiClientCompute.anon.Commitment): Request[Commitment]
  /** Creates a commitment in the specified project using the data included in the request. */
  def insert(request: PrettyPrint): Request[Operation]
  /** Retrieves a list of commitments contained within the specified region. */
  def list(request: Filter): Request[CommitmentList]
}

object RegionCommitmentsResource {
  @scala.inline
  def apply(
    aggregatedList: Alt => Request[CommitmentAggregatedList],
    get: typings.gapiClientCompute.anon.Commitment => Request[Commitment],
    insert: PrettyPrint => Request[Operation],
    list: Filter => Request[CommitmentList]
  ): RegionCommitmentsResource = {
    val __obj = js.Dynamic.literal(aggregatedList = js.Any.fromFunction1(aggregatedList), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[RegionCommitmentsResource]
  }
}


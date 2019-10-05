package typings.gapiDotClientDotCompute.gapi.client.compute

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotCompute.Anon_Alt
import typings.gapiDotClientDotCompute.Anon_AltCommitment
import typings.gapiDotClientDotCompute.Anon_AltFieldsFilter
import typings.gapiDotClientDotCompute.Anon_AltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegionCommitmentsResource extends js.Object {
  /** Retrieves an aggregated list of commitments. */
  def aggregatedList(request: Anon_Alt): Request[CommitmentAggregatedList]
  /** Returns the specified commitment resource. Get a list of available commitments by making a list() request. */
  def get(request: Anon_AltCommitment): Request[Commitment]
  /** Creates a commitment in the specified project using the data included in the request. */
  def insert(request: Anon_AltFieldsKey): Request[Operation]
  /** Retrieves a list of commitments contained within the specified region. */
  def list(request: Anon_AltFieldsFilter): Request[CommitmentList]
}

object RegionCommitmentsResource {
  @scala.inline
  def apply(
    aggregatedList: Anon_Alt => Request[CommitmentAggregatedList],
    get: Anon_AltCommitment => Request[Commitment],
    insert: Anon_AltFieldsKey => Request[Operation],
    list: Anon_AltFieldsFilter => Request[CommitmentList]
  ): RegionCommitmentsResource = {
    val __obj = js.Dynamic.literal(aggregatedList = js.Any.fromFunction1(aggregatedList), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[RegionCommitmentsResource]
  }
}


package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientCompute.AnonAlt
import typings.gapiClientCompute.AnonCommitment
import typings.gapiClientCompute.AnonFilter
import typings.gapiClientCompute.AnonPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegionCommitmentsResource extends js.Object {
  /** Retrieves an aggregated list of commitments. */
  def aggregatedList(request: AnonAlt): Request_[CommitmentAggregatedList]
  /** Returns the specified commitment resource. Get a list of available commitments by making a list() request. */
  def get(request: AnonCommitment): Request_[Commitment]
  /** Creates a commitment in the specified project using the data included in the request. */
  def insert(request: AnonPrettyPrint): Request_[Operation]
  /** Retrieves a list of commitments contained within the specified region. */
  def list(request: AnonFilter): Request_[CommitmentList]
}

object RegionCommitmentsResource {
  @scala.inline
  def apply(
    aggregatedList: AnonAlt => Request_[CommitmentAggregatedList],
    get: AnonCommitment => Request_[Commitment],
    insert: AnonPrettyPrint => Request_[Operation],
    list: AnonFilter => Request_[CommitmentList]
  ): RegionCommitmentsResource = {
    val __obj = js.Dynamic.literal(aggregatedList = js.Any.fromFunction1(aggregatedList), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[RegionCommitmentsResource]
  }
}


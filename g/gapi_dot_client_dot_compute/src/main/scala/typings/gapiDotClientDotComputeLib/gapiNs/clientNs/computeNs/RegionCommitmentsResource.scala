package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegionCommitmentsResource extends js.Object {
  /** Retrieves an aggregated list of commitments. */
  def aggregatedList(request: gapiDotClientDotComputeLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[CommitmentAggregatedList]
  /** Returns the specified commitment resource. Get a list of available commitments by making a list() request. */
  def get(request: gapiDotClientDotComputeLib.Anon_AltCommitment): gapiDotClientLib.gapiNs.clientNs.Request[Commitment]
  /** Creates a commitment in the specified project using the data included in the request. */
  def insert(request: gapiDotClientDotComputeLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Retrieves a list of commitments contained within the specified region. */
  def list(request: gapiDotClientDotComputeLib.Anon_AltFieldsFilter): gapiDotClientLib.gapiNs.clientNs.Request[CommitmentList]
}

object RegionCommitmentsResource {
  @scala.inline
  def apply(
    aggregatedList: js.Function1[
      gapiDotClientDotComputeLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[CommitmentAggregatedList]
    ],
    get: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltCommitment, 
      gapiDotClientLib.gapiNs.clientNs.Request[Commitment]
    ],
    insert: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    list: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsFilter, 
      gapiDotClientLib.gapiNs.clientNs.Request[CommitmentList]
    ]
  ): RegionCommitmentsResource = {
    val __obj = js.Dynamic.literal(aggregatedList = aggregatedList, get = get, insert = insert, list = list)
  
    __obj.asInstanceOf[RegionCommitmentsResource]
  }
}


package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait RegionCommitmentsResource extends js.Object {
  /** Retrieves an aggregated list of commitments. */
  def aggregatedList(request: gapiDotClientDotComputeLib.Anon_Project): gapiDotClientLib.gapiNs.clientNs.Request[CommitmentAggregatedList]
  /** Returns the specified commitment resource. Get a list of available commitments by making a list() request. */
  def get(request: gapiDotClientDotComputeLib.Anon_ProjectPrettyPrintQuotaUserKeyCommitment): gapiDotClientLib.gapiNs.clientNs.Request[Commitment]
  /** Creates a commitment in the specified project using the data included in the request. */
  def insert(request: gapiDotClientDotComputeLib.Anon_ProjectPrettyPrintQuotaUserKeyUserIp): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Retrieves a list of commitments contained within the specified region. */
  def list(request: gapiDotClientDotComputeLib.Anon_ProjectMaxResultsPrettyPrintPageToken): gapiDotClientLib.gapiNs.clientNs.Request[CommitmentList]
}


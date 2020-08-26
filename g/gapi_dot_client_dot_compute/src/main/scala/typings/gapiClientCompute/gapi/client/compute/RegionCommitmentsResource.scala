package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.gapiClientCompute.anon.Alt
import typings.gapiClientCompute.anon.Filter
import typings.gapiClientCompute.anon.PrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegionCommitmentsResource extends js.Object {
  /** Retrieves an aggregated list of commitments. */
  def aggregatedList(request: Alt): Request[CommitmentAggregatedList] = js.native
  /** Returns the specified commitment resource. Get a list of available commitments by making a list() request. */
  def get(request: typings.gapiClientCompute.anon.Commitment): Request[Commitment] = js.native
  /** Creates a commitment in the specified project using the data included in the request. */
  def insert(request: PrettyPrint): Request[Operation] = js.native
  /** Retrieves a list of commitments contained within the specified region. */
  def list(request: Filter): Request[CommitmentList] = js.native
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
  @scala.inline
  implicit class RegionCommitmentsResourceOps[Self <: RegionCommitmentsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAggregatedList(value: Alt => Request[CommitmentAggregatedList]): Self = this.set("aggregatedList", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: typings.gapiClientCompute.anon.Commitment => Request[Commitment]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: PrettyPrint => Request[Operation]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Filter => Request[CommitmentList]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}


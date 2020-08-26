package typings.gapiClientDatastore.gapi.client.datastore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RunQueryRequest extends js.Object {
  /** The GQL query to run. */
  var gqlQuery: js.UndefOr[GqlQuery] = js.native
  /**
    * Entities are partitioned into subsets, identified by a partition ID.
    * Queries are scoped to a single partition.
    * This partition ID is normalized with the standard default context
    * partition ID.
    */
  var partitionId: js.UndefOr[PartitionId] = js.native
  /** The query to run. */
  var query: js.UndefOr[Query] = js.native
  /** The options for this query. */
  var readOptions: js.UndefOr[ReadOptions] = js.native
}

object RunQueryRequest {
  @scala.inline
  def apply(): RunQueryRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RunQueryRequest]
  }
  @scala.inline
  implicit class RunQueryRequestOps[Self <: RunQueryRequest] (val x: Self) extends AnyVal {
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
    def setGqlQuery(value: GqlQuery): Self = this.set("gqlQuery", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGqlQuery: Self = this.set("gqlQuery", js.undefined)
    @scala.inline
    def setPartitionId(value: PartitionId): Self = this.set("partitionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePartitionId: Self = this.set("partitionId", js.undefined)
    @scala.inline
    def setQuery(value: Query): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    @scala.inline
    def setReadOptions(value: ReadOptions): Self = this.set("readOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadOptions: Self = this.set("readOptions", js.undefined)
  }
  
}


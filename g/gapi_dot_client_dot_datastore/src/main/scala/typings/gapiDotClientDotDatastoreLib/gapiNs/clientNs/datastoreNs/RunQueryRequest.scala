package typings
package gapiDotClientDotDatastoreLib.gapiNs.clientNs.datastoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunQueryRequest extends js.Object {
  /** The GQL query to run. */
  var gqlQuery: js.UndefOr[GqlQuery] = js.undefined
  /**
    * Entities are partitioned into subsets, identified by a partition ID.
    * Queries are scoped to a single partition.
    * This partition ID is normalized with the standard default context
    * partition ID.
    */
  var partitionId: js.UndefOr[PartitionId] = js.undefined
  /** The query to run. */
  var query: js.UndefOr[Query] = js.undefined
  /** The options for this query. */
  var readOptions: js.UndefOr[ReadOptions] = js.undefined
}


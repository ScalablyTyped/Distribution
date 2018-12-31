package typings
package documentdbLib.documentdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Collection extends UniqueId {
  /** The default time to live in seconds for documents in a collection. */
  var defaultTtl: js.UndefOr[scala.Double] = js.undefined
  /** The indexing policy associated with the collection. */
  var indexingPolicy: js.UndefOr[IndexingPolicy] = js.undefined
  /**
    * This value is used to configure the partition key to be used for partitioning data into multiple partitions.
    *
    * If the x-ms-offer-throughput is over 10,000, then the collection must include a partitionKey definition.
    *
    * If the x-ms-offer-throughput is equal to or under 10,000, then the collection must not include a partitionKey definition.
    */
  var partitionKey: js.UndefOr[CollectionPartitionKey] = js.undefined
}


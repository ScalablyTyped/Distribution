package typings.documentdb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Collection extends UniqueId {
  
  /** The default time to live in seconds for documents in a collection. */
  var defaultTtl: js.UndefOr[Double] = js.native
  
  /** The indexing policy associated with the collection. */
  var indexingPolicy: js.UndefOr[IndexingPolicy] = js.native
  
  /**
    * This value is used to configure the partition key to be used for partitioning data into multiple partitions.
    *
    * If the x-ms-offer-throughput is over 10,000, then the collection must include a partitionKey definition.
    *
    * If the x-ms-offer-throughput is equal to or under 10,000, then the collection must not include a partitionKey definition.
    */
  var partitionKey: js.UndefOr[CollectionPartitionKey] = js.native
}
object Collection {
  
  @scala.inline
  def apply(id: String): Collection = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Collection]
  }
  
  @scala.inline
  implicit class CollectionMutableBuilder[Self <: Collection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultTtl(value: Double): Self = StObject.set(x, "defaultTtl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultTtlUndefined: Self = StObject.set(x, "defaultTtl", js.undefined)
    
    @scala.inline
    def setIndexingPolicy(value: IndexingPolicy): Self = StObject.set(x, "indexingPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexingPolicyUndefined: Self = StObject.set(x, "indexingPolicy", js.undefined)
    
    @scala.inline
    def setPartitionKey(value: CollectionPartitionKey): Self = StObject.set(x, "partitionKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartitionKeyUndefined: Self = StObject.set(x, "partitionKey", js.undefined)
  }
}

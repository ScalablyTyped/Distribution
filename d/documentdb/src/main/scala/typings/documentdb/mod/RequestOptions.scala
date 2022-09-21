package typings.documentdb.mod

import typings.documentdb.anon.Condition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestOptions extends StObject {
  
  /** Conditions Associated with the request. */
  var accessCondition: js.UndefOr[Condition] = js.undefined
  
  /** Consistency level required by the client. */
  var consistencyLevel: js.UndefOr[String] = js.undefined
  
  /**
    * Allow execution across multiple partitions
    *
    * If the collection is partitioned, this must be set to True unless the query filters against a single partition key
    * or if the collection has only a single partition.
    */
  var enableCrossPartitionQuery: js.UndefOr[Boolean] = js.undefined
  
  /** Specifies indexing directives (index, do not index ..etc). */
  var indexingDirective: js.UndefOr[String] = js.undefined
  
  /** If true, parallelize cross-partition queries */
  var maxDegreeOfParallelism: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The user-specified throughput when creating document collections.
    *
    * Expressed in units of 100 request units per second. This can be between 400 and 250,000 (or higher by requesting a limit increase).
    *
    * If the x-ms-offer-throughput is over 10,000, then the collection must include a partitionKey definition.
    * If the x-ms-offer-throughput is equal to or under 10,000, then the collection must not include a partitionKey definition.
    *
    * One of x-ms-offer-throughput or x-ms-offer-type must be specified. Both headers cannot be specified together.
    */
  var offerThroughput: js.UndefOr[Double] = js.undefined
  
  /** Offer type when creating document collections. */
  var offerType: js.UndefOr[String] = js.undefined
  
  /**
    * The partition key value for the requested document or attachment operation.
    *
    * Required for operations against documents and attachments when the collection definition includes a partition key definition.
    */
  var partitionKey: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /** If true, populate quota in response */
  var populateQuotaInfo: js.UndefOr[Boolean] = js.undefined
  
  /** Indicates what is the post trigger to be invoked after the operation. */
  var postTriggerInclude: js.UndefOr[String] = js.undefined
  
  /** Indicates what is the pre trigger to be invoked before the operation. */
  var preTriggerInclude: js.UndefOr[String] = js.undefined
  
  /** Expiry time (in seconds) for resource token associated with permission (applicable only for requests on permissions). */
  var resourceTokenExpirySeconds: js.UndefOr[Double] = js.undefined
  
  /** Token for use with Session consistency. */
  var sessionToken: js.UndefOr[String] = js.undefined
}
object RequestOptions {
  
  inline def apply(): RequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestOptions]
  }
  
  extension [Self <: RequestOptions](x: Self) {
    
    inline def setAccessCondition(value: Condition): Self = StObject.set(x, "accessCondition", value.asInstanceOf[js.Any])
    
    inline def setAccessConditionUndefined: Self = StObject.set(x, "accessCondition", js.undefined)
    
    inline def setConsistencyLevel(value: String): Self = StObject.set(x, "consistencyLevel", value.asInstanceOf[js.Any])
    
    inline def setConsistencyLevelUndefined: Self = StObject.set(x, "consistencyLevel", js.undefined)
    
    inline def setEnableCrossPartitionQuery(value: Boolean): Self = StObject.set(x, "enableCrossPartitionQuery", value.asInstanceOf[js.Any])
    
    inline def setEnableCrossPartitionQueryUndefined: Self = StObject.set(x, "enableCrossPartitionQuery", js.undefined)
    
    inline def setIndexingDirective(value: String): Self = StObject.set(x, "indexingDirective", value.asInstanceOf[js.Any])
    
    inline def setIndexingDirectiveUndefined: Self = StObject.set(x, "indexingDirective", js.undefined)
    
    inline def setMaxDegreeOfParallelism(value: Boolean): Self = StObject.set(x, "maxDegreeOfParallelism", value.asInstanceOf[js.Any])
    
    inline def setMaxDegreeOfParallelismUndefined: Self = StObject.set(x, "maxDegreeOfParallelism", js.undefined)
    
    inline def setOfferThroughput(value: Double): Self = StObject.set(x, "offerThroughput", value.asInstanceOf[js.Any])
    
    inline def setOfferThroughputUndefined: Self = StObject.set(x, "offerThroughput", js.undefined)
    
    inline def setOfferType(value: String): Self = StObject.set(x, "offerType", value.asInstanceOf[js.Any])
    
    inline def setOfferTypeUndefined: Self = StObject.set(x, "offerType", js.undefined)
    
    inline def setPartitionKey(value: String | js.Array[String]): Self = StObject.set(x, "partitionKey", value.asInstanceOf[js.Any])
    
    inline def setPartitionKeyUndefined: Self = StObject.set(x, "partitionKey", js.undefined)
    
    inline def setPartitionKeyVarargs(value: String*): Self = StObject.set(x, "partitionKey", js.Array(value*))
    
    inline def setPopulateQuotaInfo(value: Boolean): Self = StObject.set(x, "populateQuotaInfo", value.asInstanceOf[js.Any])
    
    inline def setPopulateQuotaInfoUndefined: Self = StObject.set(x, "populateQuotaInfo", js.undefined)
    
    inline def setPostTriggerInclude(value: String): Self = StObject.set(x, "postTriggerInclude", value.asInstanceOf[js.Any])
    
    inline def setPostTriggerIncludeUndefined: Self = StObject.set(x, "postTriggerInclude", js.undefined)
    
    inline def setPreTriggerInclude(value: String): Self = StObject.set(x, "preTriggerInclude", value.asInstanceOf[js.Any])
    
    inline def setPreTriggerIncludeUndefined: Self = StObject.set(x, "preTriggerInclude", js.undefined)
    
    inline def setResourceTokenExpirySeconds(value: Double): Self = StObject.set(x, "resourceTokenExpirySeconds", value.asInstanceOf[js.Any])
    
    inline def setResourceTokenExpirySecondsUndefined: Self = StObject.set(x, "resourceTokenExpirySeconds", js.undefined)
    
    inline def setSessionToken(value: String): Self = StObject.set(x, "sessionToken", value.asInstanceOf[js.Any])
    
    inline def setSessionTokenUndefined: Self = StObject.set(x, "sessionToken", js.undefined)
  }
}

package typings.documentdb.mod

import typings.documentdb.anon.Condition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestOptions extends js.Object {
  /** Conditions Associated with the request. */
  var accessCondition: js.UndefOr[Condition] = js.native
  /** Consistency level required by the client. */
  var consistencyLevel: js.UndefOr[String] = js.native
  /**
    * Allow execution across multiple partitions
    *
    * If the collection is partitioned, this must be set to True unless the query filters against a single partition key
    * or if the collection has only a single partition.
    */
  var enableCrossPartitionQuery: js.UndefOr[Boolean] = js.native
  /** Specifies indexing directives (index, do not index ..etc). */
  var indexingDirective: js.UndefOr[String] = js.native
  /** If true, parallelize cross-partition queries */
  var maxDegreeOfParallelism: js.UndefOr[Boolean] = js.native
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
  var offerThroughput: js.UndefOr[Double] = js.native
  /** Offer type when creating document collections. */
  var offerType: js.UndefOr[String] = js.native
  /**
    * The partition key value for the requested document or attachment operation.
    *
    * Required for operations against documents and attachments when the collection definition includes a partition key definition.
    */
  var partitionKey: js.UndefOr[String | js.Array[String]] = js.native
  /** If true, populate quota in response */
  var populateQuotaInfo: js.UndefOr[Boolean] = js.native
  /** Indicates what is the post trigger to be invoked after the operation. */
  var postTriggerInclude: js.UndefOr[String] = js.native
  /** Indicates what is the pre trigger to be invoked before the operation. */
  var preTriggerInclude: js.UndefOr[String] = js.native
  /** Expiry time (in seconds) for resource token associated with permission (applicable only for requests on permissions). */
  var resourceTokenExpirySeconds: js.UndefOr[Double] = js.native
  /** Token for use with Session consistency. */
  var sessionToken: js.UndefOr[String] = js.native
}

object RequestOptions {
  @scala.inline
  def apply(): RequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestOptions]
  }
  @scala.inline
  implicit class RequestOptionsOps[Self <: RequestOptions] (val x: Self) extends AnyVal {
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
    def setAccessCondition(value: Condition): Self = this.set("accessCondition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessCondition: Self = this.set("accessCondition", js.undefined)
    @scala.inline
    def setConsistencyLevel(value: String): Self = this.set("consistencyLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConsistencyLevel: Self = this.set("consistencyLevel", js.undefined)
    @scala.inline
    def setEnableCrossPartitionQuery(value: Boolean): Self = this.set("enableCrossPartitionQuery", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableCrossPartitionQuery: Self = this.set("enableCrossPartitionQuery", js.undefined)
    @scala.inline
    def setIndexingDirective(value: String): Self = this.set("indexingDirective", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndexingDirective: Self = this.set("indexingDirective", js.undefined)
    @scala.inline
    def setMaxDegreeOfParallelism(value: Boolean): Self = this.set("maxDegreeOfParallelism", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxDegreeOfParallelism: Self = this.set("maxDegreeOfParallelism", js.undefined)
    @scala.inline
    def setOfferThroughput(value: Double): Self = this.set("offerThroughput", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOfferThroughput: Self = this.set("offerThroughput", js.undefined)
    @scala.inline
    def setOfferType(value: String): Self = this.set("offerType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOfferType: Self = this.set("offerType", js.undefined)
    @scala.inline
    def setPartitionKeyVarargs(value: String*): Self = this.set("partitionKey", js.Array(value :_*))
    @scala.inline
    def setPartitionKey(value: String | js.Array[String]): Self = this.set("partitionKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePartitionKey: Self = this.set("partitionKey", js.undefined)
    @scala.inline
    def setPopulateQuotaInfo(value: Boolean): Self = this.set("populateQuotaInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopulateQuotaInfo: Self = this.set("populateQuotaInfo", js.undefined)
    @scala.inline
    def setPostTriggerInclude(value: String): Self = this.set("postTriggerInclude", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePostTriggerInclude: Self = this.set("postTriggerInclude", js.undefined)
    @scala.inline
    def setPreTriggerInclude(value: String): Self = this.set("preTriggerInclude", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreTriggerInclude: Self = this.set("preTriggerInclude", js.undefined)
    @scala.inline
    def setResourceTokenExpirySeconds(value: Double): Self = this.set("resourceTokenExpirySeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceTokenExpirySeconds: Self = this.set("resourceTokenExpirySeconds", js.undefined)
    @scala.inline
    def setSessionToken(value: String): Self = this.set("sessionToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSessionToken: Self = this.set("sessionToken", js.undefined)
  }
  
}


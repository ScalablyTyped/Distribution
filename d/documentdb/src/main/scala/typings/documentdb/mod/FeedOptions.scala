package typings.documentdb.mod

import typings.documentdb.anon.Condition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeedOptions extends RequestOptions {
  /** Opaque token for continuing the enumeration. */
  var continuation: js.UndefOr[String] = js.undefined
  /** Allow scan on the queries which couldn't be served as indexing was opted out on the requested paths. */
  var enableScanInQuery: js.UndefOr[Boolean] = js.undefined
  /** Max number of items to be returned in the enumeration operation. */
  var maxItemCount: js.UndefOr[Double] = js.undefined
}

object FeedOptions {
  @scala.inline
  def apply(
    accessCondition: Condition = null,
    consistencyLevel: String = null,
    continuation: String = null,
    enableCrossPartitionQuery: js.UndefOr[Boolean] = js.undefined,
    enableScanInQuery: js.UndefOr[Boolean] = js.undefined,
    indexingDirective: String = null,
    maxDegreeOfParallelism: js.UndefOr[Boolean] = js.undefined,
    maxItemCount: js.UndefOr[Double] = js.undefined,
    offerThroughput: js.UndefOr[Double] = js.undefined,
    offerType: String = null,
    partitionKey: String | js.Array[String] = null,
    populateQuotaInfo: js.UndefOr[Boolean] = js.undefined,
    postTriggerInclude: String = null,
    preTriggerInclude: String = null,
    resourceTokenExpirySeconds: js.UndefOr[Double] = js.undefined,
    sessionToken: String = null
  ): FeedOptions = {
    val __obj = js.Dynamic.literal()
    if (accessCondition != null) __obj.updateDynamic("accessCondition")(accessCondition.asInstanceOf[js.Any])
    if (consistencyLevel != null) __obj.updateDynamic("consistencyLevel")(consistencyLevel.asInstanceOf[js.Any])
    if (continuation != null) __obj.updateDynamic("continuation")(continuation.asInstanceOf[js.Any])
    if (!js.isUndefined(enableCrossPartitionQuery)) __obj.updateDynamic("enableCrossPartitionQuery")(enableCrossPartitionQuery.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableScanInQuery)) __obj.updateDynamic("enableScanInQuery")(enableScanInQuery.get.asInstanceOf[js.Any])
    if (indexingDirective != null) __obj.updateDynamic("indexingDirective")(indexingDirective.asInstanceOf[js.Any])
    if (!js.isUndefined(maxDegreeOfParallelism)) __obj.updateDynamic("maxDegreeOfParallelism")(maxDegreeOfParallelism.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxItemCount)) __obj.updateDynamic("maxItemCount")(maxItemCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offerThroughput)) __obj.updateDynamic("offerThroughput")(offerThroughput.get.asInstanceOf[js.Any])
    if (offerType != null) __obj.updateDynamic("offerType")(offerType.asInstanceOf[js.Any])
    if (partitionKey != null) __obj.updateDynamic("partitionKey")(partitionKey.asInstanceOf[js.Any])
    if (!js.isUndefined(populateQuotaInfo)) __obj.updateDynamic("populateQuotaInfo")(populateQuotaInfo.get.asInstanceOf[js.Any])
    if (postTriggerInclude != null) __obj.updateDynamic("postTriggerInclude")(postTriggerInclude.asInstanceOf[js.Any])
    if (preTriggerInclude != null) __obj.updateDynamic("preTriggerInclude")(preTriggerInclude.asInstanceOf[js.Any])
    if (!js.isUndefined(resourceTokenExpirySeconds)) __obj.updateDynamic("resourceTokenExpirySeconds")(resourceTokenExpirySeconds.get.asInstanceOf[js.Any])
    if (sessionToken != null) __obj.updateDynamic("sessionToken")(sessionToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeedOptions]
  }
}


package typings.documentdb.documentdbMod

import typings.documentdb.Anon_Condition
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
    accessCondition: Anon_Condition = null,
    consistencyLevel: String = null,
    continuation: String = null,
    enableCrossPartitionQuery: js.UndefOr[Boolean] = js.undefined,
    enableScanInQuery: js.UndefOr[Boolean] = js.undefined,
    indexingDirective: String = null,
    maxDegreeOfParallelism: js.UndefOr[Boolean] = js.undefined,
    maxItemCount: Int | Double = null,
    offerThroughput: Int | Double = null,
    offerType: String = null,
    partitionKey: String | js.Array[String] = null,
    populateQuotaInfo: js.UndefOr[Boolean] = js.undefined,
    postTriggerInclude: String = null,
    preTriggerInclude: String = null,
    resourceTokenExpirySeconds: Int | Double = null,
    sessionToken: String = null
  ): FeedOptions = {
    val __obj = js.Dynamic.literal()
    if (accessCondition != null) __obj.updateDynamic("accessCondition")(accessCondition)
    if (consistencyLevel != null) __obj.updateDynamic("consistencyLevel")(consistencyLevel)
    if (continuation != null) __obj.updateDynamic("continuation")(continuation)
    if (!js.isUndefined(enableCrossPartitionQuery)) __obj.updateDynamic("enableCrossPartitionQuery")(enableCrossPartitionQuery)
    if (!js.isUndefined(enableScanInQuery)) __obj.updateDynamic("enableScanInQuery")(enableScanInQuery)
    if (indexingDirective != null) __obj.updateDynamic("indexingDirective")(indexingDirective)
    if (!js.isUndefined(maxDegreeOfParallelism)) __obj.updateDynamic("maxDegreeOfParallelism")(maxDegreeOfParallelism)
    if (maxItemCount != null) __obj.updateDynamic("maxItemCount")(maxItemCount.asInstanceOf[js.Any])
    if (offerThroughput != null) __obj.updateDynamic("offerThroughput")(offerThroughput.asInstanceOf[js.Any])
    if (offerType != null) __obj.updateDynamic("offerType")(offerType)
    if (partitionKey != null) __obj.updateDynamic("partitionKey")(partitionKey.asInstanceOf[js.Any])
    if (!js.isUndefined(populateQuotaInfo)) __obj.updateDynamic("populateQuotaInfo")(populateQuotaInfo)
    if (postTriggerInclude != null) __obj.updateDynamic("postTriggerInclude")(postTriggerInclude)
    if (preTriggerInclude != null) __obj.updateDynamic("preTriggerInclude")(preTriggerInclude)
    if (resourceTokenExpirySeconds != null) __obj.updateDynamic("resourceTokenExpirySeconds")(resourceTokenExpirySeconds.asInstanceOf[js.Any])
    if (sessionToken != null) __obj.updateDynamic("sessionToken")(sessionToken)
    __obj.asInstanceOf[FeedOptions]
  }
}


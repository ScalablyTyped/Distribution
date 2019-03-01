package typings
package documentdbLib.documentdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeedOptions extends RequestOptions {
  /** Opaque token for continuing the enumeration. */
  var continuation: js.UndefOr[java.lang.String] = js.undefined
  /** Allow scan on the queries which couldn't be served as indexing was opted out on the requested paths. */
  var enableScanInQuery: js.UndefOr[scala.Boolean] = js.undefined
  /** Max number of items to be returned in the enumeration operation. */
  var maxItemCount: js.UndefOr[scala.Double] = js.undefined
}

object FeedOptions {
  @scala.inline
  def apply(
    accessCondition: documentdbLib.Anon_Condition = null,
    consistencyLevel: java.lang.String = null,
    continuation: java.lang.String = null,
    enableCrossPartitionQuery: js.UndefOr[scala.Boolean] = js.undefined,
    enableScanInQuery: js.UndefOr[scala.Boolean] = js.undefined,
    indexingDirective: java.lang.String = null,
    maxDegreeOfParallelism: js.UndefOr[scala.Boolean] = js.undefined,
    maxItemCount: scala.Int | scala.Double = null,
    offerThroughput: scala.Int | scala.Double = null,
    offerType: java.lang.String = null,
    partitionKey: java.lang.String | js.Array[java.lang.String] = null,
    populateQuotaInfo: js.UndefOr[scala.Boolean] = js.undefined,
    postTriggerInclude: java.lang.String = null,
    preTriggerInclude: java.lang.String = null,
    resourceTokenExpirySeconds: scala.Int | scala.Double = null,
    sessionToken: java.lang.String = null
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


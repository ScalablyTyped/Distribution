package typings
package documentdbLib.documentdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaOptions extends RequestOptions {
  /** HTTP ContentType header value. */
  var contentType: js.UndefOr[java.lang.String] = js.undefined
  /** HTTP Slug header value. */
  var slug: js.UndefOr[java.lang.String] = js.undefined
}

object MediaOptions {
  @scala.inline
  def apply(
    accessCondition: documentdbLib.Anon_Condition = null,
    consistencyLevel: java.lang.String = null,
    contentType: java.lang.String = null,
    enableCrossPartitionQuery: js.UndefOr[scala.Boolean] = js.undefined,
    indexingDirective: java.lang.String = null,
    maxDegreeOfParallelism: js.UndefOr[scala.Boolean] = js.undefined,
    offerThroughput: scala.Int | scala.Double = null,
    offerType: java.lang.String = null,
    partitionKey: java.lang.String | js.Array[java.lang.String] = null,
    populateQuotaInfo: js.UndefOr[scala.Boolean] = js.undefined,
    postTriggerInclude: java.lang.String = null,
    preTriggerInclude: java.lang.String = null,
    resourceTokenExpirySeconds: scala.Int | scala.Double = null,
    sessionToken: java.lang.String = null,
    slug: java.lang.String = null
  ): MediaOptions = {
    val __obj = js.Dynamic.literal()
    if (accessCondition != null) __obj.updateDynamic("accessCondition")(accessCondition)
    if (consistencyLevel != null) __obj.updateDynamic("consistencyLevel")(consistencyLevel)
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (!js.isUndefined(enableCrossPartitionQuery)) __obj.updateDynamic("enableCrossPartitionQuery")(enableCrossPartitionQuery)
    if (indexingDirective != null) __obj.updateDynamic("indexingDirective")(indexingDirective)
    if (!js.isUndefined(maxDegreeOfParallelism)) __obj.updateDynamic("maxDegreeOfParallelism")(maxDegreeOfParallelism)
    if (offerThroughput != null) __obj.updateDynamic("offerThroughput")(offerThroughput.asInstanceOf[js.Any])
    if (offerType != null) __obj.updateDynamic("offerType")(offerType)
    if (partitionKey != null) __obj.updateDynamic("partitionKey")(partitionKey.asInstanceOf[js.Any])
    if (!js.isUndefined(populateQuotaInfo)) __obj.updateDynamic("populateQuotaInfo")(populateQuotaInfo)
    if (postTriggerInclude != null) __obj.updateDynamic("postTriggerInclude")(postTriggerInclude)
    if (preTriggerInclude != null) __obj.updateDynamic("preTriggerInclude")(preTriggerInclude)
    if (resourceTokenExpirySeconds != null) __obj.updateDynamic("resourceTokenExpirySeconds")(resourceTokenExpirySeconds.asInstanceOf[js.Any])
    if (sessionToken != null) __obj.updateDynamic("sessionToken")(sessionToken)
    if (slug != null) __obj.updateDynamic("slug")(slug)
    __obj.asInstanceOf[MediaOptions]
  }
}


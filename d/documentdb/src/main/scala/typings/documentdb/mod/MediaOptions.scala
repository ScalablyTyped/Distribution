package typings.documentdb.mod

import typings.documentdb.anon.Condition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaOptions extends RequestOptions {
  /** HTTP ContentType header value. */
  var contentType: js.UndefOr[String] = js.undefined
  /** HTTP Slug header value. */
  var slug: js.UndefOr[String] = js.undefined
}

object MediaOptions {
  @scala.inline
  def apply(
    accessCondition: Condition = null,
    consistencyLevel: String = null,
    contentType: String = null,
    enableCrossPartitionQuery: js.UndefOr[Boolean] = js.undefined,
    indexingDirective: String = null,
    maxDegreeOfParallelism: js.UndefOr[Boolean] = js.undefined,
    offerThroughput: js.UndefOr[Double] = js.undefined,
    offerType: String = null,
    partitionKey: String | js.Array[String] = null,
    populateQuotaInfo: js.UndefOr[Boolean] = js.undefined,
    postTriggerInclude: String = null,
    preTriggerInclude: String = null,
    resourceTokenExpirySeconds: js.UndefOr[Double] = js.undefined,
    sessionToken: String = null,
    slug: String = null
  ): MediaOptions = {
    val __obj = js.Dynamic.literal()
    if (accessCondition != null) __obj.updateDynamic("accessCondition")(accessCondition.asInstanceOf[js.Any])
    if (consistencyLevel != null) __obj.updateDynamic("consistencyLevel")(consistencyLevel.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (!js.isUndefined(enableCrossPartitionQuery)) __obj.updateDynamic("enableCrossPartitionQuery")(enableCrossPartitionQuery.get.asInstanceOf[js.Any])
    if (indexingDirective != null) __obj.updateDynamic("indexingDirective")(indexingDirective.asInstanceOf[js.Any])
    if (!js.isUndefined(maxDegreeOfParallelism)) __obj.updateDynamic("maxDegreeOfParallelism")(maxDegreeOfParallelism.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offerThroughput)) __obj.updateDynamic("offerThroughput")(offerThroughput.get.asInstanceOf[js.Any])
    if (offerType != null) __obj.updateDynamic("offerType")(offerType.asInstanceOf[js.Any])
    if (partitionKey != null) __obj.updateDynamic("partitionKey")(partitionKey.asInstanceOf[js.Any])
    if (!js.isUndefined(populateQuotaInfo)) __obj.updateDynamic("populateQuotaInfo")(populateQuotaInfo.get.asInstanceOf[js.Any])
    if (postTriggerInclude != null) __obj.updateDynamic("postTriggerInclude")(postTriggerInclude.asInstanceOf[js.Any])
    if (preTriggerInclude != null) __obj.updateDynamic("preTriggerInclude")(preTriggerInclude.asInstanceOf[js.Any])
    if (!js.isUndefined(resourceTokenExpirySeconds)) __obj.updateDynamic("resourceTokenExpirySeconds")(resourceTokenExpirySeconds.get.asInstanceOf[js.Any])
    if (sessionToken != null) __obj.updateDynamic("sessionToken")(sessionToken.asInstanceOf[js.Any])
    if (slug != null) __obj.updateDynamic("slug")(slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaOptions]
  }
}


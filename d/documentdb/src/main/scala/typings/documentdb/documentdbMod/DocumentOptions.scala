package typings.documentdb.documentdbMod

import typings.documentdb.Anon_Condition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentOptions extends RequestOptions {
  /** Disables the automatic id generation. If id is missing in the body and this option is true, an error will be returned. */
  var disableAutomaticIdGeneration: js.UndefOr[Boolean] = js.undefined
}

object DocumentOptions {
  @scala.inline
  def apply(
    accessCondition: Anon_Condition = null,
    consistencyLevel: String = null,
    disableAutomaticIdGeneration: js.UndefOr[Boolean] = js.undefined,
    enableCrossPartitionQuery: js.UndefOr[Boolean] = js.undefined,
    indexingDirective: String = null,
    maxDegreeOfParallelism: js.UndefOr[Boolean] = js.undefined,
    offerThroughput: Int | Double = null,
    offerType: String = null,
    partitionKey: String | js.Array[String] = null,
    populateQuotaInfo: js.UndefOr[Boolean] = js.undefined,
    postTriggerInclude: String = null,
    preTriggerInclude: String = null,
    resourceTokenExpirySeconds: Int | Double = null,
    sessionToken: String = null
  ): DocumentOptions = {
    val __obj = js.Dynamic.literal()
    if (accessCondition != null) __obj.updateDynamic("accessCondition")(accessCondition.asInstanceOf[js.Any])
    if (consistencyLevel != null) __obj.updateDynamic("consistencyLevel")(consistencyLevel.asInstanceOf[js.Any])
    if (!js.isUndefined(disableAutomaticIdGeneration)) __obj.updateDynamic("disableAutomaticIdGeneration")(disableAutomaticIdGeneration.asInstanceOf[js.Any])
    if (!js.isUndefined(enableCrossPartitionQuery)) __obj.updateDynamic("enableCrossPartitionQuery")(enableCrossPartitionQuery.asInstanceOf[js.Any])
    if (indexingDirective != null) __obj.updateDynamic("indexingDirective")(indexingDirective.asInstanceOf[js.Any])
    if (!js.isUndefined(maxDegreeOfParallelism)) __obj.updateDynamic("maxDegreeOfParallelism")(maxDegreeOfParallelism.asInstanceOf[js.Any])
    if (offerThroughput != null) __obj.updateDynamic("offerThroughput")(offerThroughput.asInstanceOf[js.Any])
    if (offerType != null) __obj.updateDynamic("offerType")(offerType.asInstanceOf[js.Any])
    if (partitionKey != null) __obj.updateDynamic("partitionKey")(partitionKey.asInstanceOf[js.Any])
    if (!js.isUndefined(populateQuotaInfo)) __obj.updateDynamic("populateQuotaInfo")(populateQuotaInfo.asInstanceOf[js.Any])
    if (postTriggerInclude != null) __obj.updateDynamic("postTriggerInclude")(postTriggerInclude.asInstanceOf[js.Any])
    if (preTriggerInclude != null) __obj.updateDynamic("preTriggerInclude")(preTriggerInclude.asInstanceOf[js.Any])
    if (resourceTokenExpirySeconds != null) __obj.updateDynamic("resourceTokenExpirySeconds")(resourceTokenExpirySeconds.asInstanceOf[js.Any])
    if (sessionToken != null) __obj.updateDynamic("sessionToken")(sessionToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentOptions]
  }
}


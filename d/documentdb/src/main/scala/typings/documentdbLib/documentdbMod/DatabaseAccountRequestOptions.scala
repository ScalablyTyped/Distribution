package typings
package documentdbLib.documentdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatabaseAccountRequestOptions extends RequestOptions {
  /** The endpoint url whose database account needs to be retrieved. If not present, current client's url will be used. */
  var urlConnection: js.UndefOr[java.lang.String] = js.undefined
}

object DatabaseAccountRequestOptions {
  @scala.inline
  def apply(
    accessCondition: documentdbLib.Anon_Condition = null,
    consistencyLevel: java.lang.String = null,
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
    urlConnection: java.lang.String = null
  ): DatabaseAccountRequestOptions = {
    val __obj = js.Dynamic.literal()
    if (accessCondition != null) __obj.updateDynamic("accessCondition")(accessCondition)
    if (consistencyLevel != null) __obj.updateDynamic("consistencyLevel")(consistencyLevel)
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
    if (urlConnection != null) __obj.updateDynamic("urlConnection")(urlConnection)
    __obj.asInstanceOf[DatabaseAccountRequestOptions]
  }
}


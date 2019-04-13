package typings
package dynogelsLib.dynogelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetItemOptions extends js.Object {
  var AttributesToGet: js.UndefOr[awsDashSdkLib.clientsDynamodbMod.AttributeNameList] = js.undefined
  var ConsistentRead: js.UndefOr[awsDashSdkLib.clientsDynamodbMod.ConsistentRead] = js.undefined
  var ExpressionAttributeNames: js.UndefOr[awsDashSdkLib.clientsDynamodbMod.ExpressionAttributeNameMap] = js.undefined
  var ProjectionExpression: js.UndefOr[awsDashSdkLib.clientsDynamodbMod.ProjectionExpression] = js.undefined
  var ReturnConsumedCapacity: js.UndefOr[awsDashSdkLib.clientsDynamodbMod.ReturnConsumedCapacity] = js.undefined
}

object GetItemOptions {
  @scala.inline
  def apply(
    AttributesToGet: awsDashSdkLib.clientsDynamodbMod.AttributeNameList = null,
    ConsistentRead: js.UndefOr[awsDashSdkLib.clientsDynamodbMod.ConsistentRead] = js.undefined,
    ExpressionAttributeNames: awsDashSdkLib.clientsDynamodbMod.ExpressionAttributeNameMap = null,
    ProjectionExpression: awsDashSdkLib.clientsDynamodbMod.ProjectionExpression = null,
    ReturnConsumedCapacity: awsDashSdkLib.clientsDynamodbMod.ReturnConsumedCapacity = null
  ): GetItemOptions = {
    val __obj = js.Dynamic.literal()
    if (AttributesToGet != null) __obj.updateDynamic("AttributesToGet")(AttributesToGet)
    if (!js.isUndefined(ConsistentRead)) __obj.updateDynamic("ConsistentRead")(ConsistentRead)
    if (ExpressionAttributeNames != null) __obj.updateDynamic("ExpressionAttributeNames")(ExpressionAttributeNames)
    if (ProjectionExpression != null) __obj.updateDynamic("ProjectionExpression")(ProjectionExpression)
    if (ReturnConsumedCapacity != null) __obj.updateDynamic("ReturnConsumedCapacity")(ReturnConsumedCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetItemOptions]
  }
}


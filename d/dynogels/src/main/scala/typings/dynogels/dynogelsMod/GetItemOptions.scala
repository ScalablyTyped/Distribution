package typings.dynogels.dynogelsMod

import typings.awsDashSdk.clientsDynamodbMod.AttributeNameList
import typings.awsDashSdk.clientsDynamodbMod.ConsistentRead
import typings.awsDashSdk.clientsDynamodbMod.ExpressionAttributeNameMap
import typings.awsDashSdk.clientsDynamodbMod.ProjectionExpression
import typings.awsDashSdk.clientsDynamodbMod.ReturnConsumedCapacity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetItemOptions extends js.Object {
  var AttributesToGet: js.UndefOr[AttributeNameList] = js.undefined
  var ConsistentRead: js.UndefOr[typings.awsDashSdk.clientsDynamodbMod.ConsistentRead] = js.undefined
  var ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap] = js.undefined
  var ProjectionExpression: js.UndefOr[typings.awsDashSdk.clientsDynamodbMod.ProjectionExpression] = js.undefined
  var ReturnConsumedCapacity: js.UndefOr[typings.awsDashSdk.clientsDynamodbMod.ReturnConsumedCapacity] = js.undefined
}

object GetItemOptions {
  @scala.inline
  def apply(
    AttributesToGet: AttributeNameList = null,
    ConsistentRead: js.UndefOr[ConsistentRead] = js.undefined,
    ExpressionAttributeNames: ExpressionAttributeNameMap = null,
    ProjectionExpression: ProjectionExpression = null,
    ReturnConsumedCapacity: ReturnConsumedCapacity = null
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


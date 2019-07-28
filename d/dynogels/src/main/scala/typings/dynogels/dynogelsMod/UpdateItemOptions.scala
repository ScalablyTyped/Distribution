package typings.dynogels.dynogelsMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsDashSdk.clientsDynamodbMod.AttributeUpdates
import typings.awsDashSdk.clientsDynamodbMod.ConditionExpression
import typings.awsDashSdk.clientsDynamodbMod.ConditionalOperator
import typings.awsDashSdk.clientsDynamodbMod.ExpectedAttributeMap
import typings.awsDashSdk.clientsDynamodbMod.ExpressionAttributeNameMap
import typings.awsDashSdk.clientsDynamodbMod.ReturnConsumedCapacity
import typings.awsDashSdk.clientsDynamodbMod.ReturnItemCollectionMetrics
import typings.awsDashSdk.clientsDynamodbMod.ReturnValue
import typings.awsDashSdk.clientsDynamodbMod.UpdateExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateItemOptions extends js.Object {
  var AttributeUpdates: js.UndefOr[typings.awsDashSdk.clientsDynamodbMod.AttributeUpdates] = js.undefined
  var ConditionExpression: js.UndefOr[typings.awsDashSdk.clientsDynamodbMod.ConditionExpression] = js.undefined
  var ConditionalOperator: js.UndefOr[typings.awsDashSdk.clientsDynamodbMod.ConditionalOperator] = js.undefined
  var Expected: js.UndefOr[ExpectedAttributeMap] = js.undefined
  var ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap] = js.undefined
  var ExpressionAttributeValues: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var ReturnConsumedCapacity: js.UndefOr[typings.awsDashSdk.clientsDynamodbMod.ReturnConsumedCapacity] = js.undefined
  var ReturnItemCollectionMetrics: js.UndefOr[typings.awsDashSdk.clientsDynamodbMod.ReturnItemCollectionMetrics] = js.undefined
  var ReturnValues: js.UndefOr[ReturnValue] = js.undefined
  var UpdateExpression: js.UndefOr[typings.awsDashSdk.clientsDynamodbMod.UpdateExpression] = js.undefined
  var expected: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object UpdateItemOptions {
  @scala.inline
  def apply(
    AttributeUpdates: AttributeUpdates = null,
    ConditionExpression: ConditionExpression = null,
    ConditionalOperator: ConditionalOperator = null,
    Expected: ExpectedAttributeMap = null,
    ExpressionAttributeNames: ExpressionAttributeNameMap = null,
    ExpressionAttributeValues: StringDictionary[js.Any] = null,
    ReturnConsumedCapacity: ReturnConsumedCapacity = null,
    ReturnItemCollectionMetrics: ReturnItemCollectionMetrics = null,
    ReturnValues: ReturnValue = null,
    UpdateExpression: UpdateExpression = null,
    expected: StringDictionary[js.Any] = null
  ): UpdateItemOptions = {
    val __obj = js.Dynamic.literal()
    if (AttributeUpdates != null) __obj.updateDynamic("AttributeUpdates")(AttributeUpdates)
    if (ConditionExpression != null) __obj.updateDynamic("ConditionExpression")(ConditionExpression)
    if (ConditionalOperator != null) __obj.updateDynamic("ConditionalOperator")(ConditionalOperator.asInstanceOf[js.Any])
    if (Expected != null) __obj.updateDynamic("Expected")(Expected)
    if (ExpressionAttributeNames != null) __obj.updateDynamic("ExpressionAttributeNames")(ExpressionAttributeNames)
    if (ExpressionAttributeValues != null) __obj.updateDynamic("ExpressionAttributeValues")(ExpressionAttributeValues)
    if (ReturnConsumedCapacity != null) __obj.updateDynamic("ReturnConsumedCapacity")(ReturnConsumedCapacity.asInstanceOf[js.Any])
    if (ReturnItemCollectionMetrics != null) __obj.updateDynamic("ReturnItemCollectionMetrics")(ReturnItemCollectionMetrics.asInstanceOf[js.Any])
    if (ReturnValues != null) __obj.updateDynamic("ReturnValues")(ReturnValues.asInstanceOf[js.Any])
    if (UpdateExpression != null) __obj.updateDynamic("UpdateExpression")(UpdateExpression)
    if (expected != null) __obj.updateDynamic("expected")(expected)
    __obj.asInstanceOf[UpdateItemOptions]
  }
}


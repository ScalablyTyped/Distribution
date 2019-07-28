package typings.dynogels.dynogelsMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsDashSdk.clientsDynamodbMod.ConditionExpression
import typings.awsDashSdk.clientsDynamodbMod.ConditionalOperator
import typings.awsDashSdk.clientsDynamodbMod.ExpectedAttributeMap
import typings.awsDashSdk.clientsDynamodbMod.ExpressionAttributeNameMap
import typings.awsDashSdk.clientsDynamodbMod.ReturnConsumedCapacity
import typings.awsDashSdk.clientsDynamodbMod.ReturnItemCollectionMetrics
import typings.awsDashSdk.clientsDynamodbMod.ReturnValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateItemOptions extends js.Object {
  var ConditionExpression: js.UndefOr[typings.awsDashSdk.clientsDynamodbMod.ConditionExpression] = js.undefined
  var ConditionalOperator: js.UndefOr[typings.awsDashSdk.clientsDynamodbMod.ConditionalOperator] = js.undefined
  var Expected: js.UndefOr[ExpectedAttributeMap] = js.undefined
  var ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap] = js.undefined
  var ExpressionAttributeValues: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var ReturnConsumedCapacity: js.UndefOr[typings.awsDashSdk.clientsDynamodbMod.ReturnConsumedCapacity] = js.undefined
  var ReturnItemCollectionMetrics: js.UndefOr[typings.awsDashSdk.clientsDynamodbMod.ReturnItemCollectionMetrics] = js.undefined
  var ReturnValues: js.UndefOr[ReturnValue] = js.undefined
  var expected: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var overwrite: js.UndefOr[Boolean] = js.undefined
}

object CreateItemOptions {
  @scala.inline
  def apply(
    ConditionExpression: ConditionExpression = null,
    ConditionalOperator: ConditionalOperator = null,
    Expected: ExpectedAttributeMap = null,
    ExpressionAttributeNames: ExpressionAttributeNameMap = null,
    ExpressionAttributeValues: StringDictionary[js.Any] = null,
    ReturnConsumedCapacity: ReturnConsumedCapacity = null,
    ReturnItemCollectionMetrics: ReturnItemCollectionMetrics = null,
    ReturnValues: ReturnValue = null,
    expected: StringDictionary[js.Any] = null,
    overwrite: js.UndefOr[Boolean] = js.undefined
  ): CreateItemOptions = {
    val __obj = js.Dynamic.literal()
    if (ConditionExpression != null) __obj.updateDynamic("ConditionExpression")(ConditionExpression)
    if (ConditionalOperator != null) __obj.updateDynamic("ConditionalOperator")(ConditionalOperator.asInstanceOf[js.Any])
    if (Expected != null) __obj.updateDynamic("Expected")(Expected)
    if (ExpressionAttributeNames != null) __obj.updateDynamic("ExpressionAttributeNames")(ExpressionAttributeNames)
    if (ExpressionAttributeValues != null) __obj.updateDynamic("ExpressionAttributeValues")(ExpressionAttributeValues)
    if (ReturnConsumedCapacity != null) __obj.updateDynamic("ReturnConsumedCapacity")(ReturnConsumedCapacity.asInstanceOf[js.Any])
    if (ReturnItemCollectionMetrics != null) __obj.updateDynamic("ReturnItemCollectionMetrics")(ReturnItemCollectionMetrics.asInstanceOf[js.Any])
    if (ReturnValues != null) __obj.updateDynamic("ReturnValues")(ReturnValues.asInstanceOf[js.Any])
    if (expected != null) __obj.updateDynamic("expected")(expected)
    if (!js.isUndefined(overwrite)) __obj.updateDynamic("overwrite")(overwrite)
    __obj.asInstanceOf[CreateItemOptions]
  }
}


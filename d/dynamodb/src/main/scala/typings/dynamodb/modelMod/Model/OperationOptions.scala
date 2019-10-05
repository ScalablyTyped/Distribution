package typings.dynamodb.modelMod.Model

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationOptions extends js.Object {
  var ConditionExpression: js.UndefOr[js.Any] = js.undefined
  var ExpressionAttributeNames: js.UndefOr[js.Any] = js.undefined
  var ExpressionAttributeValues: js.UndefOr[js.Any] = js.undefined
  var ReturnValues: js.UndefOr[String | Boolean] = js.undefined
  var UpdateExpression: js.UndefOr[js.Any] = js.undefined
  var expected: js.UndefOr[js.Any] = js.undefined
  var overwrite: js.UndefOr[Boolean] = js.undefined
}

object OperationOptions {
  @scala.inline
  def apply(
    ConditionExpression: js.Any = null,
    ExpressionAttributeNames: js.Any = null,
    ExpressionAttributeValues: js.Any = null,
    ReturnValues: String | Boolean = null,
    UpdateExpression: js.Any = null,
    expected: js.Any = null,
    overwrite: js.UndefOr[Boolean] = js.undefined
  ): OperationOptions = {
    val __obj = js.Dynamic.literal()
    if (ConditionExpression != null) __obj.updateDynamic("ConditionExpression")(ConditionExpression)
    if (ExpressionAttributeNames != null) __obj.updateDynamic("ExpressionAttributeNames")(ExpressionAttributeNames)
    if (ExpressionAttributeValues != null) __obj.updateDynamic("ExpressionAttributeValues")(ExpressionAttributeValues)
    if (ReturnValues != null) __obj.updateDynamic("ReturnValues")(ReturnValues.asInstanceOf[js.Any])
    if (UpdateExpression != null) __obj.updateDynamic("UpdateExpression")(UpdateExpression)
    if (expected != null) __obj.updateDynamic("expected")(expected)
    if (!js.isUndefined(overwrite)) __obj.updateDynamic("overwrite")(overwrite)
    __obj.asInstanceOf[OperationOptions]
  }
}


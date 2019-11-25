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
    if (ConditionExpression != null) __obj.updateDynamic("ConditionExpression")(ConditionExpression.asInstanceOf[js.Any])
    if (ExpressionAttributeNames != null) __obj.updateDynamic("ExpressionAttributeNames")(ExpressionAttributeNames.asInstanceOf[js.Any])
    if (ExpressionAttributeValues != null) __obj.updateDynamic("ExpressionAttributeValues")(ExpressionAttributeValues.asInstanceOf[js.Any])
    if (ReturnValues != null) __obj.updateDynamic("ReturnValues")(ReturnValues.asInstanceOf[js.Any])
    if (UpdateExpression != null) __obj.updateDynamic("UpdateExpression")(UpdateExpression.asInstanceOf[js.Any])
    if (expected != null) __obj.updateDynamic("expected")(expected.asInstanceOf[js.Any])
    if (!js.isUndefined(overwrite)) __obj.updateDynamic("overwrite")(overwrite.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationOptions]
  }
}


package typings.dynamodb.dynamoDBMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetItemInput extends js.Object {
  var AttributesToGet: js.UndefOr[js.Array[String]] = js.undefined
  var ConsistentRead: js.UndefOr[Boolean] = js.undefined
  var ExpressionAttributeNames: js.UndefOr[StringDictionary[String]] = js.undefined
  var Key: js.Object
  var ProjectionExpression: js.UndefOr[String] = js.undefined
  var ReturnConsumedCapacity: js.UndefOr[String] = js.undefined
  var TableName: String
}

object GetItemInput {
  @scala.inline
  def apply(
    Key: js.Object,
    TableName: String,
    AttributesToGet: js.Array[String] = null,
    ConsistentRead: js.UndefOr[Boolean] = js.undefined,
    ExpressionAttributeNames: StringDictionary[String] = null,
    ProjectionExpression: String = null,
    ReturnConsumedCapacity: String = null
  ): GetItemInput = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    if (AttributesToGet != null) __obj.updateDynamic("AttributesToGet")(AttributesToGet.asInstanceOf[js.Any])
    if (!js.isUndefined(ConsistentRead)) __obj.updateDynamic("ConsistentRead")(ConsistentRead.asInstanceOf[js.Any])
    if (ExpressionAttributeNames != null) __obj.updateDynamic("ExpressionAttributeNames")(ExpressionAttributeNames.asInstanceOf[js.Any])
    if (ProjectionExpression != null) __obj.updateDynamic("ProjectionExpression")(ProjectionExpression.asInstanceOf[js.Any])
    if (ReturnConsumedCapacity != null) __obj.updateDynamic("ReturnConsumedCapacity")(ReturnConsumedCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetItemInput]
  }
}


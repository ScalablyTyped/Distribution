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
    val __obj = js.Dynamic.literal(Key = Key, TableName = TableName)
    if (AttributesToGet != null) __obj.updateDynamic("AttributesToGet")(AttributesToGet)
    if (!js.isUndefined(ConsistentRead)) __obj.updateDynamic("ConsistentRead")(ConsistentRead)
    if (ExpressionAttributeNames != null) __obj.updateDynamic("ExpressionAttributeNames")(ExpressionAttributeNames)
    if (ProjectionExpression != null) __obj.updateDynamic("ProjectionExpression")(ProjectionExpression)
    if (ReturnConsumedCapacity != null) __obj.updateDynamic("ReturnConsumedCapacity")(ReturnConsumedCapacity)
    __obj.asInstanceOf[GetItemInput]
  }
}


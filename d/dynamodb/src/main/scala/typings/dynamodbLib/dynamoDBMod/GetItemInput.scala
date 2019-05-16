package typings
package dynamodbLib.dynamoDBMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetItemInput extends js.Object {
  var AttributesToGet: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var ConsistentRead: js.UndefOr[scala.Boolean] = js.undefined
  var ExpressionAttributeNames: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var Key: js.Object
  var ProjectionExpression: js.UndefOr[java.lang.String] = js.undefined
  var ReturnConsumedCapacity: js.UndefOr[java.lang.String] = js.undefined
  var TableName: java.lang.String
}

object GetItemInput {
  @scala.inline
  def apply(
    Key: js.Object,
    TableName: java.lang.String,
    AttributesToGet: js.Array[java.lang.String] = null,
    ConsistentRead: js.UndefOr[scala.Boolean] = js.undefined,
    ExpressionAttributeNames: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    ProjectionExpression: java.lang.String = null,
    ReturnConsumedCapacity: java.lang.String = null
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


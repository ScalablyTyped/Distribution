package typings.dynamodb

import typings.dynamodb.dynamoDBMod.DynamoDB
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDynamodb extends js.Object {
  var dynamodb: js.UndefOr[DynamoDB] = js.undefined
  var tableName: js.UndefOr[String] = js.undefined
}

object AnonDynamodb {
  @scala.inline
  def apply(dynamodb: DynamoDB = null, tableName: String = null): AnonDynamodb = {
    val __obj = js.Dynamic.literal()
    if (dynamodb != null) __obj.updateDynamic("dynamodb")(dynamodb.asInstanceOf[js.Any])
    if (tableName != null) __obj.updateDynamic("tableName")(tableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDynamodb]
  }
}


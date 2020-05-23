package typings.dynamodb.anon

import typings.dynamodb.dynamoDBMod.DynamoDB
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dynamodb extends js.Object {
  var dynamodb: js.UndefOr[DynamoDB] = js.undefined
  var tableName: js.UndefOr[String] = js.undefined
}

object Dynamodb {
  @scala.inline
  def apply(dynamodb: DynamoDB = null, tableName: String = null): Dynamodb = {
    val __obj = js.Dynamic.literal()
    if (dynamodb != null) __obj.updateDynamic("dynamodb")(dynamodb.asInstanceOf[js.Any])
    if (tableName != null) __obj.updateDynamic("tableName")(tableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dynamodb]
  }
}


package typings.dynamodb

import typings.dynamodb.dynamoDBMod.DynamoDB
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dynamodb extends js.Object {
  var dynamodb: js.UndefOr[DynamoDB] = js.undefined
  var tableName: js.UndefOr[String] = js.undefined
}

object Anon_Dynamodb {
  @scala.inline
  def apply(dynamodb: DynamoDB = null, tableName: String = null): Anon_Dynamodb = {
    val __obj = js.Dynamic.literal()
    if (dynamodb != null) __obj.updateDynamic("dynamodb")(dynamodb)
    if (tableName != null) __obj.updateDynamic("tableName")(tableName)
    __obj.asInstanceOf[Anon_Dynamodb]
  }
}


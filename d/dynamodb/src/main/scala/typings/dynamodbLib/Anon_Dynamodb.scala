package typings
package dynamodbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dynamodb extends js.Object {
  var dynamodb: js.UndefOr[dynamodbLib.dynamoDBMod.DynamoDB] = js.undefined
  var tableName: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Dynamodb {
  @scala.inline
  def apply(dynamodb: dynamodbLib.dynamoDBMod.DynamoDB = null, tableName: java.lang.String = null): Anon_Dynamodb = {
    val __obj = js.Dynamic.literal()
    if (dynamodb != null) __obj.updateDynamic("dynamodb")(dynamodb)
    if (tableName != null) __obj.updateDynamic("tableName")(tableName)
    __obj.asInstanceOf[Anon_Dynamodb]
  }
}


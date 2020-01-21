package typings.dynogels.mod

import typings.dynogels.mod.AWS.DynamoDB
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModelConfig extends js.Object {
  var docClient: js.UndefOr[js.Any] = js.undefined
  var dynamodb: js.UndefOr[DynamoDB] = js.undefined
  var tableName: js.UndefOr[String] = js.undefined
}

object ModelConfig {
  @scala.inline
  def apply(docClient: js.Any = null, dynamodb: DynamoDB = null, tableName: String = null): ModelConfig = {
    val __obj = js.Dynamic.literal()
    if (docClient != null) __obj.updateDynamic("docClient")(docClient.asInstanceOf[js.Any])
    if (dynamodb != null) __obj.updateDynamic("dynamodb")(dynamodb.asInstanceOf[js.Any])
    if (tableName != null) __obj.updateDynamic("tableName")(tableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelConfig]
  }
}


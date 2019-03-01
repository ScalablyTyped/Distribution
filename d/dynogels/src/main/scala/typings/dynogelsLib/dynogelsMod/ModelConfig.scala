package typings
package dynogelsLib.dynogelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModelConfig extends js.Object {
  var docClient: js.UndefOr[js.Any] = js.undefined
  var dynamodb: js.UndefOr[dynogelsLib.dynogelsMod.AWSNs.DynamoDB] = js.undefined
  var tableName: js.UndefOr[java.lang.String] = js.undefined
}

object ModelConfig {
  @scala.inline
  def apply(
    docClient: js.Any = null,
    dynamodb: dynogelsLib.dynogelsMod.AWSNs.DynamoDB = null,
    tableName: java.lang.String = null
  ): ModelConfig = {
    val __obj = js.Dynamic.literal()
    if (docClient != null) __obj.updateDynamic("docClient")(docClient)
    if (dynamodb != null) __obj.updateDynamic("dynamodb")(dynamodb)
    if (tableName != null) __obj.updateDynamic("tableName")(tableName)
    __obj.asInstanceOf[ModelConfig]
  }
}


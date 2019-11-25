package typings.dynamodb.dynamodbMod

import org.scalablytyped.runtime.StringDictionary
import typings.joi.joiMod.AnySchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefineConfig extends js.Object {
  var createdAt: js.UndefOr[Boolean | String] = js.undefined
  var hashKey: String
  var indexes: js.UndefOr[js.Array[IndexDefinition]] = js.undefined
  var rangeKey: js.UndefOr[String] = js.undefined
  var schema: js.UndefOr[StringDictionary[AnySchema | StringDictionary[AnySchema]]] = js.undefined
  var tableName: js.UndefOr[String | js.Function0[String]] = js.undefined
  var timestamps: js.UndefOr[Boolean] = js.undefined
  var updatedAt: js.UndefOr[Boolean | String] = js.undefined
}

object DefineConfig {
  @scala.inline
  def apply(
    hashKey: String,
    createdAt: Boolean | String = null,
    indexes: js.Array[IndexDefinition] = null,
    rangeKey: String = null,
    schema: StringDictionary[AnySchema | StringDictionary[AnySchema]] = null,
    tableName: String | js.Function0[String] = null,
    timestamps: js.UndefOr[Boolean] = js.undefined,
    updatedAt: Boolean | String = null
  ): DefineConfig = {
    val __obj = js.Dynamic.literal(hashKey = hashKey.asInstanceOf[js.Any])
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt.asInstanceOf[js.Any])
    if (indexes != null) __obj.updateDynamic("indexes")(indexes.asInstanceOf[js.Any])
    if (rangeKey != null) __obj.updateDynamic("rangeKey")(rangeKey.asInstanceOf[js.Any])
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    if (tableName != null) __obj.updateDynamic("tableName")(tableName.asInstanceOf[js.Any])
    if (!js.isUndefined(timestamps)) __obj.updateDynamic("timestamps")(timestamps.asInstanceOf[js.Any])
    if (updatedAt != null) __obj.updateDynamic("updatedAt")(updatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefineConfig]
  }
}


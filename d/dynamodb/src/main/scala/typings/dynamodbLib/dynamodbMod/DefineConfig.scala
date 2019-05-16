package typings
package dynamodbLib.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefineConfig extends js.Object {
  var createdAt: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  var hashKey: java.lang.String
  var indexes: js.UndefOr[js.Array[IndexDefinition]] = js.undefined
  var rangeKey: js.UndefOr[java.lang.String] = js.undefined
  var schema: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[
      joiLib.joiMod.AnySchema | org.scalablytyped.runtime.StringDictionary[joiLib.joiMod.AnySchema]
    ]
  ] = js.undefined
  var tableName: js.UndefOr[java.lang.String | js.Function0[java.lang.String]] = js.undefined
  var timestamps: js.UndefOr[scala.Boolean] = js.undefined
  var updatedAt: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
}

object DefineConfig {
  @scala.inline
  def apply(
    hashKey: java.lang.String,
    createdAt: scala.Boolean | java.lang.String = null,
    indexes: js.Array[IndexDefinition] = null,
    rangeKey: java.lang.String = null,
    schema: org.scalablytyped.runtime.StringDictionary[
      joiLib.joiMod.AnySchema | org.scalablytyped.runtime.StringDictionary[joiLib.joiMod.AnySchema]
    ] = null,
    tableName: java.lang.String | js.Function0[java.lang.String] = null,
    timestamps: js.UndefOr[scala.Boolean] = js.undefined,
    updatedAt: scala.Boolean | java.lang.String = null
  ): DefineConfig = {
    val __obj = js.Dynamic.literal(hashKey = hashKey)
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt.asInstanceOf[js.Any])
    if (indexes != null) __obj.updateDynamic("indexes")(indexes)
    if (rangeKey != null) __obj.updateDynamic("rangeKey")(rangeKey)
    if (schema != null) __obj.updateDynamic("schema")(schema)
    if (tableName != null) __obj.updateDynamic("tableName")(tableName.asInstanceOf[js.Any])
    if (!js.isUndefined(timestamps)) __obj.updateDynamic("timestamps")(timestamps)
    if (updatedAt != null) __obj.updateDynamic("updatedAt")(updatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefineConfig]
  }
}


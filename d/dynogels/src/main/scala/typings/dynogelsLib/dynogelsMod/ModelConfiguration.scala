package typings
package dynogelsLib.dynogelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModelConfiguration extends js.Object {
  var createdAt: js.UndefOr[scala.Boolean] = js.undefined
  var hashKey: java.lang.String
  var indexes: js.UndefOr[js.Array[_]] = js.undefined
  var log: js.UndefOr[Log] = js.undefined
  var rangeKey: js.UndefOr[java.lang.String] = js.undefined
  var schema: js.UndefOr[SchemaType] = js.undefined
  var tableName: js.UndefOr[java.lang.String | tableResolve] = js.undefined
  var timestamps: js.UndefOr[scala.Boolean] = js.undefined
  var updatedAt: js.UndefOr[java.lang.String] = js.undefined
  var validation: js.UndefOr[joiLib.joiMod.ValidationOptions] = js.undefined
}

object ModelConfiguration {
  @scala.inline
  def apply(
    hashKey: java.lang.String,
    createdAt: js.UndefOr[scala.Boolean] = js.undefined,
    indexes: js.Array[_] = null,
    log: Log = null,
    rangeKey: java.lang.String = null,
    schema: SchemaType = null,
    tableName: java.lang.String | tableResolve = null,
    timestamps: js.UndefOr[scala.Boolean] = js.undefined,
    updatedAt: java.lang.String = null,
    validation: joiLib.joiMod.ValidationOptions = null
  ): ModelConfiguration = {
    val __obj = js.Dynamic.literal(hashKey = hashKey)
    if (!js.isUndefined(createdAt)) __obj.updateDynamic("createdAt")(createdAt)
    if (indexes != null) __obj.updateDynamic("indexes")(indexes)
    if (log != null) __obj.updateDynamic("log")(log)
    if (rangeKey != null) __obj.updateDynamic("rangeKey")(rangeKey)
    if (schema != null) __obj.updateDynamic("schema")(schema)
    if (tableName != null) __obj.updateDynamic("tableName")(tableName.asInstanceOf[js.Any])
    if (!js.isUndefined(timestamps)) __obj.updateDynamic("timestamps")(timestamps)
    if (updatedAt != null) __obj.updateDynamic("updatedAt")(updatedAt)
    if (validation != null) __obj.updateDynamic("validation")(validation)
    __obj.asInstanceOf[ModelConfiguration]
  }
}


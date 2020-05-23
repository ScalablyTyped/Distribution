package typings.dynogels.mod

import typings.joi.mod.ValidationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModelConfiguration extends js.Object {
  var createdAt: js.UndefOr[Boolean | String] = js.undefined
  var hashKey: String
  var indexes: js.UndefOr[js.Array[_]] = js.undefined
  var log: js.UndefOr[Log_] = js.undefined
  var rangeKey: js.UndefOr[String] = js.undefined
  var schema: js.UndefOr[SchemaType] = js.undefined
  var tableName: js.UndefOr[String | tableResolve] = js.undefined
  var timestamps: js.UndefOr[Boolean] = js.undefined
  var updatedAt: js.UndefOr[Boolean | String] = js.undefined
  var validation: js.UndefOr[ValidationOptions] = js.undefined
}

object ModelConfiguration {
  @scala.inline
  def apply(
    hashKey: String,
    createdAt: Boolean | String = null,
    indexes: js.Array[_] = null,
    log: Log_ = null,
    rangeKey: String = null,
    schema: SchemaType = null,
    tableName: String | tableResolve = null,
    timestamps: js.UndefOr[Boolean] = js.undefined,
    updatedAt: Boolean | String = null,
    validation: ValidationOptions = null
  ): ModelConfiguration = {
    val __obj = js.Dynamic.literal(hashKey = hashKey.asInstanceOf[js.Any])
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt.asInstanceOf[js.Any])
    if (indexes != null) __obj.updateDynamic("indexes")(indexes.asInstanceOf[js.Any])
    if (log != null) __obj.updateDynamic("log")(log.asInstanceOf[js.Any])
    if (rangeKey != null) __obj.updateDynamic("rangeKey")(rangeKey.asInstanceOf[js.Any])
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    if (tableName != null) __obj.updateDynamic("tableName")(tableName.asInstanceOf[js.Any])
    if (!js.isUndefined(timestamps)) __obj.updateDynamic("timestamps")(timestamps.get.asInstanceOf[js.Any])
    if (updatedAt != null) __obj.updateDynamic("updatedAt")(updatedAt.asInstanceOf[js.Any])
    if (validation != null) __obj.updateDynamic("validation")(validation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelConfiguration]
  }
}


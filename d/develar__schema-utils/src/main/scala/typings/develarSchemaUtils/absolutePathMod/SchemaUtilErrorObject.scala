package typings.develarSchemaUtils.absolutePathMod

import typings.ajv.mod.ErrorObject
import typings.ajv.mod.ErrorParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined ajv.ajv.ErrorObject & {  children ? :std.Array<ajv.ajv.ErrorObject> | undefined} */
trait SchemaUtilErrorObject extends js.Object {
  var children: js.UndefOr[js.Array[ErrorObject]] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var dataPath: String
  var keyword: String
  // Excluded if messages set to false.
  var message: js.UndefOr[String] = js.undefined
  var params: ErrorParameters
  var parentSchema: js.UndefOr[js.Object] = js.undefined
  // Added to validation errors of propertyNames keyword schema
  var propertyName: js.UndefOr[String] = js.undefined
  // These are added with the `verbose` option.
  var schema: js.UndefOr[js.Any] = js.undefined
  var schemaPath: String
}

object SchemaUtilErrorObject {
  @scala.inline
  def apply(
    dataPath: String,
    keyword: String,
    params: ErrorParameters,
    schemaPath: String,
    children: js.Array[ErrorObject] = null,
    data: js.Any = null,
    message: String = null,
    parentSchema: js.Object = null,
    propertyName: String = null,
    schema: js.Any = null
  ): SchemaUtilErrorObject = {
    val __obj = js.Dynamic.literal(dataPath = dataPath.asInstanceOf[js.Any], keyword = keyword.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], schemaPath = schemaPath.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (parentSchema != null) __obj.updateDynamic("parentSchema")(parentSchema.asInstanceOf[js.Any])
    if (propertyName != null) __obj.updateDynamic("propertyName")(propertyName.asInstanceOf[js.Any])
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUtilErrorObject]
  }
}


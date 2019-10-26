package typings.googleapisDashCommon.buildSrcSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchemaParameter extends js.Object {
  var default: String
  var description: String
  var enum: js.Array[String]
  var enumDescription: js.Array[String]
  var format: ParameterFormat
  var location: String
  var required: Boolean
  var `type`: SchemaType
}

object SchemaParameter {
  @scala.inline
  def apply(
    default: String,
    description: String,
    enum: js.Array[String],
    enumDescription: js.Array[String],
    format: ParameterFormat,
    location: String,
    required: Boolean,
    `type`: SchemaType
  ): SchemaParameter = {
    val __obj = js.Dynamic.literal(default = default, description = description, enum = enum, enumDescription = enumDescription, format = format, location = location, required = required)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SchemaParameter]
  }
}


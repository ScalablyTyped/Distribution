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
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], enum = enum.asInstanceOf[js.Any], enumDescription = enumDescription.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaParameter]
  }
}


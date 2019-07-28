package typings.expressDashOpenapi.expressDashOpenapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Following 2 interfaces are part of jsonschema package.
trait JsonschemaError extends js.Object {
  var argument: js.Any
  var instance: js.Any
  var message: String
  var name: String
  var property: String
  var schema: String | IJsonSchema
  var stack: String
}

object JsonschemaError {
  @scala.inline
  def apply(
    argument: js.Any,
    instance: js.Any,
    message: String,
    name: String,
    property: String,
    schema: String | IJsonSchema,
    stack: String,
    toString: () => String
  ): JsonschemaError = {
    val __obj = js.Dynamic.literal(argument = argument, instance = instance, message = message, name = name, property = property, schema = schema.asInstanceOf[js.Any], stack = stack, toString = js.Any.fromFunction0(toString))
  
    __obj.asInstanceOf[JsonschemaError]
  }
}


package typings
package expressDashOpenapiLib.expressDashOpenapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Following 2 interfaces are part of jsonschema package.
trait JsonschemaError extends js.Object {
  var argument: js.Any
  var instance: js.Any
  var message: java.lang.String
  var name: java.lang.String
  var property: java.lang.String
  var schema: java.lang.String | IJsonSchema
  var stack: java.lang.String
}

object JsonschemaError {
  @scala.inline
  def apply(
    argument: js.Any,
    instance: js.Any,
    message: java.lang.String,
    name: java.lang.String,
    property: java.lang.String,
    schema: java.lang.String | IJsonSchema,
    stack: java.lang.String,
    toString: js.Function0[java.lang.String]
  ): JsonschemaError = {
    val __obj = js.Dynamic.literal(argument = argument, instance = instance, message = message, name = name, property = property, schema = schema.asInstanceOf[js.Any], stack = stack, toString = toString)
  
    __obj.asInstanceOf[JsonschemaError]
  }
}


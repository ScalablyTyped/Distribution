package typings.develarSchemaUtils.validationErrorMod

import typings.develarSchemaUtils.anon.ErrorObjectchildrenArrayE
import typings.jsonSchema.mod.JSONSchema4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@develar/schema-utils/declarations/ValidationError", JSImport.Default)
@js.native
class default protected () extends ValidationError {
  /**
    * @param {Array<SchemaUtilErrorObject>} errors
    * @param {Schema} schema
    * @param {ValidationErrorConfiguration} configuration
    */
  def this(errors: js.Array[ErrorObjectchildrenArrayE], schema: JSONSchema4) = this()
  def this(errors: js.Array[ErrorObjectchildrenArrayE], schema: typings.jsonSchema.mod.JSONSchema6) = this()
  def this(errors: js.Array[ErrorObjectchildrenArrayE], schema: typings.jsonSchema.mod.JSONSchema7) = this()
  def this(
    errors: js.Array[ErrorObjectchildrenArrayE],
    schema: JSONSchema4,
    configuration: typings.develarSchemaUtils.validateMod.ValidationErrorConfiguration
  ) = this()
  def this(
    errors: js.Array[ErrorObjectchildrenArrayE],
    schema: typings.jsonSchema.mod.JSONSchema6,
    configuration: typings.develarSchemaUtils.validateMod.ValidationErrorConfiguration
  ) = this()
  def this(
    errors: js.Array[ErrorObjectchildrenArrayE],
    schema: typings.jsonSchema.mod.JSONSchema7,
    configuration: typings.develarSchemaUtils.validateMod.ValidationErrorConfiguration
  ) = this()
}


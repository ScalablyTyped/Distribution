package typings.develarSchemaUtils

import typings.develarSchemaUtils.validateMod.ValidationErrorConfiguration
import typings.jsonSchema.mod.JSONSchema4
import typings.jsonSchema.mod.JSONSchema6
import typings.jsonSchema.mod.JSONSchema7
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@develar/schema-utils", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /**
    * @param {Schema} schema
    * @param {Array<object> | object} options
    * @param {ValidationErrorConfiguration=} configuration
    * @returns {void}
    */
  def apply(schema: JSONSchema4, options: js.Any): Unit = js.native
  def apply(schema: JSONSchema4, options: js.Any, configuration: ValidationErrorConfiguration): Unit = js.native
  def apply(schema: JSONSchema6, options: js.Any): Unit = js.native
  def apply(schema: JSONSchema6, options: js.Any, configuration: ValidationErrorConfiguration): Unit = js.native
  def apply(schema: JSONSchema7, options: js.Any): Unit = js.native
  def apply(schema: JSONSchema7, options: js.Any, configuration: ValidationErrorConfiguration): Unit = js.native
}


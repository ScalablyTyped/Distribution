package typings.develarSchemaUtils

import typings.develarSchemaUtils.declarationsValidateMod.ValidationErrorConfiguration
import typings.jsonSchema.mod.JSONSchema4
import typings.jsonSchema.mod.JSONSchema6
import typings.jsonSchema.mod.JSONSchema7
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * @param {Schema} schema
    * @param {Array<object> | object} options
    * @param {ValidationErrorConfiguration=} configuration
    * @returns {void}
    */
  inline def apply(schema: JSONSchema4, options: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(schema.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(schema: JSONSchema4, options: Any, configuration: ValidationErrorConfiguration): Unit = (^.asInstanceOf[js.Dynamic].apply(schema.asInstanceOf[js.Any], options.asInstanceOf[js.Any], configuration.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(schema: JSONSchema6, options: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(schema.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(schema: JSONSchema6, options: Any, configuration: ValidationErrorConfiguration): Unit = (^.asInstanceOf[js.Dynamic].apply(schema.asInstanceOf[js.Any], options.asInstanceOf[js.Any], configuration.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(schema: JSONSchema7, options: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(schema.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(schema: JSONSchema7, options: Any, configuration: ValidationErrorConfiguration): Unit = (^.asInstanceOf[js.Dynamic].apply(schema.asInstanceOf[js.Any], options.asInstanceOf[js.Any], configuration.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@develar/schema-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}

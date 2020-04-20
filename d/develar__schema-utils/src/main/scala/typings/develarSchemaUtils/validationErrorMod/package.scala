package typings.develarSchemaUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object validationErrorMod {
  type JSONSchema6 = typings.jsonSchema.mod.JSONSchema6
  type JSONSchema7 = typings.jsonSchema.mod.JSONSchema7
  type PostFormatter = js.Function2[
    /* formattedError */ java.lang.String, 
    /* error */ typings.develarSchemaUtils.ErrorObjectchildrenArrayE, 
    java.lang.String
  ]
  type SPECIFICITY = scala.Double
  type Schema = typings.jsonSchema.mod.JSONSchema4 | typings.jsonSchema.mod.JSONSchema6 | typings.jsonSchema.mod.JSONSchema7
}

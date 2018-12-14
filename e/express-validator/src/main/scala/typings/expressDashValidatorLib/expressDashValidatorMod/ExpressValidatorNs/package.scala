package typings
package expressDashValidatorLib.expressDashValidatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ExpressValidatorNs {
  type SanitizerFunction = js.Function1[/* item */ java.lang.String, Sanitizer]
  type ValidationSchema = stdLib.Record[
    java.lang.String, 
    ValidationSchemaParamOptions | org.scalablytyped.runtime.StringDictionary[ValidatorSchemaOptions]
  ]
}

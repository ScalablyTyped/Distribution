package typings
package expressDashValidatorLib.checkSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationParamSchema
  extends ValidatorsSchema
     with SanitizersSchema {
  var custom: js.UndefOr[ValidatorSchemaOptions[expressDashValidatorLib.checkCheckMod.CustomValidator]] = js.undefined
  var customSanitizer: js.UndefOr[
    SanitizerSchemaOptions[expressDashValidatorLib.filterSanitizeMod.CustomSanitizer]
  ] = js.undefined
  var errorMessage: js.UndefOr[js.Any] = js.undefined
  var exists: js.UndefOr[
    ValidatorSchemaOptions[expressDashValidatorLib.checkCheckMod.ValidatorOptionsNs.ExistsOptions]
  ] = js.undefined
  var in: expressDashValidatorLib.checkLocationMod.Location | js.Array[expressDashValidatorLib.checkLocationMod.Location]
  var optional: js.UndefOr[
    scala.Boolean | expressDashValidatorLib.checkCheckMod.ValidatorOptionsNs.OptionalOptions
  ] = js.undefined
}


package typings.expressValidator.anon

import typings.expressValidator.expressValidatorStrings.blacklist
import typings.expressValidator.expressValidatorStrings.customSanitizer
import typings.expressValidator.expressValidatorStrings.escape
import typings.expressValidator.expressValidatorStrings.ltrim
import typings.expressValidator.expressValidatorStrings.normalizeEmail
import typings.expressValidator.expressValidatorStrings.rtrim
import typings.expressValidator.expressValidatorStrings.stripLow
import typings.expressValidator.expressValidatorStrings.toArray
import typings.expressValidator.expressValidatorStrings.toBoolean
import typings.expressValidator.expressValidatorStrings.toDate
import typings.expressValidator.expressValidatorStrings.toFloat
import typings.expressValidator.expressValidatorStrings.toInt
import typings.expressValidator.expressValidatorStrings.trim
import typings.expressValidator.expressValidatorStrings.unescape
import typings.expressValidator.expressValidatorStrings.whitelist
import typings.expressValidator.schemaMod.SanitizerSchemaOptions
import typings.std.Parameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `0`[K /* <: /* keyof express-validator.express-validator/src/chain/sanitizers.Sanitizers<any> */ customSanitizer | blacklist | escape | unescape | ltrim | normalizeEmail | rtrim | stripLow | toArray | toBoolean | toDate | toFloat | toInt | trim | whitelist */] extends SanitizerSchemaOptions[K] {
  var options: js.UndefOr[
    (Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: express-validator.express-validator/src/chain/sanitizers.Sanitizers<any>[K] */ js.Any
    ]) | (/* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<express-validator.express-validator/src/chain/sanitizers.Sanitizers<any>[K]>[0] */ js.Any)
  ] = js.undefined
}

object `0` {
  @scala.inline
  def apply[/* <: / * keyof express-validator.express-validator/src/chain/sanitizers.Sanitizers<any> * / typings.expressValidator.expressValidatorStrings.customSanitizer | typings.expressValidator.expressValidatorStrings.blacklist | typings.expressValidator.expressValidatorStrings.escape | typings.expressValidator.expressValidatorStrings.unescape | typings.expressValidator.expressValidatorStrings.ltrim | typings.expressValidator.expressValidatorStrings.normalizeEmail | typings.expressValidator.expressValidatorStrings.rtrim | typings.expressValidator.expressValidatorStrings.stripLow | typings.expressValidator.expressValidatorStrings.toArray | typings.expressValidator.expressValidatorStrings.toBoolean | typings.expressValidator.expressValidatorStrings.toDate | typings.expressValidator.expressValidatorStrings.toFloat | typings.expressValidator.expressValidatorStrings.toInt | typings.expressValidator.expressValidatorStrings.trim | typings.expressValidator.expressValidatorStrings.whitelist */ K](
    options: (Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: express-validator.express-validator/src/chain/sanitizers.Sanitizers<any>[K] */ js.Any
    ]) | (/* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<express-validator.express-validator/src/chain/sanitizers.Sanitizers<any>[K]>[0] */ js.Any) = null
  ): `0`[K] = {
    val __obj = js.Dynamic.literal()
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`[K]]
  }
}


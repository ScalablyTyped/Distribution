package typings.expressValidator

import typings.expressValidator.schemaMod.SanitizerSchemaOptions
import typings.std.Parameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon0[K /* <: String */] extends SanitizerSchemaOptions[K] {
  var options: js.UndefOr[
    (Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: express-validator.express-validator/src/chain/sanitizers.Sanitizers<any>[K] */ js.Any
    ]) | (/* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<express-validator.express-validator/src/chain/sanitizers.Sanitizers<any>[K]>[0] */ js.Any)
  ] = js.undefined
}

object Anon0 {
  @scala.inline
  def apply[K /* <: String */](
    options: (Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: express-validator.express-validator/src/chain/sanitizers.Sanitizers<any>[K] */ js.Any
    ]) | (/* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<express-validator.express-validator/src/chain/sanitizers.Sanitizers<any>[K]>[0] */ js.Any) = null
  ): Anon0[K] = {
    val __obj = js.Dynamic.literal()
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon0[K]]
  }
}


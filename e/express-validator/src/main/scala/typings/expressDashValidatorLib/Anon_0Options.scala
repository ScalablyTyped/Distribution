package typings
package expressDashValidatorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_0Options[K /* <: java.lang.String */]
  extends expressDashValidatorLib.srcMiddlewaresSchemaMod.SanitizerSchemaOptions[K] {
  var options: js.UndefOr[
    (stdLib.Parameters[
      /* import warning: ImportType.apply Failed type conversion: express-validator.express-validator/src/chain/sanitizers.Sanitizers<any>[K] */ js.Any
    ]) | (/* import warning: ImportType.apply Failed type conversion: std.Parameters<express-validator.express-validator/src/chain/sanitizers.Sanitizers<any>[K]>[0] */ js.Any)
  ] = js.undefined
}

object Anon_0Options {
  @scala.inline
  def apply[K /* <: java.lang.String */](
    options: (stdLib.Parameters[
      /* import warning: ImportType.apply Failed type conversion: express-validator.express-validator/src/chain/sanitizers.Sanitizers<any>[K] */ js.Any
    ]) | (/* import warning: ImportType.apply Failed type conversion: std.Parameters<express-validator.express-validator/src/chain/sanitizers.Sanitizers<any>[K]>[0] */ js.Any) = null
  ): Anon_0Options[K] = {
    val __obj = js.Dynamic.literal()
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_0Options[K]]
  }
}


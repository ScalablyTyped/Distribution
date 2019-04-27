package typings
package atFeathersjsExpressLib.atFeathersjsExpressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof any, 'use'> ]: any[P]}
- Dropped {[ P in std.Exclude<keyof any, 'use'> ]: any[P]} */ @js.native
trait Application[T] extends js.Object {
  @JSName("use")
  var use_Original: atFeathersjsExpressLib.FeathersApplicationRequestHandler[T] = js.native
  def use(
    handlers: (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify RequestHandlerParams */ js.Any)*
  ): T = js.native
}


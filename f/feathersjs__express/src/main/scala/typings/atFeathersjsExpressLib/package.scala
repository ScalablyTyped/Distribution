package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atFeathersjsExpressLib {
  // TypeScript methods cannot be overloaded with a different signature. Derive two application types without the use methods.
  type ExpressAndFeathersApplicationWithoutUse[T] = Omit[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify express.Application */ _, 
    atFeathersjsExpressLib.atFeathersjsExpressLibStrings.use
  ]
  type FeathersApplicationRequestHandler[T] = (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify express.IRouterHandler<T> */ js.Any) with (js.Function1[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify RequestHandlerParams */ /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify RequestHandlerParams */ /* repeated */ js.Any, 
    T
  ])
  type Omit[T, K] = stdLib.Pick[T, stdLib.Exclude[java.lang.String, K]]
}

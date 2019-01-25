package typings
package fluentDashReactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fluentDashReactMod {
  type GetProps[C] = js.Any
  type GetString = js.Function2[/* id */ java.lang.String, /* args */ js.UndefOr[js.Object], java.lang.String]
  type MarkupParser = js.Function1[/* str */ java.lang.String, js.Array[Node]]
  type Matching[InjectedProps, DecorationTargetProps] = fluentDashReactLib.fluentDashReactLibStrings.Matching with DecorationTargetProps
  type Omit[T, K] = stdLib.Pick[T, stdLib.Exclude[java.lang.String, K]]
  type Shared[InjectedProps, DecorationTargetProps /* <: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias fluent-react.fluent-react.Shared<InjectedProps, DecorationTargetProps> */ js.Object */] = fluentDashReactLib.fluentDashReactLibStrings.Shared with DecorationTargetProps
}

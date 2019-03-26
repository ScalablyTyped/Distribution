package typings
package fluentDashReactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fluentDashReactMod {
  type GetProps[C] = js.Any
  type GetString = js.Function2[/* id */ java.lang.String, /* args */ js.UndefOr[js.Object], java.lang.String]
  type MarkupParser = js.Function1[/* str */ java.lang.String, js.Array[Node]]
  type Matching[InjectedProps, DecorationTargetProps] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof DecorationTargetProps ]: DecorationTargetProps[P] | InjectedProps[P]}
    */ fluentDashReactLib.fluentDashReactLibStrings.Matching with js.Any
  type Omit[T, K] = stdLib.Pick[T, stdLib.Exclude[java.lang.String, K]]
  type Shared[InjectedProps, DecorationTargetProps] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in std.Extract<keyof InjectedProps, keyof DecorationTargetProps> ]:? DecorationTargetProps[P]}
    */ fluentDashReactLib.fluentDashReactLibStrings.Shared with DecorationTargetProps
}

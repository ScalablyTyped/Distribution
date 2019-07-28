package typings.fluentDashReact

import typings.std.Exclude
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fluentDashReactMod {
  type GetProps[C] = js.Any
  type GetString = js.Function2[/* id */ String, /* args */ js.UndefOr[js.Object], String]
  type MarkupParser = js.Function1[/* str */ String, js.Array[Node]]
  type Matching[InjectedProps, DecorationTargetProps] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof DecorationTargetProps ]: P extends keyof InjectedProps? InjectedProps[P] extends DecorationTargetProps[P]? DecorationTargetProps[P] : InjectedProps[P] : DecorationTargetProps[P]}
    */ typings.fluentDashReact.fluentDashReactStrings.Matching with js.Any
  type Omit[T, K] = Pick[T, Exclude[String, K]]
  type Shared[InjectedProps, DecorationTargetProps] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in std.Extract<keyof InjectedProps, keyof DecorationTargetProps> ]:? InjectedProps[P] extends DecorationTargetProps[P]? DecorationTargetProps[P] : never}
    */ typings.fluentDashReact.fluentDashReactStrings.Shared with js.Any
}

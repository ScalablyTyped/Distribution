package typings.atFluentReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atFluentReactMod {
  import typings.std.Exclude
  import typings.std.Node
  import typings.std.Pick

  type GetProps[C] = js.Any
  type GetString = js.Function3[
    /* id */ String, 
    /* args */ js.UndefOr[js.Object], 
    /* fallback */ js.UndefOr[String], 
    String
  ]
  type MarkupParser = js.Function1[/* str */ String, js.Array[Node]]
  type Matching[InjectedProps, DecorationTargetProps] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof DecorationTargetProps ]: P extends keyof InjectedProps? InjectedProps[P] extends DecorationTargetProps[P]? DecorationTargetProps[P] : InjectedProps[P] : DecorationTargetProps[P]}
    */ typings.atFluentReact.atFluentReactStrings.Matching with js.Any
  type Omit[T, K] = Pick[T, Exclude[String, K]]
  type Shared[InjectedProps, DecorationTargetProps] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in std.Extract<keyof InjectedProps, keyof DecorationTargetProps> ]:? InjectedProps[P] extends DecorationTargetProps[P]? DecorationTargetProps[P] : never}
    */ typings.atFluentReact.atFluentReactStrings.Shared with js.Any
}

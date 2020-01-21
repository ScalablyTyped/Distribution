package typings.fluentReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type GetProps[C] = js.Any
  type GetString = js.Function3[
    /* id */ java.lang.String, 
    /* args */ js.UndefOr[js.Object], 
    /* fallback */ js.UndefOr[java.lang.String], 
    java.lang.String
  ]
  type MarkupParser = js.Function1[/* str */ java.lang.String, js.Array[typings.std.Node]]
  type Matching[InjectedProps, DecorationTargetProps] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof DecorationTargetProps ]: P extends keyof InjectedProps? InjectedProps[P] extends DecorationTargetProps[P]? DecorationTargetProps[P] : InjectedProps[P] : DecorationTargetProps[P]}
    */ typings.fluentReact.fluentReactStrings.Matching with js.Any
  type Omit[T, K] = typings.std.Pick[T, typings.std.Exclude[java.lang.String, K]]
  type Shared[InjectedProps, DecorationTargetProps] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in std.Extract<keyof InjectedProps, keyof DecorationTargetProps> ]:? InjectedProps[P] extends DecorationTargetProps[P]? DecorationTargetProps[P] : never}
    */ typings.fluentReact.fluentReactStrings.Shared with js.Any
}

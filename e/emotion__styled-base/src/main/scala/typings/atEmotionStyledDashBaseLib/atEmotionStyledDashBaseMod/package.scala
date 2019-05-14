package typings
package atEmotionStyledDashBaseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atEmotionStyledDashBaseMod {
  type CreateStyledComponentExtrinsic[Tag /* <: reactLib.reactMod.ComponentType[_] */, ExtraProps, Theme /* <: js.Object */] = CreateStyledComponentBase[atEmotionStyledDashBaseLib.typesHelperMod.PropsOf[Tag], ExtraProps, Theme]
  type CreateStyledComponentIntrinsic[Tag /* <: java.lang.String */, ExtraProps, Theme /* <: js.Object */] = CreateStyledComponentBase[
    /* import warning: ImportType.apply Failed type conversion: @emotion/styled-base.@emotion/styled-base.JSXInEl[Tag] */ js.Any, 
    ExtraProps, 
    Theme
  ]
  type JSXInEl = reactLib.reactMod.Global.JSXNs.IntrinsicElements
  type ReactClassPropKeys = java.lang.String
  type WithTheme[P, T] = (P with atEmotionStyledDashBaseLib.Anon_ThemeT[T]) | (P with atEmotionStyledDashBaseLib.Anon_ThemeAny)
}

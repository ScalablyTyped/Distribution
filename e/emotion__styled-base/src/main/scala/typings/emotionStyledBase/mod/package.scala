package typings.emotionStyledBase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CreateStyledComponentExtrinsic[Tag /* <: typings.react.mod.ComponentType[_] */, ExtraProps, Theme /* <: js.Object */] = typings.emotionStyledBase.mod.CreateStyledComponentBase[typings.emotionStyledBase.helperMod.PropsOf[Tag], ExtraProps, Theme]
  type CreateStyledComponentIntrinsic[Tag /* <: /* keyof @emotion/styled-base.@emotion/styled-base.JSXInEl */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ js.Any */, ExtraProps, Theme /* <: js.Object */] = typings.emotionStyledBase.mod.CreateStyledComponentBase[
    /* import warning: importer.ImportType#apply Failed type conversion: @emotion/styled-base.@emotion/styled-base.JSXInEl[Tag] */ js.Any, 
    ExtraProps, 
    Theme
  ]
  type JSXInEl = typings.react.mod.global.JSX.IntrinsicElements
  type WithTheme[P, T] = (P with typings.emotionStyledBase.anon.ThemeT[T]) | (P with typings.emotionStyledBase.anon.ThemeExclude)
}

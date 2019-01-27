package typings
package atEmotionSerializeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atEmotionSerializeMod {
  type CSSInterpolation = js.UndefOr[
    scala.Null | scala.Boolean | scala.Double | java.lang.String | ComponentSelector | Keyframes | atEmotionUtilsLib.atEmotionUtilsMod.SerializedStyles | CSSObject | ArrayCSSInterpolation
  ]
  type CSSProperties = csstypeLib.csstypeMod.PropertiesFallback[scala.Double | java.lang.String]
  type CSSPropertiesWithMultiValues = atEmotionSerializeLib.atEmotionSerializeLibStrings.CSSPropertiesWithMultiValues with CSSProperties
  type CSSPseudos[MP] = atEmotionSerializeLib.atEmotionSerializeLibStrings.CSSPseudos with js.Any
  type CSSPseudosForCSSObject = atEmotionSerializeLib.atEmotionSerializeLibStrings.CSSPseudosForCSSObject with js.Any
  type Interpolation[MP] = js.UndefOr[
    scala.Null | scala.Boolean | scala.Double | java.lang.String | ComponentSelector | Keyframes | atEmotionUtilsLib.atEmotionUtilsMod.SerializedStyles | ArrayInterpolation[MP] | ObjectInterpolation[MP] | (atEmotionSerializeLib.typesHelperMod.Equal[MP, js.UndefOr[scala.Nothing], scala.Nothing, FunctionInterpolation[MP]])
  ]
  type Keyframes = atEmotionSerializeLib.Anon_Anim with java.lang.String
}

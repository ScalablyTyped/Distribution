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
  type CSSPropertiesWithMultiValues = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof @emotion/serialize.@emotion/serialize.CSSProperties ]: @emotion/serialize.@emotion/serialize.CSSProperties[K] | std.Array<std.Extract<@emotion/serialize.@emotion/serialize.CSSProperties[K], string>>}
    */ atEmotionSerializeLib.atEmotionSerializeLibStrings.CSSPropertiesWithMultiValues with js.Any
  type Interpolation[MP] = js.UndefOr[
    scala.Null | scala.Boolean | scala.Double | java.lang.String | ComponentSelector | Keyframes | atEmotionUtilsLib.atEmotionUtilsMod.SerializedStyles | ArrayInterpolation[MP] | ObjectInterpolation[MP] | (atEmotionSerializeLib.typesHelperMod.Equal[MP, js.UndefOr[scala.Nothing], scala.Nothing, FunctionInterpolation[MP]])
  ]
  type Keyframes = atEmotionSerializeLib.Anon_Anim with java.lang.String
}

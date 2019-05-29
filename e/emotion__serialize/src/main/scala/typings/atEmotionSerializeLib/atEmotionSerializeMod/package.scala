package typings
package atEmotionSerializeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atEmotionSerializeMod {
  /* Rewritten from type alias, can be one of: 
    - scala.Null
    - `js.undefined`
    - scala.Nothing
    - scala.Boolean
    - scala.Double
    - java.lang.String
    - ComponentSelector
    - Keyframes
    - atEmotionUtilsLib.atEmotionUtilsMod.SerializedStyles
    - CSSObject
    - ArrayCSSInterpolation
  */
  type CSSInterpolation = js.UndefOr[
    _CSSInterpolation | scala.Null | scala.Boolean | scala.Double | java.lang.String | Keyframes | atEmotionUtilsLib.atEmotionUtilsMod.SerializedStyles
  ]
  type CSSProperties = csstypeLib.csstypeMod.PropertiesFallback[scala.Double | java.lang.String]
  type CSSPropertiesWithMultiValues = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof @emotion/serialize.@emotion/serialize.CSSProperties ]: @emotion/serialize.@emotion/serialize.CSSProperties[K] | std.Array<std.Extract<@emotion/serialize.@emotion/serialize.CSSProperties[K], string>>}
    */ atEmotionSerializeLib.atEmotionSerializeLibStrings.CSSPropertiesWithMultiValues with js.Any
  type CSSPseudos[MP] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in csstype.csstype.Pseudos ]:? @emotion/serialize.@emotion/serialize.ObjectInterpolation<MP>}
    */ atEmotionSerializeLib.atEmotionSerializeLibStrings.CSSPseudos with js.Any
  type CSSPseudosForCSSObject = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in csstype.csstype.Pseudos ]:? @emotion/serialize.@emotion/serialize.CSSObject}
    */ atEmotionSerializeLib.atEmotionSerializeLibStrings.CSSPseudosForCSSObject with js.Any
  /* Rewritten from type alias, can be one of: 
    - scala.Null
    - `js.undefined`
    - scala.Nothing
    - scala.Boolean
    - scala.Double
    - java.lang.String
    - ComponentSelector
    - Keyframes
    - atEmotionUtilsLib.atEmotionUtilsMod.SerializedStyles
    - ArrayInterpolation[MP]
    - ObjectInterpolation[MP]
    - atEmotionSerializeLib.typesHelperMod.Equal[MP, js.UndefOr[scala.Nothing], scala.Nothing, FunctionInterpolation[MP]]
  */
  type Interpolation[MP] = js.UndefOr[
    _Interpolation[MP] | (atEmotionSerializeLib.typesHelperMod.Equal[MP, js.UndefOr[scala.Nothing], scala.Nothing, FunctionInterpolation[MP]]) | scala.Null | scala.Boolean | scala.Double | java.lang.String | Keyframes | atEmotionUtilsLib.atEmotionUtilsMod.SerializedStyles
  ]
  type Keyframes = atEmotionSerializeLib.Anon_Anim with java.lang.String
}

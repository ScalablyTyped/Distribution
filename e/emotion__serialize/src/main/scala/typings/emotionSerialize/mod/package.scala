package typings.emotionSerialize

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /* Rewritten from type alias, can be one of: 
    - scala.Null
    - `js.undefined`
    - scala.Boolean
    - scala.Double
    - java.lang.String
    - typings.emotionSerialize.mod.ComponentSelector
    - typings.emotionSerialize.mod.Keyframes
    - typings.emotionUtils.mod.SerializedStyles
    - typings.emotionSerialize.mod.CSSObject
    - typings.emotionSerialize.mod.ArrayCSSInterpolation
  */
  type CSSInterpolation = js.UndefOr[
    typings.emotionSerialize.mod._CSSInterpolation | scala.Null | scala.Boolean | scala.Double | java.lang.String | typings.emotionSerialize.mod.Keyframes | typings.emotionUtils.mod.SerializedStyles
  ]
  type CSSProperties = typings.csstype.mod.PropertiesFallback[scala.Double | java.lang.String]
  type CSSPropertiesWithMultiValues = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof @emotion/serialize.@emotion/serialize.CSSProperties ]: @emotion/serialize.@emotion/serialize.CSSProperties[K] | std.Array<std.Extract<@emotion/serialize.@emotion/serialize.CSSProperties[K], string>>}
    */ typings.emotionSerialize.emotionSerializeStrings.CSSPropertiesWithMultiValues with js.Any
  type CSSPseudos[MP] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in csstype.csstype.Pseudos ]:? @emotion/serialize.@emotion/serialize.ObjectInterpolation<MP>}
    */ typings.emotionSerialize.emotionSerializeStrings.CSSPseudos with js.Any
  type CSSPseudosForCSSObject = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in csstype.csstype.Pseudos ]:? @emotion/serialize.@emotion/serialize.CSSObject}
    */ typings.emotionSerialize.emotionSerializeStrings.CSSPseudosForCSSObject with js.Any
  /* Rewritten from type alias, can be one of: 
    - scala.Null
    - `js.undefined`
    - scala.Boolean
    - scala.Double
    - java.lang.String
    - typings.emotionSerialize.mod.ComponentSelector
    - typings.emotionSerialize.mod.Keyframes
    - typings.emotionUtils.mod.SerializedStyles
    - typings.emotionSerialize.mod.ArrayInterpolation[MP]
    - typings.emotionSerialize.mod.ObjectInterpolation[MP]
    - typings.emotionSerialize.helperMod.Equal[
  MP, 
  js.UndefOr[scala.Nothing], 
  scala.Nothing, 
  typings.emotionSerialize.mod.FunctionInterpolation[MP]]
  */
  type Interpolation[MP] = js.UndefOr[
    typings.emotionSerialize.mod._Interpolation[MP] | (typings.emotionSerialize.helperMod.Equal[
      MP, 
      js.UndefOr[scala.Nothing], 
      scala.Nothing, 
      typings.emotionSerialize.mod.FunctionInterpolation[MP]
    ]) | scala.Null | scala.Boolean | scala.Double | java.lang.String | typings.emotionSerialize.mod.Keyframes | typings.emotionUtils.mod.SerializedStyles
  ]
  type Keyframes = typings.emotionSerialize.AnonAnim with java.lang.String
}

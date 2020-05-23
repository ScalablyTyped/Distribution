package typings.emotionSerialize

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /* Rewritten from type alias, can be one of: 
    - scala.Null
    - js.UndefOr[scala.Nothing]
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
  /* Rewritten from type alias, can be one of: 
    - scala.Null
    - js.UndefOr[scala.Nothing]
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
  type Keyframes = typings.emotionSerialize.anon.Anim with java.lang.String
}

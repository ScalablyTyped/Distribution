package typings.emotionSerialize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectInterpolation[MP]
  extends CSSOthersObject[MP]
     with CSSPropertiesWithMultiValues
     with CSSPseudos[MP]
     with _Interpolation[MP]

object ObjectInterpolation {
  @scala.inline
  def apply[MP](
    CSSPropertiesWithMultiValues: CSSPropertiesWithMultiValues = null,
    CSSPseudos: CSSPseudos[MP] = null,
    _Interpolation: _Interpolation[MP] = null
  ): ObjectInterpolation[MP] = {
    val __obj = js.Dynamic.literal()
    if (CSSPropertiesWithMultiValues != null) js.Dynamic.global.Object.assign(__obj, CSSPropertiesWithMultiValues)
    if (CSSPseudos != null) js.Dynamic.global.Object.assign(__obj, CSSPseudos)
    if (_Interpolation != null) js.Dynamic.global.Object.assign(__obj, _Interpolation)
    __obj.asInstanceOf[ObjectInterpolation[MP]]
  }
}


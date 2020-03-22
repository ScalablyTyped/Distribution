package typings.emotionSerialize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CSSObject
  extends CSSOthersObjectForCSSObject
     with CSSPropertiesWithMultiValues
     with CSSPseudosForCSSObject
     with _CSSInterpolation

object CSSObject {
  @scala.inline
  def apply(
    CSSPropertiesWithMultiValues: CSSPropertiesWithMultiValues = null,
    CSSPseudosForCSSObject: CSSPseudosForCSSObject = null,
    _CSSInterpolation: _CSSInterpolation = null
  ): CSSObject = {
    val __obj = js.Dynamic.literal()
    if (CSSPropertiesWithMultiValues != null) js.Dynamic.global.Object.assign(__obj, CSSPropertiesWithMultiValues)
    if (CSSPseudosForCSSObject != null) js.Dynamic.global.Object.assign(__obj, CSSPseudosForCSSObject)
    if (_CSSInterpolation != null) js.Dynamic.global.Object.assign(__obj, _CSSInterpolation)
    __obj.asInstanceOf[CSSObject]
  }
}


package typings.emotionSerialize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CSSObject
  extends CSSOthersObjectForCSSObject
     with CSSPropertiesWithMultiValues
     with CSSPseudosForCSSObject
     with _CSSInterpolation

object CSSObject {
  @scala.inline
  def apply(): CSSObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CSSObject]
  }
}


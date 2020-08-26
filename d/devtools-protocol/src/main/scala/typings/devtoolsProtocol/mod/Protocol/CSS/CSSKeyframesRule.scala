package typings.devtoolsProtocol.mod.Protocol.CSS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CSSKeyframesRule extends js.Object {
  /**
    * Animation name.
    */
  var animationName: Value = js.native
  /**
    * List of keyframes.
    */
  var keyframes: js.Array[CSSKeyframeRule] = js.native
}

object CSSKeyframesRule {
  @scala.inline
  def apply(animationName: Value, keyframes: js.Array[CSSKeyframeRule]): CSSKeyframesRule = {
    val __obj = js.Dynamic.literal(animationName = animationName.asInstanceOf[js.Any], keyframes = keyframes.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSSKeyframesRule]
  }
  @scala.inline
  implicit class CSSKeyframesRuleOps[Self <: CSSKeyframesRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAnimationName(value: Value): Self = this.set("animationName", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyframesVarargs(value: CSSKeyframeRule*): Self = this.set("keyframes", js.Array(value :_*))
    @scala.inline
    def setKeyframes(value: js.Array[CSSKeyframeRule]): Self = this.set("keyframes", value.asInstanceOf[js.Any])
  }
  
}


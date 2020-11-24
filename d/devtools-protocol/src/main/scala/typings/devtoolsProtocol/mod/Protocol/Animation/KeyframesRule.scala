package typings.devtoolsProtocol.mod.Protocol.Animation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyframesRule extends js.Object {
  
  /**
    * List of animation keyframes.
    */
  var keyframes: js.Array[KeyframeStyle] = js.native
  
  /**
    * CSS keyframed animation's name.
    */
  var name: js.UndefOr[String] = js.native
}
object KeyframesRule {
  
  @scala.inline
  def apply(keyframes: js.Array[KeyframeStyle]): KeyframesRule = {
    val __obj = js.Dynamic.literal(keyframes = keyframes.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyframesRule]
  }
  
  @scala.inline
  implicit class KeyframesRuleOps[Self <: KeyframesRule] (val x: Self) extends AnyVal {
    
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
    def setKeyframesVarargs(value: KeyframeStyle*): Self = this.set("keyframes", js.Array(value :_*))
    
    @scala.inline
    def setKeyframes(value: js.Array[KeyframeStyle]): Self = this.set("keyframes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}

package typings.devtoolsProtocol.mod.Protocol.CSS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetStyleTextsResponse extends js.Object {
  
  /**
    * The resulting styles after modification.
    */
  var styles: js.Array[CSSStyle] = js.native
}
object SetStyleTextsResponse {
  
  @scala.inline
  def apply(styles: js.Array[CSSStyle]): SetStyleTextsResponse = {
    val __obj = js.Dynamic.literal(styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetStyleTextsResponse]
  }
  
  @scala.inline
  implicit class SetStyleTextsResponseOps[Self <: SetStyleTextsResponse] (val x: Self) extends AnyVal {
    
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
    def setStylesVarargs(value: CSSStyle*): Self = this.set("styles", js.Array(value :_*))
    
    @scala.inline
    def setStyles(value: js.Array[CSSStyle]): Self = this.set("styles", value.asInstanceOf[js.Any])
  }
}

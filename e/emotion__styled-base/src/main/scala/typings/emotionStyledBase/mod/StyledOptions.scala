package typings.emotionStyledBase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StyledOptions extends js.Object {
  
  var label: js.UndefOr[String] = js.native
  
  var shouldForwardProp: js.UndefOr[js.Function1[/* propName */ String, Boolean]] = js.native
  
  var target: js.UndefOr[String] = js.native
}
object StyledOptions {
  
  @scala.inline
  def apply(): StyledOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StyledOptions]
  }
  
  @scala.inline
  implicit class StyledOptionsOps[Self <: StyledOptions] (val x: Self) extends AnyVal {
    
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
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setShouldForwardProp(value: /* propName */ String => Boolean): Self = this.set("shouldForwardProp", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteShouldForwardProp: Self = this.set("shouldForwardProp", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
}

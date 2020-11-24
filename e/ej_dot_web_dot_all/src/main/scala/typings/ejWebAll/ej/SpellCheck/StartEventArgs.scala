package typings.ejWebAll.ej.SpellCheck

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartEventArgs extends js.Object {
  
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  
  /** Returns the error words details.
    */
  var errorWords: js.UndefOr[js.Any] = js.native
  
  /** Returns the SpellCheck model.
    */
  var model: js.UndefOr[Model] = js.native
  
  /** Returns the request type value.
    */
  var requestType: js.UndefOr[String] = js.native
  
  /** Returns the input string.
    */
  var targetSentence: js.UndefOr[String] = js.native
  
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.native
}
object StartEventArgs {
  
  @scala.inline
  def apply(): StartEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartEventArgs]
  }
  
  @scala.inline
  implicit class StartEventArgsOps[Self <: StartEventArgs] (val x: Self) extends AnyVal {
    
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
    def setCancel(value: Boolean): Self = this.set("cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    
    @scala.inline
    def setErrorWords(value: js.Any): Self = this.set("errorWords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorWords: Self = this.set("errorWords", js.undefined)
    
    @scala.inline
    def setModel(value: Model): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    
    @scala.inline
    def setRequestType(value: String): Self = this.set("requestType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestType: Self = this.set("requestType", js.undefined)
    
    @scala.inline
    def setTargetSentence(value: String): Self = this.set("targetSentence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetSentence: Self = this.set("targetSentence", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}

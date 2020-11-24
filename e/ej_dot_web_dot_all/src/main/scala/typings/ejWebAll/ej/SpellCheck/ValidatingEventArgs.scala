package typings.ejWebAll.ej.SpellCheck

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidatingEventArgs extends js.Object {
  
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  
  /** Returns the change word to replace the error word.
    */
  var changeWord: js.UndefOr[String] = js.native
  
  /** Returns the error word to change.
    */
  var changeableWord: js.UndefOr[String] = js.native
  
  /** Returns the custom word to add into dictionary file.
    */
  var customWord: js.UndefOr[String] = js.native
  
  /** Returns the error word to ignore.
    */
  var ignoreWord: js.UndefOr[String] = js.native
  
  /** Returns the index of an error word.
    */
  var index: js.UndefOr[Double] = js.native
  
  /** Returns the SpellCheck model.
    */
  var model: js.UndefOr[Model] = js.native
  
  /** Returns the validating request type.
    */
  var requestType: js.UndefOr[String] = js.native
  
  /** Returns the target content.
    */
  var targetContent: js.UndefOr[String] = js.native
  
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.native
}
object ValidatingEventArgs {
  
  @scala.inline
  def apply(): ValidatingEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidatingEventArgs]
  }
  
  @scala.inline
  implicit class ValidatingEventArgsOps[Self <: ValidatingEventArgs] (val x: Self) extends AnyVal {
    
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
    def setChangeWord(value: String): Self = this.set("changeWord", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChangeWord: Self = this.set("changeWord", js.undefined)
    
    @scala.inline
    def setChangeableWord(value: String): Self = this.set("changeableWord", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChangeableWord: Self = this.set("changeableWord", js.undefined)
    
    @scala.inline
    def setCustomWord(value: String): Self = this.set("customWord", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomWord: Self = this.set("customWord", js.undefined)
    
    @scala.inline
    def setIgnoreWord(value: String): Self = this.set("ignoreWord", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreWord: Self = this.set("ignoreWord", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    
    @scala.inline
    def setModel(value: Model): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    
    @scala.inline
    def setRequestType(value: String): Self = this.set("requestType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestType: Self = this.set("requestType", js.undefined)
    
    @scala.inline
    def setTargetContent(value: String): Self = this.set("targetContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetContent: Self = this.set("targetContent", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}

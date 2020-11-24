package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientHtmlEditor.ActiveTabChanged event that concerns manipulations on tabs.
  */
@js.native
trait ASPxClientHtmlEditorTabEventArgs extends ASPxClientEventArgs {
  
  /**
    * Gets the name that uniquely identifies an editor tab.
    */
  var name: String = js.native
}
object ASPxClientHtmlEditorTabEventArgs {
  
  @scala.inline
  def apply(name: String): ASPxClientHtmlEditorTabEventArgs = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientHtmlEditorTabEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientHtmlEditorTabEventArgsOps[Self <: ASPxClientHtmlEditorTabEventArgs] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}

package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientUploadControl.TextChanged client event that allows you to respond to an end-user changing an edit box's text.
  */
@js.native
trait ASPxClientUploadControlTextChangedEventArgs extends ASPxClientEventArgs {
  
  /**
    * Gets the index of a file input element within the ASPxUploadControl.
    */
  var inputIndex: Double = js.native
}
object ASPxClientUploadControlTextChangedEventArgs {
  
  @scala.inline
  def apply(inputIndex: Double): ASPxClientUploadControlTextChangedEventArgs = {
    val __obj = js.Dynamic.literal(inputIndex = inputIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientUploadControlTextChangedEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientUploadControlTextChangedEventArgsOps[Self <: ASPxClientUploadControlTextChangedEventArgs] (val x: Self) extends AnyVal {
    
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
    def setInputIndex(value: Double): Self = this.set("inputIndex", value.asInstanceOf[js.Any])
  }
}

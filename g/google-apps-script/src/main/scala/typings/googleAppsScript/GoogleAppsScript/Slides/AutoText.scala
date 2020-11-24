package typings.googleAppsScript.GoogleAppsScript.Slides

import typings.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An element of text that is dynamically replaced with content that can change over time, such as a
  * slide number.
  */
@js.native
trait AutoText extends js.Object {
  
  def getAutoTextType(): AutoTextType = js.native
  
  def getIndex(): Integer = js.native
  
  def getRange(): TextRange = js.native
}
object AutoText {
  
  @scala.inline
  def apply(getAutoTextType: () => AutoTextType, getIndex: () => Integer, getRange: () => TextRange): AutoText = {
    val __obj = js.Dynamic.literal(getAutoTextType = js.Any.fromFunction0(getAutoTextType), getIndex = js.Any.fromFunction0(getIndex), getRange = js.Any.fromFunction0(getRange))
    __obj.asInstanceOf[AutoText]
  }
  
  @scala.inline
  implicit class AutoTextOps[Self <: AutoText] (val x: Self) extends AnyVal {
    
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
    def setGetAutoTextType(value: () => AutoTextType): Self = this.set("getAutoTextType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetIndex(value: () => Integer): Self = this.set("getIndex", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRange(value: () => TextRange): Self = this.set("getRange", js.Any.fromFunction0(value))
  }
}

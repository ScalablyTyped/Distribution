package typings.googleAppsScript.GoogleAppsScript.Script

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A builder for document triggers.
  */
@js.native
trait DocumentTriggerBuilder extends js.Object {
  
  def create(): Trigger = js.native
  
  def onOpen(): DocumentTriggerBuilder = js.native
}
object DocumentTriggerBuilder {
  
  @scala.inline
  def apply(create: () => Trigger, onOpen: () => DocumentTriggerBuilder): DocumentTriggerBuilder = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction0(create), onOpen = js.Any.fromFunction0(onOpen))
    __obj.asInstanceOf[DocumentTriggerBuilder]
  }
  
  @scala.inline
  implicit class DocumentTriggerBuilderOps[Self <: DocumentTriggerBuilder] (val x: Self) extends AnyVal {
    
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
    def setCreate(value: () => Trigger): Self = this.set("create", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnOpen(value: () => DocumentTriggerBuilder): Self = this.set("onOpen", js.Any.fromFunction0(value))
  }
}

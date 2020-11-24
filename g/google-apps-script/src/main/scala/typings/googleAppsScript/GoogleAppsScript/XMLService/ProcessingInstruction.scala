package typings.googleAppsScript.GoogleAppsScript.XMLService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A representation of an XML ProcessingInstruction node.
  */
@js.native
trait ProcessingInstruction extends Content {
  
  def getData(): String = js.native
  
  def getTarget(): String = js.native
}
object ProcessingInstruction {
  
  @scala.inline
  def apply(
    asCdata: () => Cdata,
    asComment: () => Comment,
    asDocType: () => DocType,
    asElement: () => Element,
    asEntityRef: () => EntityRef,
    asProcessingInstruction: () => ProcessingInstruction,
    asText: () => Text,
    detach: () => Content,
    getData: () => String,
    getParentElement: () => Element,
    getTarget: () => String,
    getType: () => ContentType,
    getValue: () => String
  ): ProcessingInstruction = {
    val __obj = js.Dynamic.literal(asCdata = js.Any.fromFunction0(asCdata), asComment = js.Any.fromFunction0(asComment), asDocType = js.Any.fromFunction0(asDocType), asElement = js.Any.fromFunction0(asElement), asEntityRef = js.Any.fromFunction0(asEntityRef), asProcessingInstruction = js.Any.fromFunction0(asProcessingInstruction), asText = js.Any.fromFunction0(asText), detach = js.Any.fromFunction0(detach), getData = js.Any.fromFunction0(getData), getParentElement = js.Any.fromFunction0(getParentElement), getTarget = js.Any.fromFunction0(getTarget), getType = js.Any.fromFunction0(getType), getValue = js.Any.fromFunction0(getValue))
    __obj.asInstanceOf[ProcessingInstruction]
  }
  
  @scala.inline
  implicit class ProcessingInstructionOps[Self <: ProcessingInstruction] (val x: Self) extends AnyVal {
    
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
    def setGetData(value: () => String): Self = this.set("getData", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTarget(value: () => String): Self = this.set("getTarget", js.Any.fromFunction0(value))
  }
}

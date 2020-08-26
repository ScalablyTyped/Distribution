package typings.googleAppsScript.GoogleAppsScript.XMLService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A representation of an XML Text node.
  */
@js.native
trait Text extends Content {
  def append(text: String): Text = js.native
  def getText(): String = js.native
  def setText(text: String): Text = js.native
}

object Text {
  @scala.inline
  def apply(
    append: String => Text,
    asCdata: () => Cdata,
    asComment: () => Comment,
    asDocType: () => DocType,
    asElement: () => Element,
    asEntityRef: () => EntityRef,
    asProcessingInstruction: () => ProcessingInstruction,
    asText: () => Text,
    detach: () => Content,
    getParentElement: () => Element,
    getText: () => String,
    getType: () => ContentType,
    getValue: () => String,
    setText: String => Text
  ): Text = {
    val __obj = js.Dynamic.literal(append = js.Any.fromFunction1(append), asCdata = js.Any.fromFunction0(asCdata), asComment = js.Any.fromFunction0(asComment), asDocType = js.Any.fromFunction0(asDocType), asElement = js.Any.fromFunction0(asElement), asEntityRef = js.Any.fromFunction0(asEntityRef), asProcessingInstruction = js.Any.fromFunction0(asProcessingInstruction), asText = js.Any.fromFunction0(asText), detach = js.Any.fromFunction0(detach), getParentElement = js.Any.fromFunction0(getParentElement), getText = js.Any.fromFunction0(getText), getType = js.Any.fromFunction0(getType), getValue = js.Any.fromFunction0(getValue), setText = js.Any.fromFunction1(setText))
    __obj.asInstanceOf[Text]
  }
  @scala.inline
  implicit class TextOps[Self <: Text] (val x: Self) extends AnyVal {
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
    def setAppend(value: String => Text): Self = this.set("append", js.Any.fromFunction1(value))
    @scala.inline
    def setGetText(value: () => String): Self = this.set("getText", js.Any.fromFunction0(value))
    @scala.inline
    def setSetText(value: String => Text): Self = this.set("setText", js.Any.fromFunction1(value))
  }
  
}


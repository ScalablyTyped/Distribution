package typings.googleAppsScript.GoogleAppsScript.XMLService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A representation of an XML CDATASection node.
  *
  *     // Create and log an XML document that shows how special characters like '<', '>', and '&' are
  *     // stored in a CDATASection node as compared to in a Text node.
  *     var illegalCharacters = '<em>The Amazing Adventures of Kavalier & Clay</em>';
  *     var cdata = XmlService.createCdata(illegalCharacters);
  *     var text = XmlService.createText(illegalCharacters);
  *     var root = XmlService.createElement('root').addContent(cdata).addContent(text);
  *     var document = XmlService.createDocument(root);
  *     var xml = XmlService.getPrettyFormat().format(document);
  *     Logger.log(xml);
  */
trait Cdata extends Content {
  def append(text: String): Text
  def getText(): String
  def setText(text: String): Text
}

object Cdata {
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
  ): Cdata = {
    val __obj = js.Dynamic.literal(append = js.Any.fromFunction1(append), asCdata = js.Any.fromFunction0(asCdata), asComment = js.Any.fromFunction0(asComment), asDocType = js.Any.fromFunction0(asDocType), asElement = js.Any.fromFunction0(asElement), asEntityRef = js.Any.fromFunction0(asEntityRef), asProcessingInstruction = js.Any.fromFunction0(asProcessingInstruction), asText = js.Any.fromFunction0(asText), detach = js.Any.fromFunction0(detach), getParentElement = js.Any.fromFunction0(getParentElement), getText = js.Any.fromFunction0(getText), getType = js.Any.fromFunction0(getType), getValue = js.Any.fromFunction0(getValue), setText = js.Any.fromFunction1(setText))
  
    __obj.asInstanceOf[Cdata]
  }
}


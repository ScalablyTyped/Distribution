package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DocumentNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.BaseNs.Blob
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InlineImage extends js.Object {
  def copy(): InlineImage
  def getAltDescription(): String
  def getAltTitle(): String
  def getAs(contentType: String): Blob
  def getAttributes(): js.Object
  def getBlob(): Blob
  def getHeight(): Integer
  def getLinkUrl(): String
  def getNextSibling(): Element
  def getParent(): ContainerElement
  def getPreviousSibling(): Element
  def getType(): ElementType
  def getWidth(): Integer
  def isAtDocumentEnd(): Boolean
  def merge(): InlineImage
  def removeFromParent(): InlineImage
  def setAltDescription(description: String): InlineImage
  def setAltTitle(title: String): InlineImage
  def setAttributes(attributes: js.Object): InlineImage
  def setHeight(height: Integer): InlineImage
  def setLinkUrl(url: String): InlineImage
  def setWidth(width: Integer): InlineImage
}

object InlineImage {
  @scala.inline
  def apply(
    copy: () => InlineImage,
    getAltDescription: () => String,
    getAltTitle: () => String,
    getAs: String => Blob,
    getAttributes: () => js.Object,
    getBlob: () => Blob,
    getHeight: () => Integer,
    getLinkUrl: () => String,
    getNextSibling: () => Element,
    getParent: () => ContainerElement,
    getPreviousSibling: () => Element,
    getType: () => ElementType,
    getWidth: () => Integer,
    isAtDocumentEnd: () => Boolean,
    merge: () => InlineImage,
    removeFromParent: () => InlineImage,
    setAltDescription: String => InlineImage,
    setAltTitle: String => InlineImage,
    setAttributes: js.Object => InlineImage,
    setHeight: Integer => InlineImage,
    setLinkUrl: String => InlineImage,
    setWidth: Integer => InlineImage
  ): InlineImage = {
    val __obj = js.Dynamic.literal(copy = js.Any.fromFunction0(copy), getAltDescription = js.Any.fromFunction0(getAltDescription), getAltTitle = js.Any.fromFunction0(getAltTitle), getAs = js.Any.fromFunction1(getAs), getAttributes = js.Any.fromFunction0(getAttributes), getBlob = js.Any.fromFunction0(getBlob), getHeight = js.Any.fromFunction0(getHeight), getLinkUrl = js.Any.fromFunction0(getLinkUrl), getNextSibling = js.Any.fromFunction0(getNextSibling), getParent = js.Any.fromFunction0(getParent), getPreviousSibling = js.Any.fromFunction0(getPreviousSibling), getType = js.Any.fromFunction0(getType), getWidth = js.Any.fromFunction0(getWidth), isAtDocumentEnd = js.Any.fromFunction0(isAtDocumentEnd), merge = js.Any.fromFunction0(merge), removeFromParent = js.Any.fromFunction0(removeFromParent), setAltDescription = js.Any.fromFunction1(setAltDescription), setAltTitle = js.Any.fromFunction1(setAltTitle), setAttributes = js.Any.fromFunction1(setAttributes), setHeight = js.Any.fromFunction1(setHeight), setLinkUrl = js.Any.fromFunction1(setLinkUrl), setWidth = js.Any.fromFunction1(setWidth))
  
    __obj.asInstanceOf[InlineImage]
  }
}


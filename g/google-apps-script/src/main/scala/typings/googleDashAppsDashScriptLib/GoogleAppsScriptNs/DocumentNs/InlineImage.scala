package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocumentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InlineImage extends js.Object {
  def copy(): InlineImage
  def getAltDescription(): java.lang.String
  def getAltTitle(): java.lang.String
  def getAs(contentType: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Blob
  def getAttributes(): js.Object
  def getBlob(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Blob
  def getHeight(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getLinkUrl(): java.lang.String
  def getNextSibling(): Element
  def getParent(): ContainerElement
  def getPreviousSibling(): Element
  def getType(): ElementType
  def getWidth(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def isAtDocumentEnd(): scala.Boolean
  def merge(): InlineImage
  def removeFromParent(): InlineImage
  def setAltDescription(description: java.lang.String): InlineImage
  def setAltTitle(title: java.lang.String): InlineImage
  def setAttributes(attributes: js.Object): InlineImage
  def setHeight(height: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): InlineImage
  def setLinkUrl(url: java.lang.String): InlineImage
  def setWidth(width: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): InlineImage
}

object InlineImage {
  @scala.inline
  def apply(
    copy: () => InlineImage,
    getAltDescription: () => java.lang.String,
    getAltTitle: () => java.lang.String,
    getAs: java.lang.String => googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Blob,
    getAttributes: () => js.Object,
    getBlob: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Blob,
    getHeight: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    getLinkUrl: () => java.lang.String,
    getNextSibling: () => Element,
    getParent: () => ContainerElement,
    getPreviousSibling: () => Element,
    getType: () => ElementType,
    getWidth: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    isAtDocumentEnd: () => scala.Boolean,
    merge: () => InlineImage,
    removeFromParent: () => InlineImage,
    setAltDescription: java.lang.String => InlineImage,
    setAltTitle: java.lang.String => InlineImage,
    setAttributes: js.Object => InlineImage,
    setHeight: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => InlineImage,
    setLinkUrl: java.lang.String => InlineImage,
    setWidth: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => InlineImage
  ): InlineImage = {
    val __obj = js.Dynamic.literal(copy = js.Any.fromFunction0(copy), getAltDescription = js.Any.fromFunction0(getAltDescription), getAltTitle = js.Any.fromFunction0(getAltTitle), getAs = js.Any.fromFunction1(getAs), getAttributes = js.Any.fromFunction0(getAttributes), getBlob = js.Any.fromFunction0(getBlob), getHeight = js.Any.fromFunction0(getHeight), getLinkUrl = js.Any.fromFunction0(getLinkUrl), getNextSibling = js.Any.fromFunction0(getNextSibling), getParent = js.Any.fromFunction0(getParent), getPreviousSibling = js.Any.fromFunction0(getPreviousSibling), getType = js.Any.fromFunction0(getType), getWidth = js.Any.fromFunction0(getWidth), isAtDocumentEnd = js.Any.fromFunction0(isAtDocumentEnd), merge = js.Any.fromFunction0(merge), removeFromParent = js.Any.fromFunction0(removeFromParent), setAltDescription = js.Any.fromFunction1(setAltDescription), setAltTitle = js.Any.fromFunction1(setAltTitle), setAttributes = js.Any.fromFunction1(setAttributes), setHeight = js.Any.fromFunction1(setHeight), setLinkUrl = js.Any.fromFunction1(setLinkUrl), setWidth = js.Any.fromFunction1(setWidth))
  
    __obj.asInstanceOf[InlineImage]
  }
}


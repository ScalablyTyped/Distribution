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
    copy: js.Function0[InlineImage],
    getAltDescription: js.Function0[java.lang.String],
    getAltTitle: js.Function0[java.lang.String],
    getAs: js.Function1[java.lang.String, googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Blob],
    getAttributes: js.Function0[js.Object],
    getBlob: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Blob],
    getHeight: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer],
    getLinkUrl: js.Function0[java.lang.String],
    getNextSibling: js.Function0[Element],
    getParent: js.Function0[ContainerElement],
    getPreviousSibling: js.Function0[Element],
    getType: js.Function0[ElementType],
    getWidth: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer],
    isAtDocumentEnd: js.Function0[scala.Boolean],
    merge: js.Function0[InlineImage],
    removeFromParent: js.Function0[InlineImage],
    setAltDescription: js.Function1[java.lang.String, InlineImage],
    setAltTitle: js.Function1[java.lang.String, InlineImage],
    setAttributes: js.Function1[js.Object, InlineImage],
    setHeight: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, InlineImage],
    setLinkUrl: js.Function1[java.lang.String, InlineImage],
    setWidth: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, InlineImage]
  ): InlineImage = {
    val __obj = js.Dynamic.literal(copy = copy, getAltDescription = getAltDescription, getAltTitle = getAltTitle, getAs = getAs, getAttributes = getAttributes, getBlob = getBlob, getHeight = getHeight, getLinkUrl = getLinkUrl, getNextSibling = getNextSibling, getParent = getParent, getPreviousSibling = getPreviousSibling, getType = getType, getWidth = getWidth, isAtDocumentEnd = isAtDocumentEnd, merge = merge, removeFromParent = removeFromParent, setAltDescription = setAltDescription, setAltTitle = setAltTitle, setAttributes = setAttributes, setHeight = setHeight, setLinkUrl = setLinkUrl, setWidth = setWidth)
  
    __obj.asInstanceOf[InlineImage]
  }
}


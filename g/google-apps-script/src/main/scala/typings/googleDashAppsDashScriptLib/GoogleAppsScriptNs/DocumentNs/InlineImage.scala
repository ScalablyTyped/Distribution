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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("copy")(copy)
    __obj.updateDynamic("getAltDescription")(getAltDescription)
    __obj.updateDynamic("getAltTitle")(getAltTitle)
    __obj.updateDynamic("getAs")(getAs)
    __obj.updateDynamic("getAttributes")(getAttributes)
    __obj.updateDynamic("getBlob")(getBlob)
    __obj.updateDynamic("getHeight")(getHeight)
    __obj.updateDynamic("getLinkUrl")(getLinkUrl)
    __obj.updateDynamic("getNextSibling")(getNextSibling)
    __obj.updateDynamic("getParent")(getParent)
    __obj.updateDynamic("getPreviousSibling")(getPreviousSibling)
    __obj.updateDynamic("getType")(getType)
    __obj.updateDynamic("getWidth")(getWidth)
    __obj.updateDynamic("isAtDocumentEnd")(isAtDocumentEnd)
    __obj.updateDynamic("merge")(merge)
    __obj.updateDynamic("removeFromParent")(removeFromParent)
    __obj.updateDynamic("setAltDescription")(setAltDescription)
    __obj.updateDynamic("setAltTitle")(setAltTitle)
    __obj.updateDynamic("setAttributes")(setAttributes)
    __obj.updateDynamic("setHeight")(setHeight)
    __obj.updateDynamic("setLinkUrl")(setLinkUrl)
    __obj.updateDynamic("setWidth")(setWidth)
    __obj.asInstanceOf[InlineImage]
  }
}


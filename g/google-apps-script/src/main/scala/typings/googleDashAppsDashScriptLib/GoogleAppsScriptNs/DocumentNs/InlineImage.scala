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


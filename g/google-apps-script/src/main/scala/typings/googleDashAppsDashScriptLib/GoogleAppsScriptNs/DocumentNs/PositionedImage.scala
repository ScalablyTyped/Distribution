package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocumentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PositionedImage extends js.Object {
  def getAs(contentType: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Blob
  def getBlob(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Blob
  def getHeight(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getId(): java.lang.String
  def getLayout(): PositionedLayout
  def getLeftOffset(): stdLib.Number
  def getParagraph(): Paragraph
  def getTopOffset(): stdLib.Number
  def getWidth(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def setHeight(height: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): PositionedImage
  def setLayout(layout: PositionedLayout): PositionedImage
  def setLeftOffset(offset: stdLib.Number): PositionedImage
  def setTopOffset(offset: stdLib.Number): PositionedImage
  def setWidth(width: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): PositionedImage
}


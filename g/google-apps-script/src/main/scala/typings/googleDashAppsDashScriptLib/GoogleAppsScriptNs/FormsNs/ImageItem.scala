package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.FormsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ImageItem extends js.Object {
  def duplicate(): ImageItem
  def getAlignment(): Alignment
  def getHelpText(): java.lang.String
  def getId(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getImage(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Blob
  def getIndex(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getTitle(): java.lang.String
  def getType(): ItemType
  def getWidth(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def setAlignment(alignment: Alignment): ImageItem
  def setHelpText(text: java.lang.String): ImageItem
  def setImage(image: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.BlobSource): ImageItem
  def setTitle(title: java.lang.String): ImageItem
  def setWidth(width: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): ImageItem
}


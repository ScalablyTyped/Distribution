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

object ImageItem {
  @scala.inline
  def apply(
    duplicate: () => ImageItem,
    getAlignment: () => Alignment,
    getHelpText: () => java.lang.String,
    getId: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    getImage: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Blob,
    getIndex: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    getTitle: () => java.lang.String,
    getType: () => ItemType,
    getWidth: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    setAlignment: Alignment => ImageItem,
    setHelpText: java.lang.String => ImageItem,
    setImage: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.BlobSource => ImageItem,
    setTitle: java.lang.String => ImageItem,
    setWidth: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => ImageItem
  ): ImageItem = {
    val __obj = js.Dynamic.literal(duplicate = js.Any.fromFunction0(duplicate), getAlignment = js.Any.fromFunction0(getAlignment), getHelpText = js.Any.fromFunction0(getHelpText), getId = js.Any.fromFunction0(getId), getImage = js.Any.fromFunction0(getImage), getIndex = js.Any.fromFunction0(getIndex), getTitle = js.Any.fromFunction0(getTitle), getType = js.Any.fromFunction0(getType), getWidth = js.Any.fromFunction0(getWidth), setAlignment = js.Any.fromFunction1(setAlignment), setHelpText = js.Any.fromFunction1(setHelpText), setImage = js.Any.fromFunction1(setImage), setTitle = js.Any.fromFunction1(setTitle), setWidth = js.Any.fromFunction1(setWidth))
  
    __obj.asInstanceOf[ImageItem]
  }
}


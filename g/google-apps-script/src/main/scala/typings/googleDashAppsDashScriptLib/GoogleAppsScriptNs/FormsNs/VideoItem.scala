package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.FormsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoItem extends js.Object {
  def duplicate(): VideoItem
  def getAlignment(): Alignment
  def getHelpText(): java.lang.String
  def getId(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getIndex(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getTitle(): java.lang.String
  def getType(): ItemType
  def getWidth(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def setAlignment(alignment: Alignment): VideoItem
  def setHelpText(text: java.lang.String): VideoItem
  def setTitle(title: java.lang.String): VideoItem
  def setVideoUrl(youtubeUrl: java.lang.String): VideoItem
  def setWidth(width: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): VideoItem
}

object VideoItem {
  @scala.inline
  def apply(
    duplicate: () => VideoItem,
    getAlignment: () => Alignment,
    getHelpText: () => java.lang.String,
    getId: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    getIndex: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    getTitle: () => java.lang.String,
    getType: () => ItemType,
    getWidth: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    setAlignment: Alignment => VideoItem,
    setHelpText: java.lang.String => VideoItem,
    setTitle: java.lang.String => VideoItem,
    setVideoUrl: java.lang.String => VideoItem,
    setWidth: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => VideoItem
  ): VideoItem = {
    val __obj = js.Dynamic.literal(duplicate = js.Any.fromFunction0(duplicate), getAlignment = js.Any.fromFunction0(getAlignment), getHelpText = js.Any.fromFunction0(getHelpText), getId = js.Any.fromFunction0(getId), getIndex = js.Any.fromFunction0(getIndex), getTitle = js.Any.fromFunction0(getTitle), getType = js.Any.fromFunction0(getType), getWidth = js.Any.fromFunction0(getWidth), setAlignment = js.Any.fromFunction1(setAlignment), setHelpText = js.Any.fromFunction1(setHelpText), setTitle = js.Any.fromFunction1(setTitle), setVideoUrl = js.Any.fromFunction1(setVideoUrl), setWidth = js.Any.fromFunction1(setWidth))
  
    __obj.asInstanceOf[VideoItem]
  }
}


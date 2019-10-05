package typings.googleDashAppsDashScript.GoogleAppsScript.Forms

import typings.googleDashAppsDashScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoItem extends js.Object {
  def duplicate(): VideoItem
  def getAlignment(): Alignment
  def getHelpText(): String
  def getId(): Integer
  def getIndex(): Integer
  def getTitle(): String
  def getType(): ItemType
  def getWidth(): Integer
  def setAlignment(alignment: Alignment): VideoItem
  def setHelpText(text: String): VideoItem
  def setTitle(title: String): VideoItem
  def setVideoUrl(youtubeUrl: String): VideoItem
  def setWidth(width: Integer): VideoItem
}

object VideoItem {
  @scala.inline
  def apply(
    duplicate: () => VideoItem,
    getAlignment: () => Alignment,
    getHelpText: () => String,
    getId: () => Integer,
    getIndex: () => Integer,
    getTitle: () => String,
    getType: () => ItemType,
    getWidth: () => Integer,
    setAlignment: Alignment => VideoItem,
    setHelpText: String => VideoItem,
    setTitle: String => VideoItem,
    setVideoUrl: String => VideoItem,
    setWidth: Integer => VideoItem
  ): VideoItem = {
    val __obj = js.Dynamic.literal(duplicate = js.Any.fromFunction0(duplicate), getAlignment = js.Any.fromFunction0(getAlignment), getHelpText = js.Any.fromFunction0(getHelpText), getId = js.Any.fromFunction0(getId), getIndex = js.Any.fromFunction0(getIndex), getTitle = js.Any.fromFunction0(getTitle), getType = js.Any.fromFunction0(getType), getWidth = js.Any.fromFunction0(getWidth), setAlignment = js.Any.fromFunction1(setAlignment), setHelpText = js.Any.fromFunction1(setHelpText), setTitle = js.Any.fromFunction1(setTitle), setVideoUrl = js.Any.fromFunction1(setVideoUrl), setWidth = js.Any.fromFunction1(setWidth))
  
    __obj.asInstanceOf[VideoItem]
  }
}


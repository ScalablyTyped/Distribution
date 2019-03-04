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
    duplicate: js.Function0[VideoItem],
    getAlignment: js.Function0[Alignment],
    getHelpText: js.Function0[java.lang.String],
    getId: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer],
    getIndex: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer],
    getTitle: js.Function0[java.lang.String],
    getType: js.Function0[ItemType],
    getWidth: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer],
    setAlignment: js.Function1[Alignment, VideoItem],
    setHelpText: js.Function1[java.lang.String, VideoItem],
    setTitle: js.Function1[java.lang.String, VideoItem],
    setVideoUrl: js.Function1[java.lang.String, VideoItem],
    setWidth: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, VideoItem]
  ): VideoItem = {
    val __obj = js.Dynamic.literal(duplicate = duplicate, getAlignment = getAlignment, getHelpText = getHelpText, getId = getId, getIndex = getIndex, getTitle = getTitle, getType = getType, getWidth = getWidth, setAlignment = setAlignment, setHelpText = setHelpText, setTitle = setTitle, setVideoUrl = setVideoUrl, setWidth = setWidth)
  
    __obj.asInstanceOf[VideoItem]
  }
}


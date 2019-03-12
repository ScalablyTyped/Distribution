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

object PositionedImage {
  @scala.inline
  def apply(
    getAs: java.lang.String => googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Blob,
    getBlob: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Blob,
    getHeight: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    getId: () => java.lang.String,
    getLayout: () => PositionedLayout,
    getLeftOffset: () => stdLib.Number,
    getParagraph: () => Paragraph,
    getTopOffset: () => stdLib.Number,
    getWidth: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    setHeight: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => PositionedImage,
    setLayout: PositionedLayout => PositionedImage,
    setLeftOffset: stdLib.Number => PositionedImage,
    setTopOffset: stdLib.Number => PositionedImage,
    setWidth: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => PositionedImage
  ): PositionedImage = {
    val __obj = js.Dynamic.literal(getAs = js.Any.fromFunction1(getAs), getBlob = js.Any.fromFunction0(getBlob), getHeight = js.Any.fromFunction0(getHeight), getId = js.Any.fromFunction0(getId), getLayout = js.Any.fromFunction0(getLayout), getLeftOffset = js.Any.fromFunction0(getLeftOffset), getParagraph = js.Any.fromFunction0(getParagraph), getTopOffset = js.Any.fromFunction0(getTopOffset), getWidth = js.Any.fromFunction0(getWidth), setHeight = js.Any.fromFunction1(setHeight), setLayout = js.Any.fromFunction1(setLayout), setLeftOffset = js.Any.fromFunction1(setLeftOffset), setTopOffset = js.Any.fromFunction1(setTopOffset), setWidth = js.Any.fromFunction1(setWidth))
  
    __obj.asInstanceOf[PositionedImage]
  }
}


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
    getAs: js.Function1[java.lang.String, googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Blob],
    getBlob: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Blob],
    getHeight: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer],
    getId: js.Function0[java.lang.String],
    getLayout: js.Function0[PositionedLayout],
    getLeftOffset: js.Function0[stdLib.Number],
    getParagraph: js.Function0[Paragraph],
    getTopOffset: js.Function0[stdLib.Number],
    getWidth: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer],
    setHeight: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, PositionedImage],
    setLayout: js.Function1[PositionedLayout, PositionedImage],
    setLeftOffset: js.Function1[stdLib.Number, PositionedImage],
    setTopOffset: js.Function1[stdLib.Number, PositionedImage],
    setWidth: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, PositionedImage]
  ): PositionedImage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getAs")(getAs)
    __obj.updateDynamic("getBlob")(getBlob)
    __obj.updateDynamic("getHeight")(getHeight)
    __obj.updateDynamic("getId")(getId)
    __obj.updateDynamic("getLayout")(getLayout)
    __obj.updateDynamic("getLeftOffset")(getLeftOffset)
    __obj.updateDynamic("getParagraph")(getParagraph)
    __obj.updateDynamic("getTopOffset")(getTopOffset)
    __obj.updateDynamic("getWidth")(getWidth)
    __obj.updateDynamic("setHeight")(setHeight)
    __obj.updateDynamic("setLayout")(setLayout)
    __obj.updateDynamic("setLeftOffset")(setLeftOffset)
    __obj.updateDynamic("setTopOffset")(setTopOffset)
    __obj.updateDynamic("setWidth")(setWidth)
    __obj.asInstanceOf[PositionedImage]
  }
}


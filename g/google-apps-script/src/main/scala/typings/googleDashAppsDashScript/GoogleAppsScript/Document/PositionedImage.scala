package typings.googleDashAppsDashScript.GoogleAppsScript.Document

import typings.googleDashAppsDashScript.GoogleAppsScript.Base.Blob
import typings.googleDashAppsDashScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PositionedImage extends js.Object {
  def getAs(contentType: String): Blob
  def getBlob(): Blob
  def getHeight(): Integer
  def getId(): String
  def getLayout(): PositionedLayout
  def getLeftOffset(): Double
  def getParagraph(): Paragraph
  def getTopOffset(): Double
  def getWidth(): Integer
  def setHeight(height: Integer): PositionedImage
  def setLayout(layout: PositionedLayout): PositionedImage
  def setLeftOffset(offset: Double): PositionedImage
  def setTopOffset(offset: Double): PositionedImage
  def setWidth(width: Integer): PositionedImage
}

object PositionedImage {
  @scala.inline
  def apply(
    getAs: String => Blob,
    getBlob: () => Blob,
    getHeight: () => Integer,
    getId: () => String,
    getLayout: () => PositionedLayout,
    getLeftOffset: () => Double,
    getParagraph: () => Paragraph,
    getTopOffset: () => Double,
    getWidth: () => Integer,
    setHeight: Integer => PositionedImage,
    setLayout: PositionedLayout => PositionedImage,
    setLeftOffset: Double => PositionedImage,
    setTopOffset: Double => PositionedImage,
    setWidth: Integer => PositionedImage
  ): PositionedImage = {
    val __obj = js.Dynamic.literal(getAs = js.Any.fromFunction1(getAs), getBlob = js.Any.fromFunction0(getBlob), getHeight = js.Any.fromFunction0(getHeight), getId = js.Any.fromFunction0(getId), getLayout = js.Any.fromFunction0(getLayout), getLeftOffset = js.Any.fromFunction0(getLeftOffset), getParagraph = js.Any.fromFunction0(getParagraph), getTopOffset = js.Any.fromFunction0(getTopOffset), getWidth = js.Any.fromFunction0(getWidth), setHeight = js.Any.fromFunction1(setHeight), setLayout = js.Any.fromFunction1(setLayout), setLeftOffset = js.Any.fromFunction1(setLeftOffset), setTopOffset = js.Any.fromFunction1(setTopOffset), setWidth = js.Any.fromFunction1(setWidth))
  
    __obj.asInstanceOf[PositionedImage]
  }
}


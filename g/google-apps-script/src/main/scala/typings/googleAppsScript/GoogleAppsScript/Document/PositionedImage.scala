package typings.googleAppsScript.GoogleAppsScript.Document

import typings.googleAppsScript.GoogleAppsScript.Base.Blob
import typings.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fixed position image anchored to a Paragraph. Unlike an InlineImage, a PositionedImage is
  * not an Element. It does not have a
  * parent or sibling Element. Instead,
  * it is anchored to a Paragraph or ListItem, and is placed via offsets from
  * that anchor. A PositionedImage has an ID that can be used to reference it.
  *
  *     var body = DocumentApp.getActiveDocument().getBody();
  *
  *     // Append a new paragraph.
  *     var paragraph = body.appendParagraph("New paragraph to anchor the image to.");
  *     *
  *     // Get an image in Drive from its ID.
  *     var image = DriveApp.getFileById('ENTER_IMAGE_FILE_ID_HERE').getBlob();
  *
  *     // Add the PositionedImage with offsets (in points).
  *     var posImage = paragraph.addPositionedImage(image)
  *         .setTopOffset(60)
  *         .setLeftOffset(40);
  */
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


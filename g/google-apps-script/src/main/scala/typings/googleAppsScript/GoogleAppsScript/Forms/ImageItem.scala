package typings.googleAppsScript.GoogleAppsScript.Forms

import typings.googleAppsScript.GoogleAppsScript.Base.Blob
import typings.googleAppsScript.GoogleAppsScript.Base.BlobSource
import typings.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A layout item that displays an image. Items can be accessed or created from a Form.
  *
  *     // Open a form by ID and add a new image item
  *     var form = FormApp.openById('1234567890abcdefghijklmnopqrstuvwxyz');
  *     var img = UrlFetchApp.fetch('https://www.google.com/images/srpr/logo4w.png');
  *     form.addImageItem()
  *         .setTitle('Google')
  *         .setHelpText('Google Logo') // The help text is the image description
  *         .setImage(img);
  */
trait ImageItem extends js.Object {
  def duplicate(): ImageItem
  def getAlignment(): Alignment
  def getHelpText(): String
  def getId(): Integer
  def getImage(): Blob
  def getIndex(): Integer
  def getTitle(): String
  def getType(): ItemType
  def getWidth(): Integer
  def setAlignment(alignment: Alignment): ImageItem
  def setHelpText(text: String): ImageItem
  def setImage(image: BlobSource): ImageItem
  def setTitle(title: String): ImageItem
  def setWidth(width: Integer): ImageItem
}

object ImageItem {
  @scala.inline
  def apply(
    duplicate: () => ImageItem,
    getAlignment: () => Alignment,
    getHelpText: () => String,
    getId: () => Integer,
    getImage: () => Blob,
    getIndex: () => Integer,
    getTitle: () => String,
    getType: () => ItemType,
    getWidth: () => Integer,
    setAlignment: Alignment => ImageItem,
    setHelpText: String => ImageItem,
    setImage: BlobSource => ImageItem,
    setTitle: String => ImageItem,
    setWidth: Integer => ImageItem
  ): ImageItem = {
    val __obj = js.Dynamic.literal(duplicate = js.Any.fromFunction0(duplicate), getAlignment = js.Any.fromFunction0(getAlignment), getHelpText = js.Any.fromFunction0(getHelpText), getId = js.Any.fromFunction0(getId), getImage = js.Any.fromFunction0(getImage), getIndex = js.Any.fromFunction0(getIndex), getTitle = js.Any.fromFunction0(getTitle), getType = js.Any.fromFunction0(getType), getWidth = js.Any.fromFunction0(getWidth), setAlignment = js.Any.fromFunction1(setAlignment), setHelpText = js.Any.fromFunction1(setHelpText), setImage = js.Any.fromFunction1(setImage), setTitle = js.Any.fromFunction1(setTitle), setWidth = js.Any.fromFunction1(setWidth))
    __obj.asInstanceOf[ImageItem]
  }
}


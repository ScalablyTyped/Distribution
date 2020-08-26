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
@js.native
trait ImageItem extends js.Object {
  def duplicate(): ImageItem = js.native
  def getAlignment(): Alignment = js.native
  def getHelpText(): String = js.native
  def getId(): Integer = js.native
  def getImage(): Blob = js.native
  def getIndex(): Integer = js.native
  def getTitle(): String = js.native
  def getType(): ItemType = js.native
  def getWidth(): Integer = js.native
  def setAlignment(alignment: Alignment): ImageItem = js.native
  def setHelpText(text: String): ImageItem = js.native
  def setImage(image: BlobSource): ImageItem = js.native
  def setTitle(title: String): ImageItem = js.native
  def setWidth(width: Integer): ImageItem = js.native
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
  @scala.inline
  implicit class ImageItemOps[Self <: ImageItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDuplicate(value: () => ImageItem): Self = this.set("duplicate", js.Any.fromFunction0(value))
    @scala.inline
    def setGetAlignment(value: () => Alignment): Self = this.set("getAlignment", js.Any.fromFunction0(value))
    @scala.inline
    def setGetHelpText(value: () => String): Self = this.set("getHelpText", js.Any.fromFunction0(value))
    @scala.inline
    def setGetId(value: () => Integer): Self = this.set("getId", js.Any.fromFunction0(value))
    @scala.inline
    def setGetImage(value: () => Blob): Self = this.set("getImage", js.Any.fromFunction0(value))
    @scala.inline
    def setGetIndex(value: () => Integer): Self = this.set("getIndex", js.Any.fromFunction0(value))
    @scala.inline
    def setGetTitle(value: () => String): Self = this.set("getTitle", js.Any.fromFunction0(value))
    @scala.inline
    def setGetType(value: () => ItemType): Self = this.set("getType", js.Any.fromFunction0(value))
    @scala.inline
    def setGetWidth(value: () => Integer): Self = this.set("getWidth", js.Any.fromFunction0(value))
    @scala.inline
    def setSetAlignment(value: Alignment => ImageItem): Self = this.set("setAlignment", js.Any.fromFunction1(value))
    @scala.inline
    def setSetHelpText(value: String => ImageItem): Self = this.set("setHelpText", js.Any.fromFunction1(value))
    @scala.inline
    def setSetImage(value: BlobSource => ImageItem): Self = this.set("setImage", js.Any.fromFunction1(value))
    @scala.inline
    def setSetTitle(value: String => ImageItem): Self = this.set("setTitle", js.Any.fromFunction1(value))
    @scala.inline
    def setSetWidth(value: Integer => ImageItem): Self = this.set("setWidth", js.Any.fromFunction1(value))
  }
  
}


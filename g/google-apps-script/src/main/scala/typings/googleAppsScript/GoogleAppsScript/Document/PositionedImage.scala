package typings.googleAppsScript.GoogleAppsScript.Document

import typings.googleAppsScript.GoogleAppsScript.Base.Blob
import typings.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
@js.native
trait PositionedImage extends js.Object {
  
  def getAs(contentType: String): Blob = js.native
  
  def getBlob(): Blob = js.native
  
  def getHeight(): Integer = js.native
  
  def getId(): String = js.native
  
  def getLayout(): PositionedLayout = js.native
  
  def getLeftOffset(): Double = js.native
  
  def getParagraph(): Paragraph = js.native
  
  def getTopOffset(): Double = js.native
  
  def getWidth(): Integer = js.native
  
  def setHeight(height: Integer): PositionedImage = js.native
  
  def setLayout(layout: PositionedLayout): PositionedImage = js.native
  
  def setLeftOffset(offset: Double): PositionedImage = js.native
  
  def setTopOffset(offset: Double): PositionedImage = js.native
  
  def setWidth(width: Integer): PositionedImage = js.native
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
  
  @scala.inline
  implicit class PositionedImageOps[Self <: PositionedImage] (val x: Self) extends AnyVal {
    
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
    def setGetAs(value: String => Blob): Self = this.set("getAs", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetBlob(value: () => Blob): Self = this.set("getBlob", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetHeight(value: () => Integer): Self = this.set("getHeight", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetId(value: () => String): Self = this.set("getId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLayout(value: () => PositionedLayout): Self = this.set("getLayout", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLeftOffset(value: () => Double): Self = this.set("getLeftOffset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetParagraph(value: () => Paragraph): Self = this.set("getParagraph", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTopOffset(value: () => Double): Self = this.set("getTopOffset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetWidth(value: () => Integer): Self = this.set("getWidth", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetHeight(value: Integer => PositionedImage): Self = this.set("setHeight", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetLayout(value: PositionedLayout => PositionedImage): Self = this.set("setLayout", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetLeftOffset(value: Double => PositionedImage): Self = this.set("setLeftOffset", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTopOffset(value: Double => PositionedImage): Self = this.set("setTopOffset", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetWidth(value: Integer => PositionedImage): Self = this.set("setWidth", js.Any.fromFunction1(value))
  }
}

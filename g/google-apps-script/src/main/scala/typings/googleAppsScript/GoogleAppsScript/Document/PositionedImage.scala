package typings.googleAppsScript.GoogleAppsScript.Document

import typings.googleAppsScript.GoogleAppsScript.Base.Blob
import typings.googleAppsScript.GoogleAppsScript.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
trait PositionedImage extends StObject {
  
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
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: PositionedImage] (val x: Self) extends AnyVal {
    
    inline def setGetAs(value: String => Blob): Self = StObject.set(x, "getAs", js.Any.fromFunction1(value))
    
    inline def setGetBlob(value: () => Blob): Self = StObject.set(x, "getBlob", js.Any.fromFunction0(value))
    
    inline def setGetHeight(value: () => Integer): Self = StObject.set(x, "getHeight", js.Any.fromFunction0(value))
    
    inline def setGetId(value: () => String): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
    
    inline def setGetLayout(value: () => PositionedLayout): Self = StObject.set(x, "getLayout", js.Any.fromFunction0(value))
    
    inline def setGetLeftOffset(value: () => Double): Self = StObject.set(x, "getLeftOffset", js.Any.fromFunction0(value))
    
    inline def setGetParagraph(value: () => Paragraph): Self = StObject.set(x, "getParagraph", js.Any.fromFunction0(value))
    
    inline def setGetTopOffset(value: () => Double): Self = StObject.set(x, "getTopOffset", js.Any.fromFunction0(value))
    
    inline def setGetWidth(value: () => Integer): Self = StObject.set(x, "getWidth", js.Any.fromFunction0(value))
    
    inline def setSetHeight(value: Integer => PositionedImage): Self = StObject.set(x, "setHeight", js.Any.fromFunction1(value))
    
    inline def setSetLayout(value: PositionedLayout => PositionedImage): Self = StObject.set(x, "setLayout", js.Any.fromFunction1(value))
    
    inline def setSetLeftOffset(value: Double => PositionedImage): Self = StObject.set(x, "setLeftOffset", js.Any.fromFunction1(value))
    
    inline def setSetTopOffset(value: Double => PositionedImage): Self = StObject.set(x, "setTopOffset", js.Any.fromFunction1(value))
    
    inline def setSetWidth(value: Integer => PositionedImage): Self = StObject.set(x, "setWidth", js.Any.fromFunction1(value))
  }
}

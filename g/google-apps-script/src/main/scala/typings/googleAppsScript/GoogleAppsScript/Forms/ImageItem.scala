package typings.googleAppsScript.GoogleAppsScript.Forms

import typings.googleAppsScript.GoogleAppsScript.Base.Blob
import typings.googleAppsScript.GoogleAppsScript.Base.BlobSource
import typings.googleAppsScript.GoogleAppsScript.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
trait ImageItem extends StObject {
  
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
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: ImageItem] (val x: Self) extends AnyVal {
    
    inline def setDuplicate(value: () => ImageItem): Self = StObject.set(x, "duplicate", js.Any.fromFunction0(value))
    
    inline def setGetAlignment(value: () => Alignment): Self = StObject.set(x, "getAlignment", js.Any.fromFunction0(value))
    
    inline def setGetHelpText(value: () => String): Self = StObject.set(x, "getHelpText", js.Any.fromFunction0(value))
    
    inline def setGetId(value: () => Integer): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
    
    inline def setGetImage(value: () => Blob): Self = StObject.set(x, "getImage", js.Any.fromFunction0(value))
    
    inline def setGetIndex(value: () => Integer): Self = StObject.set(x, "getIndex", js.Any.fromFunction0(value))
    
    inline def setGetTitle(value: () => String): Self = StObject.set(x, "getTitle", js.Any.fromFunction0(value))
    
    inline def setGetType(value: () => ItemType): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
    
    inline def setGetWidth(value: () => Integer): Self = StObject.set(x, "getWidth", js.Any.fromFunction0(value))
    
    inline def setSetAlignment(value: Alignment => ImageItem): Self = StObject.set(x, "setAlignment", js.Any.fromFunction1(value))
    
    inline def setSetHelpText(value: String => ImageItem): Self = StObject.set(x, "setHelpText", js.Any.fromFunction1(value))
    
    inline def setSetImage(value: BlobSource => ImageItem): Self = StObject.set(x, "setImage", js.Any.fromFunction1(value))
    
    inline def setSetTitle(value: String => ImageItem): Self = StObject.set(x, "setTitle", js.Any.fromFunction1(value))
    
    inline def setSetWidth(value: Integer => ImageItem): Self = StObject.set(x, "setWidth", js.Any.fromFunction1(value))
  }
}

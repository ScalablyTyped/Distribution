package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an image to add to a cell. To add an image to a cell, you must create a new image
  * value for the image using SpreadsheetApp.newCellImage() and CellImageBuilder. Then you can
  * use Range.setValue(value) or Range.setValues(values) to add the image value to the cell.
  */
trait CellImage extends StObject {
  
  def getAltTextDescription(): String
  
  def getAltTextTitle(): String
  
  def getContentUrl(): String
  
  def getUrl(): String | Null
  
  def toBuilder(): CellImageBuilder
}
object CellImage {
  
  inline def apply(
    getAltTextDescription: () => String,
    getAltTextTitle: () => String,
    getContentUrl: () => String,
    getUrl: () => String | Null,
    toBuilder: () => CellImageBuilder
  ): CellImage = {
    val __obj = js.Dynamic.literal(getAltTextDescription = js.Any.fromFunction0(getAltTextDescription), getAltTextTitle = js.Any.fromFunction0(getAltTextTitle), getContentUrl = js.Any.fromFunction0(getContentUrl), getUrl = js.Any.fromFunction0(getUrl), toBuilder = js.Any.fromFunction0(toBuilder))
    __obj.asInstanceOf[CellImage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CellImage] (val x: Self) extends AnyVal {
    
    inline def setGetAltTextDescription(value: () => String): Self = StObject.set(x, "getAltTextDescription", js.Any.fromFunction0(value))
    
    inline def setGetAltTextTitle(value: () => String): Self = StObject.set(x, "getAltTextTitle", js.Any.fromFunction0(value))
    
    inline def setGetContentUrl(value: () => String): Self = StObject.set(x, "getContentUrl", js.Any.fromFunction0(value))
    
    inline def setGetUrl(value: () => String | Null): Self = StObject.set(x, "getUrl", js.Any.fromFunction0(value))
    
    inline def setToBuilder(value: () => CellImageBuilder): Self = StObject.set(x, "toBuilder", js.Any.fromFunction0(value))
  }
}

package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Builder for CellImage. This builder creates the image value needed to add an image to a cell.
  */
trait CellImageBuilder extends StObject {
  
  def build(): CellImage
  
  def getAltTextDescription(): String
  
  def getAltTextTitle(): String
  
  def getContentUrl(): String
  
  def getUrl(): String | Null
  
  def setAltTextDescription(description: String): CellImageBuilder
  
  def setAltTextTitle(title: String): CellImageBuilder
  
  def setSourceUrl(url: String): CellImageBuilder
  
  def toBuilder(): CellImageBuilder
}
object CellImageBuilder {
  
  inline def apply(
    build: () => CellImage,
    getAltTextDescription: () => String,
    getAltTextTitle: () => String,
    getContentUrl: () => String,
    getUrl: () => String | Null,
    setAltTextDescription: String => CellImageBuilder,
    setAltTextTitle: String => CellImageBuilder,
    setSourceUrl: String => CellImageBuilder,
    toBuilder: () => CellImageBuilder
  ): CellImageBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), getAltTextDescription = js.Any.fromFunction0(getAltTextDescription), getAltTextTitle = js.Any.fromFunction0(getAltTextTitle), getContentUrl = js.Any.fromFunction0(getContentUrl), getUrl = js.Any.fromFunction0(getUrl), setAltTextDescription = js.Any.fromFunction1(setAltTextDescription), setAltTextTitle = js.Any.fromFunction1(setAltTextTitle), setSourceUrl = js.Any.fromFunction1(setSourceUrl), toBuilder = js.Any.fromFunction0(toBuilder))
    __obj.asInstanceOf[CellImageBuilder]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CellImageBuilder] (val x: Self) extends AnyVal {
    
    inline def setBuild(value: () => CellImage): Self = StObject.set(x, "build", js.Any.fromFunction0(value))
    
    inline def setGetAltTextDescription(value: () => String): Self = StObject.set(x, "getAltTextDescription", js.Any.fromFunction0(value))
    
    inline def setGetAltTextTitle(value: () => String): Self = StObject.set(x, "getAltTextTitle", js.Any.fromFunction0(value))
    
    inline def setGetContentUrl(value: () => String): Self = StObject.set(x, "getContentUrl", js.Any.fromFunction0(value))
    
    inline def setGetUrl(value: () => String | Null): Self = StObject.set(x, "getUrl", js.Any.fromFunction0(value))
    
    inline def setSetAltTextDescription(value: String => CellImageBuilder): Self = StObject.set(x, "setAltTextDescription", js.Any.fromFunction1(value))
    
    inline def setSetAltTextTitle(value: String => CellImageBuilder): Self = StObject.set(x, "setAltTextTitle", js.Any.fromFunction1(value))
    
    inline def setSetSourceUrl(value: String => CellImageBuilder): Self = StObject.set(x, "setSourceUrl", js.Any.fromFunction1(value))
    
    inline def setToBuilder(value: () => CellImageBuilder): Self = StObject.set(x, "toBuilder", js.Any.fromFunction0(value))
  }
}

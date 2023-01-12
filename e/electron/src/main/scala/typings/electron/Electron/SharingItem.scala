package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SharingItem extends StObject {
  
  // Docs: https://electronjs.org/docs/api/structures/sharing-item
  /**
    * An array of files to share.
    */
  var filePaths: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * An array of text to share.
    */
  var texts: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * An array of URLs to share.
    */
  var urls: js.UndefOr[js.Array[String]] = js.undefined
}
object SharingItem {
  
  inline def apply(): SharingItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharingItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SharingItem] (val x: Self) extends AnyVal {
    
    inline def setFilePaths(value: js.Array[String]): Self = StObject.set(x, "filePaths", value.asInstanceOf[js.Any])
    
    inline def setFilePathsUndefined: Self = StObject.set(x, "filePaths", js.undefined)
    
    inline def setFilePathsVarargs(value: String*): Self = StObject.set(x, "filePaths", js.Array(value*))
    
    inline def setTexts(value: js.Array[String]): Self = StObject.set(x, "texts", value.asInstanceOf[js.Any])
    
    inline def setTextsUndefined: Self = StObject.set(x, "texts", js.undefined)
    
    inline def setTextsVarargs(value: String*): Self = StObject.set(x, "texts", js.Array(value*))
    
    inline def setUrls(value: js.Array[String]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
    
    inline def setUrlsUndefined: Self = StObject.set(x, "urls", js.undefined)
    
    inline def setUrlsVarargs(value: String*): Self = StObject.set(x, "urls", js.Array(value*))
  }
}

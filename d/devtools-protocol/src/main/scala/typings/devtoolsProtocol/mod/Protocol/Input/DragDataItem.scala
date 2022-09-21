package typings.devtoolsProtocol.mod.Protocol.Input

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DragDataItem extends StObject {
  
  /**
    * Stores the base URL for the contained markup. Only valid when `mimeType`
    * == "text/html".
    */
  var baseURL: js.UndefOr[String] = js.undefined
  
  /**
    * Depending of the value of `mimeType`, it contains the dragged link,
    * text, HTML markup or any other data.
    */
  var data: String
  
  /**
    * Mime type of the dragged data.
    */
  var mimeType: String
  
  /**
    * Title associated with a link. Only valid when `mimeType` == "text/uri-list".
    */
  var title: js.UndefOr[String] = js.undefined
}
object DragDataItem {
  
  inline def apply(data: String, mimeType: String): DragDataItem = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragDataItem]
  }
  
  extension [Self <: DragDataItem](x: Self) {
    
    inline def setBaseURL(value: String): Self = StObject.set(x, "baseURL", value.asInstanceOf[js.Any])
    
    inline def setBaseURLUndefined: Self = StObject.set(x, "baseURL", js.undefined)
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}

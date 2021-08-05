package typings.forgeViewer.Autodesk.Viewing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThumbnailOptions extends StObject {
  
  var acmsession: String
  
  var guid: String
  
  var height: Double
  
  var urn: String
  
  var width: Double
}
object ThumbnailOptions {
  
  inline def apply(acmsession: String, guid: String, height: Double, urn: String, width: Double): ThumbnailOptions = {
    val __obj = js.Dynamic.literal(acmsession = acmsession.asInstanceOf[js.Any], guid = guid.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], urn = urn.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThumbnailOptions]
  }
  
  extension [Self <: ThumbnailOptions](x: Self) {
    
    inline def setAcmsession(value: String): Self = StObject.set(x, "acmsession", value.asInstanceOf[js.Any])
    
    inline def setGuid(value: String): Self = StObject.set(x, "guid", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setUrn(value: String): Self = StObject.set(x, "urn", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}

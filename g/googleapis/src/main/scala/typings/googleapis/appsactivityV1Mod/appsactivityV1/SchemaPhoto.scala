package typings.googleapis.appsactivityV1Mod.appsactivityV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPhoto extends StObject {
  
  /**
    * The URL of the photo.
    */
  var url: js.UndefOr[String | Null] = js.undefined
}
object SchemaPhoto {
  
  inline def apply(): SchemaPhoto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPhoto]
  }
  
  extension [Self <: SchemaPhoto](x: Self) {
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlNull: Self = StObject.set(x, "url", null)
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}

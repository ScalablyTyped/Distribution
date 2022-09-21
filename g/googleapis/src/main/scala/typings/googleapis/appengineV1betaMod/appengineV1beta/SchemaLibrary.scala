package typings.googleapis.appengineV1betaMod.appengineV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLibrary extends StObject {
  
  /**
    * Name of the library. Example: "django".
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Version of the library to select, or "latest".
    */
  var version: js.UndefOr[String | Null] = js.undefined
}
object SchemaLibrary {
  
  inline def apply(): SchemaLibrary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLibrary]
  }
  
  extension [Self <: SchemaLibrary](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionNull: Self = StObject.set(x, "version", null)
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}

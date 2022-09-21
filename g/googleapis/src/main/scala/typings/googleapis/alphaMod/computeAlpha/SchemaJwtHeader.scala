package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaJwtHeader extends StObject {
  
  /**
    * The HTTP header name.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The value prefix. The value format is "value_prefix" For example, for "Authorization: Bearer ", value_prefix="Bearer " with a space at the end.
    */
  var valuePrefix: js.UndefOr[String | Null] = js.undefined
}
object SchemaJwtHeader {
  
  inline def apply(): SchemaJwtHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaJwtHeader]
  }
  
  extension [Self <: SchemaJwtHeader](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setValuePrefix(value: String): Self = StObject.set(x, "valuePrefix", value.asInstanceOf[js.Any])
    
    inline def setValuePrefixNull: Self = StObject.set(x, "valuePrefix", null)
    
    inline def setValuePrefixUndefined: Self = StObject.set(x, "valuePrefix", js.undefined)
  }
}

package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This message specifies a header location to extract JWT token.
  */
trait SchemaJwtHeader extends StObject {
  
  /**
    * The HTTP header name.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The value prefix. The value format is &quot;value_prefix&quot; For
    * example, for &quot;Authorization: Bearer &quot;,
    * value_prefix=&quot;Bearer &quot; with a space at the end.
    */
  var valuePrefix: js.UndefOr[String] = js.undefined
}
object SchemaJwtHeader {
  
  inline def apply(): SchemaJwtHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaJwtHeader]
  }
  
  extension [Self <: SchemaJwtHeader](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setValuePrefix(value: String): Self = StObject.set(x, "valuePrefix", value.asInstanceOf[js.Any])
    
    inline def setValuePrefixUndefined: Self = StObject.set(x, "valuePrefix", js.undefined)
  }
}

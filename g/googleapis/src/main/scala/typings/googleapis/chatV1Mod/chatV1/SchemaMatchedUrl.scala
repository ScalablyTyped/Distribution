package typings.googleapis.chatV1Mod.chatV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMatchedUrl extends StObject {
  
  /**
    * Output only. The url that was matched.
    */
  var url: js.UndefOr[String | Null] = js.undefined
}
object SchemaMatchedUrl {
  
  inline def apply(): SchemaMatchedUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMatchedUrl]
  }
  
  extension [Self <: SchemaMatchedUrl](x: Self) {
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlNull: Self = StObject.set(x, "url", null)
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}

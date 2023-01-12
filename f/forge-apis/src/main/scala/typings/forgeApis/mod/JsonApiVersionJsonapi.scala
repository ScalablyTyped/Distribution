package typings.forgeApis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsonApiVersionJsonapi extends StObject {
  
  var version: String
}
object JsonApiVersionJsonapi {
  
  inline def apply(version: String): JsonApiVersionJsonapi = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonApiVersionJsonapi]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JsonApiVersionJsonapi] (val x: Self) extends AnyVal {
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}

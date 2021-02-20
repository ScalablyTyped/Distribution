package typings.forgeApis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JsonApiVersionJsonapi extends StObject {
  
  var version: String = js.native
}
object JsonApiVersionJsonapi {
  
  @scala.inline
  def apply(version: String): JsonApiVersionJsonapi = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonApiVersionJsonapi]
  }
  
  @scala.inline
  implicit class JsonApiVersionJsonapiMutableBuilder[Self <: JsonApiVersionJsonapi] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}

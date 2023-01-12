package typings.googleCloudTasks.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Policy extends StObject {
  
  var bindings: js.Array[Binding]
  
  var etag: String
  
  var version: Double
}
object Policy {
  
  inline def apply(bindings: js.Array[Binding], etag: String, version: Double): Policy = {
    val __obj = js.Dynamic.literal(bindings = bindings.asInstanceOf[js.Any], etag = etag.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Policy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Policy] (val x: Self) extends AnyVal {
    
    inline def setBindings(value: js.Array[Binding]): Self = StObject.set(x, "bindings", value.asInstanceOf[js.Any])
    
    inline def setBindingsVarargs(value: Binding*): Self = StObject.set(x, "bindings", js.Array(value*))
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}

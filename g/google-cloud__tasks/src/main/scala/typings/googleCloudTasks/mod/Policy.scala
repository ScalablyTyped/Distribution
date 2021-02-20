package typings.googleCloudTasks.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Policy extends StObject {
  
  var bindings: js.Array[Binding] = js.native
  
  var etag: String = js.native
  
  var version: Double = js.native
}
object Policy {
  
  @scala.inline
  def apply(bindings: js.Array[Binding], etag: String, version: Double): Policy = {
    val __obj = js.Dynamic.literal(bindings = bindings.asInstanceOf[js.Any], etag = etag.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Policy]
  }
  
  @scala.inline
  implicit class PolicyMutableBuilder[Self <: Policy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBindings(value: js.Array[Binding]): Self = StObject.set(x, "bindings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBindingsVarargs(value: Binding*): Self = StObject.set(x, "bindings", js.Array(value :_*))
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}

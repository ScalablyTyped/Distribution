package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaBackendServiceReference extends StObject {
  
  var backendService: js.UndefOr[String] = js.native
}
object SchemaBackendServiceReference {
  
  @scala.inline
  def apply(): SchemaBackendServiceReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBackendServiceReference]
  }
  
  @scala.inline
  implicit class SchemaBackendServiceReferenceMutableBuilder[Self <: SchemaBackendServiceReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackendService(value: String): Self = StObject.set(x, "backendService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackendServiceUndefined: Self = StObject.set(x, "backendService", js.undefined)
  }
}

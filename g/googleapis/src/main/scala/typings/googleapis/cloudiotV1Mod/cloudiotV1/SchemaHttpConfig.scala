package typings.googleapis.cloudiotV1Mod.cloudiotV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The configuration of the HTTP bridge for a device registry.
  */
@js.native
trait SchemaHttpConfig extends StObject {
  
  /**
    * If enabled, allows devices to use DeviceService via the HTTP protocol.
    * Otherwise, any requests to DeviceService will fail for this registry.
    */
  var httpEnabledState: js.UndefOr[String] = js.native
}
object SchemaHttpConfig {
  
  @scala.inline
  def apply(): SchemaHttpConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHttpConfig]
  }
  
  @scala.inline
  implicit class SchemaHttpConfigMutableBuilder[Self <: SchemaHttpConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHttpEnabledState(value: String): Self = StObject.set(x, "httpEnabledState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpEnabledStateUndefined: Self = StObject.set(x, "httpEnabledState", js.undefined)
  }
}

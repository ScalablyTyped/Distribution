package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaInstancesSetMinCpuPlatformRequest extends StObject {
  
  /**
    * Minimum cpu/platform this instance should be started at.
    */
  var minCpuPlatform: js.UndefOr[String] = js.native
}
object SchemaInstancesSetMinCpuPlatformRequest {
  
  @scala.inline
  def apply(): SchemaInstancesSetMinCpuPlatformRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstancesSetMinCpuPlatformRequest]
  }
  
  @scala.inline
  implicit class SchemaInstancesSetMinCpuPlatformRequestMutableBuilder[Self <: SchemaInstancesSetMinCpuPlatformRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMinCpuPlatform(value: String): Self = StObject.set(x, "minCpuPlatform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinCpuPlatformUndefined: Self = StObject.set(x, "minCpuPlatform", js.undefined)
  }
}

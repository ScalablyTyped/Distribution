package typings.googleCloudTasks.mod

import typings.googleCloudTasks.googleCloudTasksBooleans.`false`
import typings.googleGax.buildSrcGaxMod.CallOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallOptionsWithPagination
  extends StObject
     with CallOptions {
  
  @JSName("autoPaginate")
  var autoPaginate_CallOptionsWithPagination: `false`
}
object CallOptionsWithPagination {
  
  inline def apply(): CallOptionsWithPagination = {
    val __obj = js.Dynamic.literal(autoPaginate = false)
    __obj.asInstanceOf[CallOptionsWithPagination]
  }
  
  extension [Self <: CallOptionsWithPagination](x: Self) {
    
    inline def setAutoPaginate(value: `false`): Self = StObject.set(x, "autoPaginate", value.asInstanceOf[js.Any])
  }
}

package typings.googleCloudTasks.mod

import typings.googleCloudTasks.googleCloudTasksBooleans.`false`
import typings.googleGax.gaxMod.CallOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CallOptionsWithPagination extends CallOptions {
  
  @JSName("autoPaginate")
  var autoPaginate_CallOptionsWithPagination: `false` = js.native
}
object CallOptionsWithPagination {
  
  @scala.inline
  def apply(autoPaginate: `false`): CallOptionsWithPagination = {
    val __obj = js.Dynamic.literal(autoPaginate = autoPaginate.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallOptionsWithPagination]
  }
  
  @scala.inline
  implicit class CallOptionsWithPaginationMutableBuilder[Self <: CallOptionsWithPagination] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoPaginate(value: `false`): Self = StObject.set(x, "autoPaginate", value.asInstanceOf[js.Any])
  }
}

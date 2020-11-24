package typings.devtoolsProtocol.mod.Protocol.Runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetHeapUsageResponse extends js.Object {
  
  /**
    * Allocated heap size in bytes.
    */
  var totalSize: Double = js.native
  
  /**
    * Used heap size in bytes.
    */
  var usedSize: Double = js.native
}
object GetHeapUsageResponse {
  
  @scala.inline
  def apply(totalSize: Double, usedSize: Double): GetHeapUsageResponse = {
    val __obj = js.Dynamic.literal(totalSize = totalSize.asInstanceOf[js.Any], usedSize = usedSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetHeapUsageResponse]
  }
  
  @scala.inline
  implicit class GetHeapUsageResponseOps[Self <: GetHeapUsageResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTotalSize(value: Double): Self = this.set("totalSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsedSize(value: Double): Self = this.set("usedSize", value.asInstanceOf[js.Any])
  }
}

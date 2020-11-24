package typings.gaxios.anon

import typings.gaxios.commonMod.GaxiosOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShouldRetry extends js.Object {
  
  var config: GaxiosOptions = js.native
  
  var shouldRetry: Boolean = js.native
}
object ShouldRetry {
  
  @scala.inline
  def apply(config: GaxiosOptions, shouldRetry: Boolean): ShouldRetry = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], shouldRetry = shouldRetry.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShouldRetry]
  }
  
  @scala.inline
  implicit class ShouldRetryOps[Self <: ShouldRetry] (val x: Self) extends AnyVal {
    
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
    def setConfig(value: GaxiosOptions): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShouldRetry(value: Boolean): Self = this.set("shouldRetry", value.asInstanceOf[js.Any])
  }
}

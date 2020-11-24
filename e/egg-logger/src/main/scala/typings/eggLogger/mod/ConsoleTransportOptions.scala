package typings.eggLogger.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConsoleTransportOptions extends TransportOptions {
  
  var stderrLevel: js.UndefOr[String] = js.native
}
object ConsoleTransportOptions {
  
  @scala.inline
  def apply(): ConsoleTransportOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConsoleTransportOptions]
  }
  
  @scala.inline
  implicit class ConsoleTransportOptionsOps[Self <: ConsoleTransportOptions] (val x: Self) extends AnyVal {
    
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
    def setStderrLevel(value: String): Self = this.set("stderrLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStderrLevel: Self = this.set("stderrLevel", js.undefined)
  }
}

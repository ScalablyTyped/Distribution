package typings.dropboxjs.Dropbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SingOutOptions extends js.Object {
  
  var mustInvalidate: Boolean = js.native
}
object SingOutOptions {
  
  @scala.inline
  def apply(mustInvalidate: Boolean): SingOutOptions = {
    val __obj = js.Dynamic.literal(mustInvalidate = mustInvalidate.asInstanceOf[js.Any])
    __obj.asInstanceOf[SingOutOptions]
  }
  
  @scala.inline
  implicit class SingOutOptionsOps[Self <: SingOutOptions] (val x: Self) extends AnyVal {
    
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
    def setMustInvalidate(value: Boolean): Self = this.set("mustInvalidate", value.asInstanceOf[js.Any])
  }
}

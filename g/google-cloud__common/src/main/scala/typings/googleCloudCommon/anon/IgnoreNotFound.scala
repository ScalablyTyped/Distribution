package typings.googleCloudCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgnoreNotFound extends js.Object {
  
  var ignoreNotFound: js.UndefOr[Boolean] = js.native
}
object IgnoreNotFound {
  
  @scala.inline
  def apply(): IgnoreNotFound = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgnoreNotFound]
  }
  
  @scala.inline
  implicit class IgnoreNotFoundOps[Self <: IgnoreNotFound] (val x: Self) extends AnyVal {
    
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
    def setIgnoreNotFound(value: Boolean): Self = this.set("ignoreNotFound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreNotFound: Self = this.set("ignoreNotFound", js.undefined)
  }
}

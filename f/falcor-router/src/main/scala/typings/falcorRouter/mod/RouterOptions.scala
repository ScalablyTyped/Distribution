package typings.falcorRouter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouterOptions extends js.Object {
  
  var debug: js.UndefOr[Boolean] = js.native
  
  var maxPaths: js.UndefOr[Double] = js.native
  
  var maxRefFollow: js.UndefOr[Double] = js.native
}
object RouterOptions {
  
  @scala.inline
  def apply(): RouterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouterOptions]
  }
  
  @scala.inline
  implicit class RouterOptionsOps[Self <: RouterOptions] (val x: Self) extends AnyVal {
    
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
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    
    @scala.inline
    def setMaxPaths(value: Double): Self = this.set("maxPaths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxPaths: Self = this.set("maxPaths", js.undefined)
    
    @scala.inline
    def setMaxRefFollow(value: Double): Self = this.set("maxRefFollow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxRefFollow: Self = this.set("maxRefFollow", js.undefined)
  }
}

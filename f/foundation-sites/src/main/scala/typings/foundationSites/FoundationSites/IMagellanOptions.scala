package typings.foundationSites.FoundationSites

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMagellanOptions extends js.Object {
  
  var activeClass: js.UndefOr[String] = js.native
  
  var animationDuration: js.UndefOr[Double] = js.native
  
  var animationEasing: js.UndefOr[String] = js.native
  
  var barOffset: js.UndefOr[Double] = js.native
  
  var deepLinking: js.UndefOr[Boolean] = js.native
  
  var threshold: js.UndefOr[Double] = js.native
}
object IMagellanOptions {
  
  @scala.inline
  def apply(): IMagellanOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMagellanOptions]
  }
  
  @scala.inline
  implicit class IMagellanOptionsOps[Self <: IMagellanOptions] (val x: Self) extends AnyVal {
    
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
    def setActiveClass(value: String): Self = this.set("activeClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveClass: Self = this.set("activeClass", js.undefined)
    
    @scala.inline
    def setAnimationDuration(value: Double): Self = this.set("animationDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationDuration: Self = this.set("animationDuration", js.undefined)
    
    @scala.inline
    def setAnimationEasing(value: String): Self = this.set("animationEasing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationEasing: Self = this.set("animationEasing", js.undefined)
    
    @scala.inline
    def setBarOffset(value: Double): Self = this.set("barOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBarOffset: Self = this.set("barOffset", js.undefined)
    
    @scala.inline
    def setDeepLinking(value: Boolean): Self = this.set("deepLinking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeepLinking: Self = this.set("deepLinking", js.undefined)
    
    @scala.inline
    def setThreshold(value: Double): Self = this.set("threshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThreshold: Self = this.set("threshold", js.undefined)
  }
}

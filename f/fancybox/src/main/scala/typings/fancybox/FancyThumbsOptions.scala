package typings.fancybox

import typings.fancybox.fancyboxStrings.x
import typings.fancybox.fancyboxStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FancyThumbsOptions extends js.Object {
  
  /**
    * Display thumbnails on opening
    */
  var autoStart: js.UndefOr[Boolean] = js.native
  
  /**
    * Vertical (y) or horizontal (x) scrolling
    */
  var axis: js.UndefOr[x | y] = js.native
  
  /**
    * Hide thumbnail grid when closing animation starts
    */
  var hideOnClose: js.UndefOr[Boolean] = js.native
  
  /**
    * Container is injected into this element
    */
  var parentEl: js.UndefOr[String] = js.native
}
object FancyThumbsOptions {
  
  @scala.inline
  def apply(): FancyThumbsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FancyThumbsOptions]
  }
  
  @scala.inline
  implicit class FancyThumbsOptionsOps[Self <: FancyThumbsOptions] (val x: Self) extends AnyVal {
    
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
    def setAutoStart(value: Boolean): Self = this.set("autoStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoStart: Self = this.set("autoStart", js.undefined)
    
    @scala.inline
    def setAxis(value: typings.fancybox.fancyboxStrings.x | y): Self = this.set("axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAxis: Self = this.set("axis", js.undefined)
    
    @scala.inline
    def setHideOnClose(value: Boolean): Self = this.set("hideOnClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideOnClose: Self = this.set("hideOnClose", js.undefined)
    
    @scala.inline
    def setParentEl(value: String): Self = this.set("parentEl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentEl: Self = this.set("parentEl", js.undefined)
  }
}

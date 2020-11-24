package typings.fancybox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FancyBoxRefs extends js.Object {
  
  var bg: JQuery = js.native
  
  var caption: JQuery = js.native
  
  var container: JQuery = js.native
  
  var infobar: JQuery = js.native
  
  var inner: JQuery = js.native
  
  var navigation: JQuery = js.native
  
  var stage: JQuery = js.native
  
  var toolbar: JQuery = js.native
}
object FancyBoxRefs {
  
  @scala.inline
  def apply(
    bg: JQuery,
    caption: JQuery,
    container: JQuery,
    infobar: JQuery,
    inner: JQuery,
    navigation: JQuery,
    stage: JQuery,
    toolbar: JQuery
  ): FancyBoxRefs = {
    val __obj = js.Dynamic.literal(bg = bg.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], infobar = infobar.asInstanceOf[js.Any], inner = inner.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], stage = stage.asInstanceOf[js.Any], toolbar = toolbar.asInstanceOf[js.Any])
    __obj.asInstanceOf[FancyBoxRefs]
  }
  
  @scala.inline
  implicit class FancyBoxRefsOps[Self <: FancyBoxRefs] (val x: Self) extends AnyVal {
    
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
    def setBg(value: JQuery): Self = this.set("bg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaption(value: JQuery): Self = this.set("caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainer(value: JQuery): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfobar(value: JQuery): Self = this.set("infobar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInner(value: JQuery): Self = this.set("inner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigation(value: JQuery): Self = this.set("navigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStage(value: JQuery): Self = this.set("stage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolbar(value: JQuery): Self = this.set("toolbar", value.asInstanceOf[js.Any])
  }
}

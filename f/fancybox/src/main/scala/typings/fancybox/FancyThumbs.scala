package typings.fancybox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FancyThumbs extends js.Object {
  
  @JSName("$button")
  var $button: js.UndefOr[JQuery] = js.native
  
  @JSName("$grid")
  var $grid: js.UndefOr[JQuery] = js.native
  
  @JSName("$list")
  var $list: js.UndefOr[JQuery] = js.native
  
  def create(): Unit = js.native
  
  def focus(duration: Double): Unit = js.native
  
  def hide(): Unit = js.native
  
  def init(instance: FancyBoxInstance): Unit = js.native
  
  var instance: FancyBoxInstance = js.native
  
  var isActive: Boolean = js.native
  
  var isVisible: Boolean = js.native
  
  var opts: FancyThumbsOptions = js.native
  
  def show(): Unit = js.native
  
  def toggle(): Unit = js.native
  
  def update(): Unit = js.native
}
object FancyThumbs {
  
  @scala.inline
  def apply(
    create: () => Unit,
    focus: Double => Unit,
    hide: () => Unit,
    init: FancyBoxInstance => Unit,
    instance: FancyBoxInstance,
    isActive: Boolean,
    isVisible: Boolean,
    opts: FancyThumbsOptions,
    show: () => Unit,
    toggle: () => Unit,
    update: () => Unit
  ): FancyThumbs = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction0(create), focus = js.Any.fromFunction1(focus), hide = js.Any.fromFunction0(hide), init = js.Any.fromFunction1(init), instance = instance.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], opts = opts.asInstanceOf[js.Any], show = js.Any.fromFunction0(show), toggle = js.Any.fromFunction0(toggle), update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[FancyThumbs]
  }
  
  @scala.inline
  implicit class FancyThumbsOps[Self <: FancyThumbs] (val x: Self) extends AnyVal {
    
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
    def setCreate(value: () => Unit): Self = this.set("create", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFocus(value: Double => Unit): Self = this.set("focus", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHide(value: () => Unit): Self = this.set("hide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInit(value: FancyBoxInstance => Unit): Self = this.set("init", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInstance(value: FancyBoxInstance): Self = this.set("instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsActive(value: Boolean): Self = this.set("isActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsVisible(value: Boolean): Self = this.set("isVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpts(value: FancyThumbsOptions): Self = this.set("opts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShow(value: () => Unit): Self = this.set("show", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToggle(value: () => Unit): Self = this.set("toggle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUpdate(value: () => Unit): Self = this.set("update", js.Any.fromFunction0(value))
    
    @scala.inline
    def set$button(value: JQuery): Self = this.set("$button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$button: Self = this.set("$button", js.undefined)
    
    @scala.inline
    def set$grid(value: JQuery): Self = this.set("$grid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$grid: Self = this.set("$grid", js.undefined)
    
    @scala.inline
    def set$list(value: JQuery): Self = this.set("$list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$list: Self = this.set("$list", js.undefined)
  }
}

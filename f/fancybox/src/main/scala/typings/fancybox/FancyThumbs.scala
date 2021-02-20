package typings.fancybox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FancyThumbs extends StObject {
  
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
  implicit class FancyThumbsMutableBuilder[Self <: FancyThumbs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$button(value: JQuery): Self = StObject.set(x, "$button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$buttonUndefined: Self = StObject.set(x, "$button", js.undefined)
    
    @scala.inline
    def set$grid(value: JQuery): Self = StObject.set(x, "$grid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$gridUndefined: Self = StObject.set(x, "$grid", js.undefined)
    
    @scala.inline
    def set$list(value: JQuery): Self = StObject.set(x, "$list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$listUndefined: Self = StObject.set(x, "$list", js.undefined)
    
    @scala.inline
    def setCreate(value: () => Unit): Self = StObject.set(x, "create", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFocus(value: Double => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInit(value: FancyBoxInstance => Unit): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInstance(value: FancyBoxInstance): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsVisible(value: Boolean): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpts(value: FancyThumbsOptions): Self = StObject.set(x, "opts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToggle(value: () => Unit): Self = StObject.set(x, "toggle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUpdate(value: () => Unit): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
  }
}

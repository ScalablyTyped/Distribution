package typings.glidejsGlide.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActiveNav extends js.Object {
  
  /**
    * @default 'glide__bullet--active'
    */
  var activeNav: js.UndefOr[String] = js.native
  
  /**
    * @default 'glide__slide--active'
    */
  var activeSlide: js.UndefOr[String] = js.native
  
  /**
    * @default 'glide--carousel'
    */
  var carousel: js.UndefOr[String] = js.native
  
  /**
    * @default 'glide__slide--clone'
    */
  var cloneSlide: js.UndefOr[String] = js.native
  
  var direction: js.UndefOr[Ltr] = js.native
  
  /**
    * @default 'glide__arrow--disabled'
    */
  var disabledArrow: js.UndefOr[String] = js.native
  
  /**
    * @default 'glide--dragging'
    */
  var dragging: js.UndefOr[String] = js.native
  
  /**
    * @default 'glide--slider'
    */
  var slider: js.UndefOr[String] = js.native
  
  /**
    * @default 'glide--swipeable'
    */
  var swipeable: js.UndefOr[String] = js.native
}
object ActiveNav {
  
  @scala.inline
  def apply(): ActiveNav = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActiveNav]
  }
  
  @scala.inline
  implicit class ActiveNavOps[Self <: ActiveNav] (val x: Self) extends AnyVal {
    
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
    def setActiveNav(value: String): Self = this.set("activeNav", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveNav: Self = this.set("activeNav", js.undefined)
    
    @scala.inline
    def setActiveSlide(value: String): Self = this.set("activeSlide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveSlide: Self = this.set("activeSlide", js.undefined)
    
    @scala.inline
    def setCarousel(value: String): Self = this.set("carousel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCarousel: Self = this.set("carousel", js.undefined)
    
    @scala.inline
    def setCloneSlide(value: String): Self = this.set("cloneSlide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloneSlide: Self = this.set("cloneSlide", js.undefined)
    
    @scala.inline
    def setDirection(value: Ltr): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setDisabledArrow(value: String): Self = this.set("disabledArrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabledArrow: Self = this.set("disabledArrow", js.undefined)
    
    @scala.inline
    def setDragging(value: String): Self = this.set("dragging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragging: Self = this.set("dragging", js.undefined)
    
    @scala.inline
    def setSlider(value: String): Self = this.set("slider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlider: Self = this.set("slider", js.undefined)
    
    @scala.inline
    def setSwipeable(value: String): Self = this.set("swipeable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSwipeable: Self = this.set("swipeable", js.undefined)
  }
}

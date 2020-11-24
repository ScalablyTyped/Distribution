package typings.gliderJs.mod

import typings.gliderJs.anon.Next
import typings.gliderJs.gliderJsStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * An object containing the prev/next arrow settings
    */
  var arrows: js.UndefOr[Next] = js.native
  
  /**
    * An HTML element or selector containing the dot container
    */
  var dots: js.UndefOr[Selector | Null] = js.native
  
  /**
    * How much to aggravate the velocity of the mouse dragging
    */
  var dragVelocity: js.UndefOr[Double] = js.native
  
  /**
    * If true, the list can be scrolled by click and dragging with the
    * mouse
    */
  var draggable: js.UndefOr[Boolean] = js.native
  
  /**
    * An aggravator used to control animation speed. Higher is slower!
    */
  var duration: js.UndefOr[Double] = js.native
  
  /**
    * Use any custom easing function, compatible with most easing
    * plugins
    */
  var easing: js.UndefOr[EasingFunction] = js.native
  
  /**
    * Whether or not the event bubbles up from the container
    * @default true
    */
  var eventPropagate: js.UndefOr[Boolean] = js.native
  
  /**
    * This prevents resizing items to fit when `slidesToShow` is set to
    * auto.
    */
  var exactWidth: js.UndefOr[Boolean] = js.native
  
  /**
    * This value is ignored unless `slidesToShow` is set to `auto`, in
    * which it is then required.
    */
  var itemWidth: js.UndefOr[Double] = js.native
  
  /**
    * If true, Glider.js will lock to the nearest slide on resizing of
    * the window
    */
  var resizeLock: js.UndefOr[Boolean] = js.native
  
  /**
    * An object containing custom settings per provided breakpoint. See
    * demo for details.
    */
  var responsive: js.UndefOr[js.Array[Breakpoint]] = js.native
  
  /**
    * If true, Glider.js will scroll to the beginning/end when its
    * respective endpoint is reached
    */
  var rewind: js.UndefOr[Boolean] = js.native
  
  /**
    * If true, Glider.js will scroll to the nearest slide after any
    * scroll interactions
    */
  var scrollLock: js.UndefOr[Boolean] = js.native
  
  /**
    * When `scrollLock` is set, this is the delay in milliseconds to
    * wait before the scroll happens
    */
  var scrollLockDelay: js.UndefOr[Double] = js.native
  
  /**
    * Whether or not to release the scroll events from the container
    */
  var scrollPropagate: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether or not Glider.js should skip wrapping its children with a
    * 'glider-track' <div>.
    */
  var skipTrack: js.UndefOr[Boolean] = js.native
  
  /**
    * The number of slides to scroll when arrow navigation is used If
    * this value is set to `auto`, it will match the value of
    * `slidesToScroll`.
    */
  var slidesToScroll: js.UndefOr[Double | auto] = js.native
  
  /**
    * The number of slides to show in container. If this value is set
    * to `auto`, it will be automatially calcuated based upon the
    * number of items able to fit within the container viewport. This
    * requires setting the `itemWidth` option.
    */
  var slidesToShow: js.UndefOr[Double | auto] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setArrows(value: Next): Self = this.set("arrows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrows: Self = this.set("arrows", js.undefined)
    
    @scala.inline
    def setDots(value: Selector): Self = this.set("dots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDots: Self = this.set("dots", js.undefined)
    
    @scala.inline
    def setDotsNull: Self = this.set("dots", null)
    
    @scala.inline
    def setDragVelocity(value: Double): Self = this.set("dragVelocity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragVelocity: Self = this.set("dragVelocity", js.undefined)
    
    @scala.inline
    def setDraggable(value: Boolean): Self = this.set("draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDraggable: Self = this.set("draggable", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setEasing(value: (/* x */ Double, /* t */ Double, /* b */ Double, /* c */ Double, /* d */ Double) => Double): Self = this.set("easing", js.Any.fromFunction5(value))
    
    @scala.inline
    def deleteEasing: Self = this.set("easing", js.undefined)
    
    @scala.inline
    def setEventPropagate(value: Boolean): Self = this.set("eventPropagate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventPropagate: Self = this.set("eventPropagate", js.undefined)
    
    @scala.inline
    def setExactWidth(value: Boolean): Self = this.set("exactWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExactWidth: Self = this.set("exactWidth", js.undefined)
    
    @scala.inline
    def setItemWidth(value: Double): Self = this.set("itemWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemWidth: Self = this.set("itemWidth", js.undefined)
    
    @scala.inline
    def setResizeLock(value: Boolean): Self = this.set("resizeLock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResizeLock: Self = this.set("resizeLock", js.undefined)
    
    @scala.inline
    def setResponsiveVarargs(value: Breakpoint*): Self = this.set("responsive", js.Array(value :_*))
    
    @scala.inline
    def setResponsive(value: js.Array[Breakpoint]): Self = this.set("responsive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponsive: Self = this.set("responsive", js.undefined)
    
    @scala.inline
    def setRewind(value: Boolean): Self = this.set("rewind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRewind: Self = this.set("rewind", js.undefined)
    
    @scala.inline
    def setScrollLock(value: Boolean): Self = this.set("scrollLock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollLock: Self = this.set("scrollLock", js.undefined)
    
    @scala.inline
    def setScrollLockDelay(value: Double): Self = this.set("scrollLockDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollLockDelay: Self = this.set("scrollLockDelay", js.undefined)
    
    @scala.inline
    def setScrollPropagate(value: Boolean): Self = this.set("scrollPropagate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollPropagate: Self = this.set("scrollPropagate", js.undefined)
    
    @scala.inline
    def setSkipTrack(value: Boolean): Self = this.set("skipTrack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipTrack: Self = this.set("skipTrack", js.undefined)
    
    @scala.inline
    def setSlidesToScroll(value: Double | auto): Self = this.set("slidesToScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlidesToScroll: Self = this.set("slidesToScroll", js.undefined)
    
    @scala.inline
    def setSlidesToShow(value: Double | auto): Self = this.set("slidesToShow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlidesToShow: Self = this.set("slidesToShow", js.undefined)
  }
}

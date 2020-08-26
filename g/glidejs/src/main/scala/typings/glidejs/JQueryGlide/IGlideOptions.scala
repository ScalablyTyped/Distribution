package typings.glidejs.JQueryGlide

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGlideOptions extends js.Object {
  /**
    * Default: function () {}
    * {Function} Callback after plugin init
    */
  var afterInit: js.UndefOr[js.Function] = js.native
  /**
    * Default: function() {}
    * {Function} Callback after slide change
    */
  var afterTransition: js.UndefOr[js.Function] = js.native
  /**
    * Default: 500
    * Animation time in ms
    * @type {number}
    */
  var animationDuration: js.UndefOr[Double] = js.native
  /**
    * Default: cubic-bezier(0.165, 0.840, 0.440, 1.000)
    * cubic-bezier(0.165, 0.840, 0.440, 1.000)
    */
  var animationTimingFunc: js.UndefOr[String] = js.native
  /**
    * Default: 'slider-arrow--left'
    * {String} Left arrow
    */
  var arrowLeftClass: js.UndefOr[String] = js.native
  /**
    * Default: 'prev'
    * {String} Left arrow text
    */
  var arrowLeftText: js.UndefOr[String] = js.native
  /**
    * Default: 'slider-arrow'
    * {String} Main class for both arrows
    */
  var arrowMainClass: js.UndefOr[String] = js.native
  /**
    * Default: 'slider-arrow--right'
    * {String} Right arrow
    */
  var arrowRightClass: js.UndefOr[String] = js.native
  /**
    * Default: 'next'
    * {String} Right arrow text
    */
  var arrowRightText: js.UndefOr[String] = js.native
  /**
    * Default: true
    * {Bool or String} Show/hide/appendTo arrows
    * True for append arrows to slider wrapper
    * False for not appending arrows
    * Id or class name (e.g. '.class-name') for appending to specific HTML markup
    */
  var arrows: js.UndefOr[js.Any] = js.native
  /**
    * Default: 'slider-arrows'
    * {String} Arrows wrapper class
    */
  var arrowsWrapperClass: js.UndefOr[String] = js.native
  /**
    * Default: 4000
    * {Int or Bool} False for turning off autoplay
    */
  var autoplay: js.UndefOr[js.Any] = js.native
  /**
    * Default: function () {}
    * {Function} Callback before plugin init
    */
  var beforeInit: js.UndefOr[js.Function] = js.native
  /**
    * Default: function () {}
    * {Function} Callback before slide change
    */
  var beforeTransition: js.UndefOr[js.Function] = js.native
  /**
    * Default: true {Bool} Circular play (Animation continues without starting over once it reaches the last slide)
    */
  var circular: js.UndefOr[Boolean] = js.native
  /**
    * Default: true {Bool} Pause autoplay on mouseover slider
    */
  var hoverpause: js.UndefOr[Boolean] = js.native
  /**
    * Default: true
    * {Bool} Slide on left / right keyboard arrows press
    */
  var keyboard: js.UndefOr[Boolean] = js.native
  /**
    * Default: true
    * {Bool or String} Show/hide/appendTo bullets navigation
    * True for append arrows to slider wrapper
    * False for not appending arrows
    * Id or class name (e.g. '.class-name') for appending to specific HTML markup
    */
  var navigation: js.UndefOr[js.Any] = js.native
  /**
    * Default: true
    * {Bool} Center bullet navigation
    */
  var navigationCenter: js.UndefOr[Boolean] = js.native
  /**
    * Default: 'slider-nav'
    * {String} Navigation class
    */
  var navigationClass: js.UndefOr[String] = js.native
  /**
    * Default: 'slider-nav__item--current'
    * {String} Current navigation item class
    */
  var navigationCurrentItemClass: js.UndefOr[String] = js.native
  /**
    * Default: 'slider-nav__item'
    * {String} Navigation item class
    */
  var navigationItemClass: js.UndefOr[String] = js.native
  /**
    * Default: 60
    * {Int or Bool} Touch settings
    */
  var touchDistance: js.UndefOr[js.Any] = js.native
}

object IGlideOptions {
  @scala.inline
  def apply(): IGlideOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGlideOptions]
  }
  @scala.inline
  implicit class IGlideOptionsOps[Self <: IGlideOptions] (val x: Self) extends AnyVal {
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
    def setAfterInit(value: js.Function): Self = this.set("afterInit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterInit: Self = this.set("afterInit", js.undefined)
    @scala.inline
    def setAfterTransition(value: js.Function): Self = this.set("afterTransition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterTransition: Self = this.set("afterTransition", js.undefined)
    @scala.inline
    def setAnimationDuration(value: Double): Self = this.set("animationDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationDuration: Self = this.set("animationDuration", js.undefined)
    @scala.inline
    def setAnimationTimingFunc(value: String): Self = this.set("animationTimingFunc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationTimingFunc: Self = this.set("animationTimingFunc", js.undefined)
    @scala.inline
    def setArrowLeftClass(value: String): Self = this.set("arrowLeftClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrowLeftClass: Self = this.set("arrowLeftClass", js.undefined)
    @scala.inline
    def setArrowLeftText(value: String): Self = this.set("arrowLeftText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrowLeftText: Self = this.set("arrowLeftText", js.undefined)
    @scala.inline
    def setArrowMainClass(value: String): Self = this.set("arrowMainClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrowMainClass: Self = this.set("arrowMainClass", js.undefined)
    @scala.inline
    def setArrowRightClass(value: String): Self = this.set("arrowRightClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrowRightClass: Self = this.set("arrowRightClass", js.undefined)
    @scala.inline
    def setArrowRightText(value: String): Self = this.set("arrowRightText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrowRightText: Self = this.set("arrowRightText", js.undefined)
    @scala.inline
    def setArrows(value: js.Any): Self = this.set("arrows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrows: Self = this.set("arrows", js.undefined)
    @scala.inline
    def setArrowsWrapperClass(value: String): Self = this.set("arrowsWrapperClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrowsWrapperClass: Self = this.set("arrowsWrapperClass", js.undefined)
    @scala.inline
    def setAutoplay(value: js.Any): Self = this.set("autoplay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoplay: Self = this.set("autoplay", js.undefined)
    @scala.inline
    def setBeforeInit(value: js.Function): Self = this.set("beforeInit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeInit: Self = this.set("beforeInit", js.undefined)
    @scala.inline
    def setBeforeTransition(value: js.Function): Self = this.set("beforeTransition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeTransition: Self = this.set("beforeTransition", js.undefined)
    @scala.inline
    def setCircular(value: Boolean): Self = this.set("circular", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCircular: Self = this.set("circular", js.undefined)
    @scala.inline
    def setHoverpause(value: Boolean): Self = this.set("hoverpause", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHoverpause: Self = this.set("hoverpause", js.undefined)
    @scala.inline
    def setKeyboard(value: Boolean): Self = this.set("keyboard", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyboard: Self = this.set("keyboard", js.undefined)
    @scala.inline
    def setNavigation(value: js.Any): Self = this.set("navigation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavigation: Self = this.set("navigation", js.undefined)
    @scala.inline
    def setNavigationCenter(value: Boolean): Self = this.set("navigationCenter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavigationCenter: Self = this.set("navigationCenter", js.undefined)
    @scala.inline
    def setNavigationClass(value: String): Self = this.set("navigationClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavigationClass: Self = this.set("navigationClass", js.undefined)
    @scala.inline
    def setNavigationCurrentItemClass(value: String): Self = this.set("navigationCurrentItemClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavigationCurrentItemClass: Self = this.set("navigationCurrentItemClass", js.undefined)
    @scala.inline
    def setNavigationItemClass(value: String): Self = this.set("navigationItemClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavigationItemClass: Self = this.set("navigationItemClass", js.undefined)
    @scala.inline
    def setTouchDistance(value: js.Any): Self = this.set("touchDistance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTouchDistance: Self = this.set("touchDistance", js.undefined)
  }
  
}


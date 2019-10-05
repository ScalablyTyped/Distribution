package typings.glidejs.JQueryGlide

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGlideOptions extends js.Object {
  /**
    * Default: function () {}
    * {Function} Callback after plugin init
    */
  var afterInit: js.UndefOr[js.Function] = js.undefined
  /**
    * Default: function() {}
    * {Function} Callback after slide change
    */
  var afterTransition: js.UndefOr[js.Function] = js.undefined
  /**
    * Default: 500
    * Animation time in ms
    * @type {number}
    */
  var animationDuration: js.UndefOr[Double] = js.undefined
  /**
    * Default: cubic-bezier(0.165, 0.840, 0.440, 1.000)
    * cubic-bezier(0.165, 0.840, 0.440, 1.000)
    */
  var animationTimingFunc: js.UndefOr[String] = js.undefined
  /**
    * Default: 'slider-arrow--left'
    * {String} Left arrow
    */
  var arrowLeftClass: js.UndefOr[String] = js.undefined
  /**
    * Default: 'prev'
    * {String} Left arrow text
    */
  var arrowLeftText: js.UndefOr[String] = js.undefined
  /**
    * Default: 'slider-arrow'
    * {String} Main class for both arrows
    */
  var arrowMainClass: js.UndefOr[String] = js.undefined
  /**
    * Default: 'slider-arrow--right'
    * {String} Right arrow
    */
  var arrowRightClass: js.UndefOr[String] = js.undefined
  /**
    * Default: 'next'
    * {String} Right arrow text
    */
  var arrowRightText: js.UndefOr[String] = js.undefined
  /**
    * Default: true
    * {Bool or String} Show/hide/appendTo arrows
    * True for append arrows to slider wrapper
    * False for not appending arrows
    * Id or class name (e.g. '.class-name') for appending to specific HTML markup
    */
  var arrows: js.UndefOr[js.Any] = js.undefined
  /**
    * Default: 'slider-arrows'
    * {String} Arrows wrapper class
    */
  var arrowsWrapperClass: js.UndefOr[String] = js.undefined
  /**
    * Default: 4000
    * {Int or Bool} False for turning off autoplay
    */
  var autoplay: js.UndefOr[js.Any] = js.undefined
  /**
    * Default: function () {}
    * {Function} Callback before plugin init
    */
  var beforeInit: js.UndefOr[js.Function] = js.undefined
  /**
    * Default: function () {}
    * {Function} Callback before slide change
    */
  var beforeTransition: js.UndefOr[js.Function] = js.undefined
  /**
    * Default: true {Bool} Circular play (Animation continues without starting over once it reaches the last slide)
    */
  var circular: js.UndefOr[Boolean] = js.undefined
  /**
    * Default: true {Bool} Pause autoplay on mouseover slider
    */
  var hoverpause: js.UndefOr[Boolean] = js.undefined
  /**
    * Default: true
    * {Bool} Slide on left / right keyboard arrows press
    */
  var keyboard: js.UndefOr[Boolean] = js.undefined
  /**
    * Default: true
    * {Bool or String} Show/hide/appendTo bullets navigation
    * True for append arrows to slider wrapper
    * False for not appending arrows
    * Id or class name (e.g. '.class-name') for appending to specific HTML markup
    */
  var navigation: js.UndefOr[js.Any] = js.undefined
  /**
    * Default: true
    * {Bool} Center bullet navigation
    */
  var navigationCenter: js.UndefOr[Boolean] = js.undefined
  /**
    * Default: 'slider-nav'
    * {String} Navigation class
    */
  var navigationClass: js.UndefOr[String] = js.undefined
  /**
    * Default: 'slider-nav__item--current'
    * {String} Current navigation item class
    */
  var navigationCurrentItemClass: js.UndefOr[String] = js.undefined
  /**
    * Default: 'slider-nav__item'
    * {String} Navigation item class
    */
  var navigationItemClass: js.UndefOr[String] = js.undefined
  /**
    * Default: 60
    * {Int or Bool} Touch settings
    */
  var touchDistance: js.UndefOr[js.Any] = js.undefined
}

object IGlideOptions {
  @scala.inline
  def apply(
    afterInit: js.Function = null,
    afterTransition: js.Function = null,
    animationDuration: Int | Double = null,
    animationTimingFunc: String = null,
    arrowLeftClass: String = null,
    arrowLeftText: String = null,
    arrowMainClass: String = null,
    arrowRightClass: String = null,
    arrowRightText: String = null,
    arrows: js.Any = null,
    arrowsWrapperClass: String = null,
    autoplay: js.Any = null,
    beforeInit: js.Function = null,
    beforeTransition: js.Function = null,
    circular: js.UndefOr[Boolean] = js.undefined,
    hoverpause: js.UndefOr[Boolean] = js.undefined,
    keyboard: js.UndefOr[Boolean] = js.undefined,
    navigation: js.Any = null,
    navigationCenter: js.UndefOr[Boolean] = js.undefined,
    navigationClass: String = null,
    navigationCurrentItemClass: String = null,
    navigationItemClass: String = null,
    touchDistance: js.Any = null
  ): IGlideOptions = {
    val __obj = js.Dynamic.literal()
    if (afterInit != null) __obj.updateDynamic("afterInit")(afterInit)
    if (afterTransition != null) __obj.updateDynamic("afterTransition")(afterTransition)
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (animationTimingFunc != null) __obj.updateDynamic("animationTimingFunc")(animationTimingFunc)
    if (arrowLeftClass != null) __obj.updateDynamic("arrowLeftClass")(arrowLeftClass)
    if (arrowLeftText != null) __obj.updateDynamic("arrowLeftText")(arrowLeftText)
    if (arrowMainClass != null) __obj.updateDynamic("arrowMainClass")(arrowMainClass)
    if (arrowRightClass != null) __obj.updateDynamic("arrowRightClass")(arrowRightClass)
    if (arrowRightText != null) __obj.updateDynamic("arrowRightText")(arrowRightText)
    if (arrows != null) __obj.updateDynamic("arrows")(arrows)
    if (arrowsWrapperClass != null) __obj.updateDynamic("arrowsWrapperClass")(arrowsWrapperClass)
    if (autoplay != null) __obj.updateDynamic("autoplay")(autoplay)
    if (beforeInit != null) __obj.updateDynamic("beforeInit")(beforeInit)
    if (beforeTransition != null) __obj.updateDynamic("beforeTransition")(beforeTransition)
    if (!js.isUndefined(circular)) __obj.updateDynamic("circular")(circular)
    if (!js.isUndefined(hoverpause)) __obj.updateDynamic("hoverpause")(hoverpause)
    if (!js.isUndefined(keyboard)) __obj.updateDynamic("keyboard")(keyboard)
    if (navigation != null) __obj.updateDynamic("navigation")(navigation)
    if (!js.isUndefined(navigationCenter)) __obj.updateDynamic("navigationCenter")(navigationCenter)
    if (navigationClass != null) __obj.updateDynamic("navigationClass")(navigationClass)
    if (navigationCurrentItemClass != null) __obj.updateDynamic("navigationCurrentItemClass")(navigationCurrentItemClass)
    if (navigationItemClass != null) __obj.updateDynamic("navigationItemClass")(navigationItemClass)
    if (touchDistance != null) __obj.updateDynamic("touchDistance")(touchDistance)
    __obj.asInstanceOf[IGlideOptions]
  }
}


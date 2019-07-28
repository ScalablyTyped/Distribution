package typings.ejDotWebDotAll.ejNs.ScrollerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Specifies the swipe scrolling speed(in millisecond).
    * @Default {600}
    */
  var animationSpeed: js.UndefOr[Double] = js.undefined
  /** Set true to hides the scrollbar, when mouseout the content area.
    * @Default {false}
    */
  var autoHide: js.UndefOr[Boolean] = js.undefined
  /** Specifies the height and width of button in the scrollbar.
    * @Default {18}
    */
  var buttonSize: js.UndefOr[Double] = js.undefined
  /** Fires when Scroller control is created.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.undefined
  /** Fires when Scroller control is destroyed.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.undefined
  /** Save current model value to browser cookies for state maintenance. While refresh the page Rating control values are retained.
    * @Default {false}
    */
  var enablePersistence: js.UndefOr[Boolean] = js.undefined
  /** Indicates the Right to Left direction to scroller
    * @Default {undefined}
    */
  var enableRTL: js.UndefOr[Boolean] = js.undefined
  /** Enables or Disable the touch Scroll
    * @Default {true}
    */
  var enableTouchScroll: js.UndefOr[Boolean] = js.undefined
  /** Specifies to enable or disable the scroller
    * @Default {true}
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /** Specifies the height of Scroll panel and scrollbars.
    * @Default {250}
    */
  var height: js.UndefOr[Double | String] = js.undefined
  /** The Scroller content and scrollbars move left with given value.
    * @Default {0}
    */
  var scrollLeft: js.UndefOr[Double] = js.undefined
  /** While press on the arrow key the scrollbar position added to the given pixel value.
    * @Default {57}
    */
  var scrollOneStepBy: js.UndefOr[Double] = js.undefined
  /** The Scroller content and scrollbars move to top position with specified value.
    * @Default {0}
    */
  var scrollTop: js.UndefOr[Double] = js.undefined
  /** If the scrollbar has vertical it set as width, else it will set as height of the handler.
    * @Default {18}
    */
  var scrollerSize: js.UndefOr[Double] = js.undefined
  /** Indicates the target area to which scroller have to appear.
    * @Default {null}
    */
  var targetPane: js.UndefOr[String] = js.undefined
  /** Fires when a thumb point is removed from the touch surface.
    */
  var thumbEnd: js.UndefOr[js.Function1[/* e */ ThumbEndEventArgs, Unit]] = js.undefined
  /** Fires when a thumb point is moved along the touch surface.
    */
  var thumbMove: js.UndefOr[js.Function1[/* e */ ThumbMoveEventArgs, Unit]] = js.undefined
  /** Fires when a thumb point is placed on the touch surface.
    */
  var thumbStart: js.UndefOr[js.Function1[/* e */ ThumbStartEventArgs, Unit]] = js.undefined
  /** It fires whenever the mouse wheel is rotated either in upwards or downwards.
    */
  var wheelMove: js.UndefOr[js.Function1[/* e */ WheelMoveEventArgs, Unit]] = js.undefined
  /** It will fire when mouse trackball has been start to wheel.
    */
  var wheelStart: js.UndefOr[js.Function1[/* e */ WheelStartEventArgs, Unit]] = js.undefined
  /** It will fire when mouse trackball has been stop to wheel.
    */
  var wheelStop: js.UndefOr[js.Function1[/* e */ WheelStopEventArgs, Unit]] = js.undefined
  /** Specifies the width of Scroll panel and scrollbars.
    * @Default {0}
    */
  var width: js.UndefOr[Double | String] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    animationSpeed: Int | Double = null,
    autoHide: js.UndefOr[Boolean] = js.undefined,
    buttonSize: Int | Double = null,
    create: /* e */ CreateEventArgs => Unit = null,
    destroy: /* e */ DestroyEventArgs => Unit = null,
    enablePersistence: js.UndefOr[Boolean] = js.undefined,
    enableRTL: js.UndefOr[Boolean] = js.undefined,
    enableTouchScroll: js.UndefOr[Boolean] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    height: Double | String = null,
    scrollLeft: Int | Double = null,
    scrollOneStepBy: Int | Double = null,
    scrollTop: Int | Double = null,
    scrollerSize: Int | Double = null,
    targetPane: String = null,
    thumbEnd: /* e */ ThumbEndEventArgs => Unit = null,
    thumbMove: /* e */ ThumbMoveEventArgs => Unit = null,
    thumbStart: /* e */ ThumbStartEventArgs => Unit = null,
    wheelMove: /* e */ WheelMoveEventArgs => Unit = null,
    wheelStart: /* e */ WheelStartEventArgs => Unit = null,
    wheelStop: /* e */ WheelStopEventArgs => Unit = null,
    width: Double | String = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (animationSpeed != null) __obj.updateDynamic("animationSpeed")(animationSpeed.asInstanceOf[js.Any])
    if (!js.isUndefined(autoHide)) __obj.updateDynamic("autoHide")(autoHide)
    if (buttonSize != null) __obj.updateDynamic("buttonSize")(buttonSize.asInstanceOf[js.Any])
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction1(create))
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction1(destroy))
    if (!js.isUndefined(enablePersistence)) __obj.updateDynamic("enablePersistence")(enablePersistence)
    if (!js.isUndefined(enableRTL)) __obj.updateDynamic("enableRTL")(enableRTL)
    if (!js.isUndefined(enableTouchScroll)) __obj.updateDynamic("enableTouchScroll")(enableTouchScroll)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (scrollLeft != null) __obj.updateDynamic("scrollLeft")(scrollLeft.asInstanceOf[js.Any])
    if (scrollOneStepBy != null) __obj.updateDynamic("scrollOneStepBy")(scrollOneStepBy.asInstanceOf[js.Any])
    if (scrollTop != null) __obj.updateDynamic("scrollTop")(scrollTop.asInstanceOf[js.Any])
    if (scrollerSize != null) __obj.updateDynamic("scrollerSize")(scrollerSize.asInstanceOf[js.Any])
    if (targetPane != null) __obj.updateDynamic("targetPane")(targetPane)
    if (thumbEnd != null) __obj.updateDynamic("thumbEnd")(js.Any.fromFunction1(thumbEnd))
    if (thumbMove != null) __obj.updateDynamic("thumbMove")(js.Any.fromFunction1(thumbMove))
    if (thumbStart != null) __obj.updateDynamic("thumbStart")(js.Any.fromFunction1(thumbStart))
    if (wheelMove != null) __obj.updateDynamic("wheelMove")(js.Any.fromFunction1(wheelMove))
    if (wheelStart != null) __obj.updateDynamic("wheelStart")(js.Any.fromFunction1(wheelStart))
    if (wheelStop != null) __obj.updateDynamic("wheelStop")(js.Any.fromFunction1(wheelStop))
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
}


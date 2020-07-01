package typings.gliderJs.mod

import typings.gliderJs.anon.Next
import typings.gliderJs.gliderJsStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * An object containing the prev/next arrow settings
    */
  var arrows: js.UndefOr[Next] = js.undefined
  /**
    * An HTML element or selector containing the dot container
    */
  var dots: js.UndefOr[Selector] = js.undefined
  /**
    * How much to aggravate the velocity of the mouse dragging
    */
  var dragVelocity: js.UndefOr[Double] = js.undefined
  /**
    * If true, the list can be scrolled by click and dragging with the
    * mouse
    */
  var draggable: js.UndefOr[Boolean] = js.undefined
  /**
    * An aggravator used to control animation speed. Higher is slower!
    */
  var duration: js.UndefOr[Double] = js.undefined
  /**
    * Use any custom easing function, compatible with most easing
    * plugins
    */
  var easing: js.UndefOr[EasingFunction] = js.undefined
  /**
    * This prevents resizing items to fit when `slidesToShow` is set to
    * auto.
    */
  var exactWidth: js.UndefOr[Boolean] = js.undefined
  /**
    * This value is ignored unless `slidesToShow` is set to `auto`, in
    * which it is then required.
    */
  var itemWidth: js.UndefOr[Double] = js.undefined
  /**
    * Whether or not Glider.js events should bubble (useful for binding
    * events to all carousels)
    */
  var propagateEvent: js.UndefOr[Boolean] = js.undefined
  /**
    * If true, Glider.js will lock to the nearest slide on resizing of
    * the window
    */
  var resizeLock: js.UndefOr[Boolean] = js.undefined
  /**
    * An object containing custom settings per provided breakpoint. See
    * demo for details.
    */
  var responsive: js.UndefOr[js.Array[Breakpoint]] = js.undefined
  /**
    * If true, Glider.js will scroll to the beginning/end when its
    * respective endpoint is reached
    */
  var rewind: js.UndefOr[Boolean] = js.undefined
  /**
    * If true, Glider.js will scroll to the nearest slide after any
    * scroll interactions
    */
  var scrollLock: js.UndefOr[Boolean] = js.undefined
  /**
    * When `scrollLock` is set, this is the delay in milliseconds to
    * wait before the scroll happens
    */
  var scrollLockDelay: js.UndefOr[Double] = js.undefined
  /**
    * Whether or not to release the scroll events from the container
    */
  var scrollPropagate: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether or not Glider.js should skip wrapping its children with a
    * 'glider-track' <div>.
    */
  var skipTrack: js.UndefOr[Boolean] = js.undefined
  /**
    * The number of slides to scroll when arrow navigation is used If
    * this value is set to `auto`, it will match the value of
    * `slidesToScroll`.
    */
  var slidesToScroll: js.UndefOr[Double | auto] = js.undefined
  /**
    * The number of slides to show in container. If this value is set
    * to `auto`, it will be automatially calcuated based upon the
    * number of items able to fit within the container viewport. This
    * requires setting the `itemWidth` option.
    */
  var slidesToShow: js.UndefOr[Double | auto] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    arrows: Next = null,
    dots: Selector = null,
    dragVelocity: js.UndefOr[Double] = js.undefined,
    draggable: js.UndefOr[Boolean] = js.undefined,
    duration: js.UndefOr[Double] = js.undefined,
    easing: (/* x */ Double, /* t */ Double, /* b */ Double, /* c */ Double, /* d */ Double) => Double = null,
    exactWidth: js.UndefOr[Boolean] = js.undefined,
    itemWidth: js.UndefOr[Double] = js.undefined,
    propagateEvent: js.UndefOr[Boolean] = js.undefined,
    resizeLock: js.UndefOr[Boolean] = js.undefined,
    responsive: js.Array[Breakpoint] = null,
    rewind: js.UndefOr[Boolean] = js.undefined,
    scrollLock: js.UndefOr[Boolean] = js.undefined,
    scrollLockDelay: js.UndefOr[Double] = js.undefined,
    scrollPropagate: js.UndefOr[Boolean] = js.undefined,
    skipTrack: js.UndefOr[Boolean] = js.undefined,
    slidesToScroll: Double | auto = null,
    slidesToShow: Double | auto = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (arrows != null) __obj.updateDynamic("arrows")(arrows.asInstanceOf[js.Any])
    if (dots != null) __obj.updateDynamic("dots")(dots.asInstanceOf[js.Any])
    if (!js.isUndefined(dragVelocity)) __obj.updateDynamic("dragVelocity")(dragVelocity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(js.Any.fromFunction5(easing))
    if (!js.isUndefined(exactWidth)) __obj.updateDynamic("exactWidth")(exactWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(itemWidth)) __obj.updateDynamic("itemWidth")(itemWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(propagateEvent)) __obj.updateDynamic("propagateEvent")(propagateEvent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(resizeLock)) __obj.updateDynamic("resizeLock")(resizeLock.get.asInstanceOf[js.Any])
    if (responsive != null) __obj.updateDynamic("responsive")(responsive.asInstanceOf[js.Any])
    if (!js.isUndefined(rewind)) __obj.updateDynamic("rewind")(rewind.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollLock)) __obj.updateDynamic("scrollLock")(scrollLock.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollLockDelay)) __obj.updateDynamic("scrollLockDelay")(scrollLockDelay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollPropagate)) __obj.updateDynamic("scrollPropagate")(scrollPropagate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(skipTrack)) __obj.updateDynamic("skipTrack")(skipTrack.get.asInstanceOf[js.Any])
    if (slidesToScroll != null) __obj.updateDynamic("slidesToScroll")(slidesToScroll.asInstanceOf[js.Any])
    if (slidesToShow != null) __obj.updateDynamic("slidesToShow")(slidesToShow.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}


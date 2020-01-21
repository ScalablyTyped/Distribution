package typings.flickity.mod

import typings.flickity.AnonX
import typings.std.Element
import typings.std.Event_
import typings.std.Touch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventBindings extends js.Object {
  /**
    * Triggered after a background image has been loaded with bgLazyLoad.
    */
  var bgLazyLoad: js.UndefOr[
    js.Function2[/* event */ js.UndefOr[Event_], /* element */ js.UndefOr[Element], Unit]
  ] = js.undefined
  var cellSelect: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], Unit]] = js.undefined
  /**
    * Triggered when the selected slide is changed.
    */
  var change: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], Unit]] = js.undefined
  /**
    * Triggered when dragging ends.
    */
  var dragEnd: js.UndefOr[
    js.Function2[/* event */ Event_, /* pointer */ js.UndefOr[Element | Touch], Unit]
  ] = js.undefined
  /**
    * Triggered when dragging moves and the slider moves.
    */
  var dragMove: js.UndefOr[
    js.Function3[
      /* event */ js.UndefOr[Event_], 
      /* pointer */ js.UndefOr[Element | Touch], 
      /* moveVector */ js.UndefOr[AnonX], 
      Unit
    ]
  ] = js.undefined
  /**
    * Triggered when dragging starts and the slider starts moving.
    */
  var dragStart: js.UndefOr[
    js.Function2[/* event */ js.UndefOr[Event_], /* pointer */ js.UndefOr[Element | Touch], Unit]
  ] = js.undefined
  /**
    * Triggered after entering or exiting fullscreen view.
    */
  var fullscreenChange: js.UndefOr[js.Function1[/* isFullscreen */ js.UndefOr[Boolean], Unit]] = js.undefined
  /**
    * Triggered after an image has been loaded with lazyLoad.
    */
  var lazyLoad: js.UndefOr[
    js.Function2[/* event */ js.UndefOr[Event_], /* cellElement */ js.UndefOr[Element], Unit]
  ] = js.undefined
  /**
    * Triggered when the user's pointer (mouse, touch, pointer) presses down.
    */
  var pointerDown: js.UndefOr[
    js.Function2[/* event */ Event_, /* pointer */ js.UndefOr[Element | Touch], Unit]
  ] = js.undefined
  /**
    * Triggered when the user's pointer moves.
    */
  var pointerMove: js.UndefOr[
    js.Function3[
      /* event */ js.UndefOr[Event_], 
      /* pointer */ js.UndefOr[Element | Touch], 
      /* moveVector */ js.UndefOr[AnonX], 
      Unit
    ]
  ] = js.undefined
  /**
    * Triggered when the user's pointer unpresses.
    */
  var pointerUp: js.UndefOr[
    js.Function2[/* event */ js.UndefOr[Event_], /* pointer */ js.UndefOr[Element | Touch], Unit]
  ] = js.undefined
  /**
    * Triggered after Flickity has been activated.
    */
  var ready: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Triggered when the slider moves.
    */
  var scroll: js.UndefOr[js.Function1[/* progress */ js.UndefOr[Double], Unit]] = js.undefined
  /**
    * Triggered when a slide is selected.
    * select is triggered any time a slide is selected, even on the same slide. change is triggered only when a different slide is selected.
    * This event was previously cellSelect in Flickity v1. cellSelect will continue to work in Flickity v2.
    */
  var select: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], Unit]] = js.undefined
  /**
    * Triggered when the slider is settled at its end position.
    */
  var settle: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], Unit]] = js.undefined
  /**
    * Triggered when the user's pointer is pressed and unpressed and has not moved enough to start dragging.
    * click events are hard to detect with draggable UI, as they are triggered whenever a user drags.
    * Flickity's staticClick event resolves this, as it is triggered when the user has not dragged.
    */
  var staticClick: js.UndefOr[
    js.Function4[
      /* event */ js.UndefOr[Event_], 
      /* pointer */ js.UndefOr[Element | Touch], 
      /* cellElement */ js.UndefOr[Element], 
      /* cellIndex */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.undefined
}

object EventBindings {
  @scala.inline
  def apply(
    bgLazyLoad: (/* event */ js.UndefOr[Event_], /* element */ js.UndefOr[Element]) => Unit = null,
    cellSelect: /* index */ js.UndefOr[Double] => Unit = null,
    change: /* index */ js.UndefOr[Double] => Unit = null,
    dragEnd: (/* event */ Event_, /* pointer */ js.UndefOr[Element | Touch]) => Unit = null,
    dragMove: (/* event */ js.UndefOr[Event_], /* pointer */ js.UndefOr[Element | Touch], /* moveVector */ js.UndefOr[AnonX]) => Unit = null,
    dragStart: (/* event */ js.UndefOr[Event_], /* pointer */ js.UndefOr[Element | Touch]) => Unit = null,
    fullscreenChange: /* isFullscreen */ js.UndefOr[Boolean] => Unit = null,
    lazyLoad: (/* event */ js.UndefOr[Event_], /* cellElement */ js.UndefOr[Element]) => Unit = null,
    pointerDown: (/* event */ Event_, /* pointer */ js.UndefOr[Element | Touch]) => Unit = null,
    pointerMove: (/* event */ js.UndefOr[Event_], /* pointer */ js.UndefOr[Element | Touch], /* moveVector */ js.UndefOr[AnonX]) => Unit = null,
    pointerUp: (/* event */ js.UndefOr[Event_], /* pointer */ js.UndefOr[Element | Touch]) => Unit = null,
    ready: () => Unit = null,
    scroll: /* progress */ js.UndefOr[Double] => Unit = null,
    select: /* index */ js.UndefOr[Double] => Unit = null,
    settle: /* index */ js.UndefOr[Double] => Unit = null,
    staticClick: (/* event */ js.UndefOr[Event_], /* pointer */ js.UndefOr[Element | Touch], /* cellElement */ js.UndefOr[Element], /* cellIndex */ js.UndefOr[Double]) => Unit = null
  ): EventBindings = {
    val __obj = js.Dynamic.literal()
    if (bgLazyLoad != null) __obj.updateDynamic("bgLazyLoad")(js.Any.fromFunction2(bgLazyLoad))
    if (cellSelect != null) __obj.updateDynamic("cellSelect")(js.Any.fromFunction1(cellSelect))
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1(change))
    if (dragEnd != null) __obj.updateDynamic("dragEnd")(js.Any.fromFunction2(dragEnd))
    if (dragMove != null) __obj.updateDynamic("dragMove")(js.Any.fromFunction3(dragMove))
    if (dragStart != null) __obj.updateDynamic("dragStart")(js.Any.fromFunction2(dragStart))
    if (fullscreenChange != null) __obj.updateDynamic("fullscreenChange")(js.Any.fromFunction1(fullscreenChange))
    if (lazyLoad != null) __obj.updateDynamic("lazyLoad")(js.Any.fromFunction2(lazyLoad))
    if (pointerDown != null) __obj.updateDynamic("pointerDown")(js.Any.fromFunction2(pointerDown))
    if (pointerMove != null) __obj.updateDynamic("pointerMove")(js.Any.fromFunction3(pointerMove))
    if (pointerUp != null) __obj.updateDynamic("pointerUp")(js.Any.fromFunction2(pointerUp))
    if (ready != null) __obj.updateDynamic("ready")(js.Any.fromFunction0(ready))
    if (scroll != null) __obj.updateDynamic("scroll")(js.Any.fromFunction1(scroll))
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction1(select))
    if (settle != null) __obj.updateDynamic("settle")(js.Any.fromFunction1(settle))
    if (staticClick != null) __obj.updateDynamic("staticClick")(js.Any.fromFunction4(staticClick))
    __obj.asInstanceOf[EventBindings]
  }
}


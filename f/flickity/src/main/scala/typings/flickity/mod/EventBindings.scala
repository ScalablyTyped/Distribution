package typings.flickity.mod

import typings.flickity.anon.X
import typings.std.Element
import typings.std.Event
import typings.std.Touch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventBindings extends js.Object {
  /**
    * Triggered after a background image has been loaded with bgLazyLoad.
    */
  var bgLazyLoad: js.UndefOr[
    js.Function2[/* event */ js.UndefOr[Event], /* element */ js.UndefOr[Element], Unit]
  ] = js.native
  var cellSelect: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], Unit]] = js.native
  /**
    * Triggered when the selected slide is changed.
    */
  var change: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], Unit]] = js.native
  /**
    * Triggered when dragging ends.
    */
  var dragEnd: js.UndefOr[js.Function2[/* event */ Event, /* pointer */ js.UndefOr[Element | Touch], Unit]] = js.native
  /**
    * Triggered when dragging moves and the slider moves.
    */
  var dragMove: js.UndefOr[
    js.Function3[
      /* event */ js.UndefOr[Event], 
      /* pointer */ js.UndefOr[Element | Touch], 
      /* moveVector */ js.UndefOr[X], 
      Unit
    ]
  ] = js.native
  /**
    * Triggered when dragging starts and the slider starts moving.
    */
  var dragStart: js.UndefOr[
    js.Function2[/* event */ js.UndefOr[Event], /* pointer */ js.UndefOr[Element | Touch], Unit]
  ] = js.native
  /**
    * Triggered after entering or exiting fullscreen view.
    */
  var fullscreenChange: js.UndefOr[js.Function1[/* isFullscreen */ js.UndefOr[Boolean], Unit]] = js.native
  /**
    * Triggered after an image has been loaded with lazyLoad.
    */
  var lazyLoad: js.UndefOr[
    js.Function2[/* event */ js.UndefOr[Event], /* cellElement */ js.UndefOr[Element], Unit]
  ] = js.native
  /**
    * Triggered when the user's pointer (mouse, touch, pointer) presses down.
    */
  var pointerDown: js.UndefOr[js.Function2[/* event */ Event, /* pointer */ js.UndefOr[Element | Touch], Unit]] = js.native
  /**
    * Triggered when the user's pointer moves.
    */
  var pointerMove: js.UndefOr[
    js.Function3[
      /* event */ js.UndefOr[Event], 
      /* pointer */ js.UndefOr[Element | Touch], 
      /* moveVector */ js.UndefOr[X], 
      Unit
    ]
  ] = js.native
  /**
    * Triggered when the user's pointer unpresses.
    */
  var pointerUp: js.UndefOr[
    js.Function2[/* event */ js.UndefOr[Event], /* pointer */ js.UndefOr[Element | Touch], Unit]
  ] = js.native
  /**
    * Triggered after Flickity has been activated.
    */
  var ready: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Triggered when the slider moves.
    */
  var scroll: js.UndefOr[js.Function1[/* progress */ js.UndefOr[Double], Unit]] = js.native
  /**
    * Triggered when a slide is selected.
    * select is triggered any time a slide is selected, even on the same slide. change is triggered only when a different slide is selected.
    * This event was previously cellSelect in Flickity v1. cellSelect will continue to work in Flickity v2.
    */
  var select: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], Unit]] = js.native
  /**
    * Triggered when the slider is settled at its end position.
    */
  var settle: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], Unit]] = js.native
  /**
    * Triggered when the user's pointer is pressed and unpressed and has not moved enough to start dragging.
    * click events are hard to detect with draggable UI, as they are triggered whenever a user drags.
    * Flickity's staticClick event resolves this, as it is triggered when the user has not dragged.
    */
  var staticClick: js.UndefOr[
    js.Function4[
      /* event */ js.UndefOr[Event], 
      /* pointer */ js.UndefOr[Element | Touch], 
      /* cellElement */ js.UndefOr[Element], 
      /* cellIndex */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.native
}

object EventBindings {
  @scala.inline
  def apply(): EventBindings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventBindings]
  }
  @scala.inline
  implicit class EventBindingsOps[Self <: EventBindings] (val x: Self) extends AnyVal {
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
    def setBgLazyLoad(value: (/* event */ js.UndefOr[Event], /* element */ js.UndefOr[Element]) => Unit): Self = this.set("bgLazyLoad", js.Any.fromFunction2(value))
    @scala.inline
    def deleteBgLazyLoad: Self = this.set("bgLazyLoad", js.undefined)
    @scala.inline
    def setCellSelect(value: /* index */ js.UndefOr[Double] => Unit): Self = this.set("cellSelect", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCellSelect: Self = this.set("cellSelect", js.undefined)
    @scala.inline
    def setChange(value: /* index */ js.UndefOr[Double] => Unit): Self = this.set("change", js.Any.fromFunction1(value))
    @scala.inline
    def deleteChange: Self = this.set("change", js.undefined)
    @scala.inline
    def setDragEnd(value: (/* event */ Event, /* pointer */ js.UndefOr[Element | Touch]) => Unit): Self = this.set("dragEnd", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDragEnd: Self = this.set("dragEnd", js.undefined)
    @scala.inline
    def setDragMove(
      value: (/* event */ js.UndefOr[Event], /* pointer */ js.UndefOr[Element | Touch], /* moveVector */ js.UndefOr[X]) => Unit
    ): Self = this.set("dragMove", js.Any.fromFunction3(value))
    @scala.inline
    def deleteDragMove: Self = this.set("dragMove", js.undefined)
    @scala.inline
    def setDragStart(value: (/* event */ js.UndefOr[Event], /* pointer */ js.UndefOr[Element | Touch]) => Unit): Self = this.set("dragStart", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDragStart: Self = this.set("dragStart", js.undefined)
    @scala.inline
    def setFullscreenChange(value: /* isFullscreen */ js.UndefOr[Boolean] => Unit): Self = this.set("fullscreenChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFullscreenChange: Self = this.set("fullscreenChange", js.undefined)
    @scala.inline
    def setLazyLoad(value: (/* event */ js.UndefOr[Event], /* cellElement */ js.UndefOr[Element]) => Unit): Self = this.set("lazyLoad", js.Any.fromFunction2(value))
    @scala.inline
    def deleteLazyLoad: Self = this.set("lazyLoad", js.undefined)
    @scala.inline
    def setPointerDown(value: (/* event */ Event, /* pointer */ js.UndefOr[Element | Touch]) => Unit): Self = this.set("pointerDown", js.Any.fromFunction2(value))
    @scala.inline
    def deletePointerDown: Self = this.set("pointerDown", js.undefined)
    @scala.inline
    def setPointerMove(
      value: (/* event */ js.UndefOr[Event], /* pointer */ js.UndefOr[Element | Touch], /* moveVector */ js.UndefOr[X]) => Unit
    ): Self = this.set("pointerMove", js.Any.fromFunction3(value))
    @scala.inline
    def deletePointerMove: Self = this.set("pointerMove", js.undefined)
    @scala.inline
    def setPointerUp(value: (/* event */ js.UndefOr[Event], /* pointer */ js.UndefOr[Element | Touch]) => Unit): Self = this.set("pointerUp", js.Any.fromFunction2(value))
    @scala.inline
    def deletePointerUp: Self = this.set("pointerUp", js.undefined)
    @scala.inline
    def setReady(value: () => Unit): Self = this.set("ready", js.Any.fromFunction0(value))
    @scala.inline
    def deleteReady: Self = this.set("ready", js.undefined)
    @scala.inline
    def setScroll(value: /* progress */ js.UndefOr[Double] => Unit): Self = this.set("scroll", js.Any.fromFunction1(value))
    @scala.inline
    def deleteScroll: Self = this.set("scroll", js.undefined)
    @scala.inline
    def setSelect(value: /* index */ js.UndefOr[Double] => Unit): Self = this.set("select", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSelect: Self = this.set("select", js.undefined)
    @scala.inline
    def setSettle(value: /* index */ js.UndefOr[Double] => Unit): Self = this.set("settle", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSettle: Self = this.set("settle", js.undefined)
    @scala.inline
    def setStaticClick(
      value: (/* event */ js.UndefOr[Event], /* pointer */ js.UndefOr[Element | Touch], /* cellElement */ js.UndefOr[Element], /* cellIndex */ js.UndefOr[Double]) => Unit
    ): Self = this.set("staticClick", js.Any.fromFunction4(value))
    @scala.inline
    def deleteStaticClick: Self = this.set("staticClick", js.undefined)
  }
  
}


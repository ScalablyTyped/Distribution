package typings.dojo.dojo.base

import typings.std.Event_
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/_base/event.html
  *
  * This module defines dojo DOM event API.   Usually you should use dojo/on, and evt.stopPropagation() +
  * evt.preventDefault(), rather than this module.
  *
  */
trait event extends js.Object {
  /**
    * normalizes properties on the event object including event
    * bubbling methods, keystroke normalization, and x/y positions
    *
    * @param evt native event object
    * @param sender node to treat as "currentTarget"
    */
  def fix(evt: Event_, sender: HTMLElement): Event_
  /**
    * prevents propagation and clobbers the default action of the
    * passed event
    *
    * @param evt The event object. If omitted, window.event is used on IE.
    */
  def stop(evt: Event_): Unit
}

object event {
  @scala.inline
  def apply(fix: (Event_, HTMLElement) => Event_, stop: Event_ => Unit): event = {
    val __obj = js.Dynamic.literal(fix = js.Any.fromFunction2(fix), stop = js.Any.fromFunction1(stop))
    __obj.asInstanceOf[event]
  }
}


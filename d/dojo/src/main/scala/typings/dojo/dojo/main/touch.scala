package typings.dojo.dojo.main

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/main.touch.html
  *
  * This module provides unified touch event handlers by exporting
  * press, move, release and cancel which can also run well on desktop.
  * Based on http://dvcs.w3.org/hg/webevents/raw-file/tip/touchevents.html
  * Also, if the dojoClick property is set to truthy on a DOM node, dojo/touch generates
  * click events immediately for this node and its descendants (except for descendants that
  * have a dojoClick property set to falsy), to avoid the delay before native browser click events,
  * and regardless of whether evt.preventDefault() was called in a touch.press event listener.
  *
  */
trait touch extends js.Object {
  /**
    * Register a listener to 'touchcancel'|'mouseleave' for the given node
    *
    * @param node Target node to listen to
    * @param listener Callback function
    */
  def cancel(node: HTMLElement, listener: js.Function): js.Any
  /**
    * Register a listener to mouse.enter or touch equivalent for the given node
    *
    * @param node Target node to listen to
    * @param listener Callback function
    */
  def enter(node: HTMLElement, listener: js.Function): js.Any
  /**
    * Register a listener to mouse.leave or touch equivalent for the given node
    *
    * @param node Target node to listen to
    * @param listener Callback function
    */
  def leave(node: HTMLElement, listener: js.Function): js.Any
  /**
    * Register a listener that fires when the mouse cursor or a finger is dragged over the given node.
    *
    * @param node Target node to listen to
    * @param listener Callback function
    */
  def move(node: HTMLElement, listener: js.Function): js.Any
  /**
    * Register a listener to 'mouseout' or touch equivalent for the given node
    *
    * @param node Target node to listen to
    * @param listener Callback function
    */
  def out(node: HTMLElement, listener: js.Function): js.Any
  /**
    * Register a listener to 'mouseover' or touch equivalent for the given node
    *
    * @param node Target node to listen to
    * @param listener Callback function
    */
  def over(node: HTMLElement, listener: js.Function): js.Any
  /**
    * Register a listener to 'touchstart'|'mousedown' for the given node
    *
    * @param node Target node to listen to
    * @param listener Callback function
    */
  def press(node: HTMLElement, listener: js.Function): js.Any
  /**
    * Register a listener to releasing the mouse button while the cursor is over the given node
    * (i.e. "mouseup") or for removing the finger from the screen while touching the given node.
    *
    * @param node Target node to listen to
    * @param listener Callback function
    */
  def release(node: HTMLElement, listener: js.Function): js.Any
}

object touch {
  @scala.inline
  def apply(
    cancel: (HTMLElement, js.Function) => js.Any,
    enter: (HTMLElement, js.Function) => js.Any,
    leave: (HTMLElement, js.Function) => js.Any,
    move: (HTMLElement, js.Function) => js.Any,
    out: (HTMLElement, js.Function) => js.Any,
    over: (HTMLElement, js.Function) => js.Any,
    press: (HTMLElement, js.Function) => js.Any,
    release: (HTMLElement, js.Function) => js.Any
  ): touch = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction2(cancel), enter = js.Any.fromFunction2(enter), leave = js.Any.fromFunction2(leave), move = js.Any.fromFunction2(move), out = js.Any.fromFunction2(out), over = js.Any.fromFunction2(over), press = js.Any.fromFunction2(press), release = js.Any.fromFunction2(release))
  
    __obj.asInstanceOf[touch]
  }
}


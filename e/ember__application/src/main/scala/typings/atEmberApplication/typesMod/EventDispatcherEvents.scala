package typings.atEmberApplication.typesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventDispatcherEvents
  extends /* event */ StringDictionary[js.UndefOr[String | Null]] {
  var change: js.UndefOr[String | Null] = js.undefined
  var click: js.UndefOr[String | Null] = js.undefined
  var contextmenu: js.UndefOr[String | Null] = js.undefined
  var dblclick: js.UndefOr[String | Null] = js.undefined
  var drag: js.UndefOr[String | Null] = js.undefined
  var dragend: js.UndefOr[String | Null] = js.undefined
  var dragenter: js.UndefOr[String | Null] = js.undefined
  var dragleave: js.UndefOr[String | Null] = js.undefined
  var dragover: js.UndefOr[String | Null] = js.undefined
  var dragstart: js.UndefOr[String | Null] = js.undefined
  var drop: js.UndefOr[String | Null] = js.undefined
  var focusin: js.UndefOr[String | Null] = js.undefined
  var focusout: js.UndefOr[String | Null] = js.undefined
  var input: js.UndefOr[String | Null] = js.undefined
  var keydown: js.UndefOr[String | Null] = js.undefined
  var keypress: js.UndefOr[String | Null] = js.undefined
  var keyup: js.UndefOr[String | Null] = js.undefined
  var mousedown: js.UndefOr[String | Null] = js.undefined
  var mouseenter: js.UndefOr[String | Null] = js.undefined
  var mouseleave: js.UndefOr[String | Null] = js.undefined
  var mousemove: js.UndefOr[String | Null] = js.undefined
  var mouseup: js.UndefOr[String | Null] = js.undefined
  var submit: js.UndefOr[String | Null] = js.undefined
  var touchcancel: js.UndefOr[String | Null] = js.undefined
  var touchend: js.UndefOr[String | Null] = js.undefined
  var touchmove: js.UndefOr[String | Null] = js.undefined
  var touchstart: js.UndefOr[String | Null] = js.undefined
}

object EventDispatcherEvents {
  @scala.inline
  def apply(
    StringDictionary: /* event */ StringDictionary[js.UndefOr[String | Null]] = null,
    change: String = null,
    click: String = null,
    contextmenu: String = null,
    dblclick: String = null,
    drag: String = null,
    dragend: String = null,
    dragenter: String = null,
    dragleave: String = null,
    dragover: String = null,
    dragstart: String = null,
    drop: String = null,
    focusin: String = null,
    focusout: String = null,
    input: String = null,
    keydown: String = null,
    keypress: String = null,
    keyup: String = null,
    mousedown: String = null,
    mouseenter: String = null,
    mouseleave: String = null,
    mousemove: String = null,
    mouseup: String = null,
    submit: String = null,
    touchcancel: String = null,
    touchend: String = null,
    touchmove: String = null,
    touchstart: String = null
  ): EventDispatcherEvents = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (change != null) __obj.updateDynamic("change")(change)
    if (click != null) __obj.updateDynamic("click")(click)
    if (contextmenu != null) __obj.updateDynamic("contextmenu")(contextmenu)
    if (dblclick != null) __obj.updateDynamic("dblclick")(dblclick)
    if (drag != null) __obj.updateDynamic("drag")(drag)
    if (dragend != null) __obj.updateDynamic("dragend")(dragend)
    if (dragenter != null) __obj.updateDynamic("dragenter")(dragenter)
    if (dragleave != null) __obj.updateDynamic("dragleave")(dragleave)
    if (dragover != null) __obj.updateDynamic("dragover")(dragover)
    if (dragstart != null) __obj.updateDynamic("dragstart")(dragstart)
    if (drop != null) __obj.updateDynamic("drop")(drop)
    if (focusin != null) __obj.updateDynamic("focusin")(focusin)
    if (focusout != null) __obj.updateDynamic("focusout")(focusout)
    if (input != null) __obj.updateDynamic("input")(input)
    if (keydown != null) __obj.updateDynamic("keydown")(keydown)
    if (keypress != null) __obj.updateDynamic("keypress")(keypress)
    if (keyup != null) __obj.updateDynamic("keyup")(keyup)
    if (mousedown != null) __obj.updateDynamic("mousedown")(mousedown)
    if (mouseenter != null) __obj.updateDynamic("mouseenter")(mouseenter)
    if (mouseleave != null) __obj.updateDynamic("mouseleave")(mouseleave)
    if (mousemove != null) __obj.updateDynamic("mousemove")(mousemove)
    if (mouseup != null) __obj.updateDynamic("mouseup")(mouseup)
    if (submit != null) __obj.updateDynamic("submit")(submit)
    if (touchcancel != null) __obj.updateDynamic("touchcancel")(touchcancel)
    if (touchend != null) __obj.updateDynamic("touchend")(touchend)
    if (touchmove != null) __obj.updateDynamic("touchmove")(touchmove)
    if (touchstart != null) __obj.updateDynamic("touchstart")(touchstart)
    __obj.asInstanceOf[EventDispatcherEvents]
  }
}


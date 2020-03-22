package typings.dragselect

import typings.dragselect.dragselectStrings.altKey
import typings.dragselect.dragselectStrings.ctrlKey
import typings.dragselect.dragselectStrings.metaKey
import typings.dragselect.dragselectStrings.shiftKey
import typings.std.ArrayLike
import typings.std.Document_
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.SVGElement
import typings.std.TouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  area  :std.HTMLElement | std.SVGElement | std.Document,   autoScrollSpeed  :number, callback (selected : std.Array<std.HTMLElement | std.SVGElement>, event : std.MouseEvent | std.TouchEvent): void,   customStyles  :boolean,   hoverClass  :string,   multiSelectKeys  :std.ReadonlyArray<'ctrlKey' | 'shiftKey' | 'metaKey' | 'altKey'>,   multiSelectMode  :boolean, onDragMove (event : std.MouseEvent | std.TouchEvent): void, onDragStart (event : std.MouseEvent | std.TouchEvent): void, onDragStartBegin (event : std.MouseEvent | std.TouchEvent): void, onElementSelect (selected : std.HTMLElement | std.SVGElement): void, onElementUnselect (selected : std.HTMLElement | std.SVGElement): void,   selectableClass  :string,   selectables  :std.ArrayLike<std.HTMLElement | std.SVGElement> | std.HTMLElement | std.SVGElement,   selectedClass  :string,   selector  :std.HTMLElement,   selectorClass  :string,   zoom  :number}> */
trait PartialareaHTMLElementSVG extends js.Object {
  var area: js.UndefOr[HTMLElement | SVGElement | Document_] = js.undefined
  var autoScrollSpeed: js.UndefOr[Double] = js.undefined
  var callback: js.UndefOr[
    js.Function2[
      /* selected */ js.Array[HTMLElement | SVGElement], 
      /* event */ MouseEvent | TouchEvent, 
      Unit
    ]
  ] = js.undefined
  var customStyles: js.UndefOr[Boolean] = js.undefined
  var hoverClass: js.UndefOr[String] = js.undefined
  var multiSelectKeys: js.UndefOr[js.Array[ctrlKey | shiftKey | metaKey | altKey]] = js.undefined
  var multiSelectMode: js.UndefOr[Boolean] = js.undefined
  var onDragMove: js.UndefOr[js.Function1[/* event */ MouseEvent | TouchEvent, Unit]] = js.undefined
  var onDragStart: js.UndefOr[js.Function1[/* event */ MouseEvent | TouchEvent, Unit]] = js.undefined
  var onDragStartBegin: js.UndefOr[js.Function1[/* event */ MouseEvent | TouchEvent, Unit]] = js.undefined
  var onElementSelect: js.UndefOr[js.Function1[/* selected */ HTMLElement | SVGElement, Unit]] = js.undefined
  var onElementUnselect: js.UndefOr[js.Function1[/* selected */ HTMLElement | SVGElement, Unit]] = js.undefined
  var selectableClass: js.UndefOr[String] = js.undefined
  var selectables: js.UndefOr[(ArrayLike[HTMLElement | SVGElement]) | HTMLElement | SVGElement] = js.undefined
  var selectedClass: js.UndefOr[String] = js.undefined
  var selector: js.UndefOr[HTMLElement] = js.undefined
  var selectorClass: js.UndefOr[String] = js.undefined
  var zoom: js.UndefOr[Double] = js.undefined
}

object PartialareaHTMLElementSVG {
  @scala.inline
  def apply(
    area: HTMLElement | SVGElement | Document_ = null,
    autoScrollSpeed: Int | Double = null,
    callback: (/* selected */ js.Array[HTMLElement | SVGElement], /* event */ MouseEvent | TouchEvent) => Unit = null,
    customStyles: js.UndefOr[Boolean] = js.undefined,
    hoverClass: String = null,
    multiSelectKeys: js.Array[ctrlKey | shiftKey | metaKey | altKey] = null,
    multiSelectMode: js.UndefOr[Boolean] = js.undefined,
    onDragMove: /* event */ MouseEvent | TouchEvent => Unit = null,
    onDragStart: /* event */ MouseEvent | TouchEvent => Unit = null,
    onDragStartBegin: /* event */ MouseEvent | TouchEvent => Unit = null,
    onElementSelect: /* selected */ HTMLElement | SVGElement => Unit = null,
    onElementUnselect: /* selected */ HTMLElement | SVGElement => Unit = null,
    selectableClass: String = null,
    selectables: (ArrayLike[HTMLElement | SVGElement]) | HTMLElement | SVGElement = null,
    selectedClass: String = null,
    selector: HTMLElement = null,
    selectorClass: String = null,
    zoom: Int | Double = null
  ): PartialareaHTMLElementSVG = {
    val __obj = js.Dynamic.literal()
    if (area != null) __obj.updateDynamic("area")(area.asInstanceOf[js.Any])
    if (autoScrollSpeed != null) __obj.updateDynamic("autoScrollSpeed")(autoScrollSpeed.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction2(callback))
    if (!js.isUndefined(customStyles)) __obj.updateDynamic("customStyles")(customStyles.asInstanceOf[js.Any])
    if (hoverClass != null) __obj.updateDynamic("hoverClass")(hoverClass.asInstanceOf[js.Any])
    if (multiSelectKeys != null) __obj.updateDynamic("multiSelectKeys")(multiSelectKeys.asInstanceOf[js.Any])
    if (!js.isUndefined(multiSelectMode)) __obj.updateDynamic("multiSelectMode")(multiSelectMode.asInstanceOf[js.Any])
    if (onDragMove != null) __obj.updateDynamic("onDragMove")(js.Any.fromFunction1(onDragMove))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction1(onDragStart))
    if (onDragStartBegin != null) __obj.updateDynamic("onDragStartBegin")(js.Any.fromFunction1(onDragStartBegin))
    if (onElementSelect != null) __obj.updateDynamic("onElementSelect")(js.Any.fromFunction1(onElementSelect))
    if (onElementUnselect != null) __obj.updateDynamic("onElementUnselect")(js.Any.fromFunction1(onElementUnselect))
    if (selectableClass != null) __obj.updateDynamic("selectableClass")(selectableClass.asInstanceOf[js.Any])
    if (selectables != null) __obj.updateDynamic("selectables")(selectables.asInstanceOf[js.Any])
    if (selectedClass != null) __obj.updateDynamic("selectedClass")(selectedClass.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    if (selectorClass != null) __obj.updateDynamic("selectorClass")(selectorClass.asInstanceOf[js.Any])
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialareaHTMLElementSVG]
  }
}


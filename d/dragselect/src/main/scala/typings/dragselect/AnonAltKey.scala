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

@js.native
trait AnonAltKey extends js.Object {
  var area: HTMLElement | SVGElement | Document_ = js.native
  var autoScrollSpeed: Double = js.native
  var customStyles: Boolean = js.native
  var hoverClass: String = js.native
  var multiSelectKeys: js.Array[ctrlKey | shiftKey | metaKey | altKey] = js.native
  var multiSelectMode: Boolean = js.native
  var selectableClass: String = js.native
  var selectables: (ArrayLike[HTMLElement | SVGElement]) | HTMLElement | SVGElement = js.native
  var selectedClass: String = js.native
  var selector: HTMLElement = js.native
  var selectorClass: String = js.native
  var zoom: Double = js.native
  def callback(selected: js.Array[HTMLElement | SVGElement], event: MouseEvent): Unit = js.native
  def callback(selected: js.Array[HTMLElement | SVGElement], event: TouchEvent): Unit = js.native
  def onDragMove(event: MouseEvent): Unit = js.native
  def onDragMove(event: TouchEvent): Unit = js.native
  def onDragStart(event: MouseEvent): Unit = js.native
  def onDragStart(event: TouchEvent): Unit = js.native
  def onDragStartBegin(event: MouseEvent): Unit = js.native
  def onDragStartBegin(event: TouchEvent): Unit = js.native
  def onElementSelect(selected: HTMLElement): Unit = js.native
  def onElementSelect(selected: SVGElement): Unit = js.native
  def onElementUnselect(selected: HTMLElement): Unit = js.native
  def onElementUnselect(selected: SVGElement): Unit = js.native
}


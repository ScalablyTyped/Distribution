package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.DOMComponent
import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod._Global_.JQuery
import typings.devextreme.mod._Global_.JQueryPromise
import typings.devextreme.mod._Global_.Promise
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxScrollable extends DOMComponent {
  /** Gets the widget's height. */
  def clientHeight(): Double = js.native
  /** Gets the widget's width. */
  def clientWidth(): Double = js.native
  /** Gets the widget's content. */
  def content(): dxElement = js.native
  /** Scrolls the content by a specific distance in horizontal and vertical directions. */
  def scrollBy(distanceObject: js.Any): Unit = js.native
  /** Scrolls the content by a specific distance. */
  def scrollBy(distance: Double): Unit = js.native
  /** Gets the scrollable content's height in pixels. */
  def scrollHeight(): Double = js.native
  /** Gets the left scroll offset. */
  def scrollLeft(): Double = js.native
  /** Gets the scroll offset. */
  def scrollOffset(): js.Any = js.native
  /** Scrolls the content to a specific position. */
  def scrollTo(targetLocation: js.Any): Unit = js.native
  /** Scrolls the content to a specific position. */
  def scrollTo(targetLocation: Double): Unit = js.native
  def scrollToElement(element: JQuery): Unit = js.native
  /** Scrolls the content to an element. */
  def scrollToElement(element: Element): Unit = js.native
  /** Gets the top scroll offset. */
  def scrollTop(): Double = js.native
  /** Gets the scrollable content's width in pixels. */
  def scrollWidth(): Double = js.native
  /** Updates the scrollable contents' dimensions. */
  def update(): Promise[Unit] with JQueryPromise[Unit] = js.native
}


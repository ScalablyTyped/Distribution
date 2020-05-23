package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.DOMComponent
import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.global.JQuery
import typings.devextreme.mod.global.JQueryPromise
import typings.devextreme.mod.global.Promise
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxScrollable extends DOMComponent {
  /** @name dxScrollable.clientHeight() */
  def clientHeight(): Double = js.native
  /** @name dxScrollable.clientWidth() */
  def clientWidth(): Double = js.native
  /** @name dxScrollable.content() */
  def content(): dxElement = js.native
  /** @name dxScrollable.scrollBy(distanceObject) */
  def scrollBy(distanceObject: js.Any): Unit = js.native
  /** @name dxScrollable.scrollBy(distance) */
  def scrollBy(distance: Double): Unit = js.native
  /** @name dxScrollable.scrollHeight() */
  def scrollHeight(): Double = js.native
  /** @name dxScrollable.scrollLeft() */
  def scrollLeft(): Double = js.native
  /** @name dxScrollable.scrollOffset() */
  def scrollOffset(): js.Any = js.native
  /** @name dxScrollable.scrollTo(targetLocationObject) */
  def scrollTo(targetLocation: js.Any): Unit = js.native
  /** @name dxScrollable.scrollTo(targetLocation) */
  def scrollTo(targetLocation: Double): Unit = js.native
  def scrollToElement(element: JQuery): Unit = js.native
  /** @name dxScrollable.scrollToElement(targetLocation) */
  def scrollToElement(element: Element): Unit = js.native
  /** @name dxScrollable.scrollTop() */
  def scrollTop(): Double = js.native
  /** @name dxScrollable.scrollWidth() */
  def scrollWidth(): Double = js.native
  /** @name dxScrollable.update() */
  def update(): Promise[Unit] with JQueryPromise[Unit] = js.native
}


package typings.divaJs.rendererMod

import typings.divaJs.interfacesMod.SourceProvider
import typings.divaJs.interfacesMod.ViewportPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Renderer extends js.Object {
  var layout: typings.divaJs.documentLayoutMod.default | Null
  def adjust(): Unit
  def destroy(): Unit
  def getRenderedPages(): js.Any
  def goto(pageIndex: Double, verticalOffset: Double, horizontalOffset: Double): Unit
  def isPageVisible(pageIndex: Double): Boolean
  def load(config: js.Object, viewportPosition: ViewportPosition, sourceResolver: SourceProvider): Unit
  def transitionViewportPosition(options: js.Object): Unit
}

object Renderer {
  @scala.inline
  def apply(
    adjust: () => Unit,
    destroy: () => Unit,
    getRenderedPages: () => js.Any,
    goto: (Double, Double, Double) => Unit,
    isPageVisible: Double => Boolean,
    load: (js.Object, ViewportPosition, SourceProvider) => Unit,
    transitionViewportPosition: js.Object => Unit,
    layout: typings.divaJs.documentLayoutMod.default = null
  ): Renderer = {
    val __obj = js.Dynamic.literal(adjust = js.Any.fromFunction0(adjust), destroy = js.Any.fromFunction0(destroy), getRenderedPages = js.Any.fromFunction0(getRenderedPages), goto = js.Any.fromFunction3(goto), isPageVisible = js.Any.fromFunction1(isPageVisible), load = js.Any.fromFunction3(load), transitionViewportPosition = js.Any.fromFunction1(transitionViewportPosition))
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Renderer]
  }
}


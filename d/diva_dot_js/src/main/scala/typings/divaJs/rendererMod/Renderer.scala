package typings.divaJs.rendererMod

import typings.divaJs.interfacesMod.SourceProvider
import typings.divaJs.interfacesMod.ViewportPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Renderer extends js.Object {
  var layout: typings.divaJs.documentLayoutMod.default | Null = js.native
  def adjust(): Unit = js.native
  def destroy(): Unit = js.native
  def getRenderedPages(): js.Any = js.native
  def goto(pageIndex: Double, verticalOffset: Double, horizontalOffset: Double): Unit = js.native
  def isPageVisible(pageIndex: Double): Boolean = js.native
  def load(config: js.Object, viewportPosition: ViewportPosition, sourceResolver: SourceProvider): Unit = js.native
  def transitionViewportPosition(options: js.Object): Unit = js.native
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
    transitionViewportPosition: js.Object => Unit
  ): Renderer = {
    val __obj = js.Dynamic.literal(adjust = js.Any.fromFunction0(adjust), destroy = js.Any.fromFunction0(destroy), getRenderedPages = js.Any.fromFunction0(getRenderedPages), goto = js.Any.fromFunction3(goto), isPageVisible = js.Any.fromFunction1(isPageVisible), load = js.Any.fromFunction3(load), transitionViewportPosition = js.Any.fromFunction1(transitionViewportPosition))
    __obj.asInstanceOf[Renderer]
  }
  @scala.inline
  implicit class RendererOps[Self <: Renderer] (val x: Self) extends AnyVal {
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
    def setAdjust(value: () => Unit): Self = this.set("adjust", js.Any.fromFunction0(value))
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    @scala.inline
    def setGetRenderedPages(value: () => js.Any): Self = this.set("getRenderedPages", js.Any.fromFunction0(value))
    @scala.inline
    def setGoto(value: (Double, Double, Double) => Unit): Self = this.set("goto", js.Any.fromFunction3(value))
    @scala.inline
    def setIsPageVisible(value: Double => Boolean): Self = this.set("isPageVisible", js.Any.fromFunction1(value))
    @scala.inline
    def setLoad(value: (js.Object, ViewportPosition, SourceProvider) => Unit): Self = this.set("load", js.Any.fromFunction3(value))
    @scala.inline
    def setTransitionViewportPosition(value: js.Object => Unit): Self = this.set("transitionViewportPosition", js.Any.fromFunction1(value))
    @scala.inline
    def setLayout(value: typings.divaJs.documentLayoutMod.default): Self = this.set("layout", value.asInstanceOf[js.Any])
    @scala.inline
    def setLayoutNull: Self = this.set("layout", null)
  }
  
}


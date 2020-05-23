package typings.devextreme.mod.default

import typings.devextreme.mod.DevExpress.animationConfig
import typings.devextreme.mod.global.JQueryPromise
import typings.devextreme.mod.global.Promise
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("devextreme", "fx")
@js.native
object fx extends js.Object {
  def animate(element: Element, config: animationConfig): Promise[Unit] with JQueryPromise[Unit] = js.native
  def isAnimating(element: Element): Boolean = js.native
  def stop(element: Element, jumpToEnd: Boolean): Unit = js.native
}


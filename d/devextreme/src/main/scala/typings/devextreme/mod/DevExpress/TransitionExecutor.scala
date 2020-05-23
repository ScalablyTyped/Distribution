package typings.devextreme.mod.DevExpress

import typings.devextreme.mod.global.JQuery
import typings.devextreme.mod.global.JQueryPromise
import typings.devextreme.mod.global.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitionExecutor extends js.Object {
  def enter(elements: JQuery, animation: String): Unit = js.native
  /** @name TransitionExecutor.enter(elements, animation) */
  def enter(elements: JQuery, animation: animationConfig): Unit = js.native
  def leave(elements: JQuery, animation: String): Unit = js.native
  /** @name TransitionExecutor.leave(elements, animation) */
  def leave(elements: JQuery, animation: animationConfig): Unit = js.native
  /** @name TransitionExecutor.reset() */
  def reset(): Unit = js.native
  /** @name TransitionExecutor.start() */
  def start(): Promise[Unit] with JQueryPromise[Unit] = js.native
  /** @name TransitionExecutor.stop() */
  def stop(): Unit = js.native
}


package typings.f1.f1Mod

import typings.node.NodeJS.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait F1 extends EventEmitter {
  @JSName("apply")
  def apply(pathToTarget: String, target: js.Any, parserDefinition: js.Any): Unit = js.native
  def destroy(): Unit = js.native
  def go(state: String): F1 = js.native
  def go(state: String, callback: js.Function2[/* state */ js.Any, /* currentState */ js.Any, Unit]): F1 = js.native
  def init(initState: String): F1 = js.native
  def parsers(parser: js.Any): F1 = js.native
  def set(state: String): F1 = js.native
  def states(states: js.Any): F1 = js.native
  def step(deltaTime: Double): F1 = js.native
  def targets(targets: js.Any): F1 = js.native
  def transitions(transitions: js.Array[_]): F1 = js.native
  def update(): F1 = js.native
}


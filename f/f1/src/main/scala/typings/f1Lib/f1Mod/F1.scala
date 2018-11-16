package typings
package f1Lib.f1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait F1
  extends nodeLib.NodeJSNs.EventEmitter {
  @JSName("apply")
  def apply(pathToTarget: java.lang.String, target: js.Any, parserDefinition: js.Any): scala.Unit = js.native
  def destroy(): scala.Unit = js.native
  def go(state: java.lang.String): F1 = js.native
  def go(
    state: java.lang.String,
    callback: js.Function2[/* state */ js.Any, /* currentState */ js.Any, scala.Unit]
  ): F1 = js.native
  def init(initState: java.lang.String): F1 = js.native
  def parsers(parser: js.Any): F1 = js.native
  def set(state: java.lang.String): F1 = js.native
  def states(states: js.Any): F1 = js.native
  def step(deltaTime: scala.Double): F1 = js.native
  def targets(targets: js.Any): F1 = js.native
  def transitions(transitions: js.Array[_]): F1 = js.native
  def update(): F1 = js.native
}


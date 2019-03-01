package typings
package fastqLib.fastqMod.fastqNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait queue extends js.Object {
  var concurrency: scala.Double
  def drain(): js.Any
  def empty(): scala.Unit
  def idle(): scala.Boolean
  def kill(): js.Any
  def killAndDrain(): js.Any
  def length(): scala.Double
  def pause(): js.Any
  def push(task: js.Any, done: done): scala.Unit
  def resume(): js.Any
  def saturated(): scala.Unit
  def unshift(task: js.Any, done: done): scala.Unit
}

object queue {
  @scala.inline
  def apply(
    concurrency: scala.Double,
    drain: js.Function0[js.Any],
    empty: js.Function0[scala.Unit],
    idle: js.Function0[scala.Boolean],
    kill: js.Function0[js.Any],
    killAndDrain: js.Function0[js.Any],
    length: js.Function0[scala.Double],
    pause: js.Function0[js.Any],
    push: js.Function2[js.Any, done, scala.Unit],
    resume: js.Function0[js.Any],
    saturated: js.Function0[scala.Unit],
    unshift: js.Function2[js.Any, done, scala.Unit]
  ): queue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("concurrency")(concurrency)
    __obj.updateDynamic("drain")(drain)
    __obj.updateDynamic("empty")(empty)
    __obj.updateDynamic("idle")(idle)
    __obj.updateDynamic("kill")(kill)
    __obj.updateDynamic("killAndDrain")(killAndDrain)
    __obj.updateDynamic("length")(length)
    __obj.updateDynamic("pause")(pause)
    __obj.updateDynamic("push")(push)
    __obj.updateDynamic("resume")(resume)
    __obj.updateDynamic("saturated")(saturated)
    __obj.updateDynamic("unshift")(unshift)
    __obj.asInstanceOf[queue]
  }
}


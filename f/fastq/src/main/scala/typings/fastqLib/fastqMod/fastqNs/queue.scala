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


package typings.estimate.estimateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Estimate extends js.Object {
  var progress: Double
  var remaining: Double
  var total: Double
  def initialize(): Unit
  def update(): Unit
}

object Estimate {
  @scala.inline
  def apply(initialize: () => Unit, progress: Double, remaining: Double, total: Double, update: () => Unit): Estimate = {
    val __obj = js.Dynamic.literal(initialize = js.Any.fromFunction0(initialize), progress = progress, remaining = remaining, total = total, update = js.Any.fromFunction0(update))
  
    __obj.asInstanceOf[Estimate]
  }
}


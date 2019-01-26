package typings
package dwtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TaskQueue")
@js.native
/**
  * Constructs a new task queue
  */
class TaskQueue () extends js.Object {
  var _queue: js.Array[_] = js.native
  var isWorking: scala.Boolean = js.native
  var timeout: scala.Double = js.native
  def next(): scala.Unit = js.native
  def push(task: js.Any): scala.Unit = js.native
  def push(task: js.Any, context: js.Any): scala.Unit = js.native
  def push(task: js.Any, context: js.Any, args: js.Any): scala.Unit = js.native
  def unshift(task: js.Any): scala.Unit = js.native
  def unshift(task: js.Any, context: js.Any): scala.Unit = js.native
  def unshift(task: js.Any, context: js.Any, args: js.Any): scala.Unit = js.native
}


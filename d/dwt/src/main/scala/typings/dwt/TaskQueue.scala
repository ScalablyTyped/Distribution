package typings.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskQueue extends js.Object {
  def next(): Unit = js.native
  def push(task: js.Function1[/* bLoadingWhenPush */ Boolean, Unit]): Unit = js.native
  def push(task: js.Function1[/* bLoadingWhenPush */ Boolean, Unit], context: js.Any): Unit = js.native
  def push(task: js.Function1[/* bLoadingWhenPush */ Boolean, Unit], context: js.Any, args: js.Array[js.Any]): Unit = js.native
  def unshift(task: js.Function1[/* bLoadingWhenPush */ Boolean, Unit]): Unit = js.native
  def unshift(task: js.Function1[/* bLoadingWhenPush */ Boolean, Unit], context: js.Any): Unit = js.native
  def unshift(task: js.Function1[/* bLoadingWhenPush */ Boolean, Unit], context: js.Any, args: js.Array[js.Any]): Unit = js.native
}


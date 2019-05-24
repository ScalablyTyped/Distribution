package typings
package dwtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskQueue extends js.Object {
  def next(): scala.Unit = js.native
  def push(task: js.Function1[/* bLoadingWhenPush */ scala.Boolean, scala.Unit]): scala.Unit = js.native
  def push(task: js.Function1[/* bLoadingWhenPush */ scala.Boolean, scala.Unit], context: js.Any): scala.Unit = js.native
  def push(
    task: js.Function1[/* bLoadingWhenPush */ scala.Boolean, scala.Unit],
    context: js.Any,
    args: js.Array[js.Any]
  ): scala.Unit = js.native
  def unshift(task: js.Function1[/* bLoadingWhenPush */ scala.Boolean, scala.Unit]): scala.Unit = js.native
  def unshift(task: js.Function1[/* bLoadingWhenPush */ scala.Boolean, scala.Unit], context: js.Any): scala.Unit = js.native
  def unshift(
    task: js.Function1[/* bLoadingWhenPush */ scala.Boolean, scala.Unit],
    context: js.Any,
    args: js.Array[js.Any]
  ): scala.Unit = js.native
}


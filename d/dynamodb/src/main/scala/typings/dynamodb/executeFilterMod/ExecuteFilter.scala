package typings.dynamodb.executeFilterMod

import typings.dynamodb.callbackMod.Callback
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecuteFilter extends js.Object {
  def apply(): Readable = js.native
  def apply(callback: Callback): Unit = js.native
}


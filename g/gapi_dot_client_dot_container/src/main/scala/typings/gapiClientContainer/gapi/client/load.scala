package typings.gapiClientContainer.gapi.client

import typings.gapiClientContainer.gapiClientContainerStrings.v1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client.load")
@js.native
object load extends js.Object {
  /** Load Google Container Engine API v1 */
  def apply(name: typings.gapiClientContainer.gapiClientContainerStrings.container, version: v1): js.Thenable[Unit] = js.native
  def apply(
    name: typings.gapiClientContainer.gapiClientContainerStrings.container,
    version: v1,
    callback: js.Function0[_]
  ): Unit = js.native
}


package typings.gapiClientLogging.gapi.client

import typings.gapiClientLogging.gapiClientLoggingStrings.v2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client.load")
@js.native
object load extends js.Object {
  /** Load Stackdriver Logging API v2 */
  def apply(name: typings.gapiClientLogging.gapiClientLoggingStrings.logging, version: v2): js.Thenable[Unit] = js.native
  def apply(
    name: typings.gapiClientLogging.gapiClientLoggingStrings.logging,
    version: v2,
    callback: js.Function0[_]
  ): Unit = js.native
}


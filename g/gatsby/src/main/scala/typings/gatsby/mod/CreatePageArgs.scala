package typings.gatsby.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePageArgs[TContext] extends ParentSpanPluginArgs {
  var page: Page[TContext] = js.native
  var traceId: String = js.native
}


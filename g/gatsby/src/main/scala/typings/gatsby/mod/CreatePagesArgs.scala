package typings.gatsby.mod

import typings.gatsby.AnonData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePagesArgs extends ParentSpanPluginArgs {
  var traceId: String = js.native
  var waitForCascadingActions: Boolean = js.native
  def graphql[TData, TVariables](query: String): js.Promise[AnonData[TData]] = js.native
  def graphql[TData, TVariables](query: String, variables: TVariables): js.Promise[AnonData[TData]] = js.native
}


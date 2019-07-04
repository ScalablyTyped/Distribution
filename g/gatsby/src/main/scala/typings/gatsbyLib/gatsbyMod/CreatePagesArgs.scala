package typings
package gatsbyLib.gatsbyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePagesArgs extends ParentSpanPluginArgs {
  var traceId: java.lang.String = js.native
  var waitForCascadingActions: scala.Boolean = js.native
  def graphql[TData, TVariables](query: java.lang.String): js.Promise[gatsbyLib.Anon_Data[TData]] = js.native
  def graphql[TData, TVariables](query: java.lang.String, variables: TVariables): js.Promise[gatsbyLib.Anon_Data[TData]] = js.native
}


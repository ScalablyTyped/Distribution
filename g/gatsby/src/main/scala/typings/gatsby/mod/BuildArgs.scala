package typings.gatsby.mod

import typings.gatsby.anon.Errors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuildArgs extends ParentSpanPluginArgs {
  def graphql[TData, TVariables](query: String): js.Promise[Errors[TData]] = js.native
  def graphql[TData, TVariables](query: String, variables: TVariables): js.Promise[Errors[TData]] = js.native
}


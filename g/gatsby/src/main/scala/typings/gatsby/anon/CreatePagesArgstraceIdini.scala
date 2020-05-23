package typings.gatsby.anon

import org.scalablytyped.runtime.StringDictionary
import typings.gatsby.gatsbyStrings.`initial-createPages`
import typings.gatsby.mod.Actions
import typings.gatsby.mod.NodePluginSchema
import typings.gatsby.mod.Reporter
import typings.gatsby.mod.Store
import typings.gatsby.mod.Tracing
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined gatsby.gatsby.CreatePagesArgs & {  traceId  :'initial-createPages'} */
@js.native
trait CreatePagesArgstraceIdini
  extends /* key */ StringDictionary[js.Any] {
  var actions: Actions = js.native
  var boundActionCreators: Actions = js.native
  var cache: Del = js.native
  var createContentDigest: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof createContentDigest */ js.Any = js.native
  var createNodeId: js.Function = js.native
  var emitter: EventEmitter = js.native
  var getNode: js.Function = js.native
  var getNodeAndSavePathDependency: js.Function = js.native
  var getNodes: js.Function = js.native
  var getNodesByType: js.Function = js.native
  var hasNodeChanged: js.Function = js.native
  var loadNodeContent: js.Function = js.native
  var parentSpan: js.Object = js.native
  var pathPrefix: String = js.native
  var reporter: Reporter = js.native
  var schema: NodePluginSchema = js.native
  var store: Store = js.native
  var traceId: String with `initial-createPages` = js.native
  var tracing: Tracing = js.native
  var waitForCascadingActions: Boolean = js.native
  def graphql[TData, TVariables](query: String): js.Promise[Errors[TData]] = js.native
  def graphql[TData, TVariables](query: String, variables: TVariables): js.Promise[Errors[TData]] = js.native
}


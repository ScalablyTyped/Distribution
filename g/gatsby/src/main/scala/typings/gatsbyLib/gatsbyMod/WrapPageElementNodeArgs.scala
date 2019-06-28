package typings
package gatsbyLib.gatsbyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WrapPageElementNodeArgs extends NodePluginArgs {
  var element: js.Object
  var pathname: java.lang.String
  var props: js.Object
}

object WrapPageElementNodeArgs {
  @scala.inline
  def apply(
    actions: Actions,
    boundActionCreators: Actions,
    cache: gatsbyLib.Anon_Del,
    createContentDigest: js.Function,
    createNodeId: js.Function,
    element: js.Object,
    emitter: nodeLib.eventsMod.EventEmitter,
    getNode: js.Function,
    getNodeAndSavePathDependency: js.Function,
    getNodes: js.Function,
    getNodesByType: js.Function,
    hasNodeChanged: js.Function,
    loadNodeContent: js.Function,
    pathPrefix: java.lang.String,
    pathname: java.lang.String,
    props: js.Object,
    reporter: Reporter,
    store: Store,
    tracing: Tracing
  ): WrapPageElementNodeArgs = {
    val __obj = js.Dynamic.literal(actions = actions, boundActionCreators = boundActionCreators, cache = cache, createContentDigest = createContentDigest, createNodeId = createNodeId, element = element, emitter = emitter, getNode = getNode, getNodeAndSavePathDependency = getNodeAndSavePathDependency, getNodes = getNodes, getNodesByType = getNodesByType, hasNodeChanged = hasNodeChanged, loadNodeContent = loadNodeContent, pathPrefix = pathPrefix, pathname = pathname, props = props, reporter = reporter, store = store, tracing = tracing)
  
    __obj.asInstanceOf[WrapPageElementNodeArgs]
  }
}


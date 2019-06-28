package typings
package gatsbyLib.gatsbyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreRenderHTMLArgs extends NodePluginArgs {
  var getHeadComponents: js.Array[_]
  var getPostBodyComponents: js.Array[_]
  var getPreBodyComponents: js.Array[_]
  var replaceHeadComponents: js.Function
  var replacePostBodyComponents: js.Function
  var replacePreBodyComponents: js.Function
}

object PreRenderHTMLArgs {
  @scala.inline
  def apply(
    actions: Actions,
    boundActionCreators: Actions,
    cache: gatsbyLib.Anon_Del,
    createContentDigest: js.Function,
    createNodeId: js.Function,
    emitter: nodeLib.eventsMod.EventEmitter,
    getHeadComponents: js.Array[_],
    getNode: js.Function,
    getNodeAndSavePathDependency: js.Function,
    getNodes: js.Function,
    getNodesByType: js.Function,
    getPostBodyComponents: js.Array[_],
    getPreBodyComponents: js.Array[_],
    hasNodeChanged: js.Function,
    loadNodeContent: js.Function,
    pathPrefix: java.lang.String,
    replaceHeadComponents: js.Function,
    replacePostBodyComponents: js.Function,
    replacePreBodyComponents: js.Function,
    reporter: Reporter,
    store: Store,
    tracing: Tracing
  ): PreRenderHTMLArgs = {
    val __obj = js.Dynamic.literal(actions = actions, boundActionCreators = boundActionCreators, cache = cache, createContentDigest = createContentDigest, createNodeId = createNodeId, emitter = emitter, getHeadComponents = getHeadComponents, getNode = getNode, getNodeAndSavePathDependency = getNodeAndSavePathDependency, getNodes = getNodes, getNodesByType = getNodesByType, getPostBodyComponents = getPostBodyComponents, getPreBodyComponents = getPreBodyComponents, hasNodeChanged = hasNodeChanged, loadNodeContent = loadNodeContent, pathPrefix = pathPrefix, replaceHeadComponents = replaceHeadComponents, replacePostBodyComponents = replacePostBodyComponents, replacePreBodyComponents = replacePreBodyComponents, reporter = reporter, store = store, tracing = tracing)
  
    __obj.asInstanceOf[PreRenderHTMLArgs]
  }
}


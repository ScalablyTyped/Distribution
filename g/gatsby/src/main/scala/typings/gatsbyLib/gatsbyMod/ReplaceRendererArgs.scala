package typings
package gatsbyLib.gatsbyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplaceRendererArgs extends NodePluginArgs {
  var replaceBodyHTMLString: js.Function
  var setBodyAttributes: js.Function
  var setBodyProps: js.Function
  var setHeadComponents: js.Function
  var setHtmlAttributes: js.Function
  var setPostBodyComponents: js.Function
  var setPreBodyComponents: js.Function
}

object ReplaceRendererArgs {
  @scala.inline
  def apply(
    actions: Actions,
    boundActionCreators: Actions,
    cache: gatsbyLib.Anon_Del,
    createContentDigest: js.Function,
    createNodeId: js.Function,
    emitter: nodeLib.eventsMod.EventEmitter,
    getNode: js.Function,
    getNodeAndSavePathDependency: js.Function,
    getNodes: js.Function,
    getNodesByType: js.Function,
    hasNodeChanged: js.Function,
    loadNodeContent: js.Function,
    pathPrefix: java.lang.String,
    replaceBodyHTMLString: js.Function,
    reporter: Reporter,
    setBodyAttributes: js.Function,
    setBodyProps: js.Function,
    setHeadComponents: js.Function,
    setHtmlAttributes: js.Function,
    setPostBodyComponents: js.Function,
    setPreBodyComponents: js.Function,
    store: Store,
    tracing: Tracing
  ): ReplaceRendererArgs = {
    val __obj = js.Dynamic.literal(actions = actions, boundActionCreators = boundActionCreators, cache = cache, createContentDigest = createContentDigest, createNodeId = createNodeId, emitter = emitter, getNode = getNode, getNodeAndSavePathDependency = getNodeAndSavePathDependency, getNodes = getNodes, getNodesByType = getNodesByType, hasNodeChanged = hasNodeChanged, loadNodeContent = loadNodeContent, pathPrefix = pathPrefix, replaceBodyHTMLString = replaceBodyHTMLString, reporter = reporter, setBodyAttributes = setBodyAttributes, setBodyProps = setBodyProps, setHeadComponents = setHeadComponents, setHtmlAttributes = setHtmlAttributes, setPostBodyComponents = setPostBodyComponents, setPreBodyComponents = setPreBodyComponents, store = store, tracing = tracing)
  
    __obj.asInstanceOf[ReplaceRendererArgs]
  }
}


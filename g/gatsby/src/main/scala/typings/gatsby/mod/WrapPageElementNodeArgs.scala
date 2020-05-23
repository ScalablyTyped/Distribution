package typings.gatsby.mod

import typings.gatsby.anon.Del
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WrapPageElementNodeArgs[DataType, PageContextType] extends NodePluginArgs {
  var element: js.Object
  var pathname: String
  var props: PageProps[
    DataType, 
    PageContextType, 
    /* import warning: importer.ImportType#apply Failed type conversion: @reach/router.@reach/router.WindowLocation<history.history.LocationState>['state'] */ js.Any
  ]
}

object WrapPageElementNodeArgs {
  @scala.inline
  def apply[DataType, PageContextType](
    actions: Actions,
    boundActionCreators: Actions,
    cache: Del,
    createContentDigest: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof createContentDigest */ js.Any,
    createNodeId: js.Function,
    element: js.Object,
    emitter: EventEmitter,
    getNode: js.Function,
    getNodeAndSavePathDependency: js.Function,
    getNodes: js.Function,
    getNodesByType: js.Function,
    hasNodeChanged: js.Function,
    loadNodeContent: js.Function,
    pathPrefix: String,
    pathname: String,
    props: PageProps[
      DataType, 
      PageContextType, 
      /* import warning: importer.ImportType#apply Failed type conversion: @reach/router.@reach/router.WindowLocation<history.history.LocationState>['state'] */ js.Any
    ],
    reporter: Reporter,
    schema: NodePluginSchema,
    store: Store,
    tracing: Tracing
  ): WrapPageElementNodeArgs[DataType, PageContextType] = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], boundActionCreators = boundActionCreators.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], createContentDigest = createContentDigest.asInstanceOf[js.Any], createNodeId = createNodeId.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], emitter = emitter.asInstanceOf[js.Any], getNode = getNode.asInstanceOf[js.Any], getNodeAndSavePathDependency = getNodeAndSavePathDependency.asInstanceOf[js.Any], getNodes = getNodes.asInstanceOf[js.Any], getNodesByType = getNodesByType.asInstanceOf[js.Any], hasNodeChanged = hasNodeChanged.asInstanceOf[js.Any], loadNodeContent = loadNodeContent.asInstanceOf[js.Any], pathPrefix = pathPrefix.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], reporter = reporter.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any], tracing = tracing.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrapPageElementNodeArgs[DataType, PageContextType]]
  }
}


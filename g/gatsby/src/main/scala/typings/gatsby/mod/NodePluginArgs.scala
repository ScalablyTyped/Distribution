package typings.gatsby.mod

import org.scalablytyped.runtime.StringDictionary
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodePluginArgs
  extends /* key */ StringDictionary[js.Any] {
  /**
    * Collection of functions used to programmatically modify Gatsby’s internal state.
    */
  var actions: Actions = js.native
  /**
    * Collection of functions used to programmatically modify Gatsby’s internal state.
    * @deprecated Will be removed in gatsby 3.0. Use `actions` instead
    */
  var boundActionCreators: Actions = js.native
  /**
    * Key-value store used to persist results of time/memory/cpu intensive
    * tasks. All functions are async and return promises.
    */
  var cache: GatsbyCache = js.native
  /**
    * Internal event emitter / listener.  Do not use, unless you absolutely
    * must. Emitter is considered a private API and can change with any version.
    */
  var emitter: EventEmitter = js.native
  /**
    * Use to prefix resources URLs. `pathPrefix` will be either empty string or
    * path that starts with slash and doesn't end with slash. Check
    * [Adding a Path Prefix](https://www.gatsbyjs.org/docs/path-prefix/)
    * page for details about path prefixing.
    */
  var pathPrefix: String = js.native
  /**
    * Set of utilities to output information to user
    */
  var reporter: Reporter = js.native
  var schema: NodePluginSchema = js.native
  /**
    * Internal redux state used for application state. Do not use, unless you
    * absolutely must. Store is considered a private API and can change with
    * any version.
    */
  var store: Store = js.native
  /**
    * Set of utilities that allow adding more detailed tracing for plugins.
    * Check
    * [Performance tracing](https://www.gatsbyjs.org/docs/performance-tracing)
    * page for more details.
    */
  var tracing: Tracing = js.native
  /**
    * Create a stable content digest from a string or object, you can use the
    * result of this function to set the `internal.contentDigest` field
    * on nodes. Gatsby uses the value of this field to invalidate stale data
    * when your content changes.
    * @param input
    * @returns Hash string
    * @example
    * const node = {
    *   ...nodeData,
    *   internal: {
    *     type: `TypeOfNode`,
    *     contentDigest: createContentDigest(nodeData)
    *   }
    * }
    */
  def createContentDigest(input: String): String = js.native
  def createContentDigest(input: js.Object): String = js.native
  /**
    * Utility function useful to generate globally unique and stable node IDs.
    * It will generate different IDs for different plugins if they use same
    * input.
    *
    * @returns UUIDv5 ID string
    * @example
    * const node = {
    *   id: createNodeId(`${backendData.type}${backendData.id}`),
    *   ...restOfNodeData
    * }
    */
  def createNodeId(input: String): String = js.native
  /**
    * Get single node by given ID.
    * Don't use this in graphql resolvers - see
    * `getNodeAndSavePathDependency`
    *
    * @param id id of the node.
    * @returns Single node instance.
    * @example
    * const node = getNode(id)
    */
  def getNode(id: String): Node = js.native
  /**
    * Get single node by given ID and create dependency for given path.
    * This should be used instead of `getNode` in graphql resolvers to enable
    * tracking dependencies for query results. If it's not used Gatsby will
    * not rerun query if node changes leading to stale query results. See
    * [Page -> Node Dependency Tracking](/docs/page-node-dependencies/)
    * for more details.
    * @param id id of the node.
    * @param path of the node.
    * @returns Single node instance.
    */
  def getNodeAndSavePathDependency(id: String, path: String): Node = js.native
  /**
    * Get array of all nodes.
    *
    * @returns Array of nodes.
    * @example
    * const allNodes = getNodes()
    */
  def getNodes(): js.Array[Node] = js.native
  /**
    * Get array of nodes of given type.
    * @param type Type of nodes
    * @returns Array of nodes.
    *
    * @example
    * const markdownNodes = getNodesByType(`MarkdownRemark`)
    */
  def getNodesByType(`type`: String): js.Array[Node] = js.native
  /**
    * Compares `contentDigest` of cached node with passed value
    * to determine if node has changed.
    *
    * @param id of node
    * @param contentDigest of node
    * @deprecated This check is done internally in Gatsby and it's not necessary to use it in plugins. Will be removed in gatsby 3.0.
    */
  def hasNodeChanged(id: String, contentDigest: String): Boolean = js.native
  /**
    * Get content for a node from the plugin that created it.
    *
    * @example
    * module.exports = async function onCreateNode(
    *   { node, loadNodeContent, actions, createNodeId }
    * ) {
    *   if (node.internal.mediaType === 'text/markdown') {
    *     const { createNode, createParentChildLink } = actions
    *     const textContent = await loadNodeContent(node)
    *     // process textContent and create child nodes
    *   }
    * }
    */
  def loadNodeContent(node: Node): js.Promise[String] = js.native
}


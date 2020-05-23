package typings.gatsby.mod

import typings.gatsby.anon.Args
import typings.gatsby.anon.Child
import typings.gatsby.anon.Dictkey
import typings.gatsby.anon.FieldName
import typings.gatsby.anon.Id
import typings.gatsby.anon.NameOptions
import typings.gatsby.anon.NodeIdString
import typings.gatsby.anon.Path
import typings.gatsby.anon.Schema
import typings.graphql.definitionMod.GraphQLOutputType
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Actions extends js.Object {
  /** @see https://www.gatsbyjs.org/docs/actions/#addThirdPartySchema */
  def addThirdPartySchema(args: Schema): Unit = js.native
  def addThirdPartySchema(args: Schema, plugin: ActionPlugin): Unit = js.native
  def addThirdPartySchema(args: Schema, plugin: ActionPlugin, traceId: String): Unit = js.native
  /** @see https://www.gatsbyjs.org/docs/actions/#createFieldExtension */
  def createFieldExtension(extension: js.Object): Unit = js.native
  def createFieldExtension(extension: js.Object, plugin: ActionPlugin): Unit = js.native
  def createFieldExtension(extension: js.Object, plugin: ActionPlugin, traceId: String): Unit = js.native
  /** @see https://www.gatsbyjs.org/docs/actions/#createJob */
  def createJob(job: (Record[String, _]) with Id): Unit = js.native
  def createJob(job: (Record[String, _]) with Id, plugin: ActionPlugin): Unit = js.native
  /** @see https://www.gatsbyjs.org/docs/actions/#createJobV2 */
  def createJobV2(job: Args): js.Promise[_] = js.native
  def createJobV2(job: Args, plugin: ActionPlugin): js.Promise[_] = js.native
  /** @see https://www.gatsbyjs.org/docs/actions/#createNode */
  def createNode(node: NodeInput): Unit = js.native
  def createNode(node: NodeInput, plugin: ActionPlugin): Unit = js.native
  def createNode(node: NodeInput, plugin: ActionPlugin, options: ActionOptions): Unit = js.native
  /** @see https://www.gatsbyjs.org/docs/actions/#createNodeField */
  def createNodeField(args: FieldName): Unit = js.native
  def createNodeField(args: FieldName, plugin: ActionPlugin): Unit = js.native
  def createNodeField(args: FieldName, plugin: ActionPlugin, options: ActionOptions): Unit = js.native
  /** @see https://www.gatsbyjs.org/docs/actions/#createPage */
  def createPage[TContext](args: Page[TContext]): Unit = js.native
  def createPage[TContext](args: Page[TContext], plugin: ActionPlugin): Unit = js.native
  def createPage[TContext](args: Page[TContext], plugin: ActionPlugin, option: ActionOptions): Unit = js.native
  /** @see https://www.gatsbyjs.org/docs/actions/#createParentChildLink */
  def createParentChildLink(args: Child): Unit = js.native
  def createParentChildLink(args: Child, plugin: ActionPlugin): Unit = js.native
  /** @see https://www.gatsbyjs.org/docs/actions/#createRedirect */
  def createRedirect(redirect: Dictkey): Unit = js.native
  def createRedirect(redirect: Dictkey, plugin: ActionPlugin): Unit = js.native
  /** @see https://www.gatsbyjs.org/docs/actions/#createTypes */
  def createTypes(types: String): Unit = js.native
  def createTypes(types: String, plugin: ActionPlugin): Unit = js.native
  def createTypes(types: String, plugin: ActionPlugin, traceId: String): Unit = js.native
  def createTypes(types: js.Array[GatsbyGraphQLType | GraphQLOutputType | String]): Unit = js.native
  def createTypes(types: js.Array[GatsbyGraphQLType | GraphQLOutputType | String], plugin: ActionPlugin): Unit = js.native
  def createTypes(
    types: js.Array[GatsbyGraphQLType | GraphQLOutputType | String],
    plugin: ActionPlugin,
    traceId: String
  ): Unit = js.native
  def createTypes(types: GatsbyGraphQLType): Unit = js.native
  def createTypes(types: GatsbyGraphQLType, plugin: ActionPlugin): Unit = js.native
  def createTypes(types: GatsbyGraphQLType, plugin: ActionPlugin, traceId: String): Unit = js.native
  def createTypes(types: GraphQLOutputType): Unit = js.native
  def createTypes(types: GraphQLOutputType, plugin: ActionPlugin): Unit = js.native
  def createTypes(types: GraphQLOutputType, plugin: ActionPlugin, traceId: String): Unit = js.native
  /** @see https://www.gatsbyjs.org/docs/actions/#deletePage */
  def deleteNode(options: typings.gatsby.anon.Node): Unit = js.native
  def deleteNode(options: typings.gatsby.anon.Node, plugin: ActionPlugin): Unit = js.native
  def deleteNode(options: typings.gatsby.anon.Node, plugin: ActionPlugin, option: ActionOptions): Unit = js.native
  /**
    * @deprecated
    * @see https://www.gatsbyjs.org/docs/actions/#deleteNodes
    */
  def deleteNodes(nodes: js.Array[String]): Unit = js.native
  def deleteNodes(nodes: js.Array[String], plugin: ActionPlugin): Unit = js.native
  /** @see https://www.gatsbyjs.org/docs/actions/#deletePage */
  def deletePage(args: Path): Unit = js.native
  /** @see https://www.gatsbyjs.org/docs/actions/#endJob */
  def endJob(job: Id): Unit = js.native
  def endJob(job: Id, plugin: ActionPlugin): Unit = js.native
  /** @see https://www.gatsbyjs.org/docs/actions/#replaceWebpackConfig */
  def replaceWebpackConfig(config: js.Object): Unit = js.native
  def replaceWebpackConfig(config: js.Object, plugin: ActionPlugin): Unit = js.native
  /** @see https://www.gatsbyjs.org/docs/actions/#setBabelOptions */
  def setBabelOptions(options: js.Object): Unit = js.native
  def setBabelOptions(options: js.Object, plugin: ActionPlugin): Unit = js.native
  /** @see https://www.gatsbyjs.org/docs/actions/#setBabelPlugin */
  def setBabelPlugin(config: NameOptions): Unit = js.native
  def setBabelPlugin(config: NameOptions, plugin: ActionPlugin): Unit = js.native
  /** @see https://www.gatsbyjs.org/docs/actions/#setBabelPreset */
  def setBabelPreset(config: NameOptions): Unit = js.native
  def setBabelPreset(config: NameOptions, plugin: ActionPlugin): Unit = js.native
  /** @see https://www.gatsbyjs.org/docs/actions/#setJob */
  def setJob(job: (Record[String, _]) with Id): Unit = js.native
  def setJob(job: (Record[String, _]) with Id, plugin: ActionPlugin): Unit = js.native
  /** @see https://www.gatsbyjs.org/docs/actions/#setPluginStatus */
  def setPluginStatus(status: Record[String, _]): Unit = js.native
  def setPluginStatus(status: Record[String, _], plugin: ActionPlugin): Unit = js.native
  /** @see https://www.gatsbyjs.org/docs/actions/#setWebpackConfig */
  def setWebpackConfig(config: js.Object): Unit = js.native
  def setWebpackConfig(config: js.Object, plugin: ActionPlugin): Unit = js.native
  /** @see https://www.gatsbyjs.org/docs/actions/#touchNode */
  def touchNode(node: NodeIdString): Unit = js.native
  def touchNode(node: NodeIdString, plugin: ActionPlugin): Unit = js.native
}


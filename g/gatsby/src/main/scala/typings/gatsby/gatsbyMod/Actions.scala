package typings.gatsby.gatsbyMod

import typings.gatsby.Anon_Child
import typings.gatsby.Anon_Component
import typings.gatsby.Anon_ComponentContext
import typings.gatsby.Anon_FieldName
import typings.gatsby.Anon_Force
import typings.gatsby.Anon_Id
import typings.gatsby.Anon_NameOptions
import typings.gatsby.Anon_Node
import typings.gatsby.Anon_NodeIdString
import typings.gatsby.Anon_Schema
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Actions extends js.Object {
  /** @see https://www.gatsbyjs.org/docs/actions/#addThirdPartySchema */
  def addThirdPartySchema(args: Anon_Schema): Unit = js.native
  def addThirdPartySchema(args: Anon_Schema, plugin: ActionPlugin): Unit = js.native
  def addThirdPartySchema(args: Anon_Schema, plugin: ActionPlugin, traceId: String): Unit = js.native
  /** @see https://www.gatsbyjs.org/docs/actions/#createFieldExtension */
  def createFieldExtension(extension: js.Object, plugin: ActionPlugin): Unit = js.native
  def createFieldExtension(extension: js.Object, plugin: ActionPlugin, traceId: String): Unit = js.native
  /** @see https://www.gatsbyjs.org/docs/actions/#createJob */
  def createJob(job: (Record[String, _]) with Anon_Id): Unit = js.native
  def createJob(job: (Record[String, _]) with Anon_Id, plugin: ActionPlugin): Unit = js.native
  /** @see https://www.gatsbyjs.org/docs/actions/#createNode */
  def createNode(node: NodeInput): Unit = js.native
  def createNode(node: NodeInput, plugin: ActionPlugin): Unit = js.native
  def createNode(node: NodeInput, plugin: ActionPlugin, options: ActionOptions): Unit = js.native
  /** @see https://www.gatsbyjs.org/docs/actions/#createNodeField */
  def createNodeField(args: Anon_FieldName): Unit = js.native
  def createNodeField(args: Anon_FieldName, plugin: ActionPlugin): Unit = js.native
  def createNodeField(args: Anon_FieldName, plugin: ActionPlugin, options: ActionOptions): Unit = js.native
  /** @see https://www.gatsbyjs.org/docs/actions/#createPage */
  def createPage[TContext](args: Anon_ComponentContext[TContext]): Unit = js.native
  def createPage[TContext](args: Anon_ComponentContext[TContext], plugin: ActionPlugin): Unit = js.native
  def createPage[TContext](args: Anon_ComponentContext[TContext], plugin: ActionPlugin, option: ActionOptions): Unit = js.native
  /** @see https://www.gatsbyjs.org/docs/actions/#createParentChildLink */
  def createParentChildLink(args: Anon_Child): Unit = js.native
  def createParentChildLink(args: Anon_Child, plugin: ActionPlugin): Unit = js.native
  /** @see https://www.gatsbyjs.org/docs/actions/#createRedirect */
  def createRedirect(redirect: Anon_Force): Unit = js.native
  def createRedirect(redirect: Anon_Force, plugin: ActionPlugin): Unit = js.native
  /** @see https://www.gatsbyjs.org/docs/actions/#createTypes */
  def createTypes(types: String): Unit = js.native
  def createTypes(types: String, plugin: ActionPlugin): Unit = js.native
  def createTypes(types: String, plugin: ActionPlugin, traceId: String): Unit = js.native
  def createTypes(types: js.Array[String | js.Object]): Unit = js.native
  def createTypes(types: js.Array[String | js.Object], plugin: ActionPlugin): Unit = js.native
  def createTypes(types: js.Array[String | js.Object], plugin: ActionPlugin, traceId: String): Unit = js.native
  def createTypes(types: js.Object): Unit = js.native
  def createTypes(types: js.Object, plugin: ActionPlugin): Unit = js.native
  def createTypes(types: js.Object, plugin: ActionPlugin, traceId: String): Unit = js.native
  /** @see https://www.gatsbyjs.org/docs/actions/#deletePage */
  def deleteNode(options: Anon_Node): Unit = js.native
  def deleteNode(options: Anon_Node, plugin: ActionPlugin): Unit = js.native
  def deleteNode(options: Anon_Node, plugin: ActionPlugin, option: ActionOptions): Unit = js.native
  /**
    * @deprecated
    * @see https://www.gatsbyjs.org/docs/actions/#deleteNodes
    */
  def deleteNodes(nodes: js.Array[String]): Unit = js.native
  def deleteNodes(nodes: js.Array[String], plugin: ActionPlugin): Unit = js.native
  /** @see https://www.gatsbyjs.org/docs/actions/#deletePage */
  def deletePage(args: Anon_Component): Unit = js.native
  /** @see https://www.gatsbyjs.org/docs/actions/#endJob */
  def endJob(job: Anon_Id): Unit = js.native
  def endJob(job: Anon_Id, plugin: ActionPlugin): Unit = js.native
  /** @see https://www.gatsbyjs.org/docs/actions/#replaceWebpackConfig */
  def replaceWebpackConfig(config: js.Object): Unit = js.native
  def replaceWebpackConfig(config: js.Object, plugin: ActionPlugin): Unit = js.native
  /** @see https://www.gatsbyjs.org/docs/actions/#setBabelOptions */
  def setBabelOptions(options: js.Object): Unit = js.native
  def setBabelOptions(options: js.Object, plugin: ActionPlugin): Unit = js.native
  /** @see https://www.gatsbyjs.org/docs/actions/#setBabelPlugin */
  def setBabelPlugin(config: Anon_NameOptions): Unit = js.native
  def setBabelPlugin(config: Anon_NameOptions, plugin: ActionPlugin): Unit = js.native
  /** @see https://www.gatsbyjs.org/docs/actions/#setBabelPreset */
  def setBabelPreset(config: Anon_NameOptions): Unit = js.native
  def setBabelPreset(config: Anon_NameOptions, plugin: ActionPlugin): Unit = js.native
  /** @see https://www.gatsbyjs.org/docs/actions/#setJob */
  def setJob(job: (Record[String, _]) with Anon_Id): Unit = js.native
  def setJob(job: (Record[String, _]) with Anon_Id, plugin: ActionPlugin): Unit = js.native
  /** @see https://www.gatsbyjs.org/docs/actions/#setPluginStatus */
  def setPluginStatus(status: Record[String, _]): Unit = js.native
  def setPluginStatus(status: Record[String, _], plugin: ActionPlugin): Unit = js.native
  /** @see https://www.gatsbyjs.org/docs/actions/#setWebpackConfig */
  def setWebpackConfig(config: js.Object): Unit = js.native
  def setWebpackConfig(config: js.Object, plugin: ActionPlugin): Unit = js.native
  /** @see https://www.gatsbyjs.org/docs/actions/#touchNode */
  def touchNode(node: Anon_NodeIdString): Unit = js.native
  def touchNode(node: Anon_NodeIdString, plugin: ActionPlugin): Unit = js.native
}


package typings
package gatsbyLib.gatsbyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Actions extends js.Object {
  /** @see https://www.gatsbyjs.org/docs/actions/#addThirdPartySchema */
  def addThirdPartySchema(args: gatsbyLib.Anon_Schema): scala.Unit = js.native
  def addThirdPartySchema(args: gatsbyLib.Anon_Schema, plugin: ActionPlugin): scala.Unit = js.native
  def addThirdPartySchema(args: gatsbyLib.Anon_Schema, plugin: ActionPlugin, traceId: java.lang.String): scala.Unit = js.native
  /** @see https://www.gatsbyjs.org/docs/actions/#createFieldExtension */
  def createFieldExtension(extension: js.Object, plugin: ActionPlugin): scala.Unit = js.native
  def createFieldExtension(extension: js.Object, plugin: ActionPlugin, traceId: java.lang.String): scala.Unit = js.native
  /** @see https://www.gatsbyjs.org/docs/actions/#createJob */
  def createJob(job: (stdLib.Record[java.lang.String, _]) with gatsbyLib.Anon_Id): scala.Unit = js.native
  def createJob(job: (stdLib.Record[java.lang.String, _]) with gatsbyLib.Anon_Id, plugin: ActionPlugin): scala.Unit = js.native
  /** @see https://www.gatsbyjs.org/docs/actions/#createNode */
  def createNode(node: NodeInput): scala.Unit = js.native
  def createNode(node: NodeInput, plugin: ActionPlugin): scala.Unit = js.native
  def createNode(node: NodeInput, plugin: ActionPlugin, options: ActionOptions): scala.Unit = js.native
  /** @see https://www.gatsbyjs.org/docs/actions/#createNodeField */
  def createNodeField(args: gatsbyLib.Anon_FieldName): scala.Unit = js.native
  def createNodeField(args: gatsbyLib.Anon_FieldName, plugin: ActionPlugin): scala.Unit = js.native
  def createNodeField(args: gatsbyLib.Anon_FieldName, plugin: ActionPlugin, options: ActionOptions): scala.Unit = js.native
  /** @see https://www.gatsbyjs.org/docs/actions/#createPage */
  def createPage[TContext](args: gatsbyLib.Anon_ComponentContext[TContext]): scala.Unit = js.native
  def createPage[TContext](args: gatsbyLib.Anon_ComponentContext[TContext], plugin: ActionPlugin): scala.Unit = js.native
  def createPage[TContext](args: gatsbyLib.Anon_ComponentContext[TContext], plugin: ActionPlugin, option: ActionOptions): scala.Unit = js.native
  /** @see https://www.gatsbyjs.org/docs/actions/#createParentChildLink */
  def createParentChildLink(args: gatsbyLib.Anon_Child): scala.Unit = js.native
  def createParentChildLink(args: gatsbyLib.Anon_Child, plugin: ActionPlugin): scala.Unit = js.native
  /** @see https://www.gatsbyjs.org/docs/actions/#createRedirect */
  def createRedirect(redirect: gatsbyLib.Anon_Force): scala.Unit = js.native
  def createRedirect(redirect: gatsbyLib.Anon_Force, plugin: ActionPlugin): scala.Unit = js.native
  /** @see https://www.gatsbyjs.org/docs/actions/#createTypes */
  def createTypes(types: java.lang.String): scala.Unit = js.native
  def createTypes(types: java.lang.String, plugin: ActionPlugin): scala.Unit = js.native
  def createTypes(types: java.lang.String, plugin: ActionPlugin, traceId: java.lang.String): scala.Unit = js.native
  def createTypes(types: js.Array[java.lang.String | js.Object]): scala.Unit = js.native
  def createTypes(types: js.Array[java.lang.String | js.Object], plugin: ActionPlugin): scala.Unit = js.native
  def createTypes(types: js.Array[java.lang.String | js.Object], plugin: ActionPlugin, traceId: java.lang.String): scala.Unit = js.native
  def createTypes(types: js.Object): scala.Unit = js.native
  def createTypes(types: js.Object, plugin: ActionPlugin): scala.Unit = js.native
  def createTypes(types: js.Object, plugin: ActionPlugin, traceId: java.lang.String): scala.Unit = js.native
  /** @see https://www.gatsbyjs.org/docs/actions/#deletePage */
  def deleteNode(options: gatsbyLib.Anon_Node): scala.Unit = js.native
  def deleteNode(options: gatsbyLib.Anon_Node, plugin: ActionPlugin): scala.Unit = js.native
  def deleteNode(options: gatsbyLib.Anon_Node, plugin: ActionPlugin, option: ActionOptions): scala.Unit = js.native
  /**
    * @deprecated
    * @see https://www.gatsbyjs.org/docs/actions/#deleteNodes
    */
  def deleteNodes(nodes: js.Array[java.lang.String]): scala.Unit = js.native
  def deleteNodes(nodes: js.Array[java.lang.String], plugin: ActionPlugin): scala.Unit = js.native
  /** @see https://www.gatsbyjs.org/docs/actions/#deletePage */
  def deletePage(args: gatsbyLib.Anon_Component): scala.Unit = js.native
  /** @see https://www.gatsbyjs.org/docs/actions/#endJob */
  def endJob(job: gatsbyLib.Anon_Id): scala.Unit = js.native
  def endJob(job: gatsbyLib.Anon_Id, plugin: ActionPlugin): scala.Unit = js.native
  /** @see https://www.gatsbyjs.org/docs/actions/#replaceWebpackConfig */
  def replaceWebpackConfig(config: js.Object): scala.Unit = js.native
  def replaceWebpackConfig(config: js.Object, plugin: ActionPlugin): scala.Unit = js.native
  /** @see https://www.gatsbyjs.org/docs/actions/#setBabelOptions */
  def setBabelOptions(options: js.Object): scala.Unit = js.native
  def setBabelOptions(options: js.Object, plugin: ActionPlugin): scala.Unit = js.native
  /** @see https://www.gatsbyjs.org/docs/actions/#setBabelPlugin */
  def setBabelPlugin(config: gatsbyLib.Anon_NameOptions): scala.Unit = js.native
  def setBabelPlugin(config: gatsbyLib.Anon_NameOptions, plugin: ActionPlugin): scala.Unit = js.native
  /** @see https://www.gatsbyjs.org/docs/actions/#setBabelPreset */
  def setBabelPreset(config: gatsbyLib.Anon_NameOptions): scala.Unit = js.native
  def setBabelPreset(config: gatsbyLib.Anon_NameOptions, plugin: ActionPlugin): scala.Unit = js.native
  /** @see https://www.gatsbyjs.org/docs/actions/#setJob */
  def setJob(job: (stdLib.Record[java.lang.String, _]) with gatsbyLib.Anon_Id): scala.Unit = js.native
  def setJob(job: (stdLib.Record[java.lang.String, _]) with gatsbyLib.Anon_Id, plugin: ActionPlugin): scala.Unit = js.native
  /** @see https://www.gatsbyjs.org/docs/actions/#setPluginStatus */
  def setPluginStatus(status: stdLib.Record[java.lang.String, _]): scala.Unit = js.native
  def setPluginStatus(status: stdLib.Record[java.lang.String, _], plugin: ActionPlugin): scala.Unit = js.native
  /** @see https://www.gatsbyjs.org/docs/actions/#setWebpackConfig */
  def setWebpackConfig(config: js.Object): scala.Unit = js.native
  def setWebpackConfig(config: js.Object, plugin: ActionPlugin): scala.Unit = js.native
  /** @see https://www.gatsbyjs.org/docs/actions/#touchNode */
  def touchNode(node: gatsbyLib.Anon_NodeIdString): scala.Unit = js.native
  def touchNode(node: gatsbyLib.Anon_NodeIdString, plugin: ActionPlugin): scala.Unit = js.native
}


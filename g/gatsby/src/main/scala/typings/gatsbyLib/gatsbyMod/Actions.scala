package typings
package gatsbyLib.gatsbyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Actions extends js.Object {
  /** @see https://www.gatsbyjs.org/docs/actions/#addThirdPartySchema */
  def addThirdPartySchema(args: gatsbyLib.Anon_Schema, plugin: js.UndefOr[ActionPlugin], traceId: java.lang.String): js.Any = js.native
  /** @see https://www.gatsbyjs.org/docs/actions/#createJob */
  def createJob(job: (stdLib.Record[java.lang.String, _]) with gatsbyLib.Anon_Id): scala.Unit = js.native
  def createJob(job: (stdLib.Record[java.lang.String, _]) with gatsbyLib.Anon_Id, plugin: ActionPlugin): scala.Unit = js.native
  /** @see https://www.gatsbyjs.org/docs/actions/#createNode */
  def createNode(node: Node): scala.Unit = js.native
  def createNode(node: Node, plugin: ActionPlugin): scala.Unit = js.native
  def createNode(node: Node, plugin: ActionPlugin, options: ActionOptions): scala.Unit = js.native
  /** @see https://www.gatsbyjs.org/docs/actions/#createNodeField */
  def createNodeField(args: gatsbyLib.Anon_FieldName): scala.Unit = js.native
  def createNodeField(args: gatsbyLib.Anon_FieldName, plugin: ActionPlugin): scala.Unit = js.native
  def createNodeField(args: gatsbyLib.Anon_FieldName, plugin: ActionPlugin, options: ActionOptions): scala.Unit = js.native
  /** @see https://www.gatsbyjs.org/docs/actions/#createPage */
  def createPage(args: gatsbyLib.Anon_ComponentContext): scala.Unit = js.native
  def createPage(args: gatsbyLib.Anon_ComponentContext, plugin: ActionPlugin): scala.Unit = js.native
  def createPage(args: gatsbyLib.Anon_ComponentContext, plugin: ActionPlugin, option: ActionOptions): scala.Unit = js.native
  /** @see https://www.gatsbyjs.org/docs/actions/#createParentChildLink */
  def createParentChildLink(hasParentChild: js.Any): scala.Unit = js.native
  def createParentChildLink(hasParentChild: js.Any, plugin: ActionPlugin): scala.Unit = js.native
  /** @see https://www.gatsbyjs.org/docs/actions/#createRedirect */
  def createRedirect(redirect: gatsbyLib.Anon_Force): scala.Unit = js.native
  def createRedirect(redirect: gatsbyLib.Anon_Force, plugin: ActionPlugin): scala.Unit = js.native
  /** TODO create jsdoc on gatsbyjs.org */
  def createTypes(types: java.lang.String, plugin: js.UndefOr[ActionPlugin], traceId: java.lang.String): js.Any = js.native
  def createTypes(
    types: js.Array[java.lang.String | js.Object],
    plugin: js.UndefOr[ActionPlugin],
    traceId: java.lang.String
  ): js.Any = js.native
  def createTypes(types: js.Object, plugin: js.UndefOr[ActionPlugin], traceId: java.lang.String): js.Any = js.native
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
  def touchNode(node: gatsbyLib.Anon_NodeIdPlugin): scala.Unit = js.native
}


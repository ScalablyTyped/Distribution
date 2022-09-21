package typings.devtoolsProtocol.protocolProxyApiMod.ProtocolProxyApi

import typings.devtoolsProtocol.devtoolsProtocolStrings.loadComplete
import typings.devtoolsProtocol.devtoolsProtocolStrings.nodesUpdated
import typings.devtoolsProtocol.mod.Protocol.Accessibility.GetAXNodeAndAncestorsRequest
import typings.devtoolsProtocol.mod.Protocol.Accessibility.GetAXNodeAndAncestorsResponse
import typings.devtoolsProtocol.mod.Protocol.Accessibility.GetChildAXNodesRequest
import typings.devtoolsProtocol.mod.Protocol.Accessibility.GetChildAXNodesResponse
import typings.devtoolsProtocol.mod.Protocol.Accessibility.GetFullAXTreeRequest
import typings.devtoolsProtocol.mod.Protocol.Accessibility.GetFullAXTreeResponse
import typings.devtoolsProtocol.mod.Protocol.Accessibility.GetPartialAXTreeRequest
import typings.devtoolsProtocol.mod.Protocol.Accessibility.GetPartialAXTreeResponse
import typings.devtoolsProtocol.mod.Protocol.Accessibility.GetRootAXNodeRequest
import typings.devtoolsProtocol.mod.Protocol.Accessibility.GetRootAXNodeResponse
import typings.devtoolsProtocol.mod.Protocol.Accessibility.LoadCompleteEvent
import typings.devtoolsProtocol.mod.Protocol.Accessibility.NodesUpdatedEvent
import typings.devtoolsProtocol.mod.Protocol.Accessibility.QueryAXTreeRequest
import typings.devtoolsProtocol.mod.Protocol.Accessibility.QueryAXTreeResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccessibilityApi extends StObject {
  
  /**
    * Disables the accessibility domain.
    */
  def disable(): js.Promise[Unit] = js.native
  
  /**
    * Enables the accessibility domain which causes `AXNodeId`s to remain consistent between method calls.
    * This turns on accessibility for the page, which can impact performance until accessibility is disabled.
    */
  def enable(): js.Promise[Unit] = js.native
  
  /**
    * Fetches a node and all ancestors up to and including the root.
    * Requires `enable()` to have been called previously.
    */
  def getAXNodeAndAncestors(params: GetAXNodeAndAncestorsRequest): js.Promise[GetAXNodeAndAncestorsResponse] = js.native
  
  /**
    * Fetches a particular accessibility node by AXNodeId.
    * Requires `enable()` to have been called previously.
    */
  def getChildAXNodes(params: GetChildAXNodesRequest): js.Promise[GetChildAXNodesResponse] = js.native
  
  /**
    * Fetches the entire accessibility tree for the root Document
    */
  def getFullAXTree(params: GetFullAXTreeRequest): js.Promise[GetFullAXTreeResponse] = js.native
  
  /**
    * Fetches the accessibility node and partial accessibility tree for this DOM node, if it exists.
    */
  def getPartialAXTree(params: GetPartialAXTreeRequest): js.Promise[GetPartialAXTreeResponse] = js.native
  
  /**
    * Fetches the root node.
    * Requires `enable()` to have been called previously.
    */
  def getRootAXNode(params: GetRootAXNodeRequest): js.Promise[GetRootAXNodeResponse] = js.native
  
  /**
    * The loadComplete event mirrors the load complete event sent by the browser to assistive
    * technology when the web page has finished loading.
    */
  @JSName("on")
  def on_loadComplete(event: loadComplete, listener: js.Function1[/* params */ LoadCompleteEvent, Unit]): Unit = js.native
  /**
    * The nodesUpdated event is sent every time a previously requested node has changed the in tree.
    */
  @JSName("on")
  def on_nodesUpdated(event: nodesUpdated, listener: js.Function1[/* params */ NodesUpdatedEvent, Unit]): Unit = js.native
  
  /**
    * Query a DOM node's accessibility subtree for accessible name and role.
    * This command computes the name and role for all nodes in the subtree, including those that are
    * ignored for accessibility, and returns those that mactch the specified name and role. If no DOM
    * node is specified, or the DOM node does not exist, the command returns an error. If neither
    * `accessibleName` or `role` is specified, it returns all the accessibility nodes in the subtree.
    */
  def queryAXTree(params: QueryAXTreeRequest): js.Promise[QueryAXTreeResponse] = js.native
}

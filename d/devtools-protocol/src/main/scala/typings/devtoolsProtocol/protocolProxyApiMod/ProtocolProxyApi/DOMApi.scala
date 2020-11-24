package typings.devtoolsProtocol.protocolProxyApiMod.ProtocolProxyApi

import typings.devtoolsProtocol.devtoolsProtocolStrings.attributeModified
import typings.devtoolsProtocol.devtoolsProtocolStrings.attributeRemoved
import typings.devtoolsProtocol.devtoolsProtocolStrings.characterDataModified
import typings.devtoolsProtocol.devtoolsProtocolStrings.childNodeCountUpdated
import typings.devtoolsProtocol.devtoolsProtocolStrings.childNodeInserted
import typings.devtoolsProtocol.devtoolsProtocolStrings.childNodeRemoved
import typings.devtoolsProtocol.devtoolsProtocolStrings.distributedNodesUpdated
import typings.devtoolsProtocol.devtoolsProtocolStrings.documentUpdated
import typings.devtoolsProtocol.devtoolsProtocolStrings.inlineStyleInvalidated
import typings.devtoolsProtocol.devtoolsProtocolStrings.pseudoElementAdded
import typings.devtoolsProtocol.devtoolsProtocolStrings.pseudoElementRemoved
import typings.devtoolsProtocol.devtoolsProtocolStrings.setChildNodes
import typings.devtoolsProtocol.devtoolsProtocolStrings.shadowRootPopped
import typings.devtoolsProtocol.devtoolsProtocolStrings.shadowRootPushed
import typings.devtoolsProtocol.mod.Protocol.DOM.AttributeModifiedEvent
import typings.devtoolsProtocol.mod.Protocol.DOM.AttributeRemovedEvent
import typings.devtoolsProtocol.mod.Protocol.DOM.CharacterDataModifiedEvent
import typings.devtoolsProtocol.mod.Protocol.DOM.ChildNodeCountUpdatedEvent
import typings.devtoolsProtocol.mod.Protocol.DOM.ChildNodeInsertedEvent
import typings.devtoolsProtocol.mod.Protocol.DOM.ChildNodeRemovedEvent
import typings.devtoolsProtocol.mod.Protocol.DOM.CollectClassNamesFromSubtreeRequest
import typings.devtoolsProtocol.mod.Protocol.DOM.CollectClassNamesFromSubtreeResponse
import typings.devtoolsProtocol.mod.Protocol.DOM.CopyToRequest
import typings.devtoolsProtocol.mod.Protocol.DOM.CopyToResponse
import typings.devtoolsProtocol.mod.Protocol.DOM.DescribeNodeRequest
import typings.devtoolsProtocol.mod.Protocol.DOM.DescribeNodeResponse
import typings.devtoolsProtocol.mod.Protocol.DOM.DiscardSearchResultsRequest
import typings.devtoolsProtocol.mod.Protocol.DOM.DistributedNodesUpdatedEvent
import typings.devtoolsProtocol.mod.Protocol.DOM.FocusRequest
import typings.devtoolsProtocol.mod.Protocol.DOM.GetAttributesRequest
import typings.devtoolsProtocol.mod.Protocol.DOM.GetAttributesResponse
import typings.devtoolsProtocol.mod.Protocol.DOM.GetBoxModelRequest
import typings.devtoolsProtocol.mod.Protocol.DOM.GetBoxModelResponse
import typings.devtoolsProtocol.mod.Protocol.DOM.GetContentQuadsRequest
import typings.devtoolsProtocol.mod.Protocol.DOM.GetContentQuadsResponse
import typings.devtoolsProtocol.mod.Protocol.DOM.GetDocumentRequest
import typings.devtoolsProtocol.mod.Protocol.DOM.GetDocumentResponse
import typings.devtoolsProtocol.mod.Protocol.DOM.GetFileInfoRequest
import typings.devtoolsProtocol.mod.Protocol.DOM.GetFileInfoResponse
import typings.devtoolsProtocol.mod.Protocol.DOM.GetFlattenedDocumentRequest
import typings.devtoolsProtocol.mod.Protocol.DOM.GetFlattenedDocumentResponse
import typings.devtoolsProtocol.mod.Protocol.DOM.GetFrameOwnerRequest
import typings.devtoolsProtocol.mod.Protocol.DOM.GetFrameOwnerResponse
import typings.devtoolsProtocol.mod.Protocol.DOM.GetNodeForLocationRequest
import typings.devtoolsProtocol.mod.Protocol.DOM.GetNodeForLocationResponse
import typings.devtoolsProtocol.mod.Protocol.DOM.GetNodeStackTracesRequest
import typings.devtoolsProtocol.mod.Protocol.DOM.GetNodeStackTracesResponse
import typings.devtoolsProtocol.mod.Protocol.DOM.GetNodesForSubtreeByStyleRequest
import typings.devtoolsProtocol.mod.Protocol.DOM.GetNodesForSubtreeByStyleResponse
import typings.devtoolsProtocol.mod.Protocol.DOM.GetOuterHTMLRequest
import typings.devtoolsProtocol.mod.Protocol.DOM.GetOuterHTMLResponse
import typings.devtoolsProtocol.mod.Protocol.DOM.GetRelayoutBoundaryRequest
import typings.devtoolsProtocol.mod.Protocol.DOM.GetRelayoutBoundaryResponse
import typings.devtoolsProtocol.mod.Protocol.DOM.GetSearchResultsRequest
import typings.devtoolsProtocol.mod.Protocol.DOM.GetSearchResultsResponse
import typings.devtoolsProtocol.mod.Protocol.DOM.InlineStyleInvalidatedEvent
import typings.devtoolsProtocol.mod.Protocol.DOM.MoveToRequest
import typings.devtoolsProtocol.mod.Protocol.DOM.MoveToResponse
import typings.devtoolsProtocol.mod.Protocol.DOM.PerformSearchRequest
import typings.devtoolsProtocol.mod.Protocol.DOM.PerformSearchResponse
import typings.devtoolsProtocol.mod.Protocol.DOM.PseudoElementAddedEvent
import typings.devtoolsProtocol.mod.Protocol.DOM.PseudoElementRemovedEvent
import typings.devtoolsProtocol.mod.Protocol.DOM.PushNodeByPathToFrontendRequest
import typings.devtoolsProtocol.mod.Protocol.DOM.PushNodeByPathToFrontendResponse
import typings.devtoolsProtocol.mod.Protocol.DOM.PushNodesByBackendIdsToFrontendRequest
import typings.devtoolsProtocol.mod.Protocol.DOM.PushNodesByBackendIdsToFrontendResponse
import typings.devtoolsProtocol.mod.Protocol.DOM.QuerySelectorAllRequest
import typings.devtoolsProtocol.mod.Protocol.DOM.QuerySelectorAllResponse
import typings.devtoolsProtocol.mod.Protocol.DOM.QuerySelectorRequest
import typings.devtoolsProtocol.mod.Protocol.DOM.QuerySelectorResponse
import typings.devtoolsProtocol.mod.Protocol.DOM.RemoveAttributeRequest
import typings.devtoolsProtocol.mod.Protocol.DOM.RemoveNodeRequest
import typings.devtoolsProtocol.mod.Protocol.DOM.RequestChildNodesRequest
import typings.devtoolsProtocol.mod.Protocol.DOM.RequestNodeRequest
import typings.devtoolsProtocol.mod.Protocol.DOM.RequestNodeResponse
import typings.devtoolsProtocol.mod.Protocol.DOM.ResolveNodeRequest
import typings.devtoolsProtocol.mod.Protocol.DOM.ResolveNodeResponse
import typings.devtoolsProtocol.mod.Protocol.DOM.ScrollIntoViewIfNeededRequest
import typings.devtoolsProtocol.mod.Protocol.DOM.SetAttributeValueRequest
import typings.devtoolsProtocol.mod.Protocol.DOM.SetAttributesAsTextRequest
import typings.devtoolsProtocol.mod.Protocol.DOM.SetChildNodesEvent
import typings.devtoolsProtocol.mod.Protocol.DOM.SetFileInputFilesRequest
import typings.devtoolsProtocol.mod.Protocol.DOM.SetInspectedNodeRequest
import typings.devtoolsProtocol.mod.Protocol.DOM.SetNodeNameRequest
import typings.devtoolsProtocol.mod.Protocol.DOM.SetNodeNameResponse
import typings.devtoolsProtocol.mod.Protocol.DOM.SetNodeStackTracesEnabledRequest
import typings.devtoolsProtocol.mod.Protocol.DOM.SetNodeValueRequest
import typings.devtoolsProtocol.mod.Protocol.DOM.SetOuterHTMLRequest
import typings.devtoolsProtocol.mod.Protocol.DOM.ShadowRootPoppedEvent
import typings.devtoolsProtocol.mod.Protocol.DOM.ShadowRootPushedEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DOMApi extends js.Object {
  
  /**
    * Collects class names for the node with given id and all of it's child nodes.
    */
  def collectClassNamesFromSubtree(params: CollectClassNamesFromSubtreeRequest): js.Promise[CollectClassNamesFromSubtreeResponse] = js.native
  
  /**
    * Creates a deep copy of the specified node and places it into the target container before the
    * given anchor.
    */
  def copyTo(params: CopyToRequest): js.Promise[CopyToResponse] = js.native
  
  /**
    * Describes node given its id, does not require domain to be enabled. Does not start tracking any
    * objects, can be used for automation.
    */
  def describeNode(params: DescribeNodeRequest): js.Promise[DescribeNodeResponse] = js.native
  
  /**
    * Disables DOM agent for the given page.
    */
  def disable(): js.Promise[Unit] = js.native
  
  /**
    * Discards search results from the session with the given id. `getSearchResults` should no longer
    * be called for that search.
    */
  def discardSearchResults(params: DiscardSearchResultsRequest): js.Promise[Unit] = js.native
  
  /**
    * Enables DOM agent for the given page.
    */
  def enable(): js.Promise[Unit] = js.native
  
  /**
    * Focuses the given element.
    */
  def focus(params: FocusRequest): js.Promise[Unit] = js.native
  
  /**
    * Returns attributes for the specified node.
    */
  def getAttributes(params: GetAttributesRequest): js.Promise[GetAttributesResponse] = js.native
  
  /**
    * Returns boxes for the given node.
    */
  def getBoxModel(params: GetBoxModelRequest): js.Promise[GetBoxModelResponse] = js.native
  
  /**
    * Returns quads that describe node position on the page. This method
    * might return multiple quads for inline nodes.
    */
  def getContentQuads(params: GetContentQuadsRequest): js.Promise[GetContentQuadsResponse] = js.native
  
  /**
    * Returns the root DOM node (and optionally the subtree) to the caller.
    */
  def getDocument(params: GetDocumentRequest): js.Promise[GetDocumentResponse] = js.native
  
  /**
    * Returns file information for the given
    * File wrapper.
    */
  def getFileInfo(params: GetFileInfoRequest): js.Promise[GetFileInfoResponse] = js.native
  
  /**
    * Returns the root DOM node (and optionally the subtree) to the caller.
    * Deprecated, as it is not designed to work well with the rest of the DOM agent.
    * Use DOMSnapshot.captureSnapshot instead.
    */
  def getFlattenedDocument(params: GetFlattenedDocumentRequest): js.Promise[GetFlattenedDocumentResponse] = js.native
  
  /**
    * Returns iframe node that owns iframe with the given domain.
    */
  def getFrameOwner(params: GetFrameOwnerRequest): js.Promise[GetFrameOwnerResponse] = js.native
  
  /**
    * Returns node id at given location. Depending on whether DOM domain is enabled, nodeId is
    * either returned or not.
    */
  def getNodeForLocation(params: GetNodeForLocationRequest): js.Promise[GetNodeForLocationResponse] = js.native
  
  /**
    * Gets stack traces associated with a Node. As of now, only provides stack trace for Node creation.
    */
  def getNodeStackTraces(params: GetNodeStackTracesRequest): js.Promise[GetNodeStackTracesResponse] = js.native
  
  /**
    * Finds nodes with a given computed style in a subtree.
    */
  def getNodesForSubtreeByStyle(params: GetNodesForSubtreeByStyleRequest): js.Promise[GetNodesForSubtreeByStyleResponse] = js.native
  
  /**
    * Returns node's HTML markup.
    */
  def getOuterHTML(params: GetOuterHTMLRequest): js.Promise[GetOuterHTMLResponse] = js.native
  
  /**
    * Returns the id of the nearest ancestor that is a relayout boundary.
    */
  def getRelayoutBoundary(params: GetRelayoutBoundaryRequest): js.Promise[GetRelayoutBoundaryResponse] = js.native
  
  /**
    * Returns search results from given `fromIndex` to given `toIndex` from the search with the given
    * identifier.
    */
  def getSearchResults(params: GetSearchResultsRequest): js.Promise[GetSearchResultsResponse] = js.native
  
  /**
    * Hides any highlight.
    */
  def hideHighlight(): js.Promise[Unit] = js.native
  
  /**
    * Highlights DOM node.
    */
  def highlightNode(): js.Promise[Unit] = js.native
  
  /**
    * Highlights given rectangle.
    */
  def highlightRect(): js.Promise[Unit] = js.native
  
  /**
    * Marks last undoable state.
    */
  def markUndoableState(): js.Promise[Unit] = js.native
  
  /**
    * Moves node into the new container, places it before the given anchor.
    */
  def moveTo(params: MoveToRequest): js.Promise[MoveToResponse] = js.native
  
  /**
    * Fired when `Element`'s attribute is modified.
    */
  @JSName("on")
  def on_attributeModified(event: attributeModified, listener: js.Function1[/* params */ AttributeModifiedEvent, Unit]): Unit = js.native
  /**
    * Fired when `Element`'s attribute is removed.
    */
  @JSName("on")
  def on_attributeRemoved(event: attributeRemoved, listener: js.Function1[/* params */ AttributeRemovedEvent, Unit]): Unit = js.native
  /**
    * Mirrors `DOMCharacterDataModified` event.
    */
  @JSName("on")
  def on_characterDataModified(
    event: characterDataModified,
    listener: js.Function1[/* params */ CharacterDataModifiedEvent, Unit]
  ): Unit = js.native
  /**
    * Fired when `Container`'s child node count has changed.
    */
  @JSName("on")
  def on_childNodeCountUpdated(
    event: childNodeCountUpdated,
    listener: js.Function1[/* params */ ChildNodeCountUpdatedEvent, Unit]
  ): Unit = js.native
  /**
    * Mirrors `DOMNodeInserted` event.
    */
  @JSName("on")
  def on_childNodeInserted(event: childNodeInserted, listener: js.Function1[/* params */ ChildNodeInsertedEvent, Unit]): Unit = js.native
  /**
    * Mirrors `DOMNodeRemoved` event.
    */
  @JSName("on")
  def on_childNodeRemoved(event: childNodeRemoved, listener: js.Function1[/* params */ ChildNodeRemovedEvent, Unit]): Unit = js.native
  /**
    * Called when distrubution is changed.
    */
  @JSName("on")
  def on_distributedNodesUpdated(
    event: distributedNodesUpdated,
    listener: js.Function1[/* params */ DistributedNodesUpdatedEvent, Unit]
  ): Unit = js.native
  /**
    * Fired when `Document` has been totally updated. Node ids are no longer valid.
    */
  @JSName("on")
  def on_documentUpdated(event: documentUpdated, listener: js.Function0[Unit]): Unit = js.native
  /**
    * Fired when `Element`'s inline style is modified via a CSS property modification.
    */
  @JSName("on")
  def on_inlineStyleInvalidated(
    event: inlineStyleInvalidated,
    listener: js.Function1[/* params */ InlineStyleInvalidatedEvent, Unit]
  ): Unit = js.native
  /**
    * Called when a pseudo element is added to an element.
    */
  @JSName("on")
  def on_pseudoElementAdded(event: pseudoElementAdded, listener: js.Function1[/* params */ PseudoElementAddedEvent, Unit]): Unit = js.native
  /**
    * Called when a pseudo element is removed from an element.
    */
  @JSName("on")
  def on_pseudoElementRemoved(event: pseudoElementRemoved, listener: js.Function1[/* params */ PseudoElementRemovedEvent, Unit]): Unit = js.native
  /**
    * Fired when backend wants to provide client with the missing DOM structure. This happens upon
    * most of the calls requesting node ids.
    */
  @JSName("on")
  def on_setChildNodes(event: setChildNodes, listener: js.Function1[/* params */ SetChildNodesEvent, Unit]): Unit = js.native
  /**
    * Called when shadow root is popped from the element.
    */
  @JSName("on")
  def on_shadowRootPopped(event: shadowRootPopped, listener: js.Function1[/* params */ ShadowRootPoppedEvent, Unit]): Unit = js.native
  /**
    * Called when shadow root is pushed into the element.
    */
  @JSName("on")
  def on_shadowRootPushed(event: shadowRootPushed, listener: js.Function1[/* params */ ShadowRootPushedEvent, Unit]): Unit = js.native
  
  /**
    * Searches for a given string in the DOM tree. Use `getSearchResults` to access search results or
    * `cancelSearch` to end this search session.
    */
  def performSearch(params: PerformSearchRequest): js.Promise[PerformSearchResponse] = js.native
  
  /**
    * Requests that the node is sent to the caller given its path. // FIXME, use XPath
    */
  def pushNodeByPathToFrontend(params: PushNodeByPathToFrontendRequest): js.Promise[PushNodeByPathToFrontendResponse] = js.native
  
  /**
    * Requests that a batch of nodes is sent to the caller given their backend node ids.
    */
  def pushNodesByBackendIdsToFrontend(params: PushNodesByBackendIdsToFrontendRequest): js.Promise[PushNodesByBackendIdsToFrontendResponse] = js.native
  
  /**
    * Executes `querySelector` on a given node.
    */
  def querySelector(params: QuerySelectorRequest): js.Promise[QuerySelectorResponse] = js.native
  
  /**
    * Executes `querySelectorAll` on a given node.
    */
  def querySelectorAll(params: QuerySelectorAllRequest): js.Promise[QuerySelectorAllResponse] = js.native
  
  /**
    * Re-does the last undone action.
    */
  def redo(): js.Promise[Unit] = js.native
  
  /**
    * Removes attribute with given name from an element with given id.
    */
  def removeAttribute(params: RemoveAttributeRequest): js.Promise[Unit] = js.native
  
  /**
    * Removes node with given id.
    */
  def removeNode(params: RemoveNodeRequest): js.Promise[Unit] = js.native
  
  /**
    * Requests that children of the node with given id are returned to the caller in form of
    * `setChildNodes` events where not only immediate children are retrieved, but all children down to
    * the specified depth.
    */
  def requestChildNodes(params: RequestChildNodesRequest): js.Promise[Unit] = js.native
  
  /**
    * Requests that the node is sent to the caller given the JavaScript node object reference. All
    * nodes that form the path from the node to the root are also sent to the client as a series of
    * `setChildNodes` notifications.
    */
  def requestNode(params: RequestNodeRequest): js.Promise[RequestNodeResponse] = js.native
  
  /**
    * Resolves the JavaScript node object for a given NodeId or BackendNodeId.
    */
  def resolveNode(params: ResolveNodeRequest): js.Promise[ResolveNodeResponse] = js.native
  
  /**
    * Scrolls the specified rect of the given node into view if not already visible.
    * Note: exactly one between nodeId, backendNodeId and objectId should be passed
    * to identify the node.
    */
  def scrollIntoViewIfNeeded(params: ScrollIntoViewIfNeededRequest): js.Promise[Unit] = js.native
  
  /**
    * Sets attribute for an element with given id.
    */
  def setAttributeValue(params: SetAttributeValueRequest): js.Promise[Unit] = js.native
  
  /**
    * Sets attributes on element with given id. This method is useful when user edits some existing
    * attribute value and types in several attribute name/value pairs.
    */
  def setAttributesAsText(params: SetAttributesAsTextRequest): js.Promise[Unit] = js.native
  
  /**
    * Sets files for the given file input element.
    */
  def setFileInputFiles(params: SetFileInputFilesRequest): js.Promise[Unit] = js.native
  
  /**
    * Enables console to refer to the node with given id via $x (see Command Line API for more details
    * $x functions).
    */
  def setInspectedNode(params: SetInspectedNodeRequest): js.Promise[Unit] = js.native
  
  /**
    * Sets node name for a node with given id.
    */
  def setNodeName(params: SetNodeNameRequest): js.Promise[SetNodeNameResponse] = js.native
  
  /**
    * Sets if stack traces should be captured for Nodes. See `Node.getNodeStackTraces`. Default is disabled.
    */
  def setNodeStackTracesEnabled(params: SetNodeStackTracesEnabledRequest): js.Promise[Unit] = js.native
  
  /**
    * Sets node value for a node with given id.
    */
  def setNodeValue(params: SetNodeValueRequest): js.Promise[Unit] = js.native
  
  /**
    * Sets node HTML markup, returns new node id.
    */
  def setOuterHTML(params: SetOuterHTMLRequest): js.Promise[Unit] = js.native
  
  /**
    * Undoes the last performed action.
    */
  def undo(): js.Promise[Unit] = js.native
}

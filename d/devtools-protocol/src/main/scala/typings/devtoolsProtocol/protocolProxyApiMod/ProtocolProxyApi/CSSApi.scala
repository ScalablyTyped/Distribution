package typings.devtoolsProtocol.protocolProxyApiMod.ProtocolProxyApi

import typings.devtoolsProtocol.devtoolsProtocolStrings.fontsUpdated
import typings.devtoolsProtocol.devtoolsProtocolStrings.mediaQueryResultChanged
import typings.devtoolsProtocol.devtoolsProtocolStrings.styleSheetAdded
import typings.devtoolsProtocol.devtoolsProtocolStrings.styleSheetChanged
import typings.devtoolsProtocol.devtoolsProtocolStrings.styleSheetRemoved
import typings.devtoolsProtocol.mod.Protocol.CSS.AddRuleRequest
import typings.devtoolsProtocol.mod.Protocol.CSS.AddRuleResponse
import typings.devtoolsProtocol.mod.Protocol.CSS.CollectClassNamesRequest
import typings.devtoolsProtocol.mod.Protocol.CSS.CollectClassNamesResponse
import typings.devtoolsProtocol.mod.Protocol.CSS.CreateStyleSheetRequest
import typings.devtoolsProtocol.mod.Protocol.CSS.CreateStyleSheetResponse
import typings.devtoolsProtocol.mod.Protocol.CSS.FontsUpdatedEvent
import typings.devtoolsProtocol.mod.Protocol.CSS.ForcePseudoStateRequest
import typings.devtoolsProtocol.mod.Protocol.CSS.GetBackgroundColorsRequest
import typings.devtoolsProtocol.mod.Protocol.CSS.GetBackgroundColorsResponse
import typings.devtoolsProtocol.mod.Protocol.CSS.GetComputedStyleForNodeRequest
import typings.devtoolsProtocol.mod.Protocol.CSS.GetComputedStyleForNodeResponse
import typings.devtoolsProtocol.mod.Protocol.CSS.GetInlineStylesForNodeRequest
import typings.devtoolsProtocol.mod.Protocol.CSS.GetInlineStylesForNodeResponse
import typings.devtoolsProtocol.mod.Protocol.CSS.GetLayersForNodeRequest
import typings.devtoolsProtocol.mod.Protocol.CSS.GetLayersForNodeResponse
import typings.devtoolsProtocol.mod.Protocol.CSS.GetMatchedStylesForNodeRequest
import typings.devtoolsProtocol.mod.Protocol.CSS.GetMatchedStylesForNodeResponse
import typings.devtoolsProtocol.mod.Protocol.CSS.GetMediaQueriesResponse
import typings.devtoolsProtocol.mod.Protocol.CSS.GetPlatformFontsForNodeRequest
import typings.devtoolsProtocol.mod.Protocol.CSS.GetPlatformFontsForNodeResponse
import typings.devtoolsProtocol.mod.Protocol.CSS.GetStyleSheetTextRequest
import typings.devtoolsProtocol.mod.Protocol.CSS.GetStyleSheetTextResponse
import typings.devtoolsProtocol.mod.Protocol.CSS.SetContainerQueryTextRequest
import typings.devtoolsProtocol.mod.Protocol.CSS.SetContainerQueryTextResponse
import typings.devtoolsProtocol.mod.Protocol.CSS.SetEffectivePropertyValueForNodeRequest
import typings.devtoolsProtocol.mod.Protocol.CSS.SetKeyframeKeyRequest
import typings.devtoolsProtocol.mod.Protocol.CSS.SetKeyframeKeyResponse
import typings.devtoolsProtocol.mod.Protocol.CSS.SetLocalFontsEnabledRequest
import typings.devtoolsProtocol.mod.Protocol.CSS.SetMediaTextRequest
import typings.devtoolsProtocol.mod.Protocol.CSS.SetMediaTextResponse
import typings.devtoolsProtocol.mod.Protocol.CSS.SetRuleSelectorRequest
import typings.devtoolsProtocol.mod.Protocol.CSS.SetRuleSelectorResponse
import typings.devtoolsProtocol.mod.Protocol.CSS.SetScopeTextRequest
import typings.devtoolsProtocol.mod.Protocol.CSS.SetScopeTextResponse
import typings.devtoolsProtocol.mod.Protocol.CSS.SetStyleSheetTextRequest
import typings.devtoolsProtocol.mod.Protocol.CSS.SetStyleSheetTextResponse
import typings.devtoolsProtocol.mod.Protocol.CSS.SetStyleTextsRequest
import typings.devtoolsProtocol.mod.Protocol.CSS.SetStyleTextsResponse
import typings.devtoolsProtocol.mod.Protocol.CSS.SetSupportsTextRequest
import typings.devtoolsProtocol.mod.Protocol.CSS.SetSupportsTextResponse
import typings.devtoolsProtocol.mod.Protocol.CSS.StopRuleUsageTrackingResponse
import typings.devtoolsProtocol.mod.Protocol.CSS.StyleSheetAddedEvent
import typings.devtoolsProtocol.mod.Protocol.CSS.StyleSheetChangedEvent
import typings.devtoolsProtocol.mod.Protocol.CSS.StyleSheetRemovedEvent
import typings.devtoolsProtocol.mod.Protocol.CSS.TakeComputedStyleUpdatesResponse
import typings.devtoolsProtocol.mod.Protocol.CSS.TakeCoverageDeltaResponse
import typings.devtoolsProtocol.mod.Protocol.CSS.TrackComputedStyleUpdatesRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CSSApi extends StObject {
  
  /**
    * Inserts a new rule with the given `ruleText` in a stylesheet with given `styleSheetId`, at the
    * position specified by `location`.
    */
  def addRule(params: AddRuleRequest): js.Promise[AddRuleResponse] = js.native
  
  /**
    * Returns all class names from specified stylesheet.
    */
  def collectClassNames(params: CollectClassNamesRequest): js.Promise[CollectClassNamesResponse] = js.native
  
  /**
    * Creates a new special "via-inspector" stylesheet in the frame with given `frameId`.
    */
  def createStyleSheet(params: CreateStyleSheetRequest): js.Promise[CreateStyleSheetResponse] = js.native
  
  /**
    * Disables the CSS agent for the given page.
    */
  def disable(): js.Promise[Unit] = js.native
  
  /**
    * Enables the CSS agent for the given page. Clients should not assume that the CSS agent has been
    * enabled until the result of this command is received.
    */
  def enable(): js.Promise[Unit] = js.native
  
  /**
    * Ensures that the given node will have specified pseudo-classes whenever its style is computed by
    * the browser.
    */
  def forcePseudoState(params: ForcePseudoStateRequest): js.Promise[Unit] = js.native
  
  def getBackgroundColors(params: GetBackgroundColorsRequest): js.Promise[GetBackgroundColorsResponse] = js.native
  
  /**
    * Returns the computed style for a DOM node identified by `nodeId`.
    */
  def getComputedStyleForNode(params: GetComputedStyleForNodeRequest): js.Promise[GetComputedStyleForNodeResponse] = js.native
  
  /**
    * Returns the styles defined inline (explicitly in the "style" attribute and implicitly, using DOM
    * attributes) for a DOM node identified by `nodeId`.
    */
  def getInlineStylesForNode(params: GetInlineStylesForNodeRequest): js.Promise[GetInlineStylesForNodeResponse] = js.native
  
  /**
    * Returns all layers parsed by the rendering engine for the tree scope of a node.
    * Given a DOM element identified by nodeId, getLayersForNode returns the root
    * layer for the nearest ancestor document or shadow root. The layer root contains
    * the full layer tree for the tree scope and their ordering.
    */
  def getLayersForNode(params: GetLayersForNodeRequest): js.Promise[GetLayersForNodeResponse] = js.native
  
  /**
    * Returns requested styles for a DOM node identified by `nodeId`.
    */
  def getMatchedStylesForNode(params: GetMatchedStylesForNodeRequest): js.Promise[GetMatchedStylesForNodeResponse] = js.native
  
  /**
    * Returns all media queries parsed by the rendering engine.
    */
  def getMediaQueries(): js.Promise[GetMediaQueriesResponse] = js.native
  
  /**
    * Requests information about platform fonts which we used to render child TextNodes in the given
    * node.
    */
  def getPlatformFontsForNode(params: GetPlatformFontsForNodeRequest): js.Promise[GetPlatformFontsForNodeResponse] = js.native
  
  /**
    * Returns the current textual content for a stylesheet.
    */
  def getStyleSheetText(params: GetStyleSheetTextRequest): js.Promise[GetStyleSheetTextResponse] = js.native
  
  /**
    * Fires whenever a web font is updated.  A non-empty font parameter indicates a successfully loaded
    * web font
    */
  @JSName("on")
  def on_fontsUpdated(event: fontsUpdated, listener: js.Function1[/* params */ FontsUpdatedEvent, Unit]): Unit = js.native
  /**
    * Fires whenever a MediaQuery result changes (for example, after a browser window has been
    * resized.) The current implementation considers only viewport-dependent media features.
    */
  @JSName("on")
  def on_mediaQueryResultChanged(event: mediaQueryResultChanged, listener: js.Function0[Unit]): Unit = js.native
  /**
    * Fired whenever an active document stylesheet is added.
    */
  @JSName("on")
  def on_styleSheetAdded(event: styleSheetAdded, listener: js.Function1[/* params */ StyleSheetAddedEvent, Unit]): Unit = js.native
  /**
    * Fired whenever a stylesheet is changed as a result of the client operation.
    */
  @JSName("on")
  def on_styleSheetChanged(event: styleSheetChanged, listener: js.Function1[/* params */ StyleSheetChangedEvent, Unit]): Unit = js.native
  /**
    * Fired whenever an active document stylesheet is removed.
    */
  @JSName("on")
  def on_styleSheetRemoved(event: styleSheetRemoved, listener: js.Function1[/* params */ StyleSheetRemovedEvent, Unit]): Unit = js.native
  
  /**
    * Modifies the expression of a container query.
    */
  def setContainerQueryText(params: SetContainerQueryTextRequest): js.Promise[SetContainerQueryTextResponse] = js.native
  
  /**
    * Find a rule with the given active property for the given node and set the new value for this
    * property
    */
  def setEffectivePropertyValueForNode(params: SetEffectivePropertyValueForNodeRequest): js.Promise[Unit] = js.native
  
  /**
    * Modifies the keyframe rule key text.
    */
  def setKeyframeKey(params: SetKeyframeKeyRequest): js.Promise[SetKeyframeKeyResponse] = js.native
  
  /**
    * Enables/disables rendering of local CSS fonts (enabled by default).
    */
  def setLocalFontsEnabled(params: SetLocalFontsEnabledRequest): js.Promise[Unit] = js.native
  
  /**
    * Modifies the rule selector.
    */
  def setMediaText(params: SetMediaTextRequest): js.Promise[SetMediaTextResponse] = js.native
  
  /**
    * Modifies the rule selector.
    */
  def setRuleSelector(params: SetRuleSelectorRequest): js.Promise[SetRuleSelectorResponse] = js.native
  
  /**
    * Modifies the expression of a scope at-rule.
    */
  def setScopeText(params: SetScopeTextRequest): js.Promise[SetScopeTextResponse] = js.native
  
  /**
    * Sets the new stylesheet text.
    */
  def setStyleSheetText(params: SetStyleSheetTextRequest): js.Promise[SetStyleSheetTextResponse] = js.native
  
  /**
    * Applies specified style edits one after another in the given order.
    */
  def setStyleTexts(params: SetStyleTextsRequest): js.Promise[SetStyleTextsResponse] = js.native
  
  /**
    * Modifies the expression of a supports at-rule.
    */
  def setSupportsText(params: SetSupportsTextRequest): js.Promise[SetSupportsTextResponse] = js.native
  
  /**
    * Enables the selector recording.
    */
  def startRuleUsageTracking(): js.Promise[Unit] = js.native
  
  /**
    * Stop tracking rule usage and return the list of rules that were used since last call to
    * `takeCoverageDelta` (or since start of coverage instrumentation)
    */
  def stopRuleUsageTracking(): js.Promise[StopRuleUsageTrackingResponse] = js.native
  
  /**
    * Polls the next batch of computed style updates.
    */
  def takeComputedStyleUpdates(): js.Promise[TakeComputedStyleUpdatesResponse] = js.native
  
  /**
    * Obtain list of rules that became used since last call to this method (or since start of coverage
    * instrumentation)
    */
  def takeCoverageDelta(): js.Promise[TakeCoverageDeltaResponse] = js.native
  
  /**
    * Starts tracking the given computed styles for updates. The specified array of properties
    * replaces the one previously specified. Pass empty array to disable tracking.
    * Use takeComputedStyleUpdates to retrieve the list of nodes that had properties modified.
    * The changes to computed style properties are only tracked for nodes pushed to the front-end
    * by the DOM agent. If no changes to the tracked properties occur after the node has been pushed
    * to the front-end, no updates will be issued for the node.
    */
  def trackComputedStyleUpdates(params: TrackComputedStyleUpdatesRequest): js.Promise[Unit] = js.native
}

package typings.firefoxDashWebextDashBrowser

import typings.firefoxDashWebextDashBrowser.browserNs.webNavigationNs._WebNavigationOnBeforeNavigateEvent
import typings.firefoxDashWebextDashBrowser.browserNs.webNavigationNs._WebNavigationOnCommittedEvent
import typings.firefoxDashWebextDashBrowser.browserNs.webNavigationNs._WebNavigationOnCompletedEvent
import typings.firefoxDashWebextDashBrowser.browserNs.webNavigationNs._WebNavigationOnCreatedNavigationTargetEvent
import typings.firefoxDashWebextDashBrowser.browserNs.webNavigationNs._WebNavigationOnDOMContentLoadedEvent
import typings.firefoxDashWebextDashBrowser.browserNs.webNavigationNs._WebNavigationOnErrorOccurredEvent
import typings.firefoxDashWebextDashBrowser.browserNs.webNavigationNs._WebNavigationOnHistoryStateUpdatedEvent
import typings.firefoxDashWebextDashBrowser.browserNs.webNavigationNs._WebNavigationOnReferenceFragmentUpdatedEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofwebNavigation extends js.Object {
  /* webNavigation events */
  /** Fired when a navigation is about to occur. */
  val onBeforeNavigate: _WebNavigationOnBeforeNavigateEvent[js.Function1[/* details */ Anon_FrameIdParentFrameId, Unit]]
  /**
    * Fired when a navigation is committed. The document (and the resources it refers to, such as images and
    * subframes) might still be downloading, but at least part of the document has been received from the server and
    * the browser has decided to switch to the new document.
    */
  val onCommitted: _WebNavigationOnCommittedEvent[js.Function1[/* details */ Anon_FrameIdProcessId, Unit]]
  /** Fired when a document, including the resources it refers to, is completely loaded and initialized. */
  val onCompleted: _WebNavigationOnCompletedEvent[js.Function1[/* details */ Anon_FrameIdProcessIdTabId, Unit]]
  /** Fired when a new window, or a new tab in an existing window, is created to host a navigation. */
  val onCreatedNavigationTarget: _WebNavigationOnCreatedNavigationTargetEvent[js.Function1[/* details */ Anon_SourceFrameId, Unit]]
  /** Fired when the page's DOM is fully constructed, but the referenced resources may not finish loading. */
  val onDOMContentLoaded: _WebNavigationOnDOMContentLoadedEvent[js.Function1[/* details */ Anon_FrameIdProcessIdTabId, Unit]]
  /**
    * Fired when an error occurs and the navigation is aborted. This can happen if either a network error occurred, or
    * the user aborted the navigation.
    */
  val onErrorOccurred: _WebNavigationOnErrorOccurredEvent[js.Function1[/* details */ Anon_Error, Unit]]
  /**
    * Fired when the frame's history was updated to a new URL. All future events for that frame will use the updated
    * URL.
    */
  val onHistoryStateUpdated: _WebNavigationOnHistoryStateUpdatedEvent[js.Function1[/* details */ Anon_FrameIdProcessId, Unit]]
  /**
    * Fired when the reference fragment of a frame was updated. All future events for that frame will use the updated
    * URL.
    */
  val onReferenceFragmentUpdated: _WebNavigationOnReferenceFragmentUpdatedEvent[js.Function1[/* details */ Anon_FrameIdProcessId, Unit]]
  /** Fired when the contents of the tab is replaced by a different (usually previously pre-rendered) tab. */
  val onTabReplaced: WebExtEvent[js.Function1[/* details */ Anon_ReplacedTabId, Unit]]
  /**
    * Retrieves information about all frames of a given tab.
    * @param details Information about the tab to retrieve all frames from.
    */
  def getAllFrames(details: Anon_TabIdNumber): js.Promise[js.Array[Anon_ErrorOccurredFrameId]]
  /* webNavigation functions */
  /**
    * Retrieves information about the given frame. A frame refers to an <iframe> or a <frame> of a web page and is
    * identified by a tab ID and a frame ID.
    * @param details Information about the frame to retrieve information about.
    */
  def getFrame(details: Anon_FrameId): js.Promise[Anon_ErrorOccurred]
}

object TypeofwebNavigation {
  @scala.inline
  def apply(
    getAllFrames: Anon_TabIdNumber => js.Promise[js.Array[Anon_ErrorOccurredFrameId]],
    getFrame: Anon_FrameId => js.Promise[Anon_ErrorOccurred],
    onBeforeNavigate: _WebNavigationOnBeforeNavigateEvent[js.Function1[/* details */ Anon_FrameIdParentFrameId, Unit]],
    onCommitted: _WebNavigationOnCommittedEvent[js.Function1[/* details */ Anon_FrameIdProcessId, Unit]],
    onCompleted: _WebNavigationOnCompletedEvent[js.Function1[/* details */ Anon_FrameIdProcessIdTabId, Unit]],
    onCreatedNavigationTarget: _WebNavigationOnCreatedNavigationTargetEvent[js.Function1[/* details */ Anon_SourceFrameId, Unit]],
    onDOMContentLoaded: _WebNavigationOnDOMContentLoadedEvent[js.Function1[/* details */ Anon_FrameIdProcessIdTabId, Unit]],
    onErrorOccurred: _WebNavigationOnErrorOccurredEvent[js.Function1[/* details */ Anon_Error, Unit]],
    onHistoryStateUpdated: _WebNavigationOnHistoryStateUpdatedEvent[js.Function1[/* details */ Anon_FrameIdProcessId, Unit]],
    onReferenceFragmentUpdated: _WebNavigationOnReferenceFragmentUpdatedEvent[js.Function1[/* details */ Anon_FrameIdProcessId, Unit]],
    onTabReplaced: WebExtEvent[js.Function1[/* details */ Anon_ReplacedTabId, Unit]]
  ): TypeofwebNavigation = {
    val __obj = js.Dynamic.literal(getAllFrames = js.Any.fromFunction1(getAllFrames), getFrame = js.Any.fromFunction1(getFrame), onBeforeNavigate = onBeforeNavigate, onCommitted = onCommitted, onCompleted = onCompleted, onCreatedNavigationTarget = onCreatedNavigationTarget, onDOMContentLoaded = onDOMContentLoaded, onErrorOccurred = onErrorOccurred, onHistoryStateUpdated = onHistoryStateUpdated, onReferenceFragmentUpdated = onReferenceFragmentUpdated, onTabReplaced = onTabReplaced)
  
    __obj.asInstanceOf[TypeofwebNavigation]
  }
}


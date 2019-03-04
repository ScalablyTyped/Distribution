package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DetailsGetAllFrames extends js.Object {
  /* webNavigation events */
  /** Fired when a navigation is about to occur. */
  val onBeforeNavigate: firefoxDashWebextDashBrowserLib.browserNs.webNavigationNs._WebNavigationOnBeforeNavigateEvent[js.Function1[/* details */ Anon_FrameIdParentFrameId, scala.Unit]]
  /**
    * Fired when a navigation is committed. The document (and the resources it refers to, such as images and
    * subframes) might still be downloading, but at least part of the document has been received from the server and
    * the browser has decided to switch to the new document.
    */
  val onCommitted: firefoxDashWebextDashBrowserLib.browserNs.webNavigationNs._WebNavigationOnCommittedEvent[js.Function1[/* details */ Anon_FrameIdProcessId, scala.Unit]]
  /** Fired when a document, including the resources it refers to, is completely loaded and initialized. */
  val onCompleted: firefoxDashWebextDashBrowserLib.browserNs.webNavigationNs._WebNavigationOnCompletedEvent[js.Function1[/* details */ Anon_FrameIdProcessIdTabId, scala.Unit]]
  /** Fired when a new window, or a new tab in an existing window, is created to host a navigation. */
  val onCreatedNavigationTarget: firefoxDashWebextDashBrowserLib.browserNs.webNavigationNs._WebNavigationOnCreatedNavigationTargetEvent[js.Function1[/* details */ Anon_SourceFrameId, scala.Unit]]
  /** Fired when the page's DOM is fully constructed, but the referenced resources may not finish loading. */
  val onDOMContentLoaded: firefoxDashWebextDashBrowserLib.browserNs.webNavigationNs._WebNavigationOnDOMContentLoadedEvent[js.Function1[/* details */ Anon_FrameIdProcessIdTabId, scala.Unit]]
  /**
    * Fired when an error occurs and the navigation is aborted. This can happen if either a network error occurred, or
    * the user aborted the navigation.
    */
  val onErrorOccurred: firefoxDashWebextDashBrowserLib.browserNs.webNavigationNs._WebNavigationOnErrorOccurredEvent[js.Function1[/* details */ Anon_Error, scala.Unit]]
  /**
    * Fired when the frame's history was updated to a new URL. All future events for that frame will use the updated
    * URL.
    */
  val onHistoryStateUpdated: firefoxDashWebextDashBrowserLib.browserNs.webNavigationNs._WebNavigationOnHistoryStateUpdatedEvent[js.Function1[/* details */ Anon_FrameIdProcessId, scala.Unit]]
  /**
    * Fired when the reference fragment of a frame was updated. All future events for that frame will use the updated
    * URL.
    */
  val onReferenceFragmentUpdated: firefoxDashWebextDashBrowserLib.browserNs.webNavigationNs._WebNavigationOnReferenceFragmentUpdatedEvent[js.Function1[/* details */ Anon_FrameIdProcessId, scala.Unit]]
  /** Fired when the contents of the tab is replaced by a different (usually previously pre-rendered) tab. */
  val onTabReplaced: WebExtEvent[js.Function1[/* details */ Anon_ReplacedTabId, scala.Unit]]
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

object Anon_DetailsGetAllFrames {
  @scala.inline
  def apply(
    getAllFrames: js.Function1[Anon_TabIdNumber, js.Promise[js.Array[Anon_ErrorOccurredFrameId]]],
    getFrame: js.Function1[Anon_FrameId, js.Promise[Anon_ErrorOccurred]],
    onBeforeNavigate: firefoxDashWebextDashBrowserLib.browserNs.webNavigationNs._WebNavigationOnBeforeNavigateEvent[js.Function1[/* details */ Anon_FrameIdParentFrameId, scala.Unit]],
    onCommitted: firefoxDashWebextDashBrowserLib.browserNs.webNavigationNs._WebNavigationOnCommittedEvent[js.Function1[/* details */ Anon_FrameIdProcessId, scala.Unit]],
    onCompleted: firefoxDashWebextDashBrowserLib.browserNs.webNavigationNs._WebNavigationOnCompletedEvent[js.Function1[/* details */ Anon_FrameIdProcessIdTabId, scala.Unit]],
    onCreatedNavigationTarget: firefoxDashWebextDashBrowserLib.browserNs.webNavigationNs._WebNavigationOnCreatedNavigationTargetEvent[js.Function1[/* details */ Anon_SourceFrameId, scala.Unit]],
    onDOMContentLoaded: firefoxDashWebextDashBrowserLib.browserNs.webNavigationNs._WebNavigationOnDOMContentLoadedEvent[js.Function1[/* details */ Anon_FrameIdProcessIdTabId, scala.Unit]],
    onErrorOccurred: firefoxDashWebextDashBrowserLib.browserNs.webNavigationNs._WebNavigationOnErrorOccurredEvent[js.Function1[/* details */ Anon_Error, scala.Unit]],
    onHistoryStateUpdated: firefoxDashWebextDashBrowserLib.browserNs.webNavigationNs._WebNavigationOnHistoryStateUpdatedEvent[js.Function1[/* details */ Anon_FrameIdProcessId, scala.Unit]],
    onReferenceFragmentUpdated: firefoxDashWebextDashBrowserLib.browserNs.webNavigationNs._WebNavigationOnReferenceFragmentUpdatedEvent[js.Function1[/* details */ Anon_FrameIdProcessId, scala.Unit]],
    onTabReplaced: WebExtEvent[js.Function1[/* details */ Anon_ReplacedTabId, scala.Unit]]
  ): Anon_DetailsGetAllFrames = {
    val __obj = js.Dynamic.literal(getAllFrames = getAllFrames, getFrame = getFrame, onBeforeNavigate = onBeforeNavigate, onCommitted = onCommitted, onCompleted = onCompleted, onCreatedNavigationTarget = onCreatedNavigationTarget, onDOMContentLoaded = onDOMContentLoaded, onErrorOccurred = onErrorOccurred, onHistoryStateUpdated = onHistoryStateUpdated, onReferenceFragmentUpdated = onReferenceFragmentUpdated, onTabReplaced = onTabReplaced)
  
    __obj.asInstanceOf[Anon_DetailsGetAllFrames]
  }
}


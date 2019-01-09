package typings
package firefoxDashWebextDashBrowserLib.browserNs.webNavigationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.webNavigation")
@js.native
object webNavigationNsMembers extends js.Object {
  /* webNavigation events */
  /** Fired when a navigation is about to occur. */
  val onBeforeNavigate: _WebNavigationOnBeforeNavigateEvent[
    js.Function1[
      /* details */ firefoxDashWebextDashBrowserLib.Anon_FrameIdParentFrameId, 
      scala.Unit
    ]
  ] = js.native
  /**
    * Fired when a navigation is committed. The document (and the resources it refers to, such as images and
    * subframes) might still be downloading, but at least part of the document has been received from the server and
    * the browser has decided to switch to the new document.
    */
  val onCommitted: _WebNavigationOnCommittedEvent[
    js.Function1[/* details */ firefoxDashWebextDashBrowserLib.Anon_FrameIdProcessId, scala.Unit]
  ] = js.native
  /** Fired when a document, including the resources it refers to, is completely loaded and initialized. */
  val onCompleted: _WebNavigationOnCompletedEvent[
    js.Function1[
      /* details */ firefoxDashWebextDashBrowserLib.Anon_FrameIdProcessIdTabId, 
      scala.Unit
    ]
  ] = js.native
  /** Fired when a new window, or a new tab in an existing window, is created to host a navigation. */
  val onCreatedNavigationTarget: _WebNavigationOnCreatedNavigationTargetEvent[
    js.Function1[/* details */ firefoxDashWebextDashBrowserLib.Anon_SourceFrameId, scala.Unit]
  ] = js.native
  /** Fired when the page's DOM is fully constructed, but the referenced resources may not finish loading. */
  val onDOMContentLoaded: _WebNavigationOnDOMContentLoadedEvent[
    js.Function1[
      /* details */ firefoxDashWebextDashBrowserLib.Anon_FrameIdProcessIdTabId, 
      scala.Unit
    ]
  ] = js.native
  /**
    * Fired when an error occurs and the navigation is aborted. This can happen if either a network error occurred, or
    * the user aborted the navigation.
    */
  val onErrorOccurred: _WebNavigationOnErrorOccurredEvent[
    js.Function1[/* details */ firefoxDashWebextDashBrowserLib.Anon_Error, scala.Unit]
  ] = js.native
  /**
    * Fired when the frame's history was updated to a new URL. All future events for that frame will use the updated
    * URL.
    */
  val onHistoryStateUpdated: _WebNavigationOnHistoryStateUpdatedEvent[
    js.Function1[/* details */ firefoxDashWebextDashBrowserLib.Anon_FrameIdProcessId, scala.Unit]
  ] = js.native
  /**
    * Fired when the reference fragment of a frame was updated. All future events for that frame will use the updated
    * URL.
    */
  val onReferenceFragmentUpdated: _WebNavigationOnReferenceFragmentUpdatedEvent[
    js.Function1[/* details */ firefoxDashWebextDashBrowserLib.Anon_FrameIdProcessId, scala.Unit]
  ] = js.native
  /** Fired when the contents of the tab is replaced by a different (usually previously pre-rendered) tab. */
  val onTabReplaced: firefoxDashWebextDashBrowserLib.WebExtEvent[
    js.Function1[/* details */ firefoxDashWebextDashBrowserLib.Anon_ReplacedTabId, scala.Unit]
  ] = js.native
  /**
    * Retrieves information about all frames of a given tab.
    * @param details Information about the tab to retrieve all frames from.
    */
  def getAllFrames(details: firefoxDashWebextDashBrowserLib.Anon_TabIdNumber): js.Promise[js.Array[firefoxDashWebextDashBrowserLib.Anon_ErrorOccurredFrameId]] = js.native
  /* webNavigation functions */
  /**
    * Retrieves information about the given frame. A frame refers to an <iframe> or a <frame> of a web page and is
    * identified by a tab ID and a frame ID.
    * @param details Information about the frame to retrieve information about.
    */
  def getFrame(details: firefoxDashWebextDashBrowserLib.Anon_FrameId): js.Promise[firefoxDashWebextDashBrowserLib.Anon_ErrorOccurred] = js.native
}


package typings.firefoxWebextBrowser

import typings.firefoxWebextBrowser.browser.webNavigation.WebNavigationOnBeforeNavigateEvent
import typings.firefoxWebextBrowser.browser.webNavigation.WebNavigationOnCommittedEvent
import typings.firefoxWebextBrowser.browser.webNavigation.WebNavigationOnCompletedEvent
import typings.firefoxWebextBrowser.browser.webNavigation.WebNavigationOnCreatedNavigationTargetEvent
import typings.firefoxWebextBrowser.browser.webNavigation.WebNavigationOnDOMContentLoadedEvent
import typings.firefoxWebextBrowser.browser.webNavigation.WebNavigationOnErrorOccurredEvent
import typings.firefoxWebextBrowser.browser.webNavigation.WebNavigationOnHistoryStateUpdatedEvent
import typings.firefoxWebextBrowser.browser.webNavigation.WebNavigationOnReferenceFragmentUpdatedEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofwebNavigation extends js.Object {
  /* webNavigation events */
  /** Fired when a navigation is about to occur. */
  val onBeforeNavigate: WebNavigationOnBeforeNavigateEvent[js.Function1[/* details */ AnonProcessId, Unit]]
  /**
    * Fired when a navigation is committed. The document (and the resources it refers to, such as images and
    * subframes) might still be downloading, but at least part of the document has been received from the server and
    * the browser has decided to switch to the new document.
    */
  val onCommitted: WebNavigationOnCommittedEvent[js.Function1[/* details */ AnonTimeStamp, Unit]]
  /** Fired when a document, including the resources it refers to, is completely loaded and initialized. */
  val onCompleted: WebNavigationOnCompletedEvent[js.Function1[/* details */ AnonUrl, Unit]]
  /** Fired when a new window, or a new tab in an existing window, is created to host a navigation. */
  val onCreatedNavigationTarget: WebNavigationOnCreatedNavigationTargetEvent[js.Function1[/* details */ AnonSourceFrameId, Unit]]
  /** Fired when the page's DOM is fully constructed, but the referenced resources may not finish loading. */
  val onDOMContentLoaded: WebNavigationOnDOMContentLoadedEvent[js.Function1[/* details */ AnonUrl, Unit]]
  /**
    * Fired when an error occurs and the navigation is aborted. This can happen if either a network error occurred, or
    * the user aborted the navigation.
    */
  val onErrorOccurred: WebNavigationOnErrorOccurredEvent[js.Function1[/* details */ AnonError, Unit]]
  /**
    * Fired when the frame's history was updated to a new URL. All future events for that frame will use the updated
    * URL.
    */
  val onHistoryStateUpdated: WebNavigationOnHistoryStateUpdatedEvent[js.Function1[/* details */ AnonTimeStamp, Unit]]
  /**
    * Fired when the reference fragment of a frame was updated. All future events for that frame will use the updated
    * URL.
    */
  val onReferenceFragmentUpdated: WebNavigationOnReferenceFragmentUpdatedEvent[js.Function1[/* details */ AnonTimeStamp, Unit]]
  /** Fired when the contents of the tab is replaced by a different (usually previously pre-rendered) tab. */
  val onTabReplaced: WebExtEvent[js.Function1[/* details */ AnonReplacedTabId, Unit]]
  /**
    * Retrieves information about all frames of a given tab.
    * @param details Information about the tab to retrieve all frames from.
    */
  def getAllFrames(details: AnonTabIdNumber): js.Promise[js.Array[AnonParentFrameId]]
  /* webNavigation functions */
  /**
    * Retrieves information about the given frame. A frame refers to an <iframe> or a <frame> of a web page and is
    * identified by a tab ID and a frame ID.
    * @param details Information about the frame to retrieve information about.
    */
  def getFrame(details: AnonFrameId): js.Promise[AnonErrorOccurred]
}

object TypeofwebNavigation {
  @scala.inline
  def apply(
    getAllFrames: AnonTabIdNumber => js.Promise[js.Array[AnonParentFrameId]],
    getFrame: AnonFrameId => js.Promise[AnonErrorOccurred],
    onBeforeNavigate: WebNavigationOnBeforeNavigateEvent[js.Function1[/* details */ AnonProcessId, Unit]],
    onCommitted: WebNavigationOnCommittedEvent[js.Function1[/* details */ AnonTimeStamp, Unit]],
    onCompleted: WebNavigationOnCompletedEvent[js.Function1[/* details */ AnonUrl, Unit]],
    onCreatedNavigationTarget: WebNavigationOnCreatedNavigationTargetEvent[js.Function1[/* details */ AnonSourceFrameId, Unit]],
    onDOMContentLoaded: WebNavigationOnDOMContentLoadedEvent[js.Function1[/* details */ AnonUrl, Unit]],
    onErrorOccurred: WebNavigationOnErrorOccurredEvent[js.Function1[/* details */ AnonError, Unit]],
    onHistoryStateUpdated: WebNavigationOnHistoryStateUpdatedEvent[js.Function1[/* details */ AnonTimeStamp, Unit]],
    onReferenceFragmentUpdated: WebNavigationOnReferenceFragmentUpdatedEvent[js.Function1[/* details */ AnonTimeStamp, Unit]],
    onTabReplaced: WebExtEvent[js.Function1[/* details */ AnonReplacedTabId, Unit]]
  ): TypeofwebNavigation = {
    val __obj = js.Dynamic.literal(getAllFrames = js.Any.fromFunction1(getAllFrames), getFrame = js.Any.fromFunction1(getFrame), onBeforeNavigate = onBeforeNavigate.asInstanceOf[js.Any], onCommitted = onCommitted.asInstanceOf[js.Any], onCompleted = onCompleted.asInstanceOf[js.Any], onCreatedNavigationTarget = onCreatedNavigationTarget.asInstanceOf[js.Any], onDOMContentLoaded = onDOMContentLoaded.asInstanceOf[js.Any], onErrorOccurred = onErrorOccurred.asInstanceOf[js.Any], onHistoryStateUpdated = onHistoryStateUpdated.asInstanceOf[js.Any], onReferenceFragmentUpdated = onReferenceFragmentUpdated.asInstanceOf[js.Any], onTabReplaced = onTabReplaced.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofwebNavigation]
  }
}


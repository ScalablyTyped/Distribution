package typings.firefoxWebextBrowser.anon

import typings.firefoxWebextBrowser.WebExtEvent
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

@js.native
trait TypeofwebNavigation extends js.Object {
  /* webNavigation events */
  /** Fired when a navigation is about to occur. */
  val onBeforeNavigate: WebNavigationOnBeforeNavigateEvent[js.Function1[/* details */ ProcessId, Unit]] = js.native
  /**
    * Fired when a navigation is committed. The document (and the resources it refers to, such as images and
    * subframes) might still be downloading, but at least part of the document has been received from the server and
    * the browser has decided to switch to the new document.
    */
  val onCommitted: WebNavigationOnCommittedEvent[js.Function1[/* details */ TimeStamp, Unit]] = js.native
  /** Fired when a document, including the resources it refers to, is completely loaded and initialized. */
  val onCompleted: WebNavigationOnCompletedEvent[js.Function1[/* details */ Url, Unit]] = js.native
  /** Fired when a new window, or a new tab in an existing window, is created to host a navigation. */
  val onCreatedNavigationTarget: WebNavigationOnCreatedNavigationTargetEvent[js.Function1[/* details */ SourceFrameId, Unit]] = js.native
  /** Fired when the page's DOM is fully constructed, but the referenced resources may not finish loading. */
  val onDOMContentLoaded: WebNavigationOnDOMContentLoadedEvent[js.Function1[/* details */ Url, Unit]] = js.native
  /**
    * Fired when an error occurs and the navigation is aborted. This can happen if either a network error occurred, or
    * the user aborted the navigation.
    */
  val onErrorOccurred: WebNavigationOnErrorOccurredEvent[js.Function1[/* details */ Error, Unit]] = js.native
  /**
    * Fired when the frame's history was updated to a new URL. All future events for that frame will use the updated
    * URL.
    */
  val onHistoryStateUpdated: WebNavigationOnHistoryStateUpdatedEvent[js.Function1[/* details */ TimeStamp, Unit]] = js.native
  /**
    * Fired when the reference fragment of a frame was updated. All future events for that frame will use the updated
    * URL.
    */
  val onReferenceFragmentUpdated: WebNavigationOnReferenceFragmentUpdatedEvent[js.Function1[/* details */ TimeStamp, Unit]] = js.native
  /** Fired when the contents of the tab is replaced by a different (usually previously pre-rendered) tab. */
  val onTabReplaced: WebExtEvent[js.Function1[/* details */ ReplacedTabId, Unit]] = js.native
  /**
    * Retrieves information about all frames of a given tab.
    * @param details Information about the tab to retrieve all frames from.
    */
  def getAllFrames(details: TabIdNumber): js.Promise[js.Array[ParentFrameId]] = js.native
  /* webNavigation functions */
  /**
    * Retrieves information about the given frame. A frame refers to an <iframe> or a <frame> of a web page and is
    * identified by a tab ID and a frame ID.
    * @param details Information about the frame to retrieve information about.
    */
  def getFrame(details: FrameId): js.Promise[ErrorOccurred] = js.native
}

object TypeofwebNavigation {
  @scala.inline
  def apply(
    getAllFrames: TabIdNumber => js.Promise[js.Array[ParentFrameId]],
    getFrame: FrameId => js.Promise[ErrorOccurred],
    onBeforeNavigate: WebNavigationOnBeforeNavigateEvent[js.Function1[/* details */ ProcessId, Unit]],
    onCommitted: WebNavigationOnCommittedEvent[js.Function1[/* details */ TimeStamp, Unit]],
    onCompleted: WebNavigationOnCompletedEvent[js.Function1[/* details */ Url, Unit]],
    onCreatedNavigationTarget: WebNavigationOnCreatedNavigationTargetEvent[js.Function1[/* details */ SourceFrameId, Unit]],
    onDOMContentLoaded: WebNavigationOnDOMContentLoadedEvent[js.Function1[/* details */ Url, Unit]],
    onErrorOccurred: WebNavigationOnErrorOccurredEvent[js.Function1[/* details */ Error, Unit]],
    onHistoryStateUpdated: WebNavigationOnHistoryStateUpdatedEvent[js.Function1[/* details */ TimeStamp, Unit]],
    onReferenceFragmentUpdated: WebNavigationOnReferenceFragmentUpdatedEvent[js.Function1[/* details */ TimeStamp, Unit]],
    onTabReplaced: WebExtEvent[js.Function1[/* details */ ReplacedTabId, Unit]]
  ): TypeofwebNavigation = {
    val __obj = js.Dynamic.literal(getAllFrames = js.Any.fromFunction1(getAllFrames), getFrame = js.Any.fromFunction1(getFrame), onBeforeNavigate = onBeforeNavigate.asInstanceOf[js.Any], onCommitted = onCommitted.asInstanceOf[js.Any], onCompleted = onCompleted.asInstanceOf[js.Any], onCreatedNavigationTarget = onCreatedNavigationTarget.asInstanceOf[js.Any], onDOMContentLoaded = onDOMContentLoaded.asInstanceOf[js.Any], onErrorOccurred = onErrorOccurred.asInstanceOf[js.Any], onHistoryStateUpdated = onHistoryStateUpdated.asInstanceOf[js.Any], onReferenceFragmentUpdated = onReferenceFragmentUpdated.asInstanceOf[js.Any], onTabReplaced = onTabReplaced.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofwebNavigation]
  }
  @scala.inline
  implicit class TypeofwebNavigationOps[Self <: TypeofwebNavigation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetAllFrames(value: TabIdNumber => js.Promise[js.Array[ParentFrameId]]): Self = this.set("getAllFrames", js.Any.fromFunction1(value))
    @scala.inline
    def setGetFrame(value: FrameId => js.Promise[ErrorOccurred]): Self = this.set("getFrame", js.Any.fromFunction1(value))
    @scala.inline
    def setOnBeforeNavigate(value: WebNavigationOnBeforeNavigateEvent[js.Function1[/* details */ ProcessId, Unit]]): Self = this.set("onBeforeNavigate", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnCommitted(value: WebNavigationOnCommittedEvent[js.Function1[/* details */ TimeStamp, Unit]]): Self = this.set("onCommitted", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnCompleted(value: WebNavigationOnCompletedEvent[js.Function1[/* details */ Url, Unit]]): Self = this.set("onCompleted", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnCreatedNavigationTarget(
      value: WebNavigationOnCreatedNavigationTargetEvent[js.Function1[/* details */ SourceFrameId, Unit]]
    ): Self = this.set("onCreatedNavigationTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnDOMContentLoaded(value: WebNavigationOnDOMContentLoadedEvent[js.Function1[/* details */ Url, Unit]]): Self = this.set("onDOMContentLoaded", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnErrorOccurred(value: WebNavigationOnErrorOccurredEvent[js.Function1[/* details */ Error, Unit]]): Self = this.set("onErrorOccurred", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnHistoryStateUpdated(value: WebNavigationOnHistoryStateUpdatedEvent[js.Function1[/* details */ TimeStamp, Unit]]): Self = this.set("onHistoryStateUpdated", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnReferenceFragmentUpdated(value: WebNavigationOnReferenceFragmentUpdatedEvent[js.Function1[/* details */ TimeStamp, Unit]]): Self = this.set("onReferenceFragmentUpdated", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnTabReplaced(value: WebExtEvent[js.Function1[/* details */ ReplacedTabId, Unit]]): Self = this.set("onTabReplaced", value.asInstanceOf[js.Any])
  }
  
}


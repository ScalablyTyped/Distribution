package typings.firefoxWebextBrowser.browser.webNavigation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnReferenceFragmentUpdatedDetails extends js.Object {
  
  /**
    * 0 indicates the navigation happens in the tab content window; a positive value indicates navigation in a subframe. Frame IDs are unique within a tab.
    */
  var frameId: Double = js.native
  
  /**
    * The ID of the process runs the renderer for this tab.
    * @deprecated Unsupported on Firefox at this time.
    */
  var processId: js.UndefOr[Double] = js.native
  
  /** The ID of the tab in which the navigation occurs. */
  var tabId: Double = js.native
  
  /** The time when the navigation was committed, in milliseconds since the epoch. */
  var timeStamp: Double = js.native
  
  /**
    * A list of transition qualifiers.
    * @deprecated Unsupported on Firefox at this time.
    */
  var transitionQualifiers: js.UndefOr[js.Array[TransitionQualifier]] = js.native
  
  /**
    * Cause of the navigation.
    * @deprecated Unsupported on Firefox at this time.
    */
  var transitionType: js.UndefOr[TransitionType] = js.native
  
  var url: String = js.native
}
object OnReferenceFragmentUpdatedDetails {
  
  @scala.inline
  def apply(frameId: Double, tabId: Double, timeStamp: Double, url: String): OnReferenceFragmentUpdatedDetails = {
    val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnReferenceFragmentUpdatedDetails]
  }
  
  @scala.inline
  implicit class OnReferenceFragmentUpdatedDetailsOps[Self <: OnReferenceFragmentUpdatedDetails] (val x: Self) extends AnyVal {
    
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
    def setFrameId(value: Double): Self = this.set("frameId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabId(value: Double): Self = this.set("tabId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeStamp(value: Double): Self = this.set("timeStamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessId(value: Double): Self = this.set("processId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcessId: Self = this.set("processId", js.undefined)
    
    @scala.inline
    def setTransitionQualifiersVarargs(value: TransitionQualifier*): Self = this.set("transitionQualifiers", js.Array(value :_*))
    
    @scala.inline
    def setTransitionQualifiers(value: js.Array[TransitionQualifier]): Self = this.set("transitionQualifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitionQualifiers: Self = this.set("transitionQualifiers", js.undefined)
    
    @scala.inline
    def setTransitionType(value: TransitionType): Self = this.set("transitionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitionType: Self = this.set("transitionType", js.undefined)
  }
}

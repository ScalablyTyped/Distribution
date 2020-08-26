package typings.devtoolsProtocol.mod.Protocol.Page

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigateRequest extends js.Object {
  /**
    * Frame id to navigate, if not specified navigates the top frame.
    */
  var frameId: js.UndefOr[FrameId] = js.native
  /**
    * Referrer URL.
    */
  var referrer: js.UndefOr[String] = js.native
  /**
    * Referrer-policy used for the navigation.
    */
  var referrerPolicy: js.UndefOr[ReferrerPolicy] = js.native
  /**
    * Intended transition type.
    */
  var transitionType: js.UndefOr[TransitionType] = js.native
  /**
    * URL to navigate the page to.
    */
  var url: String = js.native
}

object NavigateRequest {
  @scala.inline
  def apply(url: String): NavigateRequest = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigateRequest]
  }
  @scala.inline
  implicit class NavigateRequestOps[Self <: NavigateRequest] (val x: Self) extends AnyVal {
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
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrameId(value: FrameId): Self = this.set("frameId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrameId: Self = this.set("frameId", js.undefined)
    @scala.inline
    def setReferrer(value: String): Self = this.set("referrer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferrer: Self = this.set("referrer", js.undefined)
    @scala.inline
    def setReferrerPolicy(value: ReferrerPolicy): Self = this.set("referrerPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferrerPolicy: Self = this.set("referrerPolicy", js.undefined)
    @scala.inline
    def setTransitionType(value: TransitionType): Self = this.set("transitionType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitionType: Self = this.set("transitionType", js.undefined)
  }
  
}


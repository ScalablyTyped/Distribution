package typings.gapiClientFirebasedynamiclinks.gapi.client.firebasedynamiclinks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateShortDynamicLinkRequest extends js.Object {
  /**
    * Information about the Dynamic Link to be shortened.
    * [Learn more](https://firebase.google.com/docs/dynamic-links/android#create-a-dynamic-link-programmatically).
    */
  var dynamicLinkInfo: js.UndefOr[DynamicLinkInfo] = js.native
  /**
    * Full long Dynamic Link URL with desired query parameters specified.
    * For example,
    * "https://sample.app.goo.gl/?link=http://www.google.com&apn=com.sample",
    * [Learn more](https://firebase.google.com/docs/dynamic-links/android#create-a-dynamic-link-programmatically).
    */
  var longDynamicLink: js.UndefOr[String] = js.native
  /** Short Dynamic Link suffix. Optional. */
  var suffix: js.UndefOr[Suffix] = js.native
}

object CreateShortDynamicLinkRequest {
  @scala.inline
  def apply(): CreateShortDynamicLinkRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateShortDynamicLinkRequest]
  }
  @scala.inline
  implicit class CreateShortDynamicLinkRequestOps[Self <: CreateShortDynamicLinkRequest] (val x: Self) extends AnyVal {
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
    def setDynamicLinkInfo(value: DynamicLinkInfo): Self = this.set("dynamicLinkInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDynamicLinkInfo: Self = this.set("dynamicLinkInfo", js.undefined)
    @scala.inline
    def setLongDynamicLink(value: String): Self = this.set("longDynamicLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLongDynamicLink: Self = this.set("longDynamicLink", js.undefined)
    @scala.inline
    def setSuffix(value: Suffix): Self = this.set("suffix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuffix: Self = this.set("suffix", js.undefined)
  }
  
}


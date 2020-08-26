package typings.gapiClientFirebasedynamiclinks.gapi.client.firebasedynamiclinks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DynamicLinkInfo extends js.Object {
  /**
    * Parameters used for tracking. See all tracking parameters in the
    * [documentation](https://firebase.google.com/docs/dynamic-links/create-manually).
    */
  var analyticsInfo: js.UndefOr[AnalyticsInfo] = js.native
  /**
    * Android related information. See Android related parameters in the
    * [documentation](https://firebase.google.com/docs/dynamic-links/create-manually).
    */
  var androidInfo: js.UndefOr[AndroidInfo] = js.native
  /**
    * Dynamic Links domain that the project owns, e.g. abcd.app.goo.gl
    * [Learn more](https://firebase.google.com/docs/dynamic-links/android/receive)
    * on how to set up Dynamic Link domain associated with your Firebase project.
    *
    * Required.
    */
  var dynamicLinkDomain: js.UndefOr[String] = js.native
  /**
    * iOS related information. See iOS related parameters in the
    * [documentation](https://firebase.google.com/docs/dynamic-links/create-manually).
    */
  var iosInfo: js.UndefOr[IosInfo] = js.native
  /**
    * The link your app will open, You can specify any URL your app can handle.
    * This link must be a well-formatted URL, be properly URL-encoded, and use
    * the HTTP or HTTPS scheme. See 'link' parameters in the
    * [documentation](https://firebase.google.com/docs/dynamic-links/create-manually).
    *
    * Required.
    */
  var link: js.UndefOr[String] = js.native
  /** Information of navigation behavior of a Firebase Dynamic Links. */
  var navigationInfo: js.UndefOr[NavigationInfo] = js.native
  /**
    * Parameters for social meta tag params.
    * Used to set meta tag data for link previews on social sites.
    */
  var socialMetaTagInfo: js.UndefOr[SocialMetaTagInfo] = js.native
}

object DynamicLinkInfo {
  @scala.inline
  def apply(): DynamicLinkInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DynamicLinkInfo]
  }
  @scala.inline
  implicit class DynamicLinkInfoOps[Self <: DynamicLinkInfo] (val x: Self) extends AnyVal {
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
    def setAnalyticsInfo(value: AnalyticsInfo): Self = this.set("analyticsInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnalyticsInfo: Self = this.set("analyticsInfo", js.undefined)
    @scala.inline
    def setAndroidInfo(value: AndroidInfo): Self = this.set("androidInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAndroidInfo: Self = this.set("androidInfo", js.undefined)
    @scala.inline
    def setDynamicLinkDomain(value: String): Self = this.set("dynamicLinkDomain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDynamicLinkDomain: Self = this.set("dynamicLinkDomain", js.undefined)
    @scala.inline
    def setIosInfo(value: IosInfo): Self = this.set("iosInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIosInfo: Self = this.set("iosInfo", js.undefined)
    @scala.inline
    def setLink(value: String): Self = this.set("link", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLink: Self = this.set("link", js.undefined)
    @scala.inline
    def setNavigationInfo(value: NavigationInfo): Self = this.set("navigationInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavigationInfo: Self = this.set("navigationInfo", js.undefined)
    @scala.inline
    def setSocialMetaTagInfo(value: SocialMetaTagInfo): Self = this.set("socialMetaTagInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSocialMetaTagInfo: Self = this.set("socialMetaTagInfo", js.undefined)
  }
  
}


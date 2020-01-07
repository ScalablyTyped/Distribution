package typings.googleapis.buildSrcApisFirebasedynamiclinksV1Mod.firebasedynamiclinks_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about a Dynamic Link.
  */
@js.native
trait Schema$DynamicLinkInfo extends js.Object {
  /**
    * Parameters used for tracking. See all tracking parameters in the
    * [documentation](https://firebase.google.com/docs/dynamic-links/create-manually).
    */
  var analyticsInfo: js.UndefOr[Schema$AnalyticsInfo] = js.native
  /**
    * Android related information. See Android related parameters in the
    * [documentation](https://firebase.google.com/docs/dynamic-links/create-manually).
    */
  var androidInfo: js.UndefOr[Schema$AndroidInfo] = js.native
  /**
    * Desktop related information. See desktop related parameters in the
    * [documentation](https://firebase.google.com/docs/dynamic-links/create-manually).
    */
  var desktopInfo: js.UndefOr[Schema$DesktopInfo] = js.native
  /**
    * E.g. https://maps.app.goo.gl, https://maps.page.link, https://g.co/maps
    * More examples can be found in description of getNormalizedUriPrefix in
    * j/c/g/firebase/dynamiclinks/uri/DdlDomain.java  Will fallback to
    * dynamic_link_domain is this field is missing
    */
  var domainUriPrefix: js.UndefOr[String] = js.native
  /**
    * Dynamic Links domain that the project owns, e.g. abcd.app.goo.gl [Learn
    * more](https://firebase.google.com/docs/dynamic-links/android/receive) on
    * how to set up Dynamic Link domain associated with your Firebase project.
    * Required if missing domain_uri_prefix.
    */
  var dynamicLinkDomain: js.UndefOr[String] = js.native
  /**
    * iOS related information. See iOS related parameters in the
    * [documentation](https://firebase.google.com/docs/dynamic-links/create-manually).
    */
  var iosInfo: js.UndefOr[Schema$IosInfo] = js.native
  /**
    * The link your app will open, You can specify any URL your app can handle.
    * This link must be a well-formatted URL, be properly URL-encoded, and use
    * the HTTP or HTTPS scheme. See &#39;link&#39; parameters in the
    * [documentation](https://firebase.google.com/docs/dynamic-links/create-manually).
    * Required.
    */
  var link: js.UndefOr[String] = js.native
  /**
    * Information of navigation behavior of a Firebase Dynamic Links.
    */
  var navigationInfo: js.UndefOr[Schema$NavigationInfo] = js.native
  /**
    * Parameters for social meta tag params. Used to set meta tag data for link
    * previews on social sites.
    */
  var socialMetaTagInfo: js.UndefOr[Schema$SocialMetaTagInfo] = js.native
}

object Schema$DynamicLinkInfo {
  @scala.inline
  def apply(
    analyticsInfo: Schema$AnalyticsInfo = null,
    androidInfo: Schema$AndroidInfo = null,
    desktopInfo: Schema$DesktopInfo = null,
    domainUriPrefix: String = null,
    dynamicLinkDomain: String = null,
    iosInfo: Schema$IosInfo = null,
    link: String = null,
    navigationInfo: Schema$NavigationInfo = null,
    socialMetaTagInfo: Schema$SocialMetaTagInfo = null
  ): Schema$DynamicLinkInfo = {
    val __obj = js.Dynamic.literal()
    if (analyticsInfo != null) __obj.updateDynamic("analyticsInfo")(analyticsInfo.asInstanceOf[js.Any])
    if (androidInfo != null) __obj.updateDynamic("androidInfo")(androidInfo.asInstanceOf[js.Any])
    if (desktopInfo != null) __obj.updateDynamic("desktopInfo")(desktopInfo.asInstanceOf[js.Any])
    if (domainUriPrefix != null) __obj.updateDynamic("domainUriPrefix")(domainUriPrefix.asInstanceOf[js.Any])
    if (dynamicLinkDomain != null) __obj.updateDynamic("dynamicLinkDomain")(dynamicLinkDomain.asInstanceOf[js.Any])
    if (iosInfo != null) __obj.updateDynamic("iosInfo")(iosInfo.asInstanceOf[js.Any])
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (navigationInfo != null) __obj.updateDynamic("navigationInfo")(navigationInfo.asInstanceOf[js.Any])
    if (socialMetaTagInfo != null) __obj.updateDynamic("socialMetaTagInfo")(socialMetaTagInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DynamicLinkInfo]
  }
}


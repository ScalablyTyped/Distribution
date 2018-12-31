package typings
package gapiDotClientDotFirebasedynamiclinksLib.gapiNs.clientNs.firebasedynamiclinksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DynamicLinkInfo extends js.Object {
  /**
    * Parameters used for tracking. See all tracking parameters in the
    * [documentation](https://firebase.google.com/docs/dynamic-links/create-manually).
    */
  var analyticsInfo: js.UndefOr[AnalyticsInfo] = js.undefined
  /**
    * Android related information. See Android related parameters in the
    * [documentation](https://firebase.google.com/docs/dynamic-links/create-manually).
    */
  var androidInfo: js.UndefOr[AndroidInfo] = js.undefined
  /**
    * Dynamic Links domain that the project owns, e.g. abcd.app.goo.gl
    * [Learn more](https://firebase.google.com/docs/dynamic-links/android/receive)
    * on how to set up Dynamic Link domain associated with your Firebase project.
    *
    * Required.
    */
  var dynamicLinkDomain: js.UndefOr[java.lang.String] = js.undefined
  /**
    * iOS related information. See iOS related parameters in the
    * [documentation](https://firebase.google.com/docs/dynamic-links/create-manually).
    */
  var iosInfo: js.UndefOr[IosInfo] = js.undefined
  /**
    * The link your app will open, You can specify any URL your app can handle.
    * This link must be a well-formatted URL, be properly URL-encoded, and use
    * the HTTP or HTTPS scheme. See 'link' parameters in the
    * [documentation](https://firebase.google.com/docs/dynamic-links/create-manually).
    *
    * Required.
    */
  var link: js.UndefOr[java.lang.String] = js.undefined
  /** Information of navigation behavior of a Firebase Dynamic Links. */
  var navigationInfo: js.UndefOr[NavigationInfo] = js.undefined
  /**
    * Parameters for social meta tag params.
    * Used to set meta tag data for link previews on social sites.
    */
  var socialMetaTagInfo: js.UndefOr[SocialMetaTagInfo] = js.undefined
}


package typings
package gapiDotClientDotFirebasedynamiclinksLib.gapiNs.clientNs.firebasedynamiclinksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GetIosPostInstallAttributionResponse extends js.Object {
  /**
               * The minimum version for app, specified by dev through ?imv= parameter.
               * Return to iSDK to allow app to evaluate if current version meets this.
               */
  var appMinimumVersion: js.UndefOr[java.lang.String] = js.undefined
  /** The confidence of the returned attribution. */
  var attributionConfidence: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The deep-link attributed post-install via one of several techniques
               * (fingerprint, copy unique).
               */
  var deepLink: js.UndefOr[java.lang.String] = js.undefined
  /**
               * User-agent specific custom-scheme URIs for iSDK to open. This will be set
               * according to the user-agent tha the click was originally made in. There is
               * no Safari-equivalent custom-scheme open URLs.
               * ie: googlechrome://www.example.com
               * ie: firefox://open-url?url=http://www.example.com
               * ie: opera-http://example.com
               */
  var externalBrowserDestinationLink: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The link to navigate to update the app if min version is not met.
               * This is either (in order): 1) fallback link (from ?ifl= parameter, if
               * specified by developer) or 2) AppStore URL (from ?isi= parameter, if
               * specified), or 3) the payload link (from required link= parameter).
               */
  var fallbackLink: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Invitation ID attributed post-install via one of several techniques
               * (fingerprint, copy unique).
               */
  var invitationId: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Instruction for iSDK to attemmpt to perform strong match. For instance,
               * if browser does not support/allow cookie or outside of support browsers,
               * this will be false.
               */
  var isStrongMatchExecutable: js.UndefOr[scala.Boolean] = js.undefined
  /**
               * Describes why match failed, ie: "discarded due to low confidence".
               * This message will be publicly visible.
               */
  var matchMessage: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Entire FDL (short or long) attributed post-install via one of several
               * techniques (fingerprint, copy unique).
               */
  var requestedLink: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The entire FDL, expanded from a short link. It is the same as the
               * requested_link, if it is long. Parameters from this should not be
               * used directly (ie: server can default utm_[campaign|medium|source]
               * to a value when requested_link lack them, server determine the best
               * fallback_link when requested_link specifies >1 fallback links).
               */
  var resolvedLink: js.UndefOr[java.lang.String] = js.undefined
  /** Scion campaign value to be propagated by iSDK to Scion at post-install. */
  var utmCampaign: js.UndefOr[java.lang.String] = js.undefined
  /** Scion medium value to be propagated by iSDK to Scion at post-install. */
  var utmMedium: js.UndefOr[java.lang.String] = js.undefined
  /** Scion source value to be propagated by iSDK to Scion at post-install. */
  var utmSource: js.UndefOr[java.lang.String] = js.undefined
}


package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Browser extends js.Object {
  /** ID referring to this grouping of browser and version numbers. This is the ID used for targeting. */
  var browserVersionId: js.UndefOr[java.lang.String] = js.undefined
  /** DART ID of this browser. This is the ID used when generating reports. */
  var dartId: js.UndefOr[java.lang.String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#browser". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Major version number (leftmost number) of this browser. For example, for Chrome 5.0.376.86 beta, this field should be set to 5. An asterisk (&#42;) may be
               * used to target any version number, and a question mark (?) may be used to target cases where the version number cannot be identified. For example,
               * Chrome &#42;.&#42; targets any version of Chrome: 1.2, 2.5, 3.5, and so on. Chrome 3.&#42; targets Chrome 3.1, 3.5, but not 4.0. Firefox ?.? targets cases where
               * the ad server knows the browser is Firefox but can't tell which version it is.
               */
  var majorVersion: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Minor version number (number after first dot on left) of this browser. For example, for Chrome 5.0.375.86 beta, this field should be set to 0. An
               * asterisk (&#42;) may be used to target any version number, and a question mark (?) may be used to target cases where the version number cannot be
               * identified. For example, Chrome &#42;.&#42; targets any version of Chrome: 1.2, 2.5, 3.5, and so on. Chrome 3.&#42; targets Chrome 3.1, 3.5, but not 4.0. Firefox
               * ?.? targets cases where the ad server knows the browser is Firefox but can't tell which version it is.
               */
  var minorVersion: js.UndefOr[java.lang.String] = js.undefined
  /** Name of this browser. */
  var name: js.UndefOr[java.lang.String] = js.undefined
}


package typings
package firefoxDashWebextDashBrowserLib.browserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object underscoreManifestNs {
  type ExtensionFileUrl = java.lang.String
  type ExtensionID = java.lang.String
  type ExtensionURL = java.lang.String
  type HttpURL = java.lang.String
  type IconImageData = org.scalablytyped.runtime.NumberDictionary[ImageData] | ImageData
  type IconPath = org.scalablytyped.runtime.NumberDictionary[ExtensionFileUrl] | ExtensionFileUrl
  type ImageData = js.Any
  type ImageDataOrExtensionURL = java.lang.String
  type KeyName = java.lang.String
  type MatchPattern = MatchPatternRestricted | MatchPatternUnestricted | _MatchPattern
  /** Same as MatchPattern above, but excludes<all_urls></all_urls> */
  type MatchPatternRestricted = java.lang.String
  /**
    * Mostly unrestricted match patterns for privileged add-ons. This should technically be rejected for unprivileged
    * add-ons, but, reasons. The MatchPattern class will still refuse privileged schemes for those extensions.
    */
  type MatchPatternUnestricted = java.lang.String
  /* _manifest types */
  type OptionalPermission = _OptionalPermission
  type OptionalPermissionOrOrigin = OptionalPermission | MatchPattern
  type Permission = java.lang.String | OptionalPermission | _Permission
  type PermissionOrOrigin = Permission | MatchPattern
  /** @deprecated Event pages are not currently supported. This will run as a persistent background page. */
  type PersistentBackgroundProperty = scala.Boolean
  type ThemeColor = java.lang.String | (js.Tuple3[scala.Double, scala.Double, scala.Double]) | (js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double])
  /** @deprecated An unexpected property was found in the WebExtension manifest. */
  type UnrecognizedProperty = js.Any
  type _MatchPattern = firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.`<all_urls>`
}

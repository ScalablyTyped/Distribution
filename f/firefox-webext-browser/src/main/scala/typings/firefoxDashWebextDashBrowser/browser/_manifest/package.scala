package typings.firefoxDashWebextDashBrowser.browser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object _manifest {
  import org.scalablytyped.runtime.NumberDictionary
  import typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.Lessthansignall_urlsGreaterthansign

  type ExtensionFileUrl = String
  type ExtensionID = String
  type ExtensionURL = String
  type HttpURL = String
  type IconImageData = NumberDictionary[ImageData] | ImageData
  type IconPath = NumberDictionary[ExtensionFileUrl] | ExtensionFileUrl
  type ImageData = js.Any
  type ImageDataOrExtensionURL = String
  type KeyName = String
  type MatchPattern = MatchPatternRestricted | MatchPatternUnestricted | _MatchPattern
  /** Same as MatchPattern above, but excludes<all_urls></all_urls> */
  type MatchPatternRestricted = String
  /**
    * Mostly unrestricted match patterns for privileged add-ons. This should technically be rejected for unprivileged
    * add-ons, but, reasons. The MatchPattern class will still refuse privileged schemes for those extensions.
    */
  type MatchPatternUnestricted = String
  type OptionalPermission = _OptionalPermission
  type OptionalPermissionOrOrigin = OptionalPermission | MatchPattern
  /* _manifest types */
  type Permission = String | OptionalPermission | _Permission
  type PermissionOrOrigin = Permission | MatchPattern
  /** @deprecated Event pages are not currently supported. This will run as a persistent background page. */
  type PersistentBackgroundProperty = Boolean
  type ThemeColor = String | (js.Tuple3[Double, Double, Double]) | (js.Tuple4[Double, Double, Double, Double])
  /** @deprecated An unexpected property was found in the WebExtension manifest. */
  type UnrecognizedProperty = js.Any
  type _MatchPattern = Lessthansignall_urlsGreaterthansign
}

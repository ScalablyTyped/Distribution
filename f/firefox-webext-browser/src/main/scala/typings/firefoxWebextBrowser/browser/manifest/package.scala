package typings.firefoxWebextBrowser.browser.manifest

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.firefoxWebextBrowser.anon.Basepath
import typings.firefoxWebextBrowser.anon.Chromeresources
import typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.Lessthansignall_urlsGreaterthansign
import typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.declarativeNetRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ExtensionFileUrl = String

type ExtensionID = String

type ExtensionURL = String

type HttpURL = String

type IconImageData = NumberDictionary[ImageData] | ImageData

type IconPath = NumberDictionary[ExtensionFileUrl] | ExtensionFileUrl

type ImageData = Any

type ImageDataOrExtensionURL = String

type KeyName = String

type MatchPattern = MatchPatternRestricted | MatchPatternUnestricted | Lessthansignall_urlsGreaterthansign

/** Same as MatchPattern above, but excludes<all_urls></all_urls> */
type MatchPatternRestricted = String

/**
  * Mostly unrestricted match patterns for privileged add-ons. This should technically be rejected for unprivileged add-ons, but, reasons. The MatchPattern class will still refuse privileged schemes for those extensions.
  */
type MatchPatternUnestricted = String

type OptionalPermission = OptionalPermissionNoPrompt | _OptionalPermission

type OptionalPermissionNoPrompt = _OptionalPermissionNoPrompt

type OptionalPermissionOrOrigin = OptionalPermission | MatchPattern

type Permission = String | PermissionNoPrompt | OptionalPermission | declarativeNetRequest

type PermissionNoPrompt = OptionalPermissionNoPrompt | PermissionPrivileged | _PermissionNoPrompt

type PermissionOrOrigin = Permission | MatchPattern

/* _manifest types */
type PermissionPrivileged = _PermissionPrivileged

type SitePermission = _SitePermission

type ThemeColor = String | (js.Tuple3[Double, Double, Double]) | (js.Tuple4[Double, Double, Double, Double])

type ThemeManifestIcons = NumberDictionary[String]

type UndefinedChromeResources = StringDictionary[ExtensionURL | StringDictionary[ExtensionURL]]

/** @deprecated An unexpected property was found in the WebExtension manifest. */
type UnrecognizedProperty = Any

type WebExtensionDictionaryManifestDictionaries = StringDictionary[String]

type WebExtensionLangpackManifestLanguages = StringDictionary[Chromeresources]

type WebExtensionLangpackManifestSources = StringDictionary[Basepath]

type WebExtensionManifestIcons = NumberDictionary[ExtensionFileUrl]

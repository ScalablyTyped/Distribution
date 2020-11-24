package typings.firefoxWebextBrowser.browser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object webRequest {
  
  /**
    * An array of HTTP headers. Each header is represented as a dictionary containing the keys `name` and either `value` or `binaryValue`.
    */
  type HttpHeaders = js.Array[typings.firefoxWebextBrowser.browser.webRequest._HttpHeaders]
  
  type OnBeforeRedirectOptions = typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.responseHeaders
  
  type OnCompletedOptions = typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.responseHeaders
  
  type OnResponseStartedOptions = typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.responseHeaders
  
  type OnSendHeadersOptions = typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.requestHeaders
  
  type TransportWeaknessReasons = typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.cipher
  
  /** If the request has been classified this is an array of `UrlClassificationFlags`. */
  type UrlClassificationParty = js.Array[typings.firefoxWebextBrowser.browser.webRequest.UrlClassificationFlags]
}

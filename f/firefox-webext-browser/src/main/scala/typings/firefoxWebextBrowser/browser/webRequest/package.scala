package typings.firefoxWebextBrowser.browser.webRequest

import typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.cipher
import typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.requestHeaders
import typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.responseHeaders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * An array of HTTP headers. Each header is represented as a dictionary containing the keys `name` and either `value` or `binaryValue`.
  */
type HttpHeaders = js.Array[_HttpHeaders]

type OnBeforeRedirectOptions = responseHeaders

type OnCompletedOptions = responseHeaders

type OnResponseStartedOptions = responseHeaders

type OnSendHeadersOptions = requestHeaders

type TransportWeaknessReasons = cipher

/** If the request has been classified this is an array of `UrlClassificationFlags`. */
type UrlClassificationParty = js.Array[UrlClassificationFlags]

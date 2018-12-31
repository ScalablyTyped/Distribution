package typings
package firefoxDashWebextDashBrowserLib.browserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object webRequestNs {
  type CertificateTransparencyStatus = firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.not_applicable | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.policy_compliant | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.policy_not_enough_scts | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.policy_not_diverse_scts
  /**
    * An array of HTTP headers. Each header is represented as a dictionary containing the keys `name` and either
    * `value` or `binaryValue`.
    */
  type HttpHeaders = js.Array[firefoxDashWebextDashBrowserLib.Anon_BinaryValue]
  type OnAuthRequiredOptions = firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.responseHeaders | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.blocking | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.asyncBlocking
  type OnBeforeRedirectOptions = firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.responseHeaders
  type OnBeforeRequestOptions = firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.blocking | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.requestBody
  type OnBeforeSendHeadersOptions = firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.requestHeaders | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.blocking
  type OnCompletedOptions = firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.responseHeaders
  type OnHeadersReceivedOptions = firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.blocking | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.responseHeaders
  type OnResponseStartedOptions = firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.responseHeaders
  type OnSendHeadersOptions = firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.requestHeaders
  /* webRequest types */
  type ResourceType = firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.main_frame | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.sub_frame | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.stylesheet | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.script | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.image | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.`object` | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.object_subrequest | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.xmlhttprequest | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.xbl | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.xslt | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.ping | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.beacon | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.xml_dtd | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.font | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.media | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.websocket | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.csp_report | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.imageset | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.web_manifest | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.speculative | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.other
  type TransportWeaknessReasons = firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.cipher
  /** Protocol version if state is "secure" */
  type _SecurityInfoProtocolVersion = firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.TLSv1 | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.TLSv1DOT1 | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.TLSv1DOT2 | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.TLSv1DOT3 | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.unknown
  type _SecurityInfoState = firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.insecure | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.weak | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.broken | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.secure
  type _WebRequestOnAuthRequiredEvent[T] = firefoxDashWebextDashBrowserLib.WebExtEventBase[
    js.Function3[
      /* callback */ T, 
      /* filter */ RequestFilter, 
      /* extraInfoSpec */ js.UndefOr[js.Array[OnAuthRequiredOptions]], 
      scala.Unit
    ], 
    T
  ]
  type _WebRequestOnBeforeRedirectEvent[T] = firefoxDashWebextDashBrowserLib.WebExtEventBase[
    js.Function3[
      /* callback */ T, 
      /* filter */ RequestFilter, 
      /* extraInfoSpec */ js.UndefOr[js.Array[OnBeforeRedirectOptions]], 
      scala.Unit
    ], 
    T
  ]
  type _WebRequestOnBeforeRequestEvent[T] = firefoxDashWebextDashBrowserLib.WebExtEventBase[
    js.Function3[
      /* callback */ T, 
      /* filter */ RequestFilter, 
      /* extraInfoSpec */ js.UndefOr[js.Array[OnBeforeRequestOptions]], 
      scala.Unit
    ], 
    T
  ]
  type _WebRequestOnBeforeSendHeadersEvent[T] = firefoxDashWebextDashBrowserLib.WebExtEventBase[
    js.Function3[
      /* callback */ T, 
      /* filter */ RequestFilter, 
      /* extraInfoSpec */ js.UndefOr[js.Array[OnBeforeSendHeadersOptions]], 
      scala.Unit
    ], 
    T
  ]
  type _WebRequestOnCompletedEvent[T] = firefoxDashWebextDashBrowserLib.WebExtEventBase[
    js.Function3[
      /* callback */ T, 
      /* filter */ RequestFilter, 
      /* extraInfoSpec */ js.UndefOr[js.Array[OnCompletedOptions]], 
      scala.Unit
    ], 
    T
  ]
  type _WebRequestOnErrorOccurredEvent[T] = firefoxDashWebextDashBrowserLib.WebExtEventBase[js.Function2[/* callback */ T, /* filter */ RequestFilter, scala.Unit], T]
  type _WebRequestOnHeadersReceivedEvent[T] = firefoxDashWebextDashBrowserLib.WebExtEventBase[
    js.Function3[
      /* callback */ T, 
      /* filter */ RequestFilter, 
      /* extraInfoSpec */ js.UndefOr[js.Array[OnHeadersReceivedOptions]], 
      scala.Unit
    ], 
    T
  ]
  type _WebRequestOnResponseStartedEvent[T] = firefoxDashWebextDashBrowserLib.WebExtEventBase[
    js.Function3[
      /* callback */ T, 
      /* filter */ RequestFilter, 
      /* extraInfoSpec */ js.UndefOr[js.Array[OnResponseStartedOptions]], 
      scala.Unit
    ], 
    T
  ]
  type _WebRequestOnSendHeadersEvent[T] = firefoxDashWebextDashBrowserLib.WebExtEventBase[
    js.Function3[
      /* callback */ T, 
      /* filter */ RequestFilter, 
      /* extraInfoSpec */ js.UndefOr[js.Array[OnSendHeadersOptions]], 
      scala.Unit
    ], 
    T
  ]
}

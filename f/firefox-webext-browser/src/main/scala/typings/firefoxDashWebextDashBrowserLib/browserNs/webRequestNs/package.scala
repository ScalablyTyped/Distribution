package typings
package firefoxDashWebextDashBrowserLib.browserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object webRequestNs {
  /**
    * An array of HTTP headers. Each header is represented as a dictionary containing the keys `name` and either
    * `value` or `binaryValue`.
    */
  type HttpHeaders = js.Array[firefoxDashWebextDashBrowserLib.Anon_BinaryValue]
  type OnBeforeRedirectOptions = firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.responseHeaders
  type OnCompletedOptions = firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.responseHeaders
  type OnResponseStartedOptions = firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.responseHeaders
  type OnSendHeadersOptions = firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.requestHeaders
  type TransportWeaknessReasons = firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.cipher
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

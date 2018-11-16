package typings
package gapiDotClientDotLoggingLib.gapiNs.clientNs.loggingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ListMonitoredResourceDescriptorsResponse extends js.Object {
  /**
               * If there might be more results than those appearing in this response, then nextPageToken is included. To get the next set of results, call this method
               * again using the value of nextPageToken as pageToken.
               */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /** A list of resource descriptors. */
  var resourceDescriptors: js.UndefOr[js.Array[MonitoredResourceDescriptor]] = js.undefined
}


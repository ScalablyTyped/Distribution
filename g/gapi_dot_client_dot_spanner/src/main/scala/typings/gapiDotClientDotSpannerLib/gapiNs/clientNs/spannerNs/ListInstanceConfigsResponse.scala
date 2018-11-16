package typings
package gapiDotClientDotSpannerLib.gapiNs.clientNs.spannerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ListInstanceConfigsResponse extends js.Object {
  /** The list of requested instance configurations. */
  var instanceConfigs: js.UndefOr[js.Array[InstanceConfig]] = js.undefined
  /**
               * `next_page_token` can be sent in a subsequent
               * ListInstanceConfigs call to
               * fetch more of the matching instance configurations.
               */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}


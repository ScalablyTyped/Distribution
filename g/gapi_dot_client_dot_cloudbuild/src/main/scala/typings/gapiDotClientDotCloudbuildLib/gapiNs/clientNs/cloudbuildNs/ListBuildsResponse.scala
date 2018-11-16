package typings
package gapiDotClientDotCloudbuildLib.gapiNs.clientNs.cloudbuildNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ListBuildsResponse extends js.Object {
  /** Builds will be sorted by create_time, descending. */
  var builds: js.UndefOr[js.Array[Build]] = js.undefined
  /** Token to receive the next page of results. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}


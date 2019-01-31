package typings
package atGoogleDashCloudTasksLib.atGoogleDashCloudTasksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListRequestObject extends ParentRequest {
  /**
    * `filter` can be used to specify a subset of queues. Any Queue field can be used as a filter and several operators as supported.
    * For example: <=, <, >=, >, !=, =, :. The filter syntax is the same as described in Stackdriver's Advanced Logs Filters.
    * Sample filter "state: PAUSED".
    * Note that using filters might cause fewer queues than the requested page_size to be returned.
    */
  var filter: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The maximum number of resources contained in the underlying API response. If page streaming is performed per-resource,
    * this parameter does not affect the return value. If page streaming is performed per-page, this determines the maximum number of resources in a page.
    */
  var pageSize: js.UndefOr[scala.Double] = js.undefined
}


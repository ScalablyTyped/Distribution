package typings
package gapiDotClientDotDatastoreLib.gapiNs.clientNs.datastoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleDatastoreAdminV1beta1Progress extends js.Object {
  /**
    * The amount of work that has been completed. Note that this may be greater
    * than work_estimated.
    */
  var workCompleted: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An estimate of how much work needs to be performed. May be zero if the
    * work estimate is unavailable.
    */
  var workEstimated: js.UndefOr[java.lang.String] = js.undefined
}

object GoogleDatastoreAdminV1beta1Progress {
  @scala.inline
  def apply(workCompleted: java.lang.String = null, workEstimated: java.lang.String = null): GoogleDatastoreAdminV1beta1Progress = {
    val __obj = js.Dynamic.literal()
    if (workCompleted != null) __obj.updateDynamic("workCompleted")(workCompleted)
    if (workEstimated != null) __obj.updateDynamic("workEstimated")(workEstimated)
    __obj.asInstanceOf[GoogleDatastoreAdminV1beta1Progress]
  }
}


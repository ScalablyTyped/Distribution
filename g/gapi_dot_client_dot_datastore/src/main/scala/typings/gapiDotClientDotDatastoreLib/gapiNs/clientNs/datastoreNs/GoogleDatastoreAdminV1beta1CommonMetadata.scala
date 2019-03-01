package typings
package gapiDotClientDotDatastoreLib.gapiNs.clientNs.datastoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleDatastoreAdminV1beta1CommonMetadata extends js.Object {
  /** The time the operation ended, either successfully or otherwise. */
  var endTime: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The client-assigned labels which were provided when the operation was
    * created. May also include additional labels.
    */
  var labels: js.UndefOr[stdLib.Record[java.lang.String, java.lang.String]] = js.undefined
  /**
    * The type of the operation. Can be used as a filter in
    * ListOperationsRequest.
    */
  var operationType: js.UndefOr[java.lang.String] = js.undefined
  /** The time that work began on the operation. */
  var startTime: js.UndefOr[java.lang.String] = js.undefined
  /** The current state of the Operation. */
  var state: js.UndefOr[java.lang.String] = js.undefined
}

object GoogleDatastoreAdminV1beta1CommonMetadata {
  @scala.inline
  def apply(
    endTime: java.lang.String = null,
    labels: stdLib.Record[java.lang.String, java.lang.String] = null,
    operationType: java.lang.String = null,
    startTime: java.lang.String = null,
    state: java.lang.String = null
  ): GoogleDatastoreAdminV1beta1CommonMetadata = {
    val __obj = js.Dynamic.literal()
    if (endTime != null) __obj.updateDynamic("endTime")(endTime)
    if (labels != null) __obj.updateDynamic("labels")(labels)
    if (operationType != null) __obj.updateDynamic("operationType")(operationType)
    if (startTime != null) __obj.updateDynamic("startTime")(startTime)
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[GoogleDatastoreAdminV1beta1CommonMetadata]
  }
}


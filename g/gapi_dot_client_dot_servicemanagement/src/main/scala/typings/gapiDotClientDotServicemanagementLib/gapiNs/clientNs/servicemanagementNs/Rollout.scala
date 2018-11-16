package typings
package gapiDotClientDotServicemanagementLib.gapiNs.clientNs.servicemanagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Rollout extends js.Object {
  /** Creation time of the rollout. Readonly. */
  var createTime: js.UndefOr[java.lang.String] = js.undefined
  /** The user who created the Rollout. Readonly. */
  var createdBy: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The strategy associated with a rollout to delete a `ManagedService`.
               * Readonly.
               */
  var deleteServiceStrategy: js.UndefOr[js.Any] = js.undefined
  /**
               * Optional unique identifier of this Rollout. Only lower case letters, digits
               * and '-' are allowed.
               *
               * If not specified by client, the server will generate one. The generated id
               * will have the form of <date><revision number>, where "date" is the create
               * date in ISO 8601 format.  "revision number" is a monotonically increasing
               * positive number that is reset every day for each service.
               * An example of the generated rollout_id is '2016-02-16r1'
               */
  var rolloutId: js.UndefOr[java.lang.String] = js.undefined
  /** The name of the service associated with this Rollout. */
  var serviceName: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The status of this rollout. Readonly. In case of a failed rollout,
               * the system will automatically rollback to the current Rollout
               * version. Readonly.
               */
  var status: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Google Service Control selects service configurations based on
               * traffic percentage.
               */
  var trafficPercentStrategy: js.UndefOr[TrafficPercentStrategy] = js.undefined
}

